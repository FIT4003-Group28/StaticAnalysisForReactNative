package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cimg  reason: default package */
/* loaded from: classes4.dex */
public class cimg extends cibj implements cimd, chyv {
    public final dcdc<cinv> a;
    public final chxr b;
    private final boolean c;
    private final cidb d;

    public cimg(final cinw cinwVar, final chrx chrxVar, final chxl chxlVar) {
        super(chxlVar);
        chxr chxrVar = chxlVar.b;
        this.b = chxrVar == null ? chxr.e : chxrVar;
        this.a = dcbg.b(chxlVar.r).s(new dbrn(cinwVar, chrxVar, chxlVar) { // from class: cime
            private final cinw a;
            private final chrx b;
            private final chxl c;

            {
                this.a = cinwVar;
                this.b = chrxVar;
                this.c = chxlVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cinw cinwVar2 = this.a;
                chrx chrxVar2 = this.b;
                chxl chxlVar2 = this.c;
                chwj chwjVar = (chwj) obj;
                chxp chxpVar = chxlVar2.i;
                if (chxpVar == null) {
                    chxpVar = chxp.k;
                }
                boolean z = chxpVar.h;
                chyy a = cinwVar2.a.a();
                cinw.a(a, 1);
                cinw.a(chrxVar2, 2);
                cinw.a(chxlVar2, 3);
                cinw.a(chwjVar, 4);
                return new cinv(a, chrxVar2, chxlVar2, chwjVar, z);
            }
        }).z();
        this.d = new cidb(chrxVar, chxlVar);
        chxp chxpVar = chxlVar.i;
        this.c = (chxpVar == null ? chxp.k : chxpVar).h;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return chys.a(this);
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.UPLOAD_PHOTOS;
    }

    @Override // defpackage.chyv
    public List<? extends chyv> d() {
        return this.a;
    }

    @Override // defpackage.cimd
    public List<? extends cinu> e() {
        return this.a;
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: cimf
            private final cimg a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                cimg cimgVar = this.a;
                cimg cimgVar2 = (cimg) obj2;
                return cimgVar.b.equals(cimgVar2.b) && cimgVar.a.size() == cimgVar2.a.size();
            }
        });
    }

    @Override // defpackage.cimd
    public jiw f() {
        return this.d;
    }

    @Override // defpackage.cimd
    public View.OnLayoutChangeListener g() {
        return this.d;
    }

    @Override // defpackage.cimd
    public Boolean h() {
        return Boolean.valueOf(this.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, chxj.DEVICE_PHOTO_UPLOAD, Integer.valueOf(this.a.size())});
    }
}
