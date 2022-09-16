package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fgb  reason: default package */
/* loaded from: classes6.dex */
final class fgb implements dxis {
    final /* synthetic */ ftt a;

    public fgb(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cedo cedoVar = (cedo) obj;
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cedoVar.a = sU;
        cedoVar.b = this.a.eW.vj();
    }
}
