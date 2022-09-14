package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buyp  reason: default package */
/* loaded from: classes4.dex */
public final class buyp implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buyp(buyo buyoVar) {
        this.b = buyoVar.a;
        this.c = buyoVar.b;
        this.a = buyoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djvw djvwVar = (djvw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djvwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djvw djvwVar, btzi<djvw, djwa> btziVar, Executor executor) {
        return this.b.a().a(djvwVar, this.a, btziVar, executor);
    }
}
