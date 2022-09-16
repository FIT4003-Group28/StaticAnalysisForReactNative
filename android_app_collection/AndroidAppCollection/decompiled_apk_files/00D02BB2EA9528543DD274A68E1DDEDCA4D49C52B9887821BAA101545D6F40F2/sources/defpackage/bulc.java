package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bulc  reason: default package */
/* loaded from: classes4.dex */
public final class bulc implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bulc(bulb bulbVar) {
        this.b = bulbVar.a;
        this.c = bulbVar.b;
        this.a = bulbVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvta dvtaVar = (dvta) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvtaVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvta dvtaVar, btzi<dvta, dvte> btziVar, Executor executor) {
        return this.b.a().a(dvtaVar, this.a, btziVar, executor);
    }
}
