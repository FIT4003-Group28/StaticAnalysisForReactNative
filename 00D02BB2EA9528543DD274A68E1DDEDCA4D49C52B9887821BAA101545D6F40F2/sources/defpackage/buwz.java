package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buwz  reason: default package */
/* loaded from: classes4.dex */
public final class buwz implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwz(buwy buwyVar) {
        this.b = buwyVar.a;
        this.c = buwyVar.b;
        this.a = buwyVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwgz dwgzVar = (dwgz) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwgzVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwgz dwgzVar, btzi<dwgz, dwhd> btziVar, Executor executor) {
        return this.b.a().a(dwgzVar, this.a, btziVar, executor);
    }
}
