package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buvy  reason: default package */
/* loaded from: classes4.dex */
public final class buvy implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buvy(buvx buvxVar) {
        this.b = buvxVar.a;
        this.c = buvxVar.b;
        this.a = buvxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dixa dixaVar = (dixa) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dixaVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dixa dixaVar, btzi<dixa, dixc> btziVar, Executor executor) {
        return this.b.a().a(dixaVar, this.a, btziVar, executor);
    }
}
