package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eky  reason: default package */
/* loaded from: classes6.dex */
final class eky implements dxis {
    final /* synthetic */ fyu a;

    public eky(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ajzk ajzkVar = (ajzk) obj;
        ajzkVar.a = this.a.es();
        this.a.eP();
        akfa rK = this.a.a.rK();
        dxjg.e(rK);
        ajzkVar.b = rK;
        ajzkVar.c = this.a.hy();
        Executor sV = this.a.a.sV();
        dxjg.e(sV);
        ajzkVar.d = sV;
        Executor sU = this.a.a.sU();
        dxjg.e(sU);
        ajzkVar.e = sU;
    }
}
