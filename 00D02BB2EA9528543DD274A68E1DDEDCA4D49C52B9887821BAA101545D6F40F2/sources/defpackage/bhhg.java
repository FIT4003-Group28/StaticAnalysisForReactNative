package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bhhg  reason: default package */
/* loaded from: classes3.dex */
public final class bhhg extends itb implements bhhy {
    private final gga a;
    private final bbut b;

    public bhhg(gga ggaVar, bbut bbutVar) {
        this.a = ggaVar;
        this.b = bbutVar;
    }

    @Override // defpackage.bhhy
    public final void e(bhhx bhhxVar) {
        bhia bhiaVar = new bhia();
        Bundle bundle = new Bundle();
        bundle.putSerializable("recommendedActionFlowProperties", bhhxVar);
        bhiaVar.B(bundle);
        this.a.D(bhiaVar);
    }

    @Override // defpackage.bhhy
    public final void f(bhhx bhhxVar) {
        int d = bhhxVar.d();
        int i = d - 1;
        if (d != 0) {
            if (i != 1) {
                return;
            }
            bbut bbutVar = this.b;
            bbuz m = bbve.m();
            ilo b = bhhxVar.b();
            dbsk.s(b);
            ((bbsu) m).b = b;
            bbva c = bbvb.c();
            c.b(true);
            m.f(c.a());
            m.b(bbuy.SHOW_PLACESHEET_PHOTOS_TAB_AND_MERCHANT_MODE_SNACKBAR);
            dwyd c2 = bhhxVar.c();
            dbsk.s(c2);
            m.e(c2);
            bbutVar.j(m.a());
            return;
        }
        throw null;
    }

    @Override // defpackage.bhhy
    public final boolean i(bhhx bhhxVar) {
        ilo b;
        int d = bhhxVar.d();
        int i = d - 1;
        if (d != 0) {
            if (i != 1 || (b = bhhxVar.b()) == null) {
                return false;
            }
            dkee b2 = dkee.b(b.h().bl);
            if (b2 == null) {
                b2 = dkee.UNKNOWN_VIEW_TYPE;
            }
            return b2 == dkee.DINING;
        }
        throw null;
    }
}
