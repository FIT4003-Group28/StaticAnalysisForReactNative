package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brwb  reason: default package */
/* loaded from: classes4.dex */
public class brwb implements brvc {
    private final beey a;
    private final bkeq b;
    private final bego c;
    private boolean d = false;
    private boolean e;

    public brwb(beez beezVar, bker bkerVar, Activity activity, btvo btvoVar, bego begoVar, Runnable runnable) {
        acmw b;
        if (btvoVar.getAdsParameters().l) {
            String string = activity.getString(R.string.AD);
            activity.getResources();
            b = acpd.a(string);
        } else {
            String string2 = activity.getString(R.string.AD);
            int a = dujv.a(btvoVar.getAdsParameters().b);
            b = acpd.b(string2, a == 0 ? 1 : a, activity.getResources());
        }
        this.b = bkerVar.a(b, true, runnable);
        this.a = beezVar.a(beex.PLACESHEET_HEADER);
        this.c = begoVar;
    }

    @Override // defpackage.brvc
    public Boolean a() {
        boolean z = true;
        if (!this.b.v().booleanValue() && !this.a.v().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvc
    public Boolean b() {
        boolean z = false;
        if (a().booleanValue() && !this.c.d() && !this.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvc
    public Boolean c() {
        boolean z = false;
        if (a().booleanValue() && this.c.d() && !this.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvc
    @dzsi
    public beer d() {
        if (this.e) {
            return null;
        }
        if (this.b.w().booleanValue()) {
            return this.b;
        }
        if (!this.a.w().booleanValue()) {
            return null;
        }
        return this.a;
    }

    @Override // defpackage.brvc
    public void e(ilo iloVar) {
        this.b.x(iloVar.cD());
        this.a.z(iloVar);
        boolean z = false;
        if (!this.d && this.c.a(iloVar) && this.c.e()) {
            z = true;
        }
        this.e = z;
    }

    @Override // defpackage.brvc
    public void f(boolean z) {
        this.d = true;
    }
}
