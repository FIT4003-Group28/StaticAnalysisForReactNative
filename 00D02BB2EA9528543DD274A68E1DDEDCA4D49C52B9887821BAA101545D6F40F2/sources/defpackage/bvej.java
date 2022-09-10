package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvej  reason: default package */
/* loaded from: classes4.dex */
public final class bvej implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvej(bvei bveiVar) {
        this.b = bveiVar.a;
        this.c = bveiVar.b;
        this.a = bveiVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        didc didcVar = (didc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(didcVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(didc didcVar, btzi<didc, dide> btziVar, Executor executor) {
        return this.b.a().a(didcVar, this.a, btziVar, executor);
    }
}
