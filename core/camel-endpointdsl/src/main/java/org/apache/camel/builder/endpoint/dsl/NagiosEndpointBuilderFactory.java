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
 * To send passive checks to Nagios using JSendNSCA.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NagiosEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Nagios component.
     */
    public interface NagiosEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedNagiosEndpointBuilder advanced() {
            return (AdvancedNagiosEndpointBuilder) this;
        }
        /**
         * This is the address of the Nagios host where checks should be send.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default NagiosEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * The port number of the host.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default NagiosEndpointBuilder port(int port) {
            setProperty("port", port);
            return this;
        }
        /**
         * The port number of the host.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default NagiosEndpointBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * Connection timeout in millis.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default NagiosEndpointBuilder connectionTimeout(int connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout in millis.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default NagiosEndpointBuilder connectionTimeout(String connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Whether or not to use synchronous when sending a passive check.
         * Setting it to false will allow Camel to continue routing the message
         * and the passive check message will be send asynchronously.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default NagiosEndpointBuilder sendSync(boolean sendSync) {
            setProperty("sendSync", sendSync);
            return this;
        }
        /**
         * Whether or not to use synchronous when sending a passive check.
         * Setting it to false will allow Camel to continue routing the message
         * and the passive check message will be send asynchronously.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default NagiosEndpointBuilder sendSync(String sendSync) {
            setProperty("sendSync", sendSync);
            return this;
        }
        /**
         * Sending timeout in millis.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default NagiosEndpointBuilder timeout(int timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * Sending timeout in millis.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default NagiosEndpointBuilder timeout(String timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * To specify an encryption method.
         * The option is a
         * <code>com.googlecode.jsendnsca.encryption.Encryption</code> type.
         * @group security
         */
        default NagiosEndpointBuilder encryption(Encryption encryption) {
            setProperty("encryption", encryption);
            return this;
        }
        /**
         * To specify an encryption method.
         * The option will be converted to a
         * <code>com.googlecode.jsendnsca.encryption.Encryption</code> type.
         * @group security
         */
        default NagiosEndpointBuilder encryption(String encryption) {
            setProperty("encryption", encryption);
            return this;
        }
        /**
         * To specify an encryption method.
         * The option is a
         * <code>org.apache.camel.component.nagios.NagiosEncryptionMethod</code>
         * type.
         * @group security
         */
        @Deprecated
        default NagiosEndpointBuilder encryptionMethod(
                NagiosEncryptionMethod encryptionMethod) {
            setProperty("encryptionMethod", encryptionMethod);
            return this;
        }
        /**
         * To specify an encryption method.
         * The option will be converted to a
         * <code>org.apache.camel.component.nagios.NagiosEncryptionMethod</code>
         * type.
         * @group security
         */
        @Deprecated
        default NagiosEndpointBuilder encryptionMethod(String encryptionMethod) {
            setProperty("encryptionMethod", encryptionMethod);
            return this;
        }
        /**
         * Password to be authenticated when sending checks to Nagios.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default NagiosEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Nagios component.
     */
    public interface AdvancedNagiosEndpointBuilder
            extends
                EndpointProducerBuilder {
        default NagiosEndpointBuilder basic() {
            return (NagiosEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedNagiosEndpointBuilder basicPropertyBinding(
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
        default AdvancedNagiosEndpointBuilder basicPropertyBinding(
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
        default AdvancedNagiosEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedNagiosEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>com.googlecode.jsendnsca.encryption.Encryption</code> enum.
     */
    public static enum Encryption {
        NONE, TRIPLE_DES, XOR, RIJNDAEL128, RIJNDAEL192, RIJNDAEL256, BLOWFISH;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.nagios.NagiosEncryptionMethod</code>
     * enum.
     */
    public static enum NagiosEncryptionMethod {
        No, Xor, TripleDes;
    }
    /**
     * To send passive checks to Nagios using JSendNSCA. Creates a builder to
     * build endpoints for the Nagios component.
     */
    default NagiosEndpointBuilder nagios(String path) {
        class NagiosEndpointBuilderImpl extends AbstractEndpointBuilder implements NagiosEndpointBuilder, AdvancedNagiosEndpointBuilder {
            public NagiosEndpointBuilderImpl(String path) {
                super("nagios", path);
            }
        }
        return new NagiosEndpointBuilderImpl(path);
    }
}