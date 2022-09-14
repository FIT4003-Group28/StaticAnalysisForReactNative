package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bung  reason: default package */
/* loaded from: classes4.dex */
public final class bung implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bung(bunf bunfVar) {
        this.b = bunfVar.a;
        this.c = bunfVar.b;
        this.a = bunfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhwm dhwmVar = (dhwm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhwmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhwm dhwmVar, btzi<dhwm, dhwq> btziVar, Executor executor) {
        return this.b.a().a(dhwmVar, this.a, btziVar, executor);
    }
}
