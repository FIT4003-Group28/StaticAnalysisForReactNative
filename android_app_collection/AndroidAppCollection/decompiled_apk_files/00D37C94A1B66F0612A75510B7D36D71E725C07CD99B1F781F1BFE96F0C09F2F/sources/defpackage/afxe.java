package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: afxe  reason: default package */
/* loaded from: classes.dex */
public final class afxe implements afyf {
    public final afyf a;
    private final Executor b;

    private afxe(Executor executor, afyf afyfVar) {
        this.b = executor;
        this.a = afyfVar;
    }

    public static afxe b(Executor executor, afyf afyfVar) {
        executor.getClass();
        afyfVar.getClass();
        return new afxe(executor, afyfVar);
    }

    @Override // defpackage.afyf
    public final void a(Object obj, yiw yiwVar) {
        obj.getClass();
        yiwVar.getClass();
        try {
            this.b.execute(new afxd(this, obj, yiwVar));
        } catch (RejectedExecutionException e) {
            yiwVar.a(obj, e);
        }
    }
}
