package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bube  reason: default package */
/* loaded from: classes4.dex */
final class bube implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bube(bubd bubdVar) {
        this.b = bubdVar.a;
        this.c = bubdVar.b;
        this.a = bubdVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        drzm drzmVar = (drzm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(drzmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(drzm drzmVar, btzi<drzm, drzo> btziVar, Executor executor) {
        return this.b.a().a(drzmVar, this.a, btziVar, executor);
    }
}
