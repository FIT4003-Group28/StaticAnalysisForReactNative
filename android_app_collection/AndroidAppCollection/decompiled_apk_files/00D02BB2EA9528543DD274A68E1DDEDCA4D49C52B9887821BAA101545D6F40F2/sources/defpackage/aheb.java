package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aheb  reason: default package */
/* loaded from: classes2.dex */
public final class aheb {
    public final agaw a;
    private final ahbd b;
    private final ahdg c;
    private final gga d;
    private final ahds e;
    private final ahed f;
    private final ahfo g;

    public aheb(ahbd ahbdVar, ahdg ahdgVar, gga ggaVar, ahds ahdsVar, ahed ahedVar, ahfo ahfoVar, agaw agawVar) {
        this.b = ahbdVar;
        this.c = ahdgVar;
        this.d = ggaVar;
        this.e = ahdsVar;
        this.f = ahedVar;
        this.g = ahfoVar;
        this.a = agawVar;
    }

    private final boolean b(dlby dlbyVar, dspd dspdVar, ddzg ddzgVar, cjta cjtaVar, agxw agxwVar, boolean z, @dzsi jic jicVar, List<agxa<?>> list, List<agwu> list2, ahea aheaVar) {
        if ((dlbyVar.a & 16) == 0 || (!z && dlbyVar.g.size() == 0)) {
            return false;
        }
        String str = dlbyVar.e;
        dlbw dlbwVar = dlbyVar.g.size() == 0 ? null : dlbyVar.g.get(0);
        dlcx dlcxVar = dlbyVar.f;
        if (dlcxVar == null) {
            dlcxVar = dlcx.e;
        }
        return c(str, dlbwVar, dlcxVar, dspdVar, ddzgVar, cjtaVar, agxwVar, jicVar, list, list2, aheaVar);
    }

