package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bume  reason: default package */
/* loaded from: classes4.dex */
public final class bume implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bume(bumd bumdVar) {
        this.b = bumdVar.a;
        this.c = bumdVar.b;
        this.a = bumdVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhvk dhvkVar = (dhvk) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhvkVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhvk dhvkVar, btzi<dhvk, dhvm> btziVar, Executor executor) {
        return this.b.a().a(dhvkVar, this.a, btziVar, executor);
    }
}
