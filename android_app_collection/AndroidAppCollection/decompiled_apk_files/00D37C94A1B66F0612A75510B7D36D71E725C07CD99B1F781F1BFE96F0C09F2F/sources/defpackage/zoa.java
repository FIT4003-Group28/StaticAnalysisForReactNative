package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: zoa  reason: default package */
/* loaded from: classes4.dex */
public final class zoa {
    public static final AtomicBoolean a = new AtomicBoolean();

    public static synchronized void a() {
        synchronized (zoa.class) {
            AtomicBoolean atomicBoolean = a;
            if (atomicBoolean.get()) {
                return;
            }
            try {
                System.loadLibrary("drishti_jni_native");
                atomicBoolean.set(true);
            } catch (UnsatisfiedLinkError e) {
                zep.d("Load library: drishti_jni_native - Failed to load", e);
            }
        }
    }
}
