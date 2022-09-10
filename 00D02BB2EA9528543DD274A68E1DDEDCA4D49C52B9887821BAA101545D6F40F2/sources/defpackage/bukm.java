package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bukm  reason: default package */
/* loaded from: classes4.dex */
public final class bukm implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bukm(bukl buklVar) {
        this.b = buklVar.a;
        this.c = buklVar.b;
        this.a = buklVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djwy djwyVar = (djwy) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djwyVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djwy djwyVar, btzi<djwy, djxa> btziVar, Executor executor) {
        return this.b.a().a(djwyVar, this.a, btziVar, executor);
    }
}
