package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: cnep  reason: default package */
/* loaded from: classes5.dex */
public final class cnep {
    public static boolean a(Future<?> future) {
        if (!future.isDone() || future.isCancelled()) {
            return false;
        }
        try {
            deha.r(future);
            return true;
        } catch (CancellationException | ExecutionException unused) {
            return false;
        }
    }
}
