package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvap  reason: default package */
/* loaded from: classes4.dex */
final class bvap implements bvan {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvap(bvao bvaoVar) {
        this.b = bvaoVar.a;
        this.c = bvaoVar.b;
        this.a = bvaoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dizr dizrVar, btzi<dizr, dizt> btziVar, bvrj bvrjVar) {
        dizr dizrVar2 = dizrVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dizrVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dizr, dizt>> c(dizr dizrVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dizr dizrVar, btzi<dizr, dizt> btziVar, Executor executor) {
        return this.b.a().a(dizrVar, this.a, btziVar, executor);
    }
}
