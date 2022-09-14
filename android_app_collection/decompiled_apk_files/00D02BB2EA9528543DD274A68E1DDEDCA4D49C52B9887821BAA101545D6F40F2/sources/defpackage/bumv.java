package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bumv  reason: default package */
/* loaded from: classes4.dex */
public final class bumv implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bumv(bumu bumuVar) {
        this.b = bumuVar.a;
        this.c = bumuVar.b;
        this.a = bumuVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        duoz duozVar = (duoz) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(duozVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(duoz duozVar, btzi<duoz, dupb> btziVar, Executor executor) {
        return this.b.a().a(duozVar, this.a, btziVar, executor);
    }
}
