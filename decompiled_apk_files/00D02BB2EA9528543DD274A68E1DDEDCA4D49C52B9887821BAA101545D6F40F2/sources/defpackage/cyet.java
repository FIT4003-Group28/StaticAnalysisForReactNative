package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cyet  reason: default package */
/* loaded from: classes5.dex */
public final class cyet {
    public static cyes a(Throwable th) {
        if (th instanceof cylw) {
            return ((cylw) th).a();
        }
        if (th instanceof TimeoutException) {
            return cyes.FAILED_TIMEOUT;
        }
        if (th instanceof InterruptedException) {
            return cyes.FAILED_INTERRUPTED;
        }
        if (th instanceof CancellationException) {
            return cyes.FAILED_CANCELED;
        }
        if (th.getCause() != null) {
            return a(th.getCause());
        }
        return cyes.FAILED_UNKNOWN;
    }
}
