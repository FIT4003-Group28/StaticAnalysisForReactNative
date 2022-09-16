package defpackage;

import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: cmzd  reason: default package */
/* loaded from: classes5.dex */
public final class cmzd {
    public static synchronized void a(Semaphore semaphore) {
        synchronized (cmzd.class) {
            semaphore.release();
        }
    }
}
