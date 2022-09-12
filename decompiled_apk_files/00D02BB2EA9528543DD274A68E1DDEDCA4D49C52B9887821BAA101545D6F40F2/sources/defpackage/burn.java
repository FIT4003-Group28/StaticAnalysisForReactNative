package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burn  reason: default package */
/* loaded from: classes4.dex */
public final class burn implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burn(burm burmVar) {
        this.b = burmVar.a;
        this.c = burmVar.b;
        this.a = burmVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djyy djyyVar = (djyy) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djyyVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djyy djyyVar, btzi<djyy, djza> btziVar, Executor executor) {
        return this.b.a().a(djyyVar, this.a, btziVar, executor);
    }
}
