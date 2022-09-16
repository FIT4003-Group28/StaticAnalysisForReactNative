package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.speech.tts.UtteranceProgressListener;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bmgl  reason: default package */
/* loaded from: classes3.dex */
class bmgl implements bmgi {
    public String a;
    final UtteranceProgressListener b;
    private final bmgw c;
    private final gga d;
    private final afha e;
    private final cjtd f;
    private final String g;
    private final String h;
    @dzsi
    private final Locale i;
    private final String j;
    private final String k;
    private final String l;
    private final boolean m;
    private final boolean n;

    public bmgl(bmgw bmgwVar, gga ggaVar, final ckmc ckmcVar, afha afhaVar, cqhn cqhnVar, bvrb bvrbVar, bwrs<ilo> bwrsVar, String str, String str2, @dzsi Locale locale) {
        this.c = bmgwVar;
        this.d = ggaVar;
        this.e = afhaVar;
        this.g = str;
        this.h = str2;
        this.i = locale;
        String displayLanguage = locale == null ? "" : locale.getDisplayLanguage();
        this.j = ggaVar.getString(R.string.SPEAKEASY_CARD_TITLE, new Object[]{displayLanguage});
        this.k = ggaVar.getString(R.string.SPEAKEASY_CARD_TITLE_LINK_DESCRIPTION, new Object[]{displayLanguage});
        this.l = ggaVar.getString(R.string.SPEAKEASY_CARD_ADDRESS_LINK_DESCRIPTION, new Object[]{displayLanguage});
        this.a = Locale.getDefault().getLanguage();
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        this.f = iloVar.bZ();
        this.m = bmfg.d(iloVar);
        this.n = bmgwVar.d(locale);
        if (Build.VERSION.SDK_INT >= 23) {
            bvrbVar.b(new Runnable(this, ckmcVar) { // from class: bmgj
                private final bmgl a;
                private final ckmc b;

                {
                    this.a = this;
                    this.b = ckmcVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bmgl bmglVar = this.a;
                    if (this.b.a() != null) {
                        bmglVar.a = Locale.forLanguageTag(bmglVar.a).getLanguage();
                    }
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
        this.b = new bmgk(this);
    }

    private final void x(String str, String str2, String str3) {
        ((ClipboardManager) this.d.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str3));
        Toast.makeText(this.d, str2, 0).show();
    }

    @Override // defpackage.bmgi
    public String a() {
        return this.g;
    }

    @Override // defpackage.bmgi
    public String b() {
        return this.h;
    }

    @Override // defpackage.bmgi
    public String c() {
        return this.j;
    }

    @Override // defpackage.bmgi
    public String d() {
        return this.k;
    }

    @Override // defpackage.bmgi
    public String e() {
        return this.l;
    }

    @Override // defpackage.bmgi
    public cqtd f() {
        return cqrt.g(true != this.c.b(this.g) ? 2131232460 : 2131232432, ibm.x());
    }

    @Override // defpackage.bmgi
    public cqtd g() {
        return cqrt.g(true != this.c.b(this.h) ? 2131232460 : 2131232432, ibm.x());
    }

    @Override // defpackage.bmgi
    public Boolean h() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.bmgi
    public Boolean i() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.bmgi
    public cqkl j() {
        Locale locale = this.i;
        if (locale != null && this.n) {
            this.c.e(locale, this.m ? this.h : this.g, this.b);
        }
        return cqkl.a;
    }

    @Override // defpackage.bmgi
    public cqkl k() {
        Locale locale = this.i;
        if (locale != null && this.n) {
            this.c.e(locale, this.h, this.b);
        }
        return cqkl.a;
    }

    @Override // defpackage.bmgi
    public cqkl l() {
        x(this.d.getString(R.string.SPEAKEASY_TITLE_LABEL), this.d.getString(R.string.SPEAKEASY_NAME_COPY), this.g);
        return cqkl.a;
    }

    @Override // defpackage.bmgi
    public cqkl m() {
        x(this.d.getString(R.string.SPEAKEASY_ADDRESS_LABEL), this.d.getString(R.string.SPEAKEASY_ADDRESS_COPY), this.h);
        return cqkl.a;
    }

    @Override // defpackage.bmgi
    public cqkl n() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(32);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("translate.google.com").path("m/translate").appendQueryParameter("sl", this.a);
        Locale locale = this.i;
        intent.setData(appendQueryParameter.appendQueryParameter("tl", locale == null ? "" : locale.getLanguage()).build());
        o();
        this.e.o(intent, 2);
        return cqkl.a;
    }

    @Override // defpackage.bmgi
    public void o() {
        this.c.c();
    }

    @Override // defpackage.bmgi
    public cqkl p() {
        o();
        this.d.g().f();
        return cqkl.a;
    }

    @Override // defpackage.bmgi
    public cjtd q() {
        cjta c = cjtd.c(this.f);
        c.d = dtxy.ik;
        return c.a();
    }

    @Override // defpackage.bmgi
    public cjtd r() {
        cjta c = cjtd.c(this.f);
        c.d = dtxy.in;
        return c.a();
    }

    @Override // defpackage.bmgi
    public cjtd s() {
        cjta c = cjtd.c(this.f);
        c.d = dtxy.ip;
        return c.a();
    }

    @Override // defpackage.bmgi
    public cjtd t() {
        cjta c = cjtd.c(this.f);
        c.d = dtxy.io;
        return c.a();
    }

    @Override // defpackage.bmgi
    public cjtd u() {
        cjta c = cjtd.c(this.f);
        c.d = dtxy.im;
        return c.a();
    }

    @Override // defpackage.bmgi
    public cjtd v() {
        cjta c = cjtd.c(this.f);
        c.d = dtxy.il;
        return c.a();
    }

    @Override // defpackage.bmgi
    public cjtd w() {
        cjta c = cjtd.c(this.f);
        c.d = dtxy.iq;
        return c.a();
    }
}
