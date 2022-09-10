package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbcm  reason: default package */
/* loaded from: classes3.dex */
public class bbcm implements iao {
    private final String a;
    private final cjtd b;
    private final Activity c;
    private final axwq d;
    private final hxy e;

    public bbcm(String str, ddho ddhoVar, Activity activity, cqhn cqhnVar, axwq axwqVar) {
        this.a = str;
        this.b = cjtd.a(ddhoVar);
        this.c = activity;
        this.d = axwqVar;
        hxz f = hya.f(cqhnVar);
        f.c(cjtd.a(dtyd.dl));
        this.e = f.a();
    }

    @Override // defpackage.iao
    public cjtd b() {
        return this.b;
    }

    @Override // defpackage.iao
    public CharSequence c() {
        return d().booleanValue() ? this.c.getString(R.string.YOUR_PLACES_TAB_NEW_UPDATES, new Object[]{this.a}) : this.a;
    }

    @Override // defpackage.iao
    public Boolean d() {
        boolean z = false;
        if (this.a.equals(this.c.getString(R.string.YOUR_PLACES_UPCOMING_TRIPS_RESERVATIONS)) && this.d.y().f()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.iao
    public hxy e() {
        return this.e;
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }

    @Override // defpackage.iao
    /* renamed from: g */
    public String a() {
        return this.a;
    }
}
