package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tal  reason: default package */
/* loaded from: classes7.dex */
public class tal implements taj {
    private final suv a;
    @dzsi
    private final String b;

    public tal(Activity activity, suv suvVar, vpd vpdVar, tlv tlvVar, amve amveVar) {
        this.a = suvVar;
        dqvj b = vyb.b(amveVar);
        dbsk.s(b);
        dwao dwaoVar = tlvVar.d().k().g;
        this.b = vmu.getAppliedDirectionsOptionsText(vpdVar, b, activity, dwaoVar == null ? dwao.R : dwaoVar);
    }

    @Override // defpackage.taj
    @dzsi
    public String a() {
        return this.b;
    }

    @Override // defpackage.taj
    public cqkl b() {
        this.a.i(true);
        return cqkl.a;
    }
}
