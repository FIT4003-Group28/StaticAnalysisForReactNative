package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bumr  reason: default package */
/* loaded from: classes4.dex */
public final class bumr implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bumr(bumq bumqVar) {
        this.b = bumqVar.a;
        this.c = bumqVar.b;
        this.a = bumqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djxc djxcVar = (djxc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djxcVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djxc djxcVar, btzi<djxc, djxk> btziVar, Executor executor) {
        return this.b.a().a(djxcVar, this.a, btziVar, executor);
    }
}
