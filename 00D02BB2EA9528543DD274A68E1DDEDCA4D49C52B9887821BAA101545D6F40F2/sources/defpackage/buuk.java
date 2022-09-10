package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buuk  reason: default package */
/* loaded from: classes4.dex */
public final class buuk implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buuk(buuj buujVar) {
        this.b = buujVar.a;
        this.c = buujVar.b;
        this.a = buujVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dipt diptVar = (dipt) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diptVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dipt diptVar, btzi<dipt, dipv> btziVar, Executor executor) {
        return this.b.a().a(diptVar, this.a, btziVar, executor);
    }
}
