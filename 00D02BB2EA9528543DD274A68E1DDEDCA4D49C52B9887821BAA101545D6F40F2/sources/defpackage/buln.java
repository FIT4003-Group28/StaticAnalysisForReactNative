package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buln  reason: default package */
/* loaded from: classes4.dex */
public final class buln implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buln(bulm bulmVar) {
        this.b = bulmVar.a;
        this.c = bulmVar.b;
        this.a = bulmVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhtm dhtmVar = (dhtm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhtmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhtm dhtmVar, btzi<dhtm, dhto> btziVar, Executor executor) {
        return this.b.a().a(dhtmVar, this.a, btziVar, executor);
    }
}
