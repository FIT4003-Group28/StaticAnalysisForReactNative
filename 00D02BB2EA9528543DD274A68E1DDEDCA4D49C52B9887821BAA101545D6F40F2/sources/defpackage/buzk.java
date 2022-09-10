package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buzk  reason: default package */
/* loaded from: classes4.dex */
public final class buzk implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buzk(buzj buzjVar) {
        this.b = buzjVar.a;
        this.c = buzjVar.b;
        this.a = buzjVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkay dkayVar = (dkay) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkayVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkay dkayVar, btzi<dkay, dkba> btziVar, Executor executor) {
        return this.b.a().a(dkayVar, this.a, btziVar, executor);
    }
}
