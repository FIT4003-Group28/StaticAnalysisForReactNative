package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buaw  reason: default package */
/* loaded from: classes4.dex */
final class buaw implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buaw(buav buavVar) {
        this.b = buavVar.a;
        this.c = buavVar.b;
        this.a = buavVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dryv dryvVar = (dryv) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dryvVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dryv dryvVar, btzi<dryv, dryx> btziVar, Executor executor) {
        return this.b.a().a(dryvVar, this.a, btziVar, executor);
    }
}
