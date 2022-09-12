package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buwl  reason: default package */
/* loaded from: classes4.dex */
public final class buwl implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwl(buwk buwkVar) {
        this.b = buwkVar.a;
        this.c = buwkVar.b;
        this.a = buwkVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dutm dutmVar = (dutm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dutmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dutm dutmVar, btzi<dutm, duto> btziVar, Executor executor) {
        return this.b.a().a(dutmVar, this.a, btziVar, executor);
    }
}
