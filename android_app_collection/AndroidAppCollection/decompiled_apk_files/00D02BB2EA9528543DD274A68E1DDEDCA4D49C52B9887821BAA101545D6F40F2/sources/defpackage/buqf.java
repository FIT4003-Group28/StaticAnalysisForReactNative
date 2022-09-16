package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqf  reason: default package */
/* loaded from: classes4.dex */
public final class buqf implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqf(buqe buqeVar) {
        this.b = buqeVar.a;
        this.c = buqeVar.b;
        this.a = buqeVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dixk dixkVar = (dixk) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dixkVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dixk dixkVar, btzi<dixk, dixm> btziVar, Executor executor) {
        return this.b.a().a(dixkVar, this.a, btziVar, executor);
    }
}
