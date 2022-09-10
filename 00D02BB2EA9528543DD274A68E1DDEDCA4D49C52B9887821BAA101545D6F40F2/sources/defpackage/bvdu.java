package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdu  reason: default package */
/* loaded from: classes4.dex */
public final class bvdu implements bvds {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdu(bvdt bvdtVar) {
        this.b = bvdtVar.a;
        this.c = bvdtVar.b;
        this.a = bvdtVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dico dicoVar, btzi<dico, dicq> btziVar, bvrj bvrjVar) {
        dico dicoVar2 = dicoVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dicoVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dico, dicq>> c(dico dicoVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dico dicoVar, btzi<dico, dicq> btziVar, Executor executor) {
        return this.b.a().a(dicoVar, this.a, btziVar, executor);
    }
}
