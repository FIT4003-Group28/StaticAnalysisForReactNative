package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buog  reason: default package */
/* loaded from: classes4.dex */
public final class buog implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buog(buof buofVar) {
        this.b = buofVar.a;
        this.c = buofVar.b;
        this.a = buofVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhzw dhzwVar = (dhzw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhzwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhzw dhzwVar, btzi<dhzw, dhzy> btziVar, Executor executor) {
        return this.b.a().a(dhzwVar, this.a, btziVar, executor);
    }
}
