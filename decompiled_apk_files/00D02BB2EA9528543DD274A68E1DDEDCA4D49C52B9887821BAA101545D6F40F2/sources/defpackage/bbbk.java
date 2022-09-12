package defpackage;

import android.text.Html;
import android.text.Spanned;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbbk  reason: default package */
/* loaded from: classes3.dex */
public class bbbk extends bban {
    public final bbbb a;
    public final cklf b;
    private final bvjj c;
    private final akfa h;
    private final cjqy i;
    private final barv j;
    private final bbbd k;
    private final ania l;
    private final v<dcdc<drjs>> m;
    @dzsi
    private bayn n;
    @dzsi
    private baqh o;
    @dzsi
    private aa<dcdc<drjs>> p;

    public bbbk(gga ggaVar, bvjj bvjjVar, akfa akfaVar, cjqy cjqyVar, cklf cklfVar, ania aniaVar, axwq axwqVar, barv barvVar, bbbd bbbdVar, bbbb bbbbVar) {
        super(ggaVar);
        this.n = null;
        this.o = null;
        this.p = null;
        this.c = bvjjVar;
        this.h = akfaVar;
        this.i = cjqyVar;
        this.b = cklfVar;
        this.l = aniaVar;
        this.k = bbbdVar;
        this.j = barvVar;
        this.a = bbbbVar;
        this.m = axwqVar.y().c();
    }

    public static acpa e(gga ggaVar) {
        cqtd g = cqrt.g(2131232726, ibm.n());
        Spanned fromHtml = Html.fromHtml(ggaVar.getString(R.string.TRIP_RESERVATIONS_SOURCE_HELP_TEXT), null, new bbbj(new bbbi(ggaVar)));
        return new acpc(fromHtml, fromHtml, g);
    }

    private final boolean g() {
        return j() && k();
    }

    private final boolean j() {
        return this.l.a();
    }

    private final boolean k() {
        return !this.c.o(bvjk.gK, this.h.j(), false);
    }

    @Override // defpackage.bban, defpackage.bayl
    public List<bayj> QI() {
        if (!g()) {
            return dcdc.e();
        }
        if (this.p == null) {
            this.p = new aa(this) { // from class: bbbe
                private final bbbk a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    bbbk bbbkVar = this.a;
                    bbbkVar.e.clear();
                    List<bayj> list = bbbkVar.e;
                    dcbg o = dcbg.b((dcdc) obj).o(bbbf.a);
                    final bbbb bbbbVar = bbbkVar.a;
                    bbbbVar.getClass();
                    list.addAll(o.s(new dbrn(bbbbVar) { // from class: bbbg
                        private final bbbb a;

                        {
                            this.a = bbbbVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            return this.a.a((drjs) obj2);
                        }
                    }).z());
                    cqkx.p(bbbkVar);
                }
            };
            this.m.b(this.d, this.p);
        }
        return super.QI();
    }

    @Override // defpackage.bban, defpackage.bayl
    @dzsi
    public baqh QK() {
        baru baruVar = null;
        if (g()) {
            baru a = this.j.a();
            baqh baqhVar = this.o;
            if (baqhVar != null && baqhVar.h().equals(a.h())) {
                return this.o;
            }
            if (true != a.Pd().isEmpty()) {
                baruVar = a;
            }
            this.o = baruVar;
        }
        return baruVar;
    }

    public final boolean f() {
        return !QI().isEmpty() || QK() != null;
    }

    @Override // defpackage.bban, defpackage.bayl
    public bayn i() {
        bayn baynVar = this.n;
        if (baynVar == null) {
            gga ggaVar = this.d;
            baynVar = new bbbh(this, ggaVar, this.i, ggaVar.getString(R.string.UPCOMING_RESERVATIONS_SUBHEADER_LINK_FORMAT_GMAIL_AND_CALENDAR), this.d.getString(R.string.LEARN_MORE), dtyi.bW);
        }
        this.n = baynVar;
        return baynVar;
    }

    @Override // defpackage.bayl
    public baye n() {
        bbbd bbbdVar = this.k;
        boolean z = false;
        if (!d().booleanValue() && !f()) {
            z = true;
        }
        return bbbdVar.a(z, j(), k());
    }
}
