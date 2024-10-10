/**
 * Copyright © 2016-2024 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.data.mobile;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.thingsboard.server.common.data.oauth2.PlatformType;
import org.thingsboard.server.common.data.validation.NoXss;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AndroidQrCodeConfig implements QrCodeConfig {

    private boolean enabled;
    @NoXss
    @NotBlank
    private String appPackage;
    @NoXss
    @NotBlank
    private String sha256CertFingerprints;
    @NoXss
    @NotBlank
    private String storeLink;

    @Override
    public PlatformType getType() {
        return PlatformType.ANDROID;
    }
}