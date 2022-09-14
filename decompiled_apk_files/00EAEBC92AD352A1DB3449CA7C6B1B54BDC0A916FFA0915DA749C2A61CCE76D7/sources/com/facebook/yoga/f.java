package com.facebook.yoga;
/* loaded from: classes.dex */
public class f extends e {
    public void a() {
        long j = this.f6525a;
        if (j != 0) {
            this.f6525a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j);
        }
    }

    protected void finalize() {
        try {
            a();
        } finally {
            super.finalize();
        }
    }
}
