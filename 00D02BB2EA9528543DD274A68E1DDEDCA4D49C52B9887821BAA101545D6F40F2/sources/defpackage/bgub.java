package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.android.apps.gmm.reportaproblem.webview.ReportAProblemWebViewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgub  reason: default package */
/* loaded from: classes3.dex */
public class bgub implements bgtz, bega {
    public final bvvw a;
    public final bovv b;
    public final akfa c;
    public final dxio<afef> d;
    @dzsi
    public ilo e;
    private final gga f;
    private boolean g = false;
    private String h = "";

    public bgub(gga ggaVar, cqhn cqhnVar, bvvw bvvwVar, bovv bovvVar, akfa akfaVar, dxio<afef> dxioVar) {
        this.f = ggaVar;
        this.a = bvvwVar;
        this.b = bovvVar;
        this.c = akfaVar;
        this.d = dxioVar;
    }

    @Override // defpackage.bgtz
    public String a() {
        return this.f.getString(R.string.MERCHANT_DESCRIPTION_FROM_THE_OWNER);
    }

    @Override // defpackage.bgtz
    public CharSequence b() {
        if (this.g) {
            return this.f.getString(R.string.MERCHANT_DESCRIPTION_DOUBLE_QUOTATION, new Object[]{this.h});
        }
        String string = this.f.getString(R.string.MERCHANT_DESCRIPTION_QUOTATION_START, new Object[]{dbtw.f(this.h, 250)});
        String string2 = this.f.getString(R.string.SHOW_MORE);
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new ForegroundColorSpan(ibm.x().b(this.f)), 0, string2.length(), 17);
        return TextUtils.concat(string, spannableString);
    }

    @Override // defpackage.bgtz
    public cqkl c() {
        if (!this.g) {
            this.g = true;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.bgtz
    public Boolean d() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.bgtz
    public jht e() {
        jhu h = jhv.h();
        ilo iloVar = this.e;
        if (iloVar == null) {
            return ((jhi) h).b();
        }
        final dpya cO = iloVar.cO();
        if (cO == null) {
            return ((jhi) h).b();
        }
        gga ggaVar = this.f;
        Object[] objArr = new Object[1];
        ilo iloVar2 = this.e;
        objArr[0] = iloVar2 == null ? "" : iloVar2.n();
        String string = ggaVar.getString(R.string.MERCHANT_DESCRIPTION_OVERFLOW_MENU_CONTENT_DESCRIPTION, objArr);
        jhi jhiVar = (jhi) h;
        jhiVar.e = string;
        dpxx dpxxVar = cO.b;
        if (dpxxVar == null) {
            dpxxVar = dpxx.d;
        }
        if ((dpxxVar.a & 1) != 0) {
            ilo iloVar3 = this.e;
            cjtd bZ = iloVar3 == null ? null : iloVar3.bZ();
            jhm jhmVar = new jhm();
            jhmVar.l = R.string.MERCHANT_DESCRIPTION_REPORT_DESCRIPTION;
            jhmVar.a = this.f.getText(R.string.MERCHANT_DESCRIPTION_REPORT_DESCRIPTION);
            jhmVar.d(new View.OnClickListener(this, cO) { // from class: bgua
                private final bgub a;
                private final dpya b;

                {
                    this.a = this;
                    this.b = cO;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bgub bgubVar = this.a;
                    dpya dpyaVar = this.b;
                    if (!btlu.n(bgubVar.c.j())) {
                        dpxx dpxxVar2 = dpyaVar.b;
                        if (dpxxVar2 == null) {
                            dpxxVar2 = dpxx.d;
                        }
                        String str = dpxxVar2.b;
                        dnps bZ2 = dnqe.i.bZ();
                        dnqb dnqbVar = dnqb.PLACE_CARD;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dnqe dnqeVar = (dnqe) bZ2.b;
                        dnqeVar.b = dnqbVar.ah;
                        dnqeVar.a |= 1;
                        dnqe dnqeVar2 = (dnqe) bZ2.b;
                        dnqeVar2.c = 1;
                        dnqeVar2.a |= 2;
                        ilo iloVar4 = bgubVar.e;
                        dbsk.s(iloVar4);
                        bowv bowvVar = new bowv(iloVar4, bZ2.bK());
                        bvvw bvvwVar = bgubVar.a;
                        bovv bovvVar = bgubVar.b;
                        dnqb b = dnqb.b(bowvVar.i().b);
                        if (b == null) {
                            b = dnqb.UNKNOWN_ENTRY_POINT;
                        }
                        bvvwVar.k(bovvVar.a(str, "aGmm.MerchantDescription", b), new ReportAProblemWebViewCallbacks(bwrs.a(bgubVar.e), bowvVar), dtxy.jZ);
                        return;
                    }
                    afdt afdtVar = afdt.a;
                    bgubVar.d.a().r();
                }
            });
            cjta c = cjtd.c(bZ);
            c.d = dtxy.jY;
            jhmVar.f = c.a();
            h.d(jhmVar.c());
        }
        return jhiVar.b();
    }

    @Override // defpackage.bgtz
    public cjtd f(ddho ddhoVar) {
        ilo iloVar = this.e;
        dbsk.s(iloVar);
        cjta c = cjtd.c(iloVar.a());
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        this.e = c;
        if (c == null || !c.cN()) {
            return;
        }
        dpya cO = this.e.cO();
        dbsk.s(cO);
        dpxz dpxzVar = cO.a;
        if (dpxzVar == null) {
            dpxzVar = dpxz.b;
        }
        String str = dpxzVar.a;
        this.h = str;
        if (str.length() > 250) {
            return;
        }
        this.g = true;
    }

    @Override // defpackage.bega
    public void u() {
        this.e = null;
        this.g = false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo iloVar = this.e;
        boolean z = false;
        if (iloVar != null && iloVar.cN()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
