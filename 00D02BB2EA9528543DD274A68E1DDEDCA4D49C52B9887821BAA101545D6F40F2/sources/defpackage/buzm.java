package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buzm  reason: default package */
/* loaded from: classes4.dex */
public final class buzm implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buzm(buzl buzlVar) {
        this.b = buzlVar.a;
        this.c = buzlVar.b;
        this.a = buzlVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        duvu duvuVar = (duvu) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(duvuVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(duvu duvuVar, btzi<duvu, duvx> btziVar, Executor executor) {
        return this.b.a().a(duvuVar, this.a, btziVar, executor);
    }
}
