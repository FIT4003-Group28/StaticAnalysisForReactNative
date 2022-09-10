package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buna  reason: default package */
/* loaded from: classes4.dex */
public final class buna implements bumy {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buna(bumz bumzVar) {
        this.b = bumzVar.a;
        this.c = bumzVar.b;
        this.a = bumzVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dupi dupiVar, btzi<dupi, dupk> btziVar, bvrj bvrjVar) {
        dupi dupiVar2 = dupiVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dupiVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dupi, dupk>> c(dupi dupiVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dupi dupiVar, btzi<dupi, dupk> btziVar, Executor executor) {
        return this.b.a().a(dupiVar, this.a, btziVar, executor);
    }
}
