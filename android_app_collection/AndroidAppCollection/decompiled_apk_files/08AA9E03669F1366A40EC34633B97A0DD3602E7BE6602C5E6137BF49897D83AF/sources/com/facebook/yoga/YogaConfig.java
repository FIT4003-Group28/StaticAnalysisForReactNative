package com.facebook.yoga;

import com.facebook.l.g;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class YogaConfig {

    /* renamed from: a  reason: collision with root package name */
    long f4223a = jni_YGConfigNew();

    private native void jni_YGConfigFree(long j);

    private native long jni_YGConfigNew();

    private native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    private native void jni_YGConfigSetLogger(long j, Object obj);

    private native void jni_YGConfigSetPointScaleFactor(long j, float f);

    private native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    static {
        g.a("yoga");
    }

    public YogaConfig() {
        if (this.f4223a == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    protected void finalize() {
        try {
            jni_YGConfigFree(this.f4223a);
        } finally {
            super.finalize();
        }
    }

    public void a(float f) {
        jni_YGConfigSetPointScaleFactor(this.f4223a, f);
    }

    public void a(boolean z) {
        jni_YGConfigSetUseLegacyStretchBehaviour(this.f4223a, z);
    }
}
