package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cxns  reason: default package */
/* loaded from: classes5.dex */
final class cxns {
    public static <T> T a(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
