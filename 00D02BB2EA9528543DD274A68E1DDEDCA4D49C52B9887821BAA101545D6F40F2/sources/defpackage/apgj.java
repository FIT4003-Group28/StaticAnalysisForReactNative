package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apgj  reason: default package */
/* loaded from: classes2.dex */
public class apgj implements jbk {
    public final gga a;
    public dcdc<jho> b = dcdc.e();
    public String c = "";
    public boolean d = false;
    private final aovg e;
    private final View.OnClickListener f;

    public apgj(gga ggaVar, apjz apjzVar, aovg aovgVar, View.OnClickListener onClickListener) {
        this.a = ggaVar;
        this.e = aovgVar;
        this.f = onClickListener;
    }

    private final String c() {
        aowo aowoVar = aowo.DAY;
        int ordinal = this.e.c().ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return this.a.getString(R.string.MAPS_ACTIVITY_VISITED_CITIES_TITLE);
            }
            if (ordinal == 3) {
                return this.a.getString(R.string.MAPS_ACTIVITY_VISITED_COUNTRIES_TITLE);
            }
            return this.a.getString(R.string.MAPS_ACTIVITY_VISITED_PLACES_TITLE);
        }
        return this.c;
    }

    @Override // defpackage.jbk
    public jib NC() {
        String c;
        jhz a = jhz.a();
        a.a = c();
        if (this.e.c() == aowo.DAY) {
            String str = this.c;
            String string = this.a.getString(true != this.d ? R.string.MAPS_ACTIVITY_TIMELINE_SHOW_CALENDAR : R.string.MAPS_ACTIVITY_TIMELINE_HIDE_CALENDAR);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length());
            sb.append(str);
            sb.append(". ");
            sb.append(string);
            c = sb.toString();
        } else {
            c = c();
        }
        a.n = c;
        a.q = ibm.b();
        a.u = ibm.t();
        a.A = false;
        a.i = cqrt.g(2131232581, ibm.o());
        a.f(new View.OnClickListener(this) { // from class: apgi
            private final apgj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gn g = this.a.a.g();
                if (!g.J()) {
                    g.e();
                }
            }
        });
        a.d(this.b);
        a.l = this.a.getResources().getString(R.string.abc_action_menu_overflow_description);
        a.g = ibm.o();
        a.d = ibm.b();
        a.x = false;
        if (this.e.c() == aowo.DAY) {
            a.m = this.f;
        }
        return a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(eapy eapyVar) {
        this.c = String.format("%s  ▴", apjz.e(eapyVar));
        this.d = true;
    }
}
