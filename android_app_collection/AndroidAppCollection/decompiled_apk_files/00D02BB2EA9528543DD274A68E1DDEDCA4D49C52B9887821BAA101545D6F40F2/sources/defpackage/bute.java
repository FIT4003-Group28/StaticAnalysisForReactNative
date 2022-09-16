package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bute  reason: default package */
/* loaded from: classes4.dex */
public final class bute implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bute(butd butdVar) {
        this.b = butdVar.a;
        this.c = butdVar.b;
        this.a = butdVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvvu dvvuVar = (dvvu) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvvuVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvvu dvvuVar, btzi<dvvu, dvvw> btziVar, Executor executor) {
        return this.b.a().a(dvvuVar, this.a, btziVar, executor);
    }
}
