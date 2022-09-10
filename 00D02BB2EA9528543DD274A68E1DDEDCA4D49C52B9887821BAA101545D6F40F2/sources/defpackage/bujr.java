package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bujr  reason: default package */
/* loaded from: classes4.dex */
public final class bujr implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bujr(bujq bujqVar) {
        this.b = bujqVar.a;
        this.c = bujqVar.b;
        this.a = bujqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhlp dhlpVar = (dhlp) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhlpVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhlp dhlpVar, btzi<dhlp, dhlr> btziVar, Executor executor) {
        return this.b.a().a(dhlpVar, this.a, btziVar, executor);
    }
}
