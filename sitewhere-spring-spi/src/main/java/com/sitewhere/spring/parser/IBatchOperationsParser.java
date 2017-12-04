/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spring.parser;

/**
 * Enumerates elements used by batch operations parser.
 * 
 * @author Derek
 */
public interface IBatchOperationsParser {

    public static enum Elements {

	/** Default MongoDB datastore */
	DefaultMongoDatastore("default-mongodb-datastore"),

	/** Default batch operation manager */
	DefaultBatchOperationManager("default-batch-operation-manager"),

	/** Batch operation manager reference */
	BatchOperationManager("batch-operation-manager");

	/** Event code */
	private String localName;

	private Elements(String localName) {
	    this.localName = localName;
	}

	public static Elements getByLocalName(String localName) {
	    for (Elements value : Elements.values()) {
		if (value.getLocalName().equals(localName)) {
		    return value;
		}
	    }
	    return null;
	}

	public String getLocalName() {
	    return localName;
	}

	public void setLocalName(String localName) {
	    this.localName = localName;
	}
    }
}