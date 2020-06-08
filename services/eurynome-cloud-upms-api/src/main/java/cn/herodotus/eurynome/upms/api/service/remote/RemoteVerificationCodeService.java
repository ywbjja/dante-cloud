/*
 * Copyright (c) 2019-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * Project Name: eurynome-cloud
 * Module Name: eurynome-cloud-upms-api
 * File Name: RemoteVerificationCodeService.java
 * Author: gengwei.zheng
 * Date: 2020/6/8 下午4:36
 * LastModified: 2020/6/8 下午4:35
 */

package cn.herodotus.eurynome.upms.api.service.remote;

import cn.herodotus.eurynome.upms.api.constants.ServiceNameConstants;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p> Description : 验证码远程服务 </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/3/3 16:01
 */
@FeignClient(value = ServiceNameConstants.UPMS_SERVICE)
public interface RemoteVerificationCodeService {
}
