package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buup  reason: default package */
/* loaded from: classes4.dex */
public final class buup implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buup(buuo buuoVar) {
        this.b = buuoVar.a;
        this.c = buuoVar.b;
        this.a = buuoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djio djioVar = (djio) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djioVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djio djioVar, btzi<djio, djiq> btziVar, Executor executor) {
        return this.b.a().a(djioVar, this.a, btziVar, executor);
    }
}
