package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmdq  reason: default package */
/* loaded from: classes3.dex */
public class bmdq {
    private static volatile transient boolean h = false;
    private static transient boolean i = false;
    public final Activity a;
    private final beia b;
    private final beia c;
    private final cjqy d;
    private final eeu e;
    private final dxio<aesb> f;
    private final dxio<afha> g;

    public bmdq(Activity activity, beia beiaVar, cjqy cjqyVar, eeu eeuVar, dxio<aesb> dxioVar, dxio<afha> dxioVar2, beia beiaVar2) {
        this.a = activity;
        this.b = beiaVar;
        this.c = beiaVar2;
        this.d = cjqyVar;
        this.e = eeuVar;
        this.f = dxioVar;
        this.g = dxioVar2;
    }

    @dzsi
    private static String f(ilo iloVar, bmds bmdsVar) {
        boolean c = bmdsVar.c();
        if (bmdsVar.a()) {
            if (c) {
                return iloVar.J();
            }
            return iloVar.I();
        } else if (c) {
            return iloVar.N();
        } else {
            return iloVar.L();
        }
    }

    private final boolean g(ilo iloVar, bmds bmdsVar, String str) {
        return bmdsVar.d() && !iloVar.aM() && !this.c.a(iloVar) && str.equals(iloVar.L()) && dbsj.d(iloVar.O());
    }

    private final void h(beia beiaVar, ilo iloVar, @dzsi cjtx cjtxVar, dbsg<cjqm> dbsgVar) {
        beiaVar.c(iloVar, new bmdn(this, new bmdu(this.a), cjtxVar, iloVar), dbsgVar);
    }

    public final void a(bwrs<ilo> bwrsVar, bmds bmdsVar) {
        if (!((efh) this.e).b) {
            return;
        }
        ilo c = bwrsVar.c();
        String f = f(c, bmdsVar);
        if (dbsj.d(f)) {
            return;
        }
        if (bmdsVar.e()) {
            this.f.a().D((ilo) bwrs.b(bwrsVar), 8, dtxy.hB);
        }
        cjtx c2 = bmdsVar.f() ? cjtx.c(2, c, false) : null;
        if (g(c, bmdsVar, f) && this.b.a(c)) {
            beih beihVar = (beih) this.b;
            if (!beihVar.a(c) || !beihVar.c.i() || c.cQ().isEmpty() || dbsj.d(c.L())) {
                ddda dddaVar = ddda.aI;
                dbsg<cjqm> g = bmdsVar.g();
                cjsx i2 = cjsy.i();
                i2.b(dddaVar);
                cjsy a = i2.a();
                if (g.a()) {
                    this.d.K(a, g.b());
                } else {
                    this.d.k(a);
                }
            } else {
                h(this.b, c, c2, bmdsVar.g());
                return;
            }
        }
        if (!((cty) this.c).a.i() || !this.c.a(c)) {
            String n = c.n();
            String valueOf = String.valueOf(f);
            b(n, f, Uri.parse(valueOf.length() != 0 ? "tel: ".concat(valueOf) : new String("tel: ")), (!bmdsVar.b() || !dbsj.d(c.P())) ? null : c.O(), this.a, c2);
            return;
        }
        h(this.c, c, c2, bmdsVar.g());
    }

    public final void b(String str, String str2, Uri uri, @dzsi String str3, Activity activity, @dzsi cjtx cjtxVar) {
        if (!dbsj.d(str3)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(String.valueOf(str2).concat("  "));
            spannableString.setSpan(new ForegroundColorSpan(irg.J().b(activity)), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            SpannableString spannableString2 = new SpannableString(str3);
            spannableString2.setSpan(new ForegroundColorSpan(irg.H().b(activity)), 0, str3.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
            new AlertDialog.Builder(activity).setTitle(str).setMessage(spannableStringBuilder).setPositiveButton(R.string.CALL, new bmdp(this, uri, activity, cjtxVar)).setNegativeButton(R.string.CANCEL_BUTTON, new bmdo()).create().show();
            return;
        }
        e(uri, activity, cjtxVar);
    }

    public final boolean c() {
        if (!h) {
            synchronized (bmdq.class) {
                if (!h) {
                    Activity activity = this.a;
                    boolean z = false;
                    if (activity.getPackageManager().hasSystemFeature("android.hardware.telephony") && !activity.getPackageManager().queryIntentActivities(new Intent("android.intent.action.DIAL"), 0).isEmpty()) {
                        z = true;
                    }
                    i = z;
                    h = true;
                }
            }
        }
        return i;
    }

    public final cjtd d(cjtd cjtdVar, ilo iloVar, bmds bmdsVar) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        cty ctyVar = (cty) this.c;
        dbsg<ddho> b = ctyVar.c.b(iloVar);
        if (ctyVar.a(iloVar) && b.a()) {
            cjta c = cjtd.c(cjtdVar);
            c.d = b.b();
            dbsgVar = dbsg.i(c.a());
        } else {
            dbsgVar = dbpy.a;
        }
        if (dbsgVar.a()) {
            return (cjtd) dbsgVar.b();
        }
        String f = f(iloVar, bmdsVar);
        if (((beih) this.b).b() && iloVar.M().a()) {
            dcep<dfzy> dcepVar = beih.a;
            dfzy b2 = dfzy.b(iloVar.M().b().a);
            if (b2 == null) {
                b2 = dfzy.UNKNOWN_DYNAMIC_ALLOCATION_SOURCE;
            }
            if (dcepVar.contains(b2)) {
                cjta c2 = cjtd.c(cjtdVar);
                c2.g(iloVar.M().b().b);
                dbsgVar2 = dbsg.i(c2.a());
                return f != null ? cjtdVar : cjtdVar;
            }
        }
        dbsgVar2 = dbpy.a;
        return f != null ? cjtdVar : cjtdVar;
    }

    public final void e(Uri uri, Activity activity, @dzsi cjtx cjtxVar) {
        if (cjtxVar != null) {
            this.d.u(cjtxVar);
        }
        this.g.a().f(activity, new Intent("android.intent.action.DIAL", uri), 4);
    }
}
