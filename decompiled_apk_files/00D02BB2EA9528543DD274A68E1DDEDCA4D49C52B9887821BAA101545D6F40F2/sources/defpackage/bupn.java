package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupn  reason: default package */
/* loaded from: classes4.dex */
public final class bupn implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupn(bupm bupmVar) {
        this.b = bupmVar.a;
        this.c = bupmVar.b;
        this.a = bupmVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dibg dibgVar = (dibg) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dibgVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dibg dibgVar, btzi<dibg, dibi> btziVar, Executor executor) {
        return this.b.a().a(dibgVar, this.a, btziVar, executor);
    }
}
