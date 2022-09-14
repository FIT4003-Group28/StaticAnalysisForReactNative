package com.baidu.mapapi;

import com.baidu.platform.comjni.tools.a;
/* loaded from: classes.dex */
public class OpenLogUtil {

    /* renamed from: a  reason: collision with root package name */
    private static ModuleName f1513a;

    public static void setModuleLogEnable(ModuleName moduleName, boolean z) {
        f1513a = moduleName;
        a.a(z, f1513a.ordinal());
    }
}
