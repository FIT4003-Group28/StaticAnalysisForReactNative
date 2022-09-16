package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buop  reason: default package */
/* loaded from: classes4.dex */
public final class buop implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buop(buoo buooVar) {
        this.b = buooVar.a;
        this.c = buooVar.b;
        this.a = buooVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dviq dviqVar = (dviq) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dviqVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dviq dviqVar, btzi<dviq, dviw> btziVar, Executor executor) {
        return this.b.a().a(dviqVar, this.a, btziVar, executor);
    }
}
