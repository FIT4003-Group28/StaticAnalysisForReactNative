package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uhy  reason: default package */
/* loaded from: classes4.dex */
public final class uhy {
    public static final Executor a = new qrj(2);

    public static void a(rve rveVar) {
        if (rveVar.k()) {
            rveVar.g();
        } else if (((rvj) rveVar).d) {
            throw new CancellationException("Task is already cancelled.");
        } else {
            throw new ExecutionException(rveVar.f());
        }
    }
}
