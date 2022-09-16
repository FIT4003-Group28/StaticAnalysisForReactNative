package com.facebook.jni;

import com.facebook.jni.a;
@com.facebook.jni.b.a
/* loaded from: classes.dex */
public class HybridData {
    @com.facebook.jni.b.a
    private Destructor mDestructor = new Destructor(this);

    /* loaded from: classes.dex */
    public static class Destructor extends a.b {
        @com.facebook.jni.b.a
        private long mNativePointer;

        Destructor(Object obj) {
            super(obj);
        }

        static native void deleteNative(long j);

        @Override // com.facebook.jni.a.b
        protected final void a() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }

    static {
        com.facebook.soloader.o.a.a("fbjni");
    }

    public synchronized void a() {
        this.mDestructor.a();
    }
}
