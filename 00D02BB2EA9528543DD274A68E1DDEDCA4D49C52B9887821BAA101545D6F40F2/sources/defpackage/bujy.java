package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bujy  reason: default package */
/* loaded from: classes4.dex */
public final class bujy implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bujy(bujx bujxVar) {
        this.b = bujxVar.a;
        this.c = bujxVar.b;
        this.a = bujxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhkf dhkfVar = (dhkf) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhkfVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhkf dhkfVar, btzi<dhkf, dhkh> btziVar, Executor executor) {
        return this.b.a().a(dhkfVar, this.a, btziVar, executor);
    }
}
