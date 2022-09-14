package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burh  reason: default package */
/* loaded from: classes4.dex */
public final class burh implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burh(burg burgVar) {
        this.b = burgVar.a;
        this.c = burgVar.b;
        this.a = burgVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        difr difrVar = (difr) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(difrVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(difr difrVar, btzi<difr, digc> btziVar, Executor executor) {
        return this.b.a().a(difrVar, this.a, btziVar, executor);
    }
}
