package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buvk  reason: default package */
/* loaded from: classes4.dex */
public final class buvk implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buvk(buvj buvjVar) {
        this.b = buvjVar.a;
        this.c = buvjVar.b;
        this.a = buvjVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwvz dwvzVar = (dwvz) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwvzVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwvz dwvzVar, btzi<dwvz, dwwb> btziVar, Executor executor) {
        return this.b.a().a(dwvzVar, this.a, btziVar, executor);
    }
}
