package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvah  reason: default package */
/* loaded from: classes4.dex */
public final class bvah implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvah(bvag bvagVar) {
        this.b = bvagVar.a;
        this.c = bvagVar.b;
        this.a = bvagVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkdw dkdwVar = (dkdw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkdwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkdw dkdwVar, btzi<dkdw, dkdy> btziVar, Executor executor) {
        return this.b.a().a(dkdwVar, this.a, btziVar, executor);
    }
}
