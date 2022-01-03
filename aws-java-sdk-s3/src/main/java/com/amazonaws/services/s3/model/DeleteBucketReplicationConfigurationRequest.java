/*
 * Copyright 2015-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.AmazonS3;

/**
 * Request object for the parameters to delete a bucket's replication
 * configuration.
 *
 * @see AmazonS3#deleteBucketReplicationConfiguration(DeleteBucketReplicationConfigurationRequest)
 */
public class DeleteBucketReplicationConfigurationRequest extends GenericBucketRequest implements ExpectedBucketOwnerRequest {

    private String expectedBucketOwner;

    /**
     * Creates a new request object, ready to be executed to delete the
     * replication configuration for the specified bucket.
     *
     * @param bucketName
     *            The name of the bucket whose replication configuration is
     *            being deleted.
     */
    public DeleteBucketReplicationConfigurationRequest(String bucketName) {
        super(bucketName);
    }

    public String getExpectedBucketOwner() {
        return expectedBucketOwner;
    }

    public DeleteBucketReplicationConfigurationRequest withExpectedBucketOwner(String expectedBucketOwner) {
        this.expectedBucketOwner = expectedBucketOwner;
        return this;
    }

    public void setExpectedBucketOwner(String expectedBucketOwner) {
        withExpectedBucketOwner(expectedBucketOwner);
    }
}
