package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buvc  reason: default package */
/* loaded from: classes4.dex */
public final class buvc implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buvc(buvb buvbVar) {
        this.b = buvbVar.a;
        this.c = buvbVar.b;
        this.a = buvbVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkcs dkcsVar = (dkcs) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkcsVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkcs dkcsVar, btzi<dkcs, dkcu> btziVar, Executor executor) {
        return this.b.a().a(dkcsVar, this.a, btziVar, executor);
    }
}
