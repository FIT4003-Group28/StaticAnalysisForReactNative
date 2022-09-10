package defpackage;

import android.text.style.URLSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjho  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjho implements cjhh {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cjhn q(defpackage.dfzq r10, int r11, @defpackage.dzsi android.view.View.OnClickListener r12, final defpackage.dxio<defpackage.afha> r13, @defpackage.dzsi defpackage.cjta r14, @defpackage.dzsi defpackage.cjtd r15, @defpackage.dzsi android.view.View.OnClickListener r16) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjho.q(dfzq, int, android.view.View$OnClickListener, dxio, cjta, cjtd, android.view.View$OnClickListener):cjhn");
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.Spanned, java.lang.CharSequence] */
    public static cjhn r(dfzq dfzqVar, int i, @dzsi View.OnClickListener onClickListener, final dxio<afha> dxioVar, @dzsi cjtd cjtdVar, @dzsi View.OnClickListener onClickListener2, @dzsi dcdc<cjew> dcdcVar) {
        cjhn cjhnVar;
        Iterable<? extends cjhe> k;
        boolean z;
        boolean z2;
        cqrp d;
        int i2;
        cjhn cjhnVar2;
        cjtd cjtdVar2 = cjtdVar;
        cjhn s = s();
        if ((dfzqVar.a & 4) != 0) {
            dfzi dfziVar = dfzqVar.c;
            if (dfziVar == null) {
                dfziVar = dfzi.f;
            }
            dgly dglyVar = dfziVar.b;
            if (dglyVar == null) {
                dglyVar = dgly.c;
            }
            cjht cjhtVar = (cjht) s;
            cjhtVar.f = acls.a(dglyVar);
            dfzi dfziVar2 = dfzqVar.c;
            if (dfziVar2 == null) {
                dfziVar2 = dfzi.f;
            }
            if ((dfziVar2.a & 2) != 0) {
                dfzi dfziVar3 = dfzqVar.c;
                if (dfziVar3 == null) {
                    dfziVar3 = dfzi.f;
                }
                dgaq dgaqVar = dfziVar3.c;
                if (dgaqVar == null) {
                    dgaqVar = dgaq.d;
                }
                cjhtVar.g = bvoa.g(dgaqVar);
            }
        }
        dfzi dfziVar4 = dfzqVar.c;
        if (dfziVar4 == null) {
            dfziVar4 = dfzi.f;
        }
        if ((dfziVar4.a & 4) != 0) {
            dfzi dfziVar5 = dfzqVar.c;
            if (dfziVar5 == null) {
                dfziVar5 = dfzi.f;
            }
            dfzp dfzpVar = dfziVar5.d;
            if (dfzpVar == null) {
                dfzpVar = dfzp.c;
            }
            ((cjht) s).h = t(dfzpVar);
        }
        dfzi dfziVar6 = dfzqVar.c;
        if (dfziVar6 == null) {
            dfziVar6 = dfzi.f;
        }
        if (!dfziVar6.e.isEmpty()) {
            dfzi dfziVar7 = dfzqVar.c;
            if (dfziVar7 == null) {
                dfziVar7 = dfzi.f;
            }
            ((cjht) s).i = dfziVar7.e;
        }
        boolean z3 = dfzqVar.d.size() > 1;
        cjht cjhtVar2 = (cjht) s;
        cjhtVar2.k = Boolean.valueOf(z3);
        if (cjhtVar2.l == null) {
            if (cjhtVar2.m == null) {
                cjhtVar2.l = dcdc.F();
            } else {
                cjhtVar2.l = dcdc.F();
                cjhtVar2.l.i(cjhtVar2.m);
                cjhtVar2.m = null;
            }
        }
        dccx<cjhe> dccxVar = cjhtVar2.l;
        boolean z4 = dcdcVar != null && !dcdcVar.isEmpty();
        if (dfzqVar.d.isEmpty()) {
            k = dcdc.e();
            cjhnVar = s;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<dfzk> it = dfzqVar.d.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                dfzk next = it.next();
                dgly dglyVar2 = next.b;
                if (dglyVar2 == null) {
                    dglyVar2 = dgly.c;
                }
                ?? b = acls.b(dglyVar2, new mw(dxioVar) { // from class: cjhk
                    private final dxio a;

                    {
                        this.a = dxioVar;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        ((afha) this.a.a()).m((String) obj, 1);
                    }
                });
                cjhf k2 = cjhg.k();
                Iterator<dfzk> it2 = it;
                cjhr cjhrVar = (cjhr) k2;
                cjhrVar.a = b;
                cjhn cjhnVar3 = s;
                cjhrVar.d = Integer.valueOf(i);
                cjhrVar.i = cjtdVar2;
                cjhrVar.j = Boolean.valueOf(z3);
                if (onClickListener2 == null) {
                    z = z3;
                    final URLSpan[] uRLSpanArr = (URLSpan[]) b.getSpans(0, b.length(), URLSpan.class);
                    int length = uRLSpanArr.length;
                    if (length > 0) {
                        i2 = 2;
                        z2 = true;
                    } else {
                        i2 = 2;
                        z2 = false;
                    }
                    if (length >= i2) {
                        cjhrVar.f = true;
                    } else if (length == 1) {
                        cjhrVar.e = new View.OnClickListener(dxioVar, uRLSpanArr) { // from class: cjhl
                            private final dxio a;
                            private final URLSpan[] b;

                            {
                                this.a = dxioVar;
                                this.b = uRLSpanArr;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ((afha) this.a.a()).m(this.b[0].getURL(), 1);
                            }
                        };
                    }
                } else {
                    z = z3;
                    z2 = false;
                }
                if (!arrayList.isEmpty()) {
                    if (z2 == z5) {
                        ((cjhf) dcft.s(arrayList)).b(cqrp.d(4.0d));
                        d = cqrp.d(4.0d);
                    } else if (z5) {
                        ((cjhf) dcft.s(arrayList)).b(cqrp.d(8.0d));
                        d = cqrp.d(dcyn.a);
                    } else {
                        ((cjhf) dcft.s(arrayList)).b(cqrp.d(dcyn.a));
                        d = cqrp.d(8.0d);
                    }
                    cjhrVar.g = d;
                }
                if ((next.a & 2) != 0) {
                    dfzp dfzpVar2 = next.c;
                    if (dfzpVar2 == null) {
                        dfzpVar2 = dfzp.c;
                    }
                    cjhrVar.b = t(dfzpVar2);
                }
                if (!next.d.isEmpty()) {
                    cjhrVar.c = next.d;
                }
                arrayList.add(k2);
                cjtdVar2 = cjtdVar;
                z5 = z2;
                it = it2;
                s = cjhnVar3;
                z3 = z;
            }
            cjhnVar = s;
            if (z4) {
                ((cjhf) dcft.s(arrayList)).b(cqrp.d(4.0d));
            }
            k = dchl.k(arrayList, cjhm.a);
        }
        dccxVar.i(k);
        if ((dfzqVar.a & 8) != 0) {
            dgaq dgaqVar2 = dfzqVar.e;
            if (dgaqVar2 == null) {
                dgaqVar2 = dgaq.d;
            }
            cjhtVar2.c = bvoa.g(dgaqVar2);
        }
        int a = dfzn.a(dfzqVar.f);
        if (a == 0) {
            a = 1;
        }
        cjhtVar2.d = Boolean.valueOf(a == 5 || a == 4);
        cjhtVar2.e = Boolean.valueOf(a == 3 || a == 5);
        if (new dsrh(dfzqVar.h, dfzq.i).contains(dfzg.BY_CLOSE_BUTTON)) {
            cjhtVar2.b = onClickListener;
        }
        if (dcdcVar == null || dcdcVar.isEmpty()) {
            cjhnVar2 = cjhnVar;
        } else {
            cjhnVar2 = cjhnVar;
            cjhnVar2.b(dcdcVar);
            cjhtVar2.k = true;
        }
        cjhtVar2.j = onClickListener2;
        if (onClickListener2 != null) {
            cjhtVar2.a = cjtdVar;
        }
        return cjhnVar2;
    }

    public static cjhn s() {
        cjht cjhtVar = new cjht();
        cjhtVar.c = ibm.b();
        cjhtVar.b(dcdc.e());
        dcdc<cjhe> e = dcdc.e();
        if (e != null) {
            if (cjhtVar.l == null) {
                cjhtVar.m = e;
                cjhtVar.d = false;
                cjhtVar.e = false;
                cjhtVar.k = false;
                return cjhtVar;
            }
            throw new IllegalStateException("Cannot set subtitleList after calling subtitleListBuilder()");
        }
        throw new NullPointerException("Null subtitleList");
    }

    private static jhp t(dfzp dfzpVar) {
        return new jhp(new jic(dfzpVar.a, ckqc.FULLY_QUALIFIED, (cqtd) null, 0), new jic(dfzpVar.b, ckqc.FULLY_QUALIFIED, (cqtd) null, 0));
    }

    @Override // defpackage.cjhh
    @dzsi
    public abstract cjtd a();

    @Override // defpackage.cjhh
    @dzsi
    public abstract cjtd b();

    @Override // defpackage.cjhh
    @dzsi
    public abstract cjtd c();

    @Override // defpackage.cjhh
    @dzsi
    public abstract View.OnClickListener d();

    @Override // defpackage.cjhh
    public abstract cqss e();

    @Override // defpackage.cjhh
    public abstract Boolean f();

    @Override // defpackage.cjhh
    public abstract Boolean g();

    @Override // defpackage.cjhh
    @dzsi
    public abstract CharSequence h();

    @Override // defpackage.cjhh
    @dzsi
    public abstract cqss i();

    @Override // defpackage.cjhh
    @dzsi
    public abstract jhp j();

    @Override // defpackage.cjhh
    @dzsi
    public abstract CharSequence k();

    @Override // defpackage.cjhh
    @dzsi
    public abstract View.OnClickListener l();

    @Override // defpackage.cjhh
    public abstract Boolean m();

    @Override // defpackage.cjhh
    public abstract dcdc<cjew> n();

    @Override // defpackage.cjhh
    public /* bridge */ /* synthetic */ List o() {
        throw null;
    }

    public abstract dcdc<cjhe> p();
}
