package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fdu  reason: default package */
/* loaded from: classes6.dex */
final class fdu implements dxis {
    final /* synthetic */ ftt a;

    public fdu(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ajgi ajgiVar = (ajgi) obj;
        ajgiVar.b = this.a.eW.ez();
        ajgiVar.c = new ajzv(this.a.p());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ajgiVar.d = sU;
    }
}
