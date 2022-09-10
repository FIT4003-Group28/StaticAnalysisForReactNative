package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdy  reason: default package */
/* loaded from: classes4.dex */
public final class bvdy implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdy(bvdx bvdxVar) {
        this.b = bvdxVar.a;
        this.c = bvdxVar.b;
        this.a = bvdxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djsv djsvVar = (djsv) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djsvVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djsv djsvVar, btzi<djsv, djsz> btziVar, Executor executor) {
        return this.b.a().a(djsvVar, this.a, btziVar, executor);
    }
}
