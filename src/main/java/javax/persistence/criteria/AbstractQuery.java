/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//
// This source code implements specifications defined by the Java
// Community Process. In order to remain compliant with the specification
// DO NOT add / change / or delete method signatures!
//

package javax.persistence.criteria;

import java.util.List;
import java.util.Set;

import javax.persistence.metamodel.EntityType;


public interface AbstractQuery<T> {

    <X> Root<X> from(EntityType<X> entity);

    <X> Root<X> from(Class<X> entityClass);

    Set<Root<?>> getRoots();
    AbstractQuery<T> where(Expression<Boolean> restriction);

    AbstractQuery<T> where(Predicate... restrictions);

    AbstractQuery<T> groupBy(Expression<?>... grouping);

    AbstractQuery<T> having(Expression<Boolean> restriction);

    AbstractQuery<T> having(Predicate... restrictions);

    AbstractQuery<T> distinct(boolean distinct);

    <U> Subquery<U> subquery(Class<U> type);

    Selection<T> getSelection();
    List<Expression<?>> getGroupList();

    Predicate getRestriction();

    Predicate getGroupRestriction();

    boolean isDistinct();

    Class<T> getResultType();  	
}
