package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: szf  reason: default package */
/* loaded from: classes7.dex */
public class szf implements sun {
    @dzsi
    private final wtr a;
    private final String b;
    private final cqtd c;
    private final cjtd d;

    public szf(Activity activity, wts wtsVar, tlv tlvVar, amve amveVar) {
        String string;
        cqtd f;
        cjtd u;
        dbsg<amub> A = tlvVar.A(amveVar, activity);
        wtr a = A.a() ? wtsVar.a(A.b()) : null;
        this.a = a;
        boolean z = false;
        if (a != null && a.a()) {
            z = true;
        }
        if (z) {
            string = activity.getString(R.string.PERSISTENT_FOOTER_START_BUTTON);
        } else {
            string = activity.getString(R.string.NAVIGATION_FAB_LABEL_PREVIEW);
        }
        this.b = string;
        if (z) {
            f = cqrt.f(2131232359);
        } else {
            f = cqrt.f(2131231594);
        }
        this.c = f;
        if (z) {
            u = vyb.u(amveVar, dtxn.cV);
        } else {
            u = vyb.u(amveVar, dtxn.cU);
        }
        this.d = u;
    }

    @Override // defpackage.sun
    public cqtd a() {
        return this.c;
    }

    @Override // defpackage.sun
    public String b() {
        return this.b;
    }

    @Override // defpackage.sun
    public String c() {
        return sum.a(this);
    }

    @Override // defpackage.sun
    @dzsi
    public cjtd d() {
        return this.d;
    }

    @Override // defpackage.sun
    public cqkl e() {
        wtr wtrVar = this.a;
        if (wtrVar != null) {
            wtrVar.b();
        }
        return cqkl.a;
    }

    @Override // defpackage.sun
    public Boolean f() {
        return true;
    }

    @Override // defpackage.sun
    public Boolean g() {
        return sum.b();
    }
}
