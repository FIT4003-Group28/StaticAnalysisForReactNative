package defpackage;

import android.app.Activity;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bhug  reason: default package */
/* loaded from: classes3.dex */
public class bhug implements bhtu {
    private final cdjd a;
    private final dvxh b;
    private final boolean c;
    private final boolean d;
    private final bwrs<ilo> e;
    private final bhhf f;
    private final bhtz g;
    private final btvo h;
    @dzsi
    private final cjcu i;

    public bhug(cdjd cdjdVar, dvxh dvxhVar, boolean z, bwrs<ilo> bwrsVar, cjcs cjcsVar, btvo btvoVar, bhhf bhhfVar, bhtz bhtzVar, cjcw cjcwVar) {
        this.a = cdjdVar;
        this.b = dvxhVar;
        this.c = z;
        boolean booleanValue = ((Boolean) cdjdVar.d().h(bhua.a).c(false)).booleanValue();
        this.d = booleanValue;
        this.e = bwrsVar;
        this.h = btvoVar;
        this.f = bhhfVar;
        this.g = bhtzVar;
        cjcv cjcvVar = null;
        if (cdjdVar.d().a() && cdjdVar.d().b().a().b().a()) {
            cjcvVar = cjcwVar.a(booleanValue, cdjdVar.d().b().a().d(), (String) cdjdVar.a().b().h(bhub.a).c(""), cjct.OWNER_RESPONSE, null, cjcsVar);
        }
        this.i = cjcvVar;
    }

    @Override // defpackage.bhtu
    public String a() {
        if (!this.d) {
            return (String) this.a.d().h(bhuc.a).c("");
        }
        return (String) this.a.d().h(bhud.a).c("");
    }

    @Override // defpackage.bhtu
    public Boolean b() {
        return Boolean.valueOf(this.a.d().a());
    }

    @Override // defpackage.bhtu
    public String c() {
        dnzt dnztVar = this.b.s;
        if (dnztVar == null) {
            dnztVar = dnzt.e;
        }
        return dnztVar.c;
    }

    @Override // defpackage.bhtu
    public String d() {
        return (String) this.a.d().h(bhue.a).c("");
    }

    @Override // defpackage.bhtu
    public jic e() {
        dnzt dnztVar = this.b.s;
        if (dnztVar == null) {
            dnztVar = dnzt.e;
        }
        dnpq dnpqVar = dnztVar.b;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return new jic(dnpqVar.e, ckqc.FULLY_QUALIFIED, 2131232998);
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bhug)) {
            return false;
        }
        bhug bhugVar = (bhug) obj;
        return dbsd.a(this.b, bhugVar.b) && dbsd.a(a(), bhugVar.a()) && dbsd.a(Boolean.valueOf(this.c), Boolean.valueOf(bhugVar.c));
    }

    @Override // defpackage.bhtu
    public Boolean f() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.bhtu
    public Boolean g() {
        return Boolean.valueOf(this.h.getUgcParameters().aQ());
    }

    @Override // defpackage.bhtu
    @dzsi
    public jht h() {
        if (this.f.f(this.e) && b().booleanValue() && ((Boolean) this.a.d().h(bhuf.a).c(false)).booleanValue()) {
            bhtz bhtzVar = this.g;
            bwrs<ilo> bwrsVar = this.e;
            cdjd cdjdVar = this.a;
            bhtz.a(bwrsVar, 1);
            bhtz.a(cdjdVar, 2);
            Activity activity = (Activity) ((dxjd) bhtzVar.a).a;
            bhtz.a(activity, 3);
            aput a = bhtzVar.b.a();
            bhtz.a(a, 4);
            return new bhty(bwrsVar, cdjdVar, activity, a).b();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a.a().g()});
    }

    @Override // defpackage.bhtu
    @dzsi
    public cjcu i() {
        return this.i;
    }

    @Override // defpackage.bhtu
    public String j() {
        return String.format("%s · %s", c(), d());
    }
}
