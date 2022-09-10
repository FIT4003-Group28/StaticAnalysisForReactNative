package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: apda  reason: default package */
/* loaded from: classes2.dex */
public class apda implements apcz {
    static final cqtd a = cqrt.f(2131232045);
    private final ilo b;
    private final aoxr c;
    private final Integer d;
    private final Long e;
    private final bmdv f;
    private final Activity g;
    private final jba h;
    private final ahjq i;
    private final bnjv j;

    public apda(Activity activity, ahjq ahjqVar, bmdv bmdvVar, bnjv bnjvVar, aoxt aoxtVar, aoxr aoxrVar) {
        this.i = ahjqVar;
        this.c = aoxrVar;
        this.f = bmdvVar;
        this.g = activity;
        this.j = bnjvVar;
        ilo a2 = aoxtVar.a();
        dbsk.s(a2);
        dbsk.s(a2);
        bnjs a3 = bnjvVar.a(a2);
        a3.c = ahjqVar.a();
        this.h = a3.a();
        this.b = aoxtVar.a();
        this.d = Integer.valueOf(aoxtVar.e().a);
        dpuc dpucVar = aoxtVar.e().b;
        this.e = Long.valueOf((dpucVar == null ? dpuc.c : dpucVar).b);
    }

    @Override // defpackage.apcz
    public String a() {
        return this.b.n();
    }

    @Override // defpackage.apcz
    public String b() {
        return this.b.B();
    }

    @Override // defpackage.apcz
    public jic c() {
        return aphi.a(this.b, a);
    }

    @Override // defpackage.apcz
    public String d() {
        ArrayList a2 = dchl.a();
        if (this.e.longValue() == 0) {
            return cqrt.o(R.plurals.MAPS_ACTIVITY_NUM_VISITS, this.d.intValue(), this.d).a(this.g).toString();
        }
        if (this.c == aoxr.NUM_VISITS) {
            a2.add(cqrt.o(R.plurals.MAPS_ACTIVITY_NUM_VISITS, this.d.intValue(), this.d).a(this.g).toString());
            a2.add(this.f.d(this.e.longValue(), "", true));
        } else {
            a2.add(this.f.d(this.e.longValue(), "", true));
            a2.add(cqrt.o(R.plurals.MAPS_ACTIVITY_NUM_VISITS, this.d.intValue(), this.d).a(this.g).toString());
        }
        return dbrz.e(" · ").g(a2);
    }

    @Override // defpackage.apcz
    public String e() {
        return this.b.ar();
    }

    @Override // defpackage.apcz
    public String f() {
        return this.h.t();
    }
}
