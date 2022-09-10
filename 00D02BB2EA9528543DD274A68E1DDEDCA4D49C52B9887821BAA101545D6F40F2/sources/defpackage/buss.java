package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buss  reason: default package */
/* loaded from: classes4.dex */
public final class buss implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buss(busr busrVar) {
        this.b = busrVar.a;
        this.c = busrVar.b;
        this.a = busrVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dusu dusuVar = (dusu) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dusuVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dusu dusuVar, btzi<dusu, dusw> btziVar, Executor executor) {
        return this.b.a().a(dusuVar, this.a, btziVar, executor);
    }
}
