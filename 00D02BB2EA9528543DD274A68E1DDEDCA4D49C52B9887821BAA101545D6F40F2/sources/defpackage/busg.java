package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: busg  reason: default package */
/* loaded from: classes4.dex */
public final class busg implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public busg(busf busfVar) {
        this.b = busfVar.a;
        this.c = busfVar.b;
        this.a = busfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dihn dihnVar = (dihn) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dihnVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dihn dihnVar, btzi<dihn, dihp> btziVar, Executor executor) {
        return this.b.a().a(dihnVar, this.a, btziVar, executor);
    }
}
