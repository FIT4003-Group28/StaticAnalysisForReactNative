package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abth  reason: default package */
/* loaded from: classes2.dex */
public class abth extends bruj {
    private final Activity e;
    private final jba f;
    private final dxio<begg> g;

    public abth(Activity activity, dxio<begg> dxioVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.g = dxioVar;
        this.f = jbaVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        final ilo r = r();
        if (r != null) {
            final dxio<begg> dxioVar = this.g;
            new Runnable(r, dxioVar) { // from class: abtg
                private final ilo a;
                private final dxio b;

                {
                    this.a = r;
                    this.b = dxioVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ilo iloVar = this.a;
                    dxio dxioVar2 = this.b;
                    begj begjVar = new begj();
                    begjVar.b(iloVar);
                    begjVar.c = jjn.FULLY_EXPANDED;
                    begjVar.e = bege.OVERVIEW;
                    ((begg) dxioVar2.a()).o(begjVar, false, null);
                    ((begg) dxioVar2.a()).m(jjn.FULLY_EXPANDED);
                }
            }.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        String g = this.f.g();
        if (dbsj.d(g)) {
            return this.e.getString(R.string.ACCESSIBILITY_EXPLORE_NEARBY);
        }
        return this.e.getString(R.string.ACCESSIBILITY_EXPLORE_NEARBY_LONG, new Object[]{g});
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.e.getString(R.string.EXPLORE_NEARBY_ACTION_BUTTON);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        ilo r = r();
        boolean z = false;
        if (r != null && r.o) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131232669, ibm.x());
    }
}
