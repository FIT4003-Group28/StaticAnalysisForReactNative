package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvcl  reason: default package */
/* loaded from: classes4.dex */
public final class bvcl implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvcl(bvck bvckVar) {
        this.b = bvckVar.a;
        this.c = bvckVar.b;
        this.a = bvckVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwdc dwdcVar = (dwdc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwdcVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwdc dwdcVar, btzi<dwdc, dwde> btziVar, Executor executor) {
        return this.b.a().a(dwdcVar, this.a, btziVar, executor);
    }
}
