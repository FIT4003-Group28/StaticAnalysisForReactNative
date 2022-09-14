package com.baidu.mapapi.search.core;

import com.baidu.mapapi.VersionInfo;
import com.baidu.mapapi.common.BaiduMapSDKException;
import com.baidu.platform.comapi.NativeLoader;
/* loaded from: classes.dex */
public class g {
    static {
        if (!VersionInfo.getApiVersion().equals(j.a())) {
            throw new BaiduMapSDKException("the version of search is not match with base");
        }
        NativeLoader.getInstance().loadLibrary(j.b());
    }
}
