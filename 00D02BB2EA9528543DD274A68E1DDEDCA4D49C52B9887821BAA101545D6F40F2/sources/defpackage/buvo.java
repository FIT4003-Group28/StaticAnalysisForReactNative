package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buvo  reason: default package */
/* loaded from: classes4.dex */
public final class buvo implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buvo(buvn buvnVar) {
        this.b = buvnVar.a;
        this.c = buvnVar.b;
        this.a = buvnVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dipx dipxVar = (dipx) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dipxVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dipx dipxVar, btzi<dipx, dipz> btziVar, Executor executor) {
        return this.b.a().a(dipxVar, this.a, btziVar, executor);
    }
}
