/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The ldap component allows you to perform searches in LDAP servers using
 * filters as the message payload.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LdapEndpointBuilderFactory {


    /**
     * Builder for endpoint for the LDAP component.
     */
    public interface LdapEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedLdapEndpointBuilder advanced() {
            return (AdvancedLdapEndpointBuilder) this;
        }
        /**
         * Name of either a javax.naming.directory.DirContext, or
         * java.util.Hashtable, or Map bean to lookup in the registry. If the
         * bean is either a Hashtable or Map then a new
         * javax.naming.directory.DirContext instance is created for each use.
         * If the bean is a javax.naming.directory.DirContext then the bean is
         * used as given. The latter may not be possible in all situations where
         * the javax.naming.directory.DirContext must not be shared, and in
         * those situations it can be better to use java.util.Hashtable or Map
         * instead.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default LdapEndpointBuilder dirContextName(String dirContextName) {
            setProperty("dirContextName", dirContextName);
            return this;
        }
        /**
         * The base DN for searches.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default LdapEndpointBuilder base(String base) {
            setProperty("base", base);
            return this;
        }
        /**
         * When specified the ldap module uses paging to retrieve all results
         * (most LDAP Servers throw an exception when trying to retrieve more
         * than 1000 entries in one query). To be able to use this a LdapContext
         * (subclass of DirContext) has to be passed in as ldapServerBean
         * (otherwise an exception is thrown).
         * The option is a <code>java.lang.Integer</code> type.
         * @group producer
         */
        default LdapEndpointBuilder pageSize(Integer pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * When specified the ldap module uses paging to retrieve all results
         * (most LDAP Servers throw an exception when trying to retrieve more
         * than 1000 entries in one query). To be able to use this a LdapContext
         * (subclass of DirContext) has to be passed in as ldapServerBean
         * (otherwise an exception is thrown).
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group producer
         */
        default LdapEndpointBuilder pageSize(String pageSize) {
            setProperty("pageSize", pageSize);
            return this;
        }
        /**
         * Comma-separated list of attributes that should be set in each entry
         * of the result.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default LdapEndpointBuilder returnedAttributes(String returnedAttributes) {
            setProperty("returnedAttributes", returnedAttributes);
            return this;
        }
        /**
         * Specifies how deeply to search the tree of entries, starting at the
         * base DN.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default LdapEndpointBuilder scope(String scope) {
            setProperty("scope", scope);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the LDAP component.
     */
    public interface AdvancedLdapEndpointBuilder
            extends
                EndpointProducerBuilder {
        default LdapEndpointBuilder basic() {
            return (LdapEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedLdapEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedLdapEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedLdapEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedLdapEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The ldap component allows you to perform searches in LDAP servers using
     * filters as the message payload. Creates a builder to build endpoints for
     * the LDAP component.
     */
    default LdapEndpointBuilder ldap(String path) {
        class LdapEndpointBuilderImpl extends AbstractEndpointBuilder implements LdapEndpointBuilder, AdvancedLdapEndpointBuilder {
            public LdapEndpointBuilderImpl(String path) {
                super("ldap", path);
            }
        }
        return new LdapEndpointBuilderImpl(path);
    }
}