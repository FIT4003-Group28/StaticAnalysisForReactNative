package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buni  reason: default package */
/* loaded from: classes4.dex */
public final class buni implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buni(bunh bunhVar) {
        this.b = bunhVar.a;
        this.c = bunhVar.b;
        this.a = bunhVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dijr dijrVar = (dijr) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dijrVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dijr dijrVar, btzi<dijr, dijt> btziVar, Executor executor) {
        return this.b.a().a(dijrVar, this.a, btziVar, executor);
    }
}
