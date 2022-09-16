package defpackage;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zpb  reason: default package */
/* loaded from: classes7.dex */
public class zpb implements zdi {
    final /* synthetic */ zpe a;

    public zpb(zpe zpeVar) {
        this.a = zpeVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        boolean z = false;
        if (this.a.i.getTransitTrackingParameters().t) {
            zpe zpeVar = this.a;
            if (zpeVar.l.e(zpeVar.g)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zdi
    public Boolean b() {
        boolean z = false;
        if (this.a.i.getTransitTripCheckInParameters().a && a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jad
    public cqkl c() {
        return this.a.af();
    }

    @Override // defpackage.jad
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtyc.cN;
        return b.a();
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }

    @Override // defpackage.zdi
    @dzsi
    public CharSequence j() {
        String string;
        dpbw dpbwVar = dpbw.UNKNOWN;
        int a = dkwh.a(this.a.i.getTransitTripCheckInParameters().b);
        if (a == 0) {
            a = 1;
        }
        switch (a - 1) {
            case 1:
                string = this.a.m.getString(R.string.VIEW_ROUTE_AND_CHECK_IN_BUTTON);
                break;
            case 2:
                string = this.a.m.getString(R.string.VIEW_GUIDE_AND_CHECK_IN_BUTTON);
                break;
            case 3:
                string = this.a.m.getString(R.string.NAVIGATION_GO_AND_CHECK_IN_BUTTON);
                break;
            case 4:
                string = this.a.m.getString(R.string.NAVIGATE_AND_CHECK_IN_BUTTON);
                break;
            case 5:
                string = this.a.m.getString(R.string.START_NAVIGATION_AND_CHECK_IN_BUTTON);
                break;
            case 6:
                string = this.a.y();
                break;
            default:
                return null;
        }
        if (string == null) {
            return null;
        }
        return TextUtils.ellipsize(string, new TextPaint(), 75.0f, TextUtils.TruncateAt.END);
    }

    @Override // defpackage.zdi
    @dzsi
    public CharSequence k() {
        zpe zpeVar = this.a;
        int i = zpeVar.o + 1;
        dpbw dpbwVar = dpbw.UNKNOWN;
        int a = dkwh.a(zpeVar.i.getTransitTripCheckInParameters().b);
        if (a == 0) {
            a = 1;
        }
        switch (a - 1) {
            case 1:
                return this.a.m.getResources().getQuantityString(R.plurals.ACCESSIBILITY_VIEW_ROUTE_AND_CHECK_IN_WITH_ROUTE, i, Integer.valueOf(i));
            case 2:
                return this.a.m.getResources().getQuantityString(R.plurals.ACCESSIBILITY_VIEW_GUIDE_AND_CHECK_IN_WITH_ROUTE, i, Integer.valueOf(i));
            case 3:
                return this.a.m.getResources().getQuantityString(R.plurals.ACCESSIBILITY_NAVIGATION_GO_AND_CHECK_IN_WITH_ROUTE, i, Integer.valueOf(i));
            case 4:
                return this.a.m.getResources().getQuantityString(R.plurals.ACCESSIBILITY_NAVIGATE_AND_CHECK_IN_WITH_ROUTE, i, Integer.valueOf(i));
            case 5:
                return this.a.m.getResources().getQuantityString(R.plurals.ACCESSIBILITY_START_NAVIGATION_AND_CHECK_IN_WITH_ROUTE, i, Integer.valueOf(i));
            case 6:
                return this.a.S();
            default:
                return this.a.m.getResources().getQuantityString(R.plurals.ACCESSIBILITY_START_NAVIGATION_WITH_ROUTE, i, Integer.valueOf(i));
        }
    }

    @Override // defpackage.zdi
    @dzsi
    public CharSequence l() {
        Resources resources = this.a.m.getResources();
        int i = this.a.o + 1;
        return resources.getQuantityString(R.plurals.ACCESSIBILITY_START_NAVIGATION_WITH_ROUTE, i, Integer.valueOf(i));
    }

    @Override // defpackage.jad
    /* renamed from: m */
    public String e() {
        return this.a.j;
    }
}
