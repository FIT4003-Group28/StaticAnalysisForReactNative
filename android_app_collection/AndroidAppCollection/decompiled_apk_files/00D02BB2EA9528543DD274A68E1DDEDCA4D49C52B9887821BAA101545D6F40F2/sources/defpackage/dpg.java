package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dpg  reason: default package */
/* loaded from: classes6.dex */
public final class dpg {
    public final Activity a;
    public final btvo b;
    public final czkm<dsw> c;
    public final dbsg<czo> d;
    public final Executor e;
    public final dbty<dtm> f;
    public final dem g;
    public final dkh h;
    private final ahjq i;
    private final dbsg<czw> j;

    public dpg(Activity activity, btvo btvoVar, final dbsg<czw> dbsgVar, final czkm<dsw> czkmVar, ahjq ahjqVar, dbsg<czo> dbsgVar2, Executor executor, den denVar, dkh dkhVar) {
        this.a = activity;
        this.b = btvoVar;
        this.c = czkmVar;
        this.i = ahjqVar;
        this.d = dbsgVar2;
        this.e = executor;
        this.h = dkhVar;
        this.g = denVar.a(czh.LIGHTHOUSE, new dbty(czkmVar) { // from class: doy
            private final czkm a;

            {
                this.a = czkmVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return deew.h(degp.q(this.a.b()), dpb.a, dege.a);
            }
        });
        this.j = dbsgVar;
        this.f = dbsgVar.a() ? new dbty(dbsgVar) { // from class: doz
            private final dbsg a;

            {
                this.a = dbsgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return ((czw) this.a.b()).a();
            }
        } : dpa.a;
    }

    public final boolean a() {
        if (this.j.a()) {
            dte dteVar = this.j.b().a().b;
            if (dteVar == null) {
                dteVar = dte.w;
            }
            return dteVar.v;
        }
        return false;
    }

    public final boolean b(dxp dxpVar) {
        if (a()) {
            return true;
        }
        GmmLocation a = this.i.a();
        if (a == null) {
            return false;
        }
        dsyz bZ = dsza.e.bZ();
        double latitude = a.getLatitude();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsza dszaVar = (dsza) bZ.b;
        dszaVar.a |= 1;
        dszaVar.b = latitude;
        double longitude = a.getLongitude();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsza dszaVar2 = (dsza) bZ.b;
        dszaVar2.a |= 2;
        dszaVar2.c = longitude;
        double altitude = a.getAltitude();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsza dszaVar3 = (dsza) bZ.b;
        dszaVar3.a |= 4;
        dszaVar3.d = altitude;
        return dxpVar.a(bZ.bK()).a() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<dbsg<dpf>> c(int i) {
        boolean a;
        if (i - 1 != 0) {
            a = dph.b(this.b, this.f);
        } else {
            a = dph.a(this.b, this.f);
        }
        if (!a) {
            return deha.a(dbpy.a);
        }
        return this.g.a(new dpc(this, i), dbpy.a);
    }
}
