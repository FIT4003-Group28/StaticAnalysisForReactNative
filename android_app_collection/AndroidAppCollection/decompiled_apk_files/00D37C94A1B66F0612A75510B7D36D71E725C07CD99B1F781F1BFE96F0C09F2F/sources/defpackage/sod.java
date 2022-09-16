package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: sod  reason: default package */
/* loaded from: classes4.dex */
public final class sod extends sol {
    final /* synthetic */ ankx a;

    public sod(ankx ankxVar) {
        this.a = ankxVar;
    }

    @Override // defpackage.sol
    public final ankx a() {
        return this.a;
    }

    @Override // defpackage.anjw, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new soe(runnable));
    }

    @Override // defpackage.sol, defpackage.anka
    public final /* bridge */ /* synthetic */ ankw f() {
        return this.a;
    }

    @Override // defpackage.anjw, defpackage.amtj
    public final /* bridge */ /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.anka, defpackage.anjw
    public final /* bridge */ /* synthetic */ ExecutorService h() {
        return this.a;
    }

    @Override // defpackage.anjw, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.anjw, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amtj
    public final String toString() {
        String solVar = super.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(solVar).length() + 19);
        sb.append("ExceptionHandling[");
        sb.append(solVar);
        sb.append("]");
        return sb.toString();
    }
}
