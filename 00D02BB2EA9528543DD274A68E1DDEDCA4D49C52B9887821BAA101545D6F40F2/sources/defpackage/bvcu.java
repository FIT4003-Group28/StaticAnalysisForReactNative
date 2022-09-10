package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvcu  reason: default package */
/* loaded from: classes4.dex */
public final class bvcu implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvcu(bvct bvctVar) {
        this.b = bvctVar.a;
        this.c = bvctVar.b;
        this.a = bvctVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwdg dwdgVar = (dwdg) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwdgVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwdg dwdgVar, btzi<dwdg, dwdi> btziVar, Executor executor) {
        return this.b.a().a(dwdgVar, this.a, btziVar, executor);
    }
}
