package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvcx  reason: default package */
/* loaded from: classes4.dex */
public final class bvcx implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvcx(bvcw bvcwVar) {
        this.b = bvcwVar.a;
        this.c = bvcwVar.b;
        this.a = bvcwVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        ditc ditcVar = (ditc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(ditcVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(ditc ditcVar, btzi<ditc, dite> btziVar, Executor executor) {
        return this.b.a().a(ditcVar, this.a, btziVar, executor);
    }
}
