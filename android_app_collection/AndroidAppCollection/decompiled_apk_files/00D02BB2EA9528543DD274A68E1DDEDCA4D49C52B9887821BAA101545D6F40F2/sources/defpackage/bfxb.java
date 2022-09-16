package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfxb  reason: default package */
/* loaded from: classes.dex */
public final class bfxb extends afho {
    public static final dbsl<afga> a = bfxa.a;
    private final dxio<begg> i;
    private final dxio<bbut> j;
    private final dxio<cafi> k;
    private final dxio<cfrt> l;
    private final dxio<chnm> m;
    private final afhj n;
    private final dxio<btvo> o;
    private final cklq p;

    public bfxb(Intent intent, @dzsi String str, gga ggaVar, afih afihVar, afhe afheVar, dxio<begg> dxioVar, dxio<bbut> dxioVar2, eeu eeuVar, dxio<afwr> dxioVar3, afhj afhjVar, dxio<btvo> dxioVar4, dxio<cafi> dxioVar5, dxio<cfrt> dxioVar6, dxio<chnm> dxioVar7, cklq cklqVar) {
        super(intent, str, afid.PLACE_ACTION, ggaVar, eeuVar, afihVar, afheVar, dxioVar3);
        this.i = dxioVar;
        this.j = dxioVar2;
        this.n = afhjVar;
        this.o = dxioVar4;
        this.k = dxioVar5;
        this.l = dxioVar6;
        this.m = dxioVar7;
        this.p = cklqVar;
    }

    private final void i(begj begjVar) {
        this.i.a().o(begjVar, false, null);
    }

    private static int l(dwxv dwxvVar) {
        drpm drpmVar = dwxvVar.b;
        if (drpmVar == null) {
            drpmVar = drpm.c;
        }
        drpl drplVar = drpmVar.a;
        if (drplVar == null) {
            drplVar = drpl.b;
        }
        int a2 = drpk.a(drplVar.a);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.afho
    protected final boolean d() {
        return !affw.b(this.f);
    }

    @Override // defpackage.afho
    public final void e(afia afiaVar, String str) {
        jjn jjnVar;
        dcdc dcdcVar;
        this.p.a(ckls.EXTERNAL_INTENT);
        this.n.a(afiaVar);
        ily ilyVar = new ily();
        ilyVar.F(afiaVar.b);
        ilyVar.j(afiaVar.t);
        ilyVar.f = false;
        ilyVar.D();
        ilo d = ilyVar.d();
        boolean equals = "com.google.android.apps.gmm.iamhere.notification.HereNotification".equals(afiaVar.F);
        int l = l(afiaVar.E) - 1;
        int i = 1;
        if (l == 1 || l == 2) {
            jjnVar = jjn.FULLY_EXPANDED;
        } else if (l == 4) {
            jjnVar = jjn.EXPANDED;
        } else {
            jjnVar = jjn.COLLAPSED;
        }
        begj begjVar = new begj();
        dnqg bZ = dnqh.p.bZ();
        int i2 = ddda.e.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        int i3 = dnqhVar.a | 64;
        dnqhVar.a = i3;
        dnqhVar.g = i2;
        str.getClass();
        dnqhVar.a = i3 | 2;
        dnqhVar.c = str;
        begjVar.d = bZ.bK();
        begjVar.c = jjnVar;
        begjVar.D = equals;
        begjVar.b(d);
        int l2 = l(afiaVar.E) - 1;
        if (l2 != 0 && l2 != 1) {
            if (l2 == 2) {
                begjVar.e = bege.REVIEWS;
            } else if (l2 != 4) {
                ddjr ddjrVar = afiaVar.x;
                dwyd dwydVar = afiaVar.I;
                dwyd dwydVar2 = ((ddjrVar == ddjr.WEB_SEARCH || ddjrVar == ddjr.WEB_SEARCH_VOICE) && dwydVar == dwyd.UNKNOWN_ENTRY_POINT) ? dwyd.LOCAL_UNIVERSAL : dwydVar;
                if (dwyd.PHOTO_TAKEN_NOTIFICATION.equals(dwydVar2)) {
                    int a2 = dkhb.a(this.o.a().getPhotoTakenNotificationParameters().o);
                    if (a2 != 0) {
                        i = a2;
                    }
                } else {
                    i = 3;
                }
                int i4 = i - 1;
                if (i4 == 2) {
                    i(begjVar);
                } else if (i4 == 3) {
                    if (this.m.a().n()) {
                        if (this.l.a().b()) {
                            this.l.a().a();
                        }
                        this.m.a().k();
                    } else {
                        this.k.a().t(dkcp.CONTRIBUTE);
                    }
                }
                List<Uri> list = afiaVar.H;
                if (list == null || list.isEmpty()) {
                    dcdcVar = (dcdc) dbsg.j(afiaVar.G).h(bfwz.a).c(dcdc.e());
                } else {
                    dcdcVar = dcdc.r(list);
                }
                boolean equals2 = dwyd.PHOTO_TAKEN_NOTIFICATION.equals(dwydVar2);
                if (!dcdcVar.isEmpty() || equals2) {
                    ArrayList arrayList = new ArrayList(dcdcVar);
                    bbus bbusVar = afiaVar.K;
                    aeui aeuiVar = afiaVar.L;
                    String str2 = afiaVar.J;
                    this.j.a().E(arrayList, d, bbusVar, dwydVar2, aeuiVar);
                    return;
                }
                bbuz m = bbve.m();
                m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
                m.e(dwydVar2);
                ((bbsu) m).b = d;
                this.j.a().j(m.a());
                return;
            }
        }
        i(begjVar);
    }
}
