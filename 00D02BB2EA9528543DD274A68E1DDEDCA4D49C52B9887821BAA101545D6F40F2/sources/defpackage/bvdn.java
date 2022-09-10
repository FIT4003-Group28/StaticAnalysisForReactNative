package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdn  reason: default package */
/* loaded from: classes4.dex */
public final class bvdn implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdn(bvdm bvdmVar) {
        this.b = bvdmVar.a;
        this.c = bvdmVar.b;
        this.a = bvdmVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dimc dimcVar = (dimc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dimcVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dimc dimcVar, btzi<dimc, dime> btziVar, Executor executor) {
        return this.b.a().a(dimcVar, this.a, btziVar, executor);
    }
}
