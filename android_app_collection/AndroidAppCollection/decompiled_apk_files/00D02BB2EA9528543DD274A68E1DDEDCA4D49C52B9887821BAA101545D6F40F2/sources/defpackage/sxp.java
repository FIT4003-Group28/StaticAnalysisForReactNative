package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sxp  reason: default package */
/* loaded from: classes7.dex */
public class sxp implements sun {
    private final jkf a;
    private final Activity b;
    private boolean c;

    public sxp(Activity activity, jkf jkfVar, cqhn cqhnVar) {
        this.b = activity;
        this.a = jkfVar;
        this.c = jkfVar.l().L() == jjn.COLLAPSED;
    }

    @Override // defpackage.sun
    public cqtd a() {
        if (this.c) {
            return cqrt.f(2131232316);
        }
        return cqrt.f(2131232773);
    }

    @Override // defpackage.sun
    public String b() {
        if (this.c) {
            return this.b.getString(R.string.SLIDER_STATE_TOGGLE_STEPS);
        }
        return this.b.getString(R.string.SLIDER_STATE_TOGGLE_SHOW_MAP);
    }

    @Override // defpackage.sun
    public String c() {
        return sum.a(this);
    }

    @Override // defpackage.sun
    @dzsi
    public cjtd d() {
        return null;
    }

    @Override // defpackage.sun
    public cqkl e() {
        if (this.c) {
            this.a.B(jjn.FULLY_EXPANDED);
        } else {
            this.a.B(jjn.COLLAPSED);
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.sun
    public Boolean f() {
        return sum.c();
    }

    @Override // defpackage.sun
    public Boolean g() {
        return sum.b();
    }

    public void h(jjn jjnVar) {
        boolean z = jjnVar == jjn.COLLAPSED;
        if (this.c != z) {
            this.c = z;
            cqkx.p(this);
        }
    }
}
