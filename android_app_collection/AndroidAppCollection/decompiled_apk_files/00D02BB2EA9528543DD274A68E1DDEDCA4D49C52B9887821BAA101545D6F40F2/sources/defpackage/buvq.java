package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buvq  reason: default package */
/* loaded from: classes4.dex */
public final class buvq implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buvq(buvp buvpVar) {
        this.b = buvpVar.a;
        this.c = buvpVar.b;
        this.a = buvpVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        disd disdVar = (disd) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(disdVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(disd disdVar, btzi<disd, disf> btziVar, Executor executor) {
        return this.b.a().a(disdVar, this.a, btziVar, executor);
    }
}
