package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* compiled from: PG */
/* renamed from: azut  reason: default package */
/* loaded from: classes2.dex */
public final class azut {
    private static final List a;

    static {
        Iterator it = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        it.getClass();
        a = aztk.c(new aztf(new azth(it)));
    }

    public static final void a(azrd azrdVar, Throwable th) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : a) {
            try {
                coroutineExceptionHandler.handleException(azrdVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, ayno.g(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
