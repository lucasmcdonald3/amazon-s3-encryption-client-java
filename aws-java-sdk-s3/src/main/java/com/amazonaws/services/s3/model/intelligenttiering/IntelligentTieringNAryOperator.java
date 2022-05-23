/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.intelligenttiering;

import java.util.List;

/**
 *  Abstract class representing an operator that acts on N number of predicates.
 */
abstract class IntelligentTieringNAryOperator extends IntelligentTieringFilterPredicate {

    private final List<IntelligentTieringFilterPredicate> operands;

    protected IntelligentTieringNAryOperator(List<IntelligentTieringFilterPredicate> operands) {
        this.operands = operands;
    }

    public List<IntelligentTieringFilterPredicate> getOperands() {
        return operands;
    }
}
