package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buza  reason: default package */
/* loaded from: classes4.dex */
public final class buza implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buza(buyz buyzVar) {
        this.b = buyzVar.a;
        this.c = buyzVar.b;
        this.a = buyzVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djzw djzwVar = (djzw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djzwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djzw djzwVar, btzi<djzw, djzy> btziVar, Executor executor) {
        return this.b.a().a(djzwVar, this.a, btziVar, executor);
    }
}
