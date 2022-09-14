package com.facebook.yoga;
/* loaded from: classes.dex */
public class r extends YogaNodeJNIBase {
    public r() {
    }

    public r(c cVar) {
        super(cVar);
    }

    protected void finalize() {
        try {
            q();
        } finally {
            super.finalize();
        }
    }

    public void q() {
        long j = this.f6515f;
        if (j != 0) {
            this.f6515f = 0L;
            YogaNative.jni_YGNodeFreeJNI(j);
        }
    }
}
