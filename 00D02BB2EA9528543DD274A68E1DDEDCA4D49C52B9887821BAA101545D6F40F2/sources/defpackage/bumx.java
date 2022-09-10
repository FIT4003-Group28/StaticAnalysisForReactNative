package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bumx  reason: default package */
/* loaded from: classes4.dex */
public final class bumx implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bumx(bumw bumwVar) {
        this.b = bumwVar.a;
        this.c = bumwVar.b;
        this.a = bumwVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dupe dupeVar = (dupe) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dupeVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dupe dupeVar, btzi<dupe, dupg> btziVar, Executor executor) {
        return this.b.a().a(dupeVar, this.a, btziVar, executor);
    }
}
