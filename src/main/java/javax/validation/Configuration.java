/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package javax.validation;

import java.io.InputStream;

/**
 * @version $Rev$ $Date$
 */
public interface Configuration<T extends Configuration<T>> {

    /**
     * @param stream
     * @return this
     * @throws IllegalArgumentException
     */
    T addMapping(InputStream stream);

    /**
     * @param name
     * @param value
     * @return this
     * @throws IllegalArgumentException
     */
    T addProperty(String name, String value);

    /**
     * @return ValidatorFactory
     * @throws ValidationException
     */
    ValidatorFactory buildValidatorFactory();

    /**
     * @param constraintValidatorFactory
     * @return this
     */
    T constraintValidatorFactory(
        ConstraintValidatorFactory constraintValidatorFactory);

    /**
     * @return MessageInterpolator
     */
    MessageInterpolator getDefaultMessageInterpolator();

    /**
     * @return this
     */
    T ignoreXmlConfiguration();

    /**
     * @param interpolator
     * @return this
     */
    T messageInterpolator(MessageInterpolator interpolator);

    /**
     * @param resolver
     * @return this
     */
    T traversableResolver(TraversableResolver resolver);
}
