package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bveh  reason: default package */
/* loaded from: classes4.dex */
public final class bveh implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bveh(bveg bvegVar) {
        this.b = bvegVar.a;
        this.c = bvegVar.b;
        this.a = bvegVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvfk dvfkVar = (dvfk) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvfkVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvfk dvfkVar, btzi<dvfk, dvfo> btziVar, Executor executor) {
        return this.b.a().a(dvfkVar, this.a, btziVar, executor);
    }
}
