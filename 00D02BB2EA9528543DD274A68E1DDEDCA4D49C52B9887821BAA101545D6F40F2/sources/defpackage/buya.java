package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buya  reason: default package */
/* loaded from: classes4.dex */
public final class buya implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buya(buxz buxzVar) {
        this.b = buxzVar.a;
        this.c = buxzVar.b;
        this.a = buxzVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvto dvtoVar = (dvto) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvtoVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvto dvtoVar, btzi<dvto, dvts> btziVar, Executor executor) {
        return this.b.a().a(dvtoVar, this.a, btziVar, executor);
    }
}
