package defpackage;

import android.app.Activity;
import android.text.Spannable;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: avru  reason: default package */
/* loaded from: classes3.dex */
public class avru implements avrs {
    public final btyh a;
    cjkr b;
    private final Activity c;
    private final cjmt d;
    private final acyp e;
    private final avsm f;

    public avru(Activity activity, cjmt cjmtVar, acyp acypVar, avsm avsmVar, btyh btyhVar) {
        this.c = activity;
        this.d = cjmtVar;
        this.e = acypVar;
        this.f = avsmVar;
        this.a = btyhVar;
    }

    @Override // defpackage.avrs
    public CharSequence a() {
        String string = this.c.getString(R.string.WIFI_ONLY_HEADER);
        if (!e()) {
            return string;
        }
        String string2 = this.c.getString(R.string.OFFLINE_MAPS_MISSING_SDCARD_HEADER);
        if (bvox.b(this.c)) {
            StringBuilder sb = new StringBuilder(String.valueOf(string2).length() + 3 + String.valueOf(string).length());
            sb.append(string2);
            sb.append(" • ");
            sb.append(string);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(string2).length());
        sb2.append(string);
        sb2.append(" • ");
        sb2.append(string2);
        return sb2.toString();
    }

    @Override // defpackage.avrs
    public Integer b() {
        return Integer.valueOf(this.d.f(efe.WIFI_ONLY_BANNER));
    }

    @Override // defpackage.avrs
    public cqkl c() {
        bvsx bvsxVar = new bvsx(this.c.getResources());
        bvsu c = bvsxVar.c(R.string.WIFI_ONLY_TITLE);
        c.i();
        Spannable c2 = c.c();
        cjkp B = cjkr.B();
        bvsu c3 = bvsxVar.c(R.string.TURN_OFF_WIFI_ONLY_MODE);
        c3.a(c2);
        B.t(c3.c());
        B.y(this.c.getResources().getString(R.string.CANCEL_BUTTON), null, cjtd.a(dtxx.bD));
        B.z(this.c.getResources().getString(R.string.OK_BUTTON), new View.OnClickListener(this) { // from class: avrt
            private final avru a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a(false);
            }
        }, cjtd.a(dtxx.bE));
        cjkr u = B.u(this.c);
        this.b = u;
        u.q().show();
        return cqkl.a;
    }

    @Override // defpackage.avrs
    public Boolean d() {
        return Boolean.valueOf(this.e.c());
    }

    public boolean e() {
        avzg l = this.f.b().l();
        dbsk.s(l);
        avzc a = l.a();
        return a != null && a.e();
    }
}
