package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buoe  reason: default package */
/* loaded from: classes4.dex */
public final class buoe implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buoe(buod buodVar) {
        this.b = buodVar.a;
        this.c = buodVar.b;
        this.a = buodVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhzs dhzsVar = (dhzs) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhzsVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhzs dhzsVar, btzi<dhzs, dhzu> btziVar, Executor executor) {
        return this.b.a().a(dhzsVar, this.a, btziVar, executor);
    }
}
