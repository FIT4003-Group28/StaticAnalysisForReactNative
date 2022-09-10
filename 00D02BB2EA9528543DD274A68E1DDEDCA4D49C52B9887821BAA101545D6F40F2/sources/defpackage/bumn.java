package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bumn  reason: default package */
/* loaded from: classes4.dex */
public final class bumn implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bumn(bumm bummVar) {
        this.b = bummVar.a;
        this.c = bummVar.b;
        this.a = bummVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diqj diqjVar = (diqj) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diqjVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diqj diqjVar, btzi<diqj, diql> btziVar, Executor executor) {
        return this.b.a().a(diqjVar, this.a, btziVar, executor);
    }
}
