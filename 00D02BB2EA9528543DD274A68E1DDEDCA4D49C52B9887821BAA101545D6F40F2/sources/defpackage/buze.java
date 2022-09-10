package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buze  reason: default package */
/* loaded from: classes4.dex */
public final class buze implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buze(buzd buzdVar) {
        this.b = buzdVar.a;
        this.c = buzdVar.b;
        this.a = buzdVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkaq dkaqVar = (dkaq) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkaqVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkaq dkaqVar, btzi<dkaq, dkas> btziVar, Executor executor) {
        return this.b.a().a(dkaqVar, this.a, btziVar, executor);
    }
}
