package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsqv  reason: default package */
/* loaded from: classes4.dex */
public class bsqv implements jay {
    public final dwii a;
    public final cklf b;
    public final cjqy c;
    private final Activity d;

    public bsqv(Activity activity, cjqy cjqyVar, cklf cklfVar, dwii dwiiVar) {
        this.d = activity;
        this.c = cjqyVar;
        this.a = dwiiVar;
        this.b = cklfVar;
    }

    @Override // defpackage.jay
    public List a() {
        return dcdc.e();
    }

    @Override // defpackage.jay
    public jht b() {
        jhu h = jhv.h();
        jhi jhiVar = (jhi) h;
        jhiVar.c = 2131231632;
        jhiVar.d = Integer.valueOf(ibm.m().b(this.d));
        jhiVar.e = this.d.getString(R.string.LEARN_MORE);
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.LEARN_MORE;
        jhmVar.a = this.d.getString(R.string.LEARN_MORE);
        h.d(jhmVar.c());
        jhiVar.a = new jhs(this) { // from class: bsqt
            private final bsqv a;

            {
                this.a = this;
            }

            @Override // defpackage.jhs
            public final void a() {
                cjtd a;
                bsqv bsqvVar = this.a;
                if (dwii.CONTACT == bsqvVar.a) {
                    a = cjtd.a(dtxy.ac);
                } else {
                    a = cjtd.a(dtxy.bD);
                }
                bsqvVar.c.i(a);
            }
        };
        jhiVar.b = new jhr(this) { // from class: bsqu
            private final bsqv a;

            {
                this.a = this;
            }

            @Override // defpackage.jhr
            public final void a(int i) {
                bsqv bsqvVar = this.a;
                if (i == R.string.LEARN_MORE) {
                    dwii dwiiVar = dwii.UNKNOWN;
                    if (bsqvVar.a.ordinal() == 1) {
                        bsqvVar.c.i(cjtd.a(dtxy.ab));
                        bsqvVar.b.a("maps_android_contacts");
                        return;
                    }
                    bsqvVar.c.i(cjtd.a(dtxy.bC));
                    bsqvVar.b.a("find_reservations");
                }
            }
        };
        return h.b();
    }

    @Override // defpackage.jay
    public void c(int i) {
    }
}
