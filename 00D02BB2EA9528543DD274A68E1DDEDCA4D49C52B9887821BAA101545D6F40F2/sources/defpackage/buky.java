package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buky  reason: default package */
/* loaded from: classes4.dex */
public final class buky implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buky(bukx bukxVar) {
        this.b = bukxVar.a;
        this.c = bukxVar.b;
        this.a = bukxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhru dhruVar = (dhru) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhruVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhru dhruVar, btzi<dhru, dhry> btziVar, Executor executor) {
        return this.b.a().a(dhruVar, this.a, btziVar, executor);
    }
}
