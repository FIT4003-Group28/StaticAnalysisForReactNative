package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvgb  reason: default package */
/* loaded from: classes4.dex */
public final class bvgb implements bvfz {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvgb(bvga bvgaVar) {
        this.b = bvgaVar.a;
        this.c = bvgaVar.b;
        this.a = bvgaVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dlzu dlzuVar, btzi<dlzu, dlzy> btziVar, bvrj bvrjVar) {
        dlzu dlzuVar2 = dlzuVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dlzuVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dlzu, dlzy>> c(dlzu dlzuVar) {
        return btzj.a(this, dlzuVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dlzu dlzuVar, btzi<dlzu, dlzy> btziVar, Executor executor) {
        return this.b.a().a(dlzuVar, this.a, btziVar, executor);
    }
}
