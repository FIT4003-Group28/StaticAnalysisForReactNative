package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: barf  reason: default package */
/* loaded from: classes3.dex */
public abstract class barf implements baqe {
    private final baqo a;
    private final dcdc<drdg> b;
    private boolean c;
    final gga d;
    final bakv e;
    final cqkj f;
    String g;
    cqtd h;
    cjtd i;
    @dzsi
    public final baqc j;
    @dzsi
    private final drdg k;
    @dzsi
    private gdf l;

    public barf(dcdc<drdg> dcdcVar, gga ggaVar, cqkj cqkjVar, bakv bakvVar) {
        this.d = ggaVar;
        this.f = cqkjVar;
        this.e = bakvVar;
        this.b = dcdcVar;
        baqo h = h();
        this.a = h;
        if (dcdcVar.size() >= 2) {
            this.k = null;
            this.j = i(ggaVar, dcdcVar, h);
            return;
        }
        this.k = (drdg) dcft.r(dcdcVar, null);
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqtd n(int i) {
        return cqrt.g(i, ibm.x());
    }

    public static begj o(ilo iloVar) {
        begj begjVar = new begj();
        begjVar.b(iloVar);
        begjVar.n = true;
        begjVar.c = jjn.EXPANDED;
        return begjVar;
    }

    @Override // defpackage.baqe
    public cqtd a() {
        return this.h;
    }

    @Override // defpackage.baqe
    public String b() {
        return this.g;
    }

    @Override // defpackage.baqe
    public Boolean c() {
        return false;
    }

    @Override // defpackage.baqe
    public cqkl d() {
        if (this.b.size() >= 2) {
            cqkf e = this.f.e(new baly());
            e.e(this.j);
            gdf gdfVar = new gdf((Context) this.d, false);
            this.l = gdfVar;
            Window window = gdfVar.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                gdf gdfVar2 = this.l;
                dbsk.s(gdfVar2);
                gdfVar2.setContentView(e.c());
                gdf gdfVar3 = this.l;
                dbsk.s(gdfVar3);
                gdfVar3.show();
                baqc baqcVar = this.j;
                if (baqcVar instanceof baqs) {
                    gdf gdfVar4 = this.l;
                    dbsk.s(gdfVar4);
                    ((baqs) baqcVar).e(gdfVar4);
                }
            }
        } else {
            drdg drdgVar = this.k;
            if (drdgVar != null) {
                this.a.a(drdgVar);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.baqe
    public Boolean e() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.baqe
    public String f() {
        return b();
    }

    @Override // defpackage.baqe
    public cjtd g() {
        return this.i;
    }

    public abstract baqo h();

    public abstract baqc i(gga ggaVar, dcdc<drdg> dcdcVar, baqo baqoVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z) {
        this.c = z;
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        gdf gdfVar = this.l;
        if (gdfVar != null) {
            gdfVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        ckos.b(this.d.findViewById(16908290), R.string.OFFLINE_ERROR, 0).c();
    }
}
