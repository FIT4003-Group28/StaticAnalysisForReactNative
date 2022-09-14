package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cypj  reason: default package */
/* loaded from: classes5.dex */
public final class cypj {
    public static int a(Throwable th) {
        if (th instanceof cylw) {
            return cyfa.b(((cylw) th).a());
        }
        if (th instanceof TimeoutException) {
            return 8;
        }
        if (th instanceof InterruptedException) {
            return 5;
        }
        if (th instanceof CancellationException) {
            return 4;
        }
        if (th.getCause() == null) {
            return 3;
        }
        return a(th.getCause());
    }
}
