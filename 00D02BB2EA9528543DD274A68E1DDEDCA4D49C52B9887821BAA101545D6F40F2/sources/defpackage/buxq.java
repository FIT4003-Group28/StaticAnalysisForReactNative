package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buxq  reason: default package */
/* loaded from: classes4.dex */
final class buxq implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buxq(buxp buxpVar) {
        this.b = buxpVar.a;
        this.c = buxpVar.b;
        this.a = buxpVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djqw djqwVar = (djqw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djqwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djqw djqwVar, btzi<djqw, djqy> btziVar, Executor executor) {
        return this.b.a().a(djqwVar, this.a, btziVar, executor);
    }
}
