package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apjv  reason: default package */
/* loaded from: classes2.dex */
public class apjv {
    public final gga a;
    public final anhg b;
    public final dxio<ache> c;
    public final apkm d;
    public final cpv e;

    public apjv(gga ggaVar, anhg anhgVar, dxio<ache> dxioVar, apkm apkmVar, cpv cpvVar) {
        this.a = ggaVar;
        this.b = anhgVar;
        this.c = dxioVar;
        this.d = apkmVar;
        this.e = cpvVar;
    }

    public final jhz a() {
        jhz jhzVar = new jhz();
        jhzVar.a = " ";
        jhzVar.f(g());
        jhzVar.q = cqta.f();
        jhzVar.x = false;
        return jhzVar;
    }

    public final jho b() {
        jhm jhmVar = new jhm();
        jhmVar.a = k(R.string.SETTINGS_AND_PRIVACY_MENU_ITEM);
        jhmVar.h = 0;
        jhmVar.d(new View.OnClickListener(this) { // from class: apjh
            private final apjv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.m();
            }
        });
        return jhmVar.c();
    }

    public final jho c(final apjs apjsVar) {
        jhm jhmVar = new jhm();
        jhmVar.a = k(R.string.MAPS_ACTIVITY_DELETE_DAY_MENU);
        jhmVar.h = 0;
        jhmVar.d(new View.OnClickListener(apjsVar) { // from class: apjl
            private final apjs a;

            {
                this.a = apjsVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
        jhmVar.f = cjtd.a(dtyi.al);
        return jhmVar.c();
    }

    public final jho d(final apju apjuVar) {
        jhm jhmVar = new jhm();
        jhmVar.a = k(R.string.MAPS_ACTIVITY_REMOVE_STOP_FROM_DAY_MENU);
        jhmVar.b = k(R.string.MAPS_ACTIVITY_REMOVE_STOP_FROM_DAY_MENU);
        jhmVar.c = cqrt.g(2131232600, irg.k());
        jhmVar.h = 2;
        jhmVar.d(new View.OnClickListener(apjuVar) { // from class: apjm
            private final apju a;

            {
                this.a = apjuVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
        jhmVar.f = cjtd.a(dtyi.bK);
        return jhmVar.c();
    }

    public final jho e(final apjr apjrVar) {
        jhm jhmVar = new jhm();
        jhmVar.a = k(R.string.MAPS_ACTIVITY_ADD_A_PLACE);
        jhmVar.h = 0;
        jhmVar.d(new View.OnClickListener(apjrVar) { // from class: apjn
            private final apjr a;

            {
                this.a = apjrVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
        jhmVar.f = cjtd.a(dtyi.S);
        return jhmVar.c();
    }

    public final jho f() {
        jhm jhmVar = new jhm();
        jhmVar.a = k(R.string.REFRESH_BUTTON);
        jhmVar.h = 0;
        jhmVar.d(new View.OnClickListener(this) { // from class: apjo
            private final apjv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apjv apjvVar = this.a;
                apjvVar.e.f(apjvVar.a.getWindow().getDecorView(), apjvVar.k(R.string.ACCESSIBILITY_REFRESHING));
                apjvVar.b.p();
            }
        });
        return jhmVar.c();
    }

    public final View.OnClickListener g() {
        return new View.OnClickListener(this) { // from class: apjp
            private final apjv a;

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
        };
    }

    public final jho h() {
        if (!jk.a(this.a)) {
            return null;
        }
        jhm jhmVar = new jhm();
        jhmVar.a = k(R.string.LOCATION_HISTORY_ADD_TO_HOMESCREEN);
        jhmVar.h = 0;
        jhmVar.d(new View.OnClickListener(this) { // from class: apjq
            private final apjv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d.a();
            }
        });
        jhmVar.f = cjtd.a(dtyi.bd);
        return jhmVar.c();
    }

    public final jho i() {
        jhm jhmVar = new jhm();
        jhmVar.a = k(R.string.SEND_FEEDBACK);
        jhmVar.h = 0;
        jhmVar.d(new View.OnClickListener(this) { // from class: apji
            private final apjv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.a().k(false, true, achc.TIMELINE, null);
            }
        });
        jhmVar.f = cjtd.a(dtyi.bM);
        return jhmVar.c();
    }

    public final jho j() {
        jhm jhmVar = new jhm();
        jhmVar.a = k(R.string.HELP);
        jhmVar.h = 0;
        jhmVar.d(new View.OnClickListener(this) { // from class: apjj
            private final apjv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.a().q("android_timeline");
            }
        });
        jhmVar.f = cjtd.a(dtyi.ar);
        return jhmVar.c();
    }

    public final String k(int i) {
        return this.a.getString(i);
    }
}
