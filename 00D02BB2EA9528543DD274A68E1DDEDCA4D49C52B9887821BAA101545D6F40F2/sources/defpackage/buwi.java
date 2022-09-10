package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buwi  reason: default package */
/* loaded from: classes4.dex */
public final class buwi implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwi(buwh buwhVar) {
        this.b = buwhVar.a;
        this.c = buwhVar.b;
        this.a = buwhVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwgv dwgvVar = (dwgv) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwgvVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwgv dwgvVar, btzi<dwgv, dwgx> btziVar, Executor executor) {
        return this.b.a().a(dwgvVar, this.a, btziVar, executor);
    }
}
