package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahjf  reason: default package */
/* loaded from: classes2.dex */
public class ahjf extends ahhv {
    public final agwu a;
    private final List<agxa<?>> b;
    private final List<agwu> c;
    private final cqix<? extends agxd> d;
    private final cjta e;

    public ahjf(ahht ahhtVar, ahhi ahhiVar, ahfo ahfoVar, final bkpi bkpiVar, dlcv dlcvVar, int i, agyh agyhVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        dldt dldtVar;
        jic g;
        if (dlcvVar.b == 22) {
            dldtVar = (dldt) dlcvVar.c;
        } else {
            dldtVar = dldt.e;
        }
        final dlds dldsVar = dldtVar.d.get(0);
        dlcx dlcxVar = dldtVar.c;
        dlcx dlcxVar2 = dlcxVar == null ? dlcx.e : dlcxVar;
        String str = dldtVar.a;
        ddzf bZ = ddzg.t.bZ();
        ddyt bZ2 = ddyu.i.bZ();
        boolean z = agyhVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar = (ddyu) bZ2.b;
        int i2 = ddyuVar.a | 4;
        ddyuVar.a = i2;
        ddyuVar.c = z;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        int i3 = i2 | 512;
        ddyuVar.a = i3;
        ddyuVar.h = dspdVar;
        ddyuVar.a = i3 | 8;
        ddyuVar.d = i;
        int i4 = ddcu.JV.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar2 = (ddyu) bZ2.b;
        ddyuVar2.a |= 16;
        ddyuVar2.e = i4;
        ddyu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        bK.getClass();
        ddzgVar.k = bK;
        ddzgVar.b |= 1;
        ddzg bK2 = bZ.bK();
        cjta z2 = z(str, i, bK2, agyhVar);
        this.e = z2;
        ahfn a = ahfoVar.a(dlcxVar2, 0, bK2, null, false);
        this.a = a;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        agve agveVar = new agve(agvd.c().a());
        dgly dglyVar = dldsVar.a;
        arrayList.add(agxa.a(agveVar, new ahip(new ahiq(null, acls.a(dglyVar == null ? dgly.c : dglyVar), new cqkn(this, bkpiVar, dldsVar) { // from class: ahjd
            private final ahjf a;
            private final bkpi b;
            private final dlds c;

            {
                this.a = this;
                this.b = bkpiVar;
                this.c = dldsVar;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                ahjf ahjfVar = this.a;
                bkpi bkpiVar2 = this.b;
                dlds dldsVar2 = this.c;
                ahae ahaeVar = (ahae) cqkpVar;
                bwrs<ilo> a2 = bwrs.a(ahjfVar.a.b());
                docg docgVar = dldsVar2.b;
                if (docgVar == null) {
                    docgVar = docg.M;
                }
                bkpiVar2.e(a2, cdrr.r(docgVar, cdja.PUBLISHED), bkpg.f(cdjk.LOCAL_STREAM));
            }
        }, z2.b(dtxu.bN)))));
        if (!dldsVar.c.isEmpty() && (g = agxk.g(dldsVar.c.get(0))) != null) {
            arrayList.add(agxa.a(new agrb(), new ahhd(ahdh.b(g), new cqkn(this, bkpiVar, dldsVar) { // from class: ahje
                private final ahjf a;
                private final bkpi b;
                private final dlds c;

                {
                    this.a = this;
                    this.b = bkpiVar;
                    this.c = dldsVar;
                }

                @Override // defpackage.cqkn
                public final void a(cqkp cqkpVar, View view) {
                    ahjf ahjfVar = this.a;
                    bkpi bkpiVar2 = this.b;
                    dlds dldsVar2 = this.c;
                    agzz agzzVar = (agzz) cqkpVar;
                    bwrs<ilo> a2 = bwrs.a(ahjfVar.a.b());
                    docg docgVar = dldsVar2.b;
                    if (docgVar == null) {
                        docgVar = docg.M;
                    }
                    bkpiVar2.e(a2, cdrr.r(docgVar, cdja.PUBLISHED), bkpg.f(cdjk.LOCAL_STREAM));
                }
            }, this.k.getString(R.string.LOCALSTREAM_ACCESSIBILITY_SEE_REVIEWS, new Object[]{a.c()}), z2.b(dtxu.bN))));
        }
        agoa h = agob.h();
        h.e(true);
        arrayList.add(agxa.a(new agdj(h.a()), new ahfl(a)));
        agdv agdvVar = new agdv();
        String str2 = dldtVar.b;
        Activity activity = (Activity) ((dxjd) ahhiVar.a).a;
        ahhi.a(activity, 1);
        agaw a2 = ahhiVar.b.a();
        ahhi.a(a2, 2);
        ahhi.a(dldsVar, 3);
        ahhi.a(z2, 4);
        ahhi.a(str2, 5);
        ahhi.a(this, 6);
        this.d = cqgr.fT(agdvVar, new ahhh(activity, a2, dldsVar, z2, str2, this, true));
        this.c = dcdc.f(a);
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.b;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.e.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<? extends agxd> c() {
        return this.d;
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.c;
    }

    @Override // defpackage.ahhv
    @dzsi
    public agwu o() {
        return this.a;
    }
}
