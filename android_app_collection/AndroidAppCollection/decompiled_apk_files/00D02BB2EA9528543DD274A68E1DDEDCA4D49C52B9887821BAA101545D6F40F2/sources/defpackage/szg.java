package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: szg  reason: default package */
/* loaded from: classes7.dex */
public class szg extends szn implements syx {
    @dzsi
    private final szf a;
    private final sxp b;

    public szg(Activity activity, sxq sxqVar, wts wtsVar, tlv tlvVar, amve amveVar) {
        this.a = new szf(activity, wtsVar, tlvVar, amveVar);
        this.b = sxqVar.a();
    }

    @Override // defpackage.szn
    public void OI(jjn jjnVar) {
        this.b.h(jjnVar);
    }

    @Override // defpackage.syx
    public dcdc<cqix<?>> a() {
        return dcdc.g(cqgr.fT(new sua(), this.a), cqgr.fT(new sua(), this.b));
    }
}
