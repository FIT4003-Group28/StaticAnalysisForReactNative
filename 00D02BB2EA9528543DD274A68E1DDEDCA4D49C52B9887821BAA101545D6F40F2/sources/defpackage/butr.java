package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: butr  reason: default package */
/* loaded from: classes4.dex */
public final class butr implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public butr(butq butqVar) {
        this.b = butqVar.a;
        this.c = butqVar.b;
        this.a = butqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dils dilsVar = (dils) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dilsVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dils dilsVar, btzi<dils, dilu> btziVar, Executor executor) {
        return this.b.a().a(dilsVar, this.a, btziVar, executor);
    }
}
