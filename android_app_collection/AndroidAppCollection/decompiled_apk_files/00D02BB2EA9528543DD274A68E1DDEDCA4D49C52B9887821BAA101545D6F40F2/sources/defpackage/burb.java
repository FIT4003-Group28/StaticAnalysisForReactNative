package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burb  reason: default package */
/* loaded from: classes4.dex */
public final class burb implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burb(bura buraVar) {
        this.b = buraVar.a;
        this.c = buraVar.b;
        this.a = buraVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diez diezVar = (diez) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diezVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diez diezVar, btzi<diez, diff> btziVar, Executor executor) {
        return this.b.a().a(diezVar, this.a, btziVar, executor);
    }
}
