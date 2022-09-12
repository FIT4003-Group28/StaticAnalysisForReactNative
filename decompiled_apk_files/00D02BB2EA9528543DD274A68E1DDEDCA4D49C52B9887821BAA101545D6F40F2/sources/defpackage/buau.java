package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buau  reason: default package */
/* loaded from: classes4.dex */
final class buau implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buau(buat buatVar) {
        this.b = buatVar.a;
        this.c = buatVar.b;
        this.a = buatVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dryr dryrVar = (dryr) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dryrVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dryr dryrVar, btzi<dryr, dryt> btziVar, Executor executor) {
        return this.b.a().a(dryrVar, this.a, btziVar, executor);
    }
}
