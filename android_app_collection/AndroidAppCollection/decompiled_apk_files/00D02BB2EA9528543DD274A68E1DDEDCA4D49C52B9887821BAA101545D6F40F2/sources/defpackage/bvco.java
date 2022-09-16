package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvco  reason: default package */
/* loaded from: classes4.dex */
final class bvco implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvco(bvcn bvcnVar) {
        this.b = bvcnVar.a;
        this.c = bvcnVar.b;
        this.a = bvcnVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhsa dhsaVar = (dhsa) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhsaVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhsa dhsaVar, btzi<dhsa, dhsc> btziVar, Executor executor) {
        return this.b.a().a(dhsaVar, this.a, btziVar, executor);
    }
}
