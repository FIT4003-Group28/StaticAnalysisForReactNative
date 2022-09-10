package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azga  reason: default package */
/* loaded from: classes3.dex */
final class azga implements degu<dcdc<baal>> {
    final /* synthetic */ dhjx a;
    final /* synthetic */ ilo b;
    final /* synthetic */ azgh c;

    public azga(azgh azghVar, dhjx dhjxVar, ilo iloVar) {
        this.c = azghVar;
        this.a = dhjxVar;
        this.b = iloVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dcdc<baal> dcdcVar) {
        final akqs m = akyx.m(this.a);
        dcdc z = dcbg.b(dcdcVar).o(new dbsl(m) { // from class: azfy
            private final akqs a;

            {
                this.a = m;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                akqs akqsVar = this.a;
                baal baalVar = (baal) obj;
                if (baalVar.z() != null) {
                    baak z2 = baalVar.z();
                    dbsk.s(z2);
                    if (z2.b() == null) {
                        return false;
                    }
                    baak z3 = baalVar.z();
                    dbsk.s(z3);
                    return akqsVar.b(z3.b());
                }
                return false;
            }
        }).o(azfz.a).z();
        azgh azghVar = this.c;
        ilo iloVar = this.b;
        baad a = azghVar.f.a().a(azghVar.b.getString(R.string.SAVED_PLACES_NEAR_AREA, new Object[]{iloVar.n()}));
        int size = z.size();
        for (int i = 0; i < size; i++) {
            a.b((baal) z.get(i));
        }
        dbsg u = dcbg.b(iloVar.aE()).s(azff.a).u();
        if (u.a()) {
            dnwk bZ = dnwl.f.bZ();
            dnwq bZ2 = dnwr.c.bZ();
            String str = (String) u.b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnwr dnwrVar = (dnwr) bZ2.b;
            str.getClass();
            dnwrVar.a = 1 | dnwrVar.a;
            dnwrVar.b = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnwl dnwlVar = (dnwl) bZ.b;
            dnwr bK = bZ2.bK();
            bK.getClass();
            dnwlVar.e = bK;
            dnwlVar.a |= 8192;
            a.J(bZ.bK());
        }
        this.c.i(a);
    }
}
