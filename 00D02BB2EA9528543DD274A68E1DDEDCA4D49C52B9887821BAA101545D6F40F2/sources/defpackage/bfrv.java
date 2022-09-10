package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfrv  reason: default package */
/* loaded from: classes3.dex */
public class bfrv extends bruj {
    private final Activity e;
    private final brrx f;
    private final dxio<begg> g;
    private final dxio<brba> h;

    public bfrv(Activity activity, dxio<brba> dxioVar, dxio<begg> dxioVar2, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.h = dxioVar;
        this.g = dxioVar2;
        this.f = brrxVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        Runnable runnable;
        final ilo r = r();
        if (r != null) {
            brrw g = this.f.g();
            if (g == brrw.CATEGORICAL_SEARCH_LIST || g == brrw.TRAVERSAL) {
                final dxio<brba> dxioVar = this.h;
                runnable = new Runnable(dxioVar, r) { // from class: bfru
                    private final dxio a;
                    private final ilo b;

                    {
                        this.a = dxioVar;
                        this.b = r;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dxio dxioVar2 = this.a;
                        ilo iloVar = this.b;
                        begj begjVar = new begj();
                        begjVar.n = true;
                        begjVar.c = jjn.FULLY_EXPANDED;
                        begjVar.e = bege.PRICES;
                        begjVar.B = true;
                        ((brba) dxioVar2.a()).J(iloVar, begjVar);
                    }
                };
            } else {
                final dxio<begg> dxioVar2 = this.g;
                runnable = new Runnable(r, dxioVar2) { // from class: bfrt
                    private final ilo a;
                    private final dxio b;

                    {
                        this.a = r;
                        this.b = dxioVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ilo iloVar = this.a;
                        dxio dxioVar3 = this.b;
                        begj begjVar = new begj();
                        begjVar.b(iloVar);
                        begjVar.c = jjn.FULLY_EXPANDED;
                        begjVar.e = bege.PRICES;
                        ((begg) dxioVar3.a()).o(begjVar, false, null);
                    }
                };
            }
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.e.getString(R.string.HOTEL_AVAILABILITY_PILL_LINK);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        ilo r = r();
        boolean z = false;
        if (r != null && r.bS().a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131231656, ibm.w());
    }
}
