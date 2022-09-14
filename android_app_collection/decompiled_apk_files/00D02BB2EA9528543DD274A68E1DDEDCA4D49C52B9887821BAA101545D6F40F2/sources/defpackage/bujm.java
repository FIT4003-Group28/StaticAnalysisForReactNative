package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bujm  reason: default package */
/* loaded from: classes4.dex */
public final class bujm implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bujm(bujl bujlVar) {
        this.b = bujlVar.a;
        this.c = bujlVar.b;
        this.a = bujlVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dukl duklVar = (dukl) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(duklVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dukl duklVar, btzi<dukl, dukn> btziVar, Executor executor) {
        return this.b.a().a(duklVar, this.a, btziVar, executor);
    }
}
