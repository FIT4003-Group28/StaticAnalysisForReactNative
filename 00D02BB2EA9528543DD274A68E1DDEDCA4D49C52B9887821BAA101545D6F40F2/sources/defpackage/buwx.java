package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buwx  reason: default package */
/* loaded from: classes4.dex */
public final class buwx implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwx(buww buwwVar) {
        this.b = buwwVar.a;
        this.c = buwwVar.b;
        this.a = buwwVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djos djosVar = (djos) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djosVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djos djosVar, btzi<djos, djov> btziVar, Executor executor) {
        return this.b.a().a(djosVar, this.a, btziVar, executor);
    }
}
