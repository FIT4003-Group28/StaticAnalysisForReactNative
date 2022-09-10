package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqh  reason: default package */
/* loaded from: classes4.dex */
public final class buqh implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqh(buqg buqgVar) {
        this.b = buqgVar.a;
        this.c = buqgVar.b;
        this.a = buqgVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dick dickVar = (dick) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dickVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dick dickVar, btzi<dick, dicm> btziVar, Executor executor) {
        return this.b.a().a(dickVar, this.a, btziVar, executor);
    }
}
