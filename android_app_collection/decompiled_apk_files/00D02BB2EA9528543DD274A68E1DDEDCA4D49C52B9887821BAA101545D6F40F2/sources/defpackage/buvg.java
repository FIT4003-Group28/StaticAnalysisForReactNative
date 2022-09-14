package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buvg  reason: default package */
/* loaded from: classes4.dex */
public final class buvg implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buvg(buvf buvfVar) {
        this.b = buvfVar.a;
        this.c = buvfVar.b;
        this.a = buvfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkdg dkdgVar = (dkdg) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkdgVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkdg dkdgVar, btzi<dkdg, dkdm> btziVar, Executor executor) {
        return this.b.a().a(dkdgVar, this.a, btziVar, executor);
    }
}
