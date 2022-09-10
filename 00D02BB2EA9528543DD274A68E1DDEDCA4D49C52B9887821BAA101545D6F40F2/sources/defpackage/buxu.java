package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buxu  reason: default package */
/* loaded from: classes4.dex */
public final class buxu implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buxu(buxt buxtVar) {
        this.b = buxtVar.a;
        this.c = buxtVar.b;
        this.a = buxtVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djrc djrcVar = (djrc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djrcVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djrc djrcVar, btzi<djrc, djre> btziVar, Executor executor) {
        return this.b.a().a(djrcVar, this.a, btziVar, executor);
    }
}
