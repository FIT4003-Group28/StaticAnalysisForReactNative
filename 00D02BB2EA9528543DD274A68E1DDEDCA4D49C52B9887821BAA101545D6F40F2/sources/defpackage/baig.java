package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: baig  reason: default package */
/* loaded from: classes3.dex */
public class baig implements baeu {
    private final CharSequence A;
    private final CharSequence B;
    private final ddho C;
    private final ddho D;
    final azva c;
    final baal d;
    final azxk e;
    final akqi f;
    public final azxb g;
    public CharSequence h;
    public boolean i;
    public bnju j;
    public final float k;
    public final long l;
    public int m;
    private final cqat q;
    private final gga r;
    private final dxio<begg> s;
    private final dxio<axwo> t;
    private final dxio<axwy> u;
    private CharSequence v;
    private jic w;
    private ilo x;
    private final String y;
    private final cqtd z;
    private static final Integer n = 2;
    public static final dbrl<baig> a = new baie();
    private static final int o = R.raw.ic_qu_default_hero;
    private static final cqtd p = iup.e(R.raw.ic_qu_default_hero);
    static final jic b = new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.ic_qu_default_hero), 0);

    public baig(cqat cqatVar, bvsl bvslVar, gga ggaVar, ahjq ahjqVar, dxio<begg> dxioVar, azxk azxkVar, boolean z, ddho ddhoVar, ddho ddhoVar2) {
        SpannableStringBuilder spannableStringBuilder;
        this.i = false;
        this.v = "";
        this.w = b;
        String str = null;
        this.j = null;
        this.q = cqatVar;
        this.r = ggaVar;
        this.t = null;
        this.u = null;
        this.s = dxioVar;
        this.c = null;
        this.d = null;
        this.e = azxkVar;
        akqi b2 = azxkVar.b();
        this.f = b2;
        this.g = azxb.f(azxkVar.b(), q(azxkVar));
        this.h = azxkVar.e(ggaVar);
        akqq q = q(azxkVar);
        this.x = n(this.h.toString(), b2, q);
        this.k = o(ahjqVar, q);
        str = z ? p(ahjqVar, q, bvslVar) : str;
        this.y = str;
        if (!akqi.d(b2)) {
            dolk dolkVar = azxkVar.g().c;
            if ((dolkVar == null ? dolk.h : dolkVar).d.isEmpty()) {
                spannableStringBuilder = ggaVar.getString(R.string.SAVED_TAB_SAVED_PLACE_CAROUSEL_DROPPED_PIN);
            } else {
                dolk dolkVar2 = azxkVar.g().c;
                spannableStringBuilder = (dolkVar2 == null ? dolk.h : dolkVar2).d;
            }
            if (z && str != null) {
                spannableStringBuilder = new SpannableStringBuilder().append((CharSequence) str).append((CharSequence) " · ").append(spannableStringBuilder);
            }
            this.v = spannableStringBuilder;
        }
        this.z = bael.b(baab.STARRED_PLACES);
        String string = ggaVar.getString(R.string.DEFAULT_LIST_STARRED_PLACES);
        this.A = string;
        this.B = ggaVar.getString(R.string.SAVED_TAB_SAVED_PLACE_CAROUSEL_CARD_LIST_LINK_CONTENT_DESCRIPTION, new Object[]{string, this.h});
        this.l = azxkVar.j();
        this.C = ddhoVar;
        this.D = ddhoVar2;
    }

    private static SpannableStringBuilder m(Context context, byeb byebVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byeb byebVar2 = byeb.PERMANENTLY_CLOSED;
        baif baifVar = baif.ALWAYS_VISIBLE_ALONE;
        switch (byebVar.ordinal()) {
            case 0:
                spannableStringBuilder.append((CharSequence) context.getString(R.string.PLACE_PERMANENTLY_CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.D().b(context)), 0, spannableStringBuilder.length(), 0);
                return spannableStringBuilder;
            case 1:
            case 6:
            case 7:
            case 14:
            case 15:
                spannableStringBuilder.append((CharSequence) context.getString(R.string.CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.D().b(context)), 0, spannableStringBuilder.length(), 0);
                return spannableStringBuilder;
            case 2:
            case 3:
            case 11:
            case 13:
                spannableStringBuilder.append((CharSequence) context.getString(R.string.OPEN));
                return spannableStringBuilder;
            case 4:
            case 5:
                spannableStringBuilder.append((CharSequence) context.getString(R.string.CLOSES_SOON));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.D().b(context)), 0, spannableStringBuilder.length(), 0);
                return spannableStringBuilder;
            case 8:
            case 9:
                spannableStringBuilder.append((CharSequence) context.getString(R.string.OPENS_SOON));
                return spannableStringBuilder;
            case 10:
                spannableStringBuilder.append((CharSequence) context.getString(R.string.OPEN_24_HOURS));
                return spannableStringBuilder;
            case 12:
                spannableStringBuilder.append((CharSequence) context.getString(R.string.PLACE_HOURS_UNKNOWN));
                return spannableStringBuilder;
            case 16:
                spannableStringBuilder.append((CharSequence) context.getString(R.string.PLACE_TEMPORARILY_CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.D().b(context)), 0, spannableStringBuilder.length(), 0);
                return spannableStringBuilder;
            default:
                return spannableStringBuilder;
        }
    }

    private static ilo n(String str, akqi akqiVar, akqq akqqVar) {
        ily ilyVar = new ily();
        ilyVar.F(str);
        ilyVar.j(akqiVar);
        if (akqqVar != null) {
            ilyVar.q(akqqVar);
        }
        return ilyVar.d();
    }

    private static float o(ahjq ahjqVar, akqq akqqVar) {
        GmmLocation a2 = ahjqVar.a();
        if (a2 == null || akqqVar == null) {
            return 0.0f;
        }
        return a2.F(akqqVar);
    }

    private static String p(ahjq ahjqVar, akqq akqqVar, bvsl bvslVar) {
        GmmLocation a2 = ahjqVar.a();
        if (a2 == null || akqqVar == null) {
            return null;
        }
        return isl.a(a2, akqqVar, bvslVar);
    }

    private static akqq q(azxk azxkVar) {
        dolk r = azxkVar.r();
        dbsk.s(r);
        dnoh dnohVar = r.e;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        return akqq.e(dnohVar);
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.baeu
    public jic b() {
        return this.w;
    }

    @Override // defpackage.baeu
    public CharSequence c() {
        return this.h;
    }

    @Override // defpackage.baeu
    public CharSequence d() {
        return this.v;
    }

    @Override // defpackage.baeu
    public cqtd e() {
        return this.z;
    }

    @Override // defpackage.baeu
    public CharSequence f() {
        return this.A;
    }

    @Override // defpackage.baeu
    public cqkl g() {
        begj begjVar = new begj();
        begjVar.n = true;
        begjVar.c(false);
        begjVar.c = jjn.EXPANDED;
        begjVar.b(this.x);
        this.s.a().o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.baeu
    public cjtd h() {
        cjta b2 = cjtd.b();
        b2.d = this.C;
        b2.i(this.m);
        return b2.a();
    }

    @Override // defpackage.baeu
    public cqkl i() {
        if (this.e != null) {
            this.r.D(ayen.g());
        } else if (this.d != null) {
            dxio<axwo> dxioVar = this.t;
            dbsk.s(dxioVar);
            baad b2 = this.d.b();
            dbsk.s(b2);
            dxioVar.a().i(b2);
        } else if (this.c != null) {
            dxio<axwy> dxioVar2 = this.u;
            dbsk.s(dxioVar2);
            dxioVar2.a().o();
        }
        return cqkl.a;
    }

    @Override // defpackage.baeu
    public CharSequence j() {
        return this.B;
    }

    @Override // defpackage.baeu
    public cjtd k() {
        cjta b2 = cjtd.b();
        b2.d = this.D;
        b2.i(this.m);
        return b2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(bnju bnjuVar) {
        ckqd b2;
        baif baifVar;
        this.j = bnjuVar;
        if (!this.i && bnjuVar.g() != null) {
            this.h = bnjuVar.g();
        }
        gga ggaVar = this.r;
        dnhc dnhcVar = bnjuVar.aH().h().aj;
        if (dnhcVar == null) {
            dnhcVar = dnhc.b;
        }
        String str = dnhcVar.a;
        String B = bnjuVar.aH().B();
        dsrj<dglo> dsrjVar = bnjuVar.aH().cA().a;
        byed b3 = bnjuVar.aH().al().b(this.q);
        gga ggaVar2 = this.r;
        ilo aH = bnjuVar.aH();
        String c = aehv.a(ggaVar2.getResources(), aH.bT()).c(aH.ar());
        String str2 = this.y;
        String g = dbrz.e(" · ").g(dcbg.b(dsrjVar).o(baic.a).s(baid.a).z());
        if (true != g.isEmpty()) {
            c = g;
        }
        if (true != c.isEmpty()) {
            B = c;
        }
        if (true != B.isEmpty()) {
            str = B;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add(str2);
        }
        jic jicVar = null;
        if (b3 != null) {
            byeb a2 = b3.a();
            baif[] values = baif.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    baifVar = null;
                    break;
                }
                baifVar = values[i];
                if (baifVar.d.contains(a2)) {
                    break;
                }
                i++;
            }
            if (baifVar == null) {
                baifVar = baif.INVISIBLE;
            }
            byeb byebVar = byeb.PERMANENTLY_CLOSED;
            int ordinal = baifVar.ordinal();
            if (ordinal == 0) {
                arrayList.add(m(ggaVar, a2));
            } else if (ordinal == 1) {
                arrayList.add(m(ggaVar, a2));
                if (!str.isEmpty()) {
                    arrayList.add(str);
                }
            } else if (ordinal == 2 && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.v = dbrz.e(" · ").g(arrayList.subList(0, Math.min(arrayList.size(), n.intValue())));
        if (bnjuVar.e() != null) {
            jicVar = bnjuVar.e();
        } else {
            ilo aH2 = bnjuVar.aH();
            if (aH2.h().I.size() > 0) {
                dwfl dwflVar = aH2.h().I.get(0);
                if (ckob.b(dwflVar)) {
                    b2 = new cknd(dwflVar);
                } else {
                    b2 = jfv.b(dwflVar);
                }
                jicVar = new jic(dwflVar.h, b2, p, 0);
            }
        }
        if (jicVar != null) {
            this.w = jicVar;
        }
        this.x = bnjuVar.aH();
        cqkx.p(this);
    }

    public baig(cqat cqatVar, bvsl bvslVar, gga ggaVar, ahjq ahjqVar, dxio<begg> dxioVar, dxio<axwy> dxioVar2, azva azvaVar, boolean z, ddho ddhoVar, ddho ddhoVar2) {
        this.i = false;
        this.v = "";
        this.w = b;
        String str = null;
        this.j = null;
        this.q = cqatVar;
        this.r = ggaVar;
        this.t = null;
        this.u = dxioVar2;
        this.s = dxioVar;
        this.c = azvaVar;
        this.d = null;
        this.e = null;
        akqi akqiVar = azvaVar.c;
        this.f = akqiVar;
        this.g = azxb.f(azvaVar.c, azvaVar.e);
        this.h = azvaVar.e(ggaVar);
        this.i = true;
        akqq akqqVar = azvaVar.e;
        this.x = n(this.h.toString(), akqiVar, akqqVar);
        this.k = o(ahjqVar, akqqVar);
        str = z ? p(ahjqVar, akqqVar, bvslVar) : str;
        this.y = str;
        if (!akqi.d(akqiVar)) {
            if (!z || str == null) {
                this.v = ggaVar.getString(R.string.SAVED_TAB_SAVED_PLACE_CAROUSEL_DROPPED_PIN);
            } else {
                this.v = new SpannableStringBuilder().append((CharSequence) str).append((CharSequence) " · ").append((CharSequence) ggaVar.getString(R.string.SAVED_TAB_SAVED_PLACE_CAROUSEL_DROPPED_PIN));
            }
        }
        this.z = bael.c();
        String string = ggaVar.getString(R.string.YOUR_PLACES_NICKNAMED_PLACES);
        this.A = string;
        this.B = ggaVar.getString(R.string.SAVED_TAB_SAVED_PLACE_CAROUSEL_CARD_LIST_LINK_CONTENT_DESCRIPTION, new Object[]{string, this.h});
        this.l = azvaVar.q();
        this.C = ddhoVar;
        this.D = ddhoVar2;
    }

    public baig(cqat cqatVar, bvsl bvslVar, gga ggaVar, ahjq ahjqVar, dxio<begg> dxioVar, dxio<axwo> dxioVar2, baal baalVar, boolean z, ddho ddhoVar, ddho ddhoVar2) {
        CharSequence d;
        this.i = false;
        this.v = "";
        this.w = b;
        String str = null;
        this.j = null;
        this.q = cqatVar;
        this.r = ggaVar;
        this.t = dxioVar2;
        this.u = null;
        this.s = dxioVar;
        this.c = null;
        this.d = baalVar;
        this.e = null;
        baak z2 = baalVar.z();
        dbsk.s(z2);
        akqi a2 = z2.a();
        this.f = a2;
        baak z3 = baalVar.z();
        dbsk.s(z3);
        this.g = azxb.f(z3.a(), z3.b());
        String y = baalVar.y(ggaVar);
        this.h = y;
        this.x = n(y.toString(), a2, z2.b());
        this.k = o(ahjqVar, z2.b());
        str = z ? p(ahjqVar, z2.b(), bvslVar) : str;
        this.y = str;
        if (z2.d().isEmpty()) {
            d = z2.b().b();
        } else {
            d = z2.d();
        }
        if (!akqi.d(a2)) {
            if (z && str != null) {
                d = new SpannableStringBuilder().append((CharSequence) str).append((CharSequence) " · ").append(d);
            }
            this.v = d;
        }
        baad b2 = baalVar.b();
        dbsk.s(b2);
        this.z = bael.b(b2.o());
        String E = b2.E(ggaVar);
        this.A = E;
        this.B = ggaVar.getString(R.string.SAVED_TAB_SAVED_PLACE_CAROUSEL_CARD_LIST_LINK_CONTENT_DESCRIPTION, new Object[]{E, this.h});
        this.l = baalVar.F();
        this.C = ddhoVar;
        this.D = ddhoVar2;
    }
}
