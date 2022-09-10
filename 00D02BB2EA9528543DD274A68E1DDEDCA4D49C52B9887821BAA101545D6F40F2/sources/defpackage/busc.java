package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: busc  reason: default package */
/* loaded from: classes4.dex */
public final class busc implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public busc(busb busbVar) {
        this.b = busbVar.a;
        this.c = busbVar.b;
        this.a = busbVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        digz digzVar = (digz) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(digzVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(digz digzVar, btzi<digz, dihh> btziVar, Executor executor) {
        return this.b.a().a(digzVar, this.a, btziVar, executor);
    }
}
