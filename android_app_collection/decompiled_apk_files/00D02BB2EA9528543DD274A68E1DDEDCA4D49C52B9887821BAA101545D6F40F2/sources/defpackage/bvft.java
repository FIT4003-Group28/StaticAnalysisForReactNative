package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvft  reason: default package */
/* loaded from: classes4.dex */
public final class bvft implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvft(bvfs bvfsVar) {
        this.b = bvfsVar.a;
        this.c = bvfsVar.b;
        this.a = bvfsVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvrc dvrcVar = (dvrc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvrcVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvrc dvrcVar, btzi<dvrc, dvre> btziVar, Executor executor) {
        return this.b.a().a(dvrcVar, this.a, btziVar, executor);
    }
}
