package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bumj  reason: default package */
/* loaded from: classes4.dex */
public final class bumj implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bumj(bumi bumiVar) {
        this.b = bumiVar.a;
        this.c = bumiVar.b;
        this.a = bumiVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvqa dvqaVar = (dvqa) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvqaVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvqa dvqaVar, btzi<dvqa, dvqe> btziVar, Executor executor) {
        return this.b.a().a(dvqaVar, this.a, btziVar, executor);
    }
}
