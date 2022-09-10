package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buyv  reason: default package */
/* loaded from: classes4.dex */
public final class buyv implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buyv(buyu buyuVar) {
        this.b = buyuVar.a;
        this.c = buyuVar.b;
        this.a = buyuVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvvi dvviVar = (dvvi) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvviVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvvi dvviVar, btzi<dvvi, dvvm> btziVar, Executor executor) {
        return this.b.a().a(dvviVar, this.a, btziVar, executor);
    }
}
