package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buwa  reason: default package */
/* loaded from: classes4.dex */
public final class buwa implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwa(buvz buvzVar) {
        this.b = buvzVar.a;
        this.c = buvzVar.b;
        this.a = buvzVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djya djyaVar = (djya) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djyaVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djya djyaVar, btzi<djya, djyi> btziVar, Executor executor) {
        return this.b.a().a(djyaVar, this.a, btziVar, executor);
    }
}
