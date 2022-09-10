package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: adxv  reason: default package */
/* loaded from: classes2.dex */
public class adxv extends adyp implements adyu {
    private static final dcqe q = dcqe.c("adxv");
    @dzsi
    private final advr A;
    private final adxe B;
    private final cjtd C;
    private final cjtd D;
    private final cjta E;
    @dzsi
    private final dqhj F;
    @dzsi
    private final gfw G;
    public final gga a;
    public final bwqv b;
    public final dxio<afha> c;
    public final ilo d;
    public final btvo e;
    dwfl f;
    private final dxio<cafi> r;
    private final dxio<bbut> s;
    private final CharSequence t;
    private final CharSequence u;
    private final String v;
    private final String w;
    @dzsi
    private final jic x;
    @dzsi
    private final jic y;
    @dzsi
    private final adwy z;

    /* JADX WARN: Removed duplicated region for block: B:42:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public adxv(defpackage.gga r18, defpackage.bwqv r19, defpackage.abfa r20, defpackage.dxio<defpackage.cafi> r21, defpackage.dxio<defpackage.afha> r22, defpackage.adwz r23, defpackage.adxf r24, defpackage.dxio<defpackage.bbut> r25, defpackage.axjh r26, final defpackage.adwv r27, defpackage.adyo r28, defpackage.gfw r29, defpackage.btvo r30, defpackage.absg r31, java.lang.String r32, defpackage.dwfl r33, defpackage.dlcx r34, defpackage.dlcz r35, defpackage.cjtd r36, android.view.View.OnAttachStateChangeListener r37, @defpackage.dzsi defpackage.btlu r38, @defpackage.dzsi defpackage.dqhj r39, @defpackage.dzsi defpackage.dspd r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adxv.<init>(gga, bwqv, abfa, dxio, dxio, adwz, adxf, dxio, axjh, adwv, adyo, gfw, btvo, absg, java.lang.String, dwfl, dlcx, dlcz, cjtd, android.view.View$OnAttachStateChangeListener, btlu, dqhj, dspd, java.lang.String):void");
    }

    @Override // defpackage.adyp, defpackage.advs
    @dzsi
    public jbj B() {
        return this.z;
    }

    @Override // defpackage.adyp
    @dzsi
    protected final jic O() {
        return this.x;
    }

    @Override // defpackage.adyp
    @dzsi
    public jic P() {
        return this.y;
    }

    @Override // defpackage.adyp
    @dzsi
    public dqhj Q() {
        return this.F;
    }

    @Override // defpackage.adyp
    protected final List<jho> R() {
        ArrayList arrayList = new ArrayList();
        jhm a = jhm.a();
        a.a = this.a.getString(R.string.REPORT_A_PROBLEM);
        a.b = this.a.getString(R.string.REPORT_A_PROBLEM);
        a.f = cjtd.b;
        a.d(new View.OnClickListener(this) { // from class: adxt
            private final adxv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adxv adxvVar = this.a;
                bdjk.bn(adxvVar.a, adxvVar.f, adxvVar.d, adxvVar.b, adxvVar.e, adxvVar.c, bbvn.d);
            }
        });
        arrayList.add(a.c());
        return arrayList;
    }

    @Override // defpackage.adyu
    public void S(bbua bbuaVar) {
        dqjc dqjcVar = bbuaVar.e().get(this.f.d);
        if (dqjcVar != null) {
            dwfl dwflVar = this.f;
            dsqp dsqpVar = (dsqp) dwflVar.cu(5);
            dsqpVar.bC(dwflVar);
            dwfi dwfiVar = (dwfi) dsqpVar;
            if (dwfiVar.c) {
                dwfiVar.bF();
                dwfiVar.c = false;
            }
            dwfl dwflVar2 = (dwfl) dwfiVar.b;
            dqjcVar.getClass();
            dwflVar2.s = dqjcVar;
            dwflVar2.a |= 262144;
            this.f = dwfiVar.bK();
            adwy adwyVar = this.z;
            if (adwyVar == null) {
                return;
            }
            adwyVar.h = dqjcVar;
            cqkx.p(adwyVar);
        }
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence a() {
        return this.t;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence b() {
        return this.u;
    }

    @Override // defpackage.adyp, defpackage.advs
    public String c() {
        return this.v;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return this.C;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl f() {
        if (this.w.isEmpty()) {
            return cqkl.a;
        }
        try {
            Runnable b = bmek.b(this.a, this.r.a(), this.c, this.w);
            if (b != null) {
                b.run();
            }
        } catch (RuntimeException e) {
            bvoo.i(e);
        }
        return cqkl.a;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd g() {
        return this.E.b(dtxr.bQ);
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd h() {
        return this.D;
    }

    @Override // defpackage.adyp, defpackage.advs
    @dzsi
    public advr n() {
        return this.A;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence p() {
        return "";
    }

    @Override // defpackage.adyp, defpackage.advs
    public String s() {
        return this.a.getResources().getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_PHOTO_OF_PLACE, this.B.a());
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl v() {
        bbtv v = bbty.v();
        v.e(false);
        v.k(true);
        v.o(true);
        v.j(bbtq.a);
        bbty a = v.a();
        if (this.z != null) {
            dwfl dwflVar = this.f;
            dsqp dsqpVar = (dsqp) dwflVar.cu(5);
            dsqpVar.bC(dwflVar);
            dwfi dwfiVar = (dwfi) dsqpVar;
            dqjc dqjcVar = this.z.h;
            if (dwfiVar.c) {
                dwfiVar.bF();
                dwfiVar.c = false;
            }
            dwfl dwflVar2 = (dwfl) dwfiVar.b;
            dwfl dwflVar3 = dwfl.w;
            dqjcVar.getClass();
            dwflVar2.s = dqjcVar;
            dwflVar2.a |= 262144;
            this.f = dwfiVar.bK();
        }
        this.s.a().p(new ckni(dcdc.f(this.f)), 0, a, bwrs.a(this.d), this.G);
        return cqkl.a;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd w() {
        return this.E.b(dtxr.bS);
    }

    @Override // defpackage.adyp, defpackage.advs
    public advi z() {
        return this.B;
    }
}
