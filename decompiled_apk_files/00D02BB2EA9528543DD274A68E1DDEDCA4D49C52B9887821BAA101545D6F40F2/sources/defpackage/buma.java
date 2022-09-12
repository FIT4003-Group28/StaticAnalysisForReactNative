package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buma  reason: default package */
/* loaded from: classes4.dex */
public final class buma implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buma(bulz bulzVar) {
        this.b = bulzVar.a;
        this.c = bulzVar.b;
        this.a = bulzVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhva dhvaVar = (dhva) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhvaVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhva dhvaVar, btzi<dhva, dhve> btziVar, Executor executor) {
        return this.b.a().a(dhvaVar, this.a, btziVar, executor);
    }
}
