package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buva  reason: default package */
/* loaded from: classes4.dex */
public final class buva implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buva(buuz buuzVar) {
        this.b = buuzVar.a;
        this.c = buuzVar.b;
        this.a = buuzVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwtm dwtmVar = (dwtm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwtmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwtm dwtmVar, btzi<dwtm, dwul> btziVar, Executor executor) {
        return this.b.a().a(dwtmVar, this.a, btziVar, executor);
    }
}
