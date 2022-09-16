package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvfx  reason: default package */
/* loaded from: classes4.dex */
final class bvfx implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvfx(bvfw bvfwVar) {
        this.b = bvfwVar.a;
        this.c = bvfwVar.b;
        this.a = bvfwVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dlzm dlzmVar = (dlzm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dlzmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dlzm dlzmVar, btzi<dlzm, dlzs> btziVar, Executor executor) {
        return this.b.a().a(dlzmVar, this.a, btziVar, executor);
    }
}
