package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqm  reason: default package */
/* loaded from: classes4.dex */
public final class buqm implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqm(buql buqlVar) {
        this.b = buqlVar.a;
        this.c = buqlVar.b;
        this.a = buqlVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dihr dihrVar = (dihr) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dihrVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dihr dihrVar, btzi<dihr, diht> btziVar, Executor executor) {
        return this.b.a().a(dihrVar, this.a, btziVar, executor);
    }
}
