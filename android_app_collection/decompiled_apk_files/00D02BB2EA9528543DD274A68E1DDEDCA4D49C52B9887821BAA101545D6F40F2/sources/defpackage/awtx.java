package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awtx  reason: default package */
/* loaded from: classes3.dex */
public class awtx implements jbk {
    private final jib a;
    private final jib b;
    private jib c;

    public awtx(Activity activity, cqhn cqhnVar) {
        jhz jhzVar = new jhz();
        jhzVar.q = cqta.f();
        jhzVar.g = ibm.b();
        jhzVar.E = 1;
        jhzVar.d = irn.N();
        jhzVar.j = cqrt.l(R.string.BACK_BUTTON);
        jhzVar.a = activity.getString(R.string.PARKING_LOCATION_SHEET_HEADER_TITLE);
        jhzVar.f(new awtw(activity));
        jib b = jhzVar.b();
        this.b = b;
        jhz e = b.e();
        e.g = ibl.b();
        jib b2 = e.b();
        this.a = b2;
        this.c = b2;
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.c;
    }

    public void b(jjn jjnVar) {
        jib jibVar = jjnVar == jjn.FULLY_EXPANDED ? this.b : this.a;
        if (!this.c.equals(jibVar)) {
            this.c = jibVar;
            cqkx.p(this);
        }
    }
}
