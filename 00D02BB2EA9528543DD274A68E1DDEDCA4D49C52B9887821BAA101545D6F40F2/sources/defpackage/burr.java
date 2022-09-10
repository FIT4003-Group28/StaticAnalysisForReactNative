package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burr  reason: default package */
/* loaded from: classes4.dex */
public final class burr implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burr(burq burqVar) {
        this.b = burqVar.a;
        this.c = burqVar.b;
        this.a = burqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        duzc duzcVar = (duzc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(duzcVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(duzc duzcVar, btzi<duzc, duzk> btziVar, Executor executor) {
        return this.b.a().a(duzcVar, this.a, btziVar, executor);
    }
}
