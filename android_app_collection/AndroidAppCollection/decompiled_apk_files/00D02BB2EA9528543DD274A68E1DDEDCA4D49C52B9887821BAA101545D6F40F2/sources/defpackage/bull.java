package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bull  reason: default package */
/* loaded from: classes.dex */
public final class bull implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bull(bulk bulkVar) {
        this.b = bulkVar.a;
        this.c = bulkVar.b;
        this.a = bulkVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvoj dvojVar = (dvoj) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvojVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvoj dvojVar, btzi<dvoj, dvon> btziVar, Executor executor) {
        return this.b.a().a(dvojVar, this.a, btziVar, executor);
    }
}
