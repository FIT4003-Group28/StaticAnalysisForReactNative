package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvbx  reason: default package */
/* loaded from: classes4.dex */
public final class bvbx implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvbx(bvbw bvbwVar) {
        this.b = bvbwVar.a;
        this.c = bvbwVar.b;
        this.a = bvbwVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkbg dkbgVar = (dkbg) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkbgVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkbg dkbgVar, btzi<dkbg, dkbi> btziVar, Executor executor) {
        return this.b.a().a(dkbgVar, this.a, btziVar, executor);
    }
}
