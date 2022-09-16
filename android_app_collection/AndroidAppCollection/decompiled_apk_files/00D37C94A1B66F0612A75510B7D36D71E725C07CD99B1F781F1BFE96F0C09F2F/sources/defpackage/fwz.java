package defpackage;
/* compiled from: PG */
/* renamed from: fwz  reason: default package */
/* loaded from: classes3.dex */
final class fwz implements akev {
    final /* synthetic */ aqgu a;
    final /* synthetic */ acti b;

    public fwz(aqgu aqguVar, acti actiVar) {
        this.a = aqguVar;
        this.b = actiVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        fxb fxbVar = (fxb) obj;
        aqgu aqguVar = this.a;
        acti actiVar = this.b;
        if (actiVar == null || aqguVar == null) {
            return;
        }
        actiVar.q(new acte(aqguVar.f), null);
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        fxb fxbVar = (fxb) obj;
        aqgu aqguVar = this.a;
        acti actiVar = this.b;
        if (actiVar != null) {
            actiVar.v(aqguVar, aqguVar.f, null);
        }
    }
}
