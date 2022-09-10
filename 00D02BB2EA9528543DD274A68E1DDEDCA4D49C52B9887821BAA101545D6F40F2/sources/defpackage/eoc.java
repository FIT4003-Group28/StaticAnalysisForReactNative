package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eoc  reason: default package */
/* loaded from: classes6.dex */
final class eoc implements dxis {
    final /* synthetic */ ftt a;

    public eoc(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        qst qstVar = (qst) obj;
        qstVar.bw = this.a.kt();
        qstVar.a = this.a.tq();
        qstVar.b = (qtt) this.a.eW.np();
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        qstVar.c = sU;
    }
}