    @dzsi
    public final ahec a(dlcv dlcvVar, int i, agyh agyhVar) {
        dlby dlbyVar;
        cjta cjtaVar;
        ahec ahecVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ahea aheaVar;
        boolean z;
        ahec ahecVar2;
        if (dlcvVar.b == 5) {
            dlbyVar = (dlby) dlcvVar.c;
        } else {
            dlbyVar = dlby.h;
        }
        dlby dlbyVar2 = dlbyVar;
        agxw agxwVar = agyhVar.e;
        if (agxwVar == null) {
            agxwVar = agxw.c;
        }
        agxw agxwVar2 = agxwVar;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ahea aheaVar2 = new ahea();
        ddzf bZ = ddzg.t.bZ();
        ddyt bZ2 = ddyu.i.bZ();
        boolean z2 = agyhVar.b;
        boolean z3 = false;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar = (ddyu) bZ2.b;
        int i2 = ddyuVar.a | 4;
        ddyuVar.a = i2;
        ddyuVar.c = z2;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        int i3 = i2 | 512;
        ddyuVar.a = i3;
        ddyuVar.h = dspdVar;
        int i4 = i3 | 8;
        ddyuVar.a = i4;
        ddyuVar.d = i;
        int i5 = dlbyVar2.b;
        ddyuVar.a = i4 | 16;
        ddyuVar.e = i5;
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
        cjta z4 = ahhv.z(dlbyVar2.c, i, bK2, agyhVar);
        int a = dpyr.a(dlbyVar2.d);
        if (a == 0) {
            a = 1;
        }
        int i6 = a - 1;
        if (i6 == 1) {
            cjtaVar = z4;
            ahecVar = null;
            arrayList = arrayList4;
            arrayList2 = arrayList3;
            aheaVar = aheaVar2;
            z3 = b(dlbyVar2, dlcvVar.d, bK2, cjtaVar, agxwVar2, true, new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.localstream_newly_opened_icon_svg), 0), arrayList2, arrayList4, aheaVar);
        } else if (i6 == 2) {
            arrayList2 = arrayList3;
            ahecVar = null;
            cjtaVar = z4;
            arrayList = arrayList4;
            aheaVar = aheaVar2;
            z3 = b(dlbyVar2, dlcvVar.d, bK2, z4, agxwVar2, false, null, arrayList2, arrayList, aheaVar);
        } else {
            if (i6 == 3) {
                cjtaVar = z4;
                arrayList = arrayList4;
                aheaVar = aheaVar2;
                dspd dspdVar2 = dlcvVar.d;
                dlam dlamVar = dlcvVar.g;
                if (dlamVar == null) {
                    dlamVar = dlam.d;
                }
                if (dlamVar.a == 3) {
                    dlbyVar2 = dlbyVar2;
                    z = true;
                } else {
                    dlbyVar2 = dlbyVar2;
                    z = false;
                }
                if (dlbyVar2.g.size() == 1 && dlbyVar2.g.get(0).f.size() != 0 && (dlbyVar2.a & 16) == 0) {
                    final ahdr a2 = this.e.a(dlbyVar2.g.get(0), dspdVar2, true, z, bK2);
                    if (a2.c() != null && !a2.b.isEmpty()) {
                        CharSequence c = a2.c();
                        dbsk.s(c);
                        aheaVar.a = c;
                        aheaVar.b = a2.d();
                        aheaVar.c = new ahaq(a2) { // from class: ahdt
                            private final ahdr a;

                            {
                                this.a = a2;
                            }

                            @Override // defpackage.ahaq
                            public final void a() {
                                this.a.f();
                            }
                        };
                        aheaVar.d = a2.e(dtxu.bx);
                        aheaVar.e = dlbyVar2.e;
                        arrayList.addAll(a2.a);
                        arrayList2 = arrayList3;
                        arrayList2.add(agxa.a(new agve(agvd.c().a()), new ahip(new ahiq(a2.a(), a2.g(), new cqkn(a2) { // from class: ahdu
                            private final ahdr a;

                            {
                                this.a = a2;
                            }

                            @Override // defpackage.cqkn
                            public final void a(cqkp cqkpVar, View view) {
                                ahae ahaeVar = (ahae) cqkpVar;
                                this.a.f();
                            }
                        }, a2.e(dtxu.bx)))));
                        agoa h = agob.h();
                        h.e(true);
                        h.c(true);
                        agoc agocVar = new agoc(h.a());
                        ArrayList arrayList5 = new ArrayList();
                        for (agwu agwuVar : dcft.v(a2.b, 2)) {
                            arrayList5.add(cqgr.fT(agocVar, agwuVar));
                        }
                        ahaz a3 = this.b.a(arrayList5, cjtaVar.b(dtxu.bE));
                        if (a2.a.size() > arrayList5.size()) {
                            String string = this.d.getString(R.string.LOCALSTREAM_SEE_ARTICLE);
                            ahdv ahdvVar = new ahdv(a2);
                            cjtd b = cjtaVar.b(dtxu.ci);
                            ahecVar2 = null;
                            a3.e = null;
                            a3.f = ahdvVar;
                            a3.b = null;
                            a3.c = b;
                            a3.a = string;
                            if (!cjtd.b.equals(b) && b.g != null) {
                                z3 = true;
                            }
                            dbsk.a(z3);
                        } else {
                            ahecVar2 = null;
                        }
                        arrayList2.add(agxa.a(new agdh(), new ahat(a3.a())));
                        ahecVar = ahecVar2;
                        cjtaVar = cjtaVar;
                        arrayList = arrayList;
                        aheaVar = aheaVar;
                        z3 = true;
                    }
                }
                arrayList2 = arrayList3;
                ahecVar = null;
            } else if (i6 != 4) {
                ahecVar = null;
            } else {
                dspd dspdVar3 = dlcvVar.d;
                if (dlbyVar2.g.size() <= 0 || (dlbyVar2.a & 16) != 0) {
                    cjtaVar = z4;
                    ahecVar = null;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    aheaVar = aheaVar2;
                } else {
                    dlbw dlbwVar = dlbyVar2.g.get(0);
                    cjtaVar = z4;
                    aheaVar = aheaVar2;
                    arrayList = arrayList4;
                    z3 = c(dlbyVar2.e, dlbwVar, dlbwVar.f.get(0), dspdVar3, bK2, cjtaVar, agxwVar2, null, arrayList3, arrayList, aheaVar);
                    arrayList2 = arrayList3;
                    dlbyVar2 = dlbyVar2;
                    ahecVar = null;
                }
            }
            int i7 = dlbyVar2.d;
            dlbyVar2.g.size();
            int i8 = dlbyVar2.a;
            return ahecVar;
        }
        if (z3) {
            ahed ahedVar = this.f;
            if ((dlbyVar2.a & 16) != 0 && dlbyVar2.f == null) {
                dlcx dlcxVar = dlcx.e;
            }
            ahas a4 = ahedVar.a.a();
            ahed.a(a4, 1);
            ahht a5 = ahedVar.b.a();
            ahed.a(a5, 2);
            agaw a6 = ahedVar.c.a();
            ahed.a(a6, 3);
            ahed.a(dlcvVar, 4);
            ahed.a(agyhVar, 5);
            ahed.a(arrayList2, 7);
            ArrayList arrayList6 = arrayList;
            ahed.a(arrayList6, 8);
            ahea aheaVar3 = aheaVar;
            ahed.a(aheaVar3, 9);
            cjta cjtaVar2 = cjtaVar;
            ahed.a(cjtaVar2, 10);
            return new ahec(a4, a5, a6, dlcvVar, agyhVar, arrayList2, arrayList6, aheaVar3, cjtaVar2);
        }
        int i72 = dlbyVar2.d;
        dlbyVar2.g.size();
        int i82 = dlbyVar2.a;
        return ahecVar;
    }

    private final boolean c(CharSequence charSequence, @dzsi dlbw dlbwVar, dlcx dlcxVar, dspd dspdVar, ddzg ddzgVar, cjta cjtaVar, agxw agxwVar, @dzsi jic jicVar, List<agxa<?>> list, List<agwu> list2, ahea aheaVar) {
        CharSequence charSequence2 = charSequence;
        final ahdr a = dlbwVar == null ? null : this.e.a(dlbwVar, dspdVar, false, false, ddzgVar);
        final ahfn a2 = this.g.a(dlcxVar, 0, ddzgVar, null, false);
        list2.add(a2);
        if (a == null) {
            aheaVar.a = charSequence2;
            aheaVar.b = jicVar;
            aheaVar.e = charSequence2;
        } else if (a.c() == null) {
            return false;
        } else {
            CharSequence c = a.c();
            dbsk.s(c);
            aheaVar.a = c;
            jic d = a.d();
            if (d == null) {
                d = jicVar;
            }
            aheaVar.b = d;
            aheaVar.c = new ahaq(a) { // from class: ahdw
                private final ahdr a;

                {
                    this.a = a;
                }

                @Override // defpackage.ahaq
                public final void a() {
                    this.a.f();
                }
            };
            aheaVar.d = a.e(dtxu.bx);
            aheaVar.e = charSequence2;
        }
        aheaVar.f = a2;
        if (a != null) {
            list.add(agxa.a(new agve(agvd.c().a()), new ahip(new ahiq(a.a(), a.g(), new cqkn(a) { // from class: ahdx
                private final ahdr a;

                {
                    this.a = a;
                }

                @Override // defpackage.cqkn
                public final void a(cqkp cqkpVar, View view) {
                    ahae ahaeVar = (ahae) cqkpVar;
                    this.a.f();
                }
            }, a.e(dtxu.bx)))));
        }
        if (a2.f().size() < 4) {
            list.add(agxa.a(new agrb(), new ahhd(a2.f().get(0), new cqkn(this, a2) { // from class: ahdy
                private final aheb a;
                private final agwu b;

                {
                    this.a = this;
                    this.b = a2;
                }

                @Override // defpackage.cqkn
                public final void a(cqkp cqkpVar, View view) {
                    agzz agzzVar = (agzz) cqkpVar;
                    this.a.a.a(this.b.b(), bege.PHOTOS, jjn.FULLY_EXPANDED);
                }
            }, this.d.getString(R.string.LOCALSTREAM_ACCESSIBILITY_SEE_PHOTOS, new Object[]{a2.b().n()}), a2.p(dtxu.cm))));
        } else {
            dvyw dvywVar = dlcxVar.c;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            dcdc z = dcbg.b(dvywVar.I).s(ahdz.a).x(5).z();
            aggm b = aggn.b();
            b.b(2);
            aggo aggoVar = new aggo(b.a());
            ahdg ahdgVar = this.c;
            if (a != null) {
                charSequence2 = a.a();
            }
            list.add(agxa.a(aggoVar, ahdgVar.a(z, charSequence2, TimeUnit.SECONDS.toMillis(3L), agxwVar.b, cjtaVar)));
        }
        agoa h = agob.h();
        h.e(true);
        list.add(agxa.a(new agdj(h.a()), new ahfl(a2)));
        return true;
    }
}
