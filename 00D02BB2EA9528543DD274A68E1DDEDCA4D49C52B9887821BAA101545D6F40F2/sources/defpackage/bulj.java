package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bulj  reason: default package */
/* loaded from: classes4.dex */
public final class bulj implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bulj(buli buliVar) {
        this.b = buliVar.a;
        this.c = buliVar.b;
        this.a = buliVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhsg dhsgVar = (dhsg) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhsgVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhsg dhsgVar, btzi<dhsg, dhsi> btziVar, Executor executor) {
        return this.b.a().a(dhsgVar, this.a, btziVar, executor);
    }
}
