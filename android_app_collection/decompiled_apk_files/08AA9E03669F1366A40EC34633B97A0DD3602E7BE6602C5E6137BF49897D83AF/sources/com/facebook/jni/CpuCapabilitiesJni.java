package com.facebook.jni;

import com.facebook.l.g;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class CpuCapabilitiesJni {
    @com.facebook.k.a.a
    public static native boolean nativeDeviceSupportsNeon();

    @com.facebook.k.a.a
    public static native boolean nativeDeviceSupportsVFPFP16();

    @com.facebook.k.a.a
    public static native boolean nativeDeviceSupportsX86();

    static {
        g.a("fb");
    }
}
