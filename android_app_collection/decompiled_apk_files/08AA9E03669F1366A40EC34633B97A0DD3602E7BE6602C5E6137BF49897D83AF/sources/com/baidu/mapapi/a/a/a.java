package com.baidu.mapapi.a.a;

import com.baidu.mapapi.VersionInfo;
import com.baidu.mapapi.common.BaiduMapSDKException;
import com.baidu.platform.comapi.NativeLoader;
/* loaded from: classes.dex */
public class a {
    static {
        if (!VersionInfo.getApiVersion().equals(b.a())) {
            throw new BaiduMapSDKException("the version of util is not match with base");
        }
        NativeLoader.getInstance().loadLibrary(b.b());
    }
}
