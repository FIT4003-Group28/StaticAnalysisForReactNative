package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buzg  reason: default package */
/* loaded from: classes4.dex */
public final class buzg implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buzg(buzf buzfVar) {
        this.b = buzfVar.a;
        this.c = buzfVar.b;
        this.a = buzfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkam dkamVar = (dkam) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkamVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkam dkamVar, btzi<dkam, dkao> btziVar, Executor executor) {
        return this.b.a().a(dkamVar, this.a, btziVar, executor);
    }
}
