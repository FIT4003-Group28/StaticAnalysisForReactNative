package defpackage;

import android.app.Application;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cczj  reason: default package */
/* loaded from: classes4.dex */
public class cczj implements ccxk {
    @dzsi
    private final ccxh a;
    private final ccwu b;
    private final ccxj c;
    private final ccxi d;
    private final CharSequence e;
    private final cjtd f;

    /* JADX WARN: Multi-variable type inference failed */
    public cczj(btvo btvoVar, Application application, String str, dgfb dgfbVar, ccwu ccwuVar, ccxi ccxiVar, ccxh ccxhVar) {
        ccxj ccxjVar;
        boolean g = btvoVar.getUgcOfferingsParameters().g();
        boolean z = false;
        if (g) {
            djtz djtzVar = ccwuVar.c;
            if ((djtzVar == null ? djtz.c : djtzVar).a == 1) {
                z = true;
            }
        }
        boolean l = btvoVar.getUgcOfferingsParameters().l();
        this.f = cjtd.a(z ? dtxx.ak : dtxx.as);
        String str2 = ccwuVar.b;
        if (btvoVar.getUgcOfferingsParameters().l()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ibm.m().b(application));
            spannableStringBuilder.append((CharSequence) str2);
            int indexOf = h(str2).indexOf(h(str));
            if (indexOf >= 0 && !dbsj.d(str)) {
                spannableStringBuilder.setSpan(foregroundColorSpan, indexOf, str.length() + indexOf, 33);
            }
            str2 = spannableStringBuilder;
        }
        this.e = str2;
        this.b = ccwuVar;
        this.d = ccxiVar;
        this.a = true != z ? null : ccxhVar;
        int ordinal = dgfbVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                ccxjVar = ccxj.SHOPPING;
            } else if (ordinal == 3) {
                ccxjVar = ccxj.LOCAL_PLAY;
            } else {
                ccxjVar = ccxj.HELP;
            }
        } else if (z) {
            if (g) {
                ccxjVar = ccxj.RESTAURANT_BLUE;
            } else {
                ccxjVar = ccxj.RESTAURANT;
            }
        } else if (l || g) {
            ccxjVar = ccxj.NONE;
        } else {
            ccxjVar = ccxj.RESTAURANT;
        }
        this.c = ccxjVar;
    }

    private static String h(String str) {
        return str.toLowerCase(Locale.getDefault());
    }

    @Override // defpackage.ccxk
    public CharSequence a() {
        return this.e;
    }

    @Override // defpackage.ccxk
    public ccxj b() {
        return this.c;
    }

    @Override // defpackage.ccxk
    public cqkl c() {
        this.d.a(this);
        return cqkl.a;
    }

    @Override // defpackage.ccxk
    public Boolean d() {
        return Boolean.valueOf(this.a != null);
    }

    @Override // defpackage.ccxk
    public cqkl e() {
        djtw djtwVar;
        ccxh ccxhVar = this.a;
        if (ccxhVar != null) {
            ccwu ccwuVar = this.b;
            cclk cclkVar = (cclk) ccxhVar;
            gga ggaVar = cclkVar.c;
            ccwk ccwkVar = cclkVar.ai.d;
            if (ccwkVar == null) {
                ccwkVar = ccwk.m;
            }
            dgfb b = dgfb.b(ccwkVar.b);
            if (b == null) {
                b = dgfb.UNKNOWN_OFFERING_TYPE;
            }
            djtz djtzVar = ccwuVar.c;
            if (djtzVar == null) {
                djtzVar = djtz.c;
            }
            dbsk.a(djtzVar.a == 1);
            cclm bZ = ccln.p.bZ();
            djtz djtzVar2 = ccwuVar.c;
            if (djtzVar2 == null) {
                djtzVar2 = djtz.c;
            }
            if (djtzVar2.a == 1) {
                djtwVar = (djtw) djtzVar2.b;
            } else {
                djtwVar = djtw.b;
            }
            String str = djtwVar.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccln cclnVar = (ccln) bZ.b;
            str.getClass();
            int i = 1 | cclnVar.a;
            cclnVar.a = i;
            cclnVar.d = str;
            String str2 = ccwuVar.b;
            str2.getClass();
            int i2 = i | 8;
            cclnVar.a = i2;
            cclnVar.f = str2;
            cclnVar.e = b.f;
            cclnVar.a = i2 | 2;
            ccln bK = bZ.bK();
            ccwk ccwkVar2 = cclkVar.ai.d;
            if (ccwkVar2 == null) {
                ccwkVar2 = ccwk.m;
            }
            ccxa ccxaVar = ccwkVar2.c;
            if (ccxaVar == null) {
                ccxaVar = ccxa.f;
            }
            cclx bZ2 = ccma.c.bZ();
            bZ2.a(cclz.WRONG_NAME);
            bZ2.a(cclz.INAPPROPRIATE_NAME);
            bZ2.a(cclz.NOT_SERVED);
            ggaVar.D(cclg.g(bK, ccxaVar, bZ2.bK()));
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxk
    public cjtd f() {
        return this.f;
    }

    public ccwu g() {
        return this.b;
    }
}
