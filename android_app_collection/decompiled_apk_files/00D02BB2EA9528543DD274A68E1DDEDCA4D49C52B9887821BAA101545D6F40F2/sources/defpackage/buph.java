package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buph  reason: default package */
/* loaded from: classes4.dex */
public final class buph implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buph(bupg bupgVar) {
        this.b = bupgVar.a;
        this.c = bupgVar.b;
        this.a = bupgVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diji dijiVar = (diji) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dijiVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diji dijiVar, btzi<diji, dijk> btziVar, Executor executor) {
        return this.b.a().a(dijiVar, this.a, btziVar, executor);
    }
}
