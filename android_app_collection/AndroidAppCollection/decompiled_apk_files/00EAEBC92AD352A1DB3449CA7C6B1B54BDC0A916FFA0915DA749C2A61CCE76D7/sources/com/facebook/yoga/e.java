package com.facebook.yoga;
/* loaded from: classes.dex */
public abstract class e extends c {

    /* renamed from: a  reason: collision with root package name */
    long f6525a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }

    private e(long j) {
        if (j != 0) {
            this.f6525a = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    @Override // com.facebook.yoga.c
    public void a(float f2) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f6525a, f2);
    }

    @Override // com.facebook.yoga.c
    public void a(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.f6525a, z);
    }
}
