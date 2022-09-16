package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buxx  reason: default package */
/* loaded from: classes4.dex */
public final class buxx implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buxx(buxw buxwVar) {
        this.b = buxwVar.a;
        this.c = buxwVar.b;
        this.a = buxwVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwjd dwjdVar = (dwjd) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwjdVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwjd dwjdVar, btzi<dwjd, dwjf> btziVar, Executor executor) {
        return this.b.a().a(dwjdVar, this.a, btziVar, executor);
    }
}
