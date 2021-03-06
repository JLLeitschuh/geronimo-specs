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
package javax.persistence;

import java.util.Map;
import javax.persistence.metamodel.Metamodel;
import javax.persistence.criteria.CriteriaBuilder;

public interface EntityManagerFactory {

    public EntityManager createEntityManager();
    
    public EntityManager createEntityManager(Map map);

    public EntityManager createEntityManager(SynchronizationType synchronizationType);

    public EntityManager createEntityManager(SynchronizationType synchronizationType, Map map);

    public CriteriaBuilder getCriteriaBuilder();
    
    public Metamodel getMetamodel();

    public boolean isOpen();
    
    public void close();

    public Map<String, Object> getProperties();

    public Cache getCache();

    public PersistenceUnitUtil getPersistenceUnitUtil();

    public void addNamedQuery(String name, Query query);

    public <T> T unwrap(Class<T> cls);

    public <T> void addNamedEntityGraph(String graphName, EntityGraph<T> entityGraph);

}
