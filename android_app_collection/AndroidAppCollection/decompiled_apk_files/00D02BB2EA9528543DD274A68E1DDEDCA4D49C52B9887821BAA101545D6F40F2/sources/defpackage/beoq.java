package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beoq  reason: default package */
/* loaded from: classes3.dex */
public class beoq implements benq {
    static final Interpolator a = new LinearInterpolator();
    private String A;
    private String B;
    private String C;
    public final String b;
    public final String c;
    public final Handler d;
    public final bgym e;
    public final boolean f;
    public String g;
    public boolean h;
    private final bmdq i;
    private final String j;
    private final dxio<beii> k;
    private final ff l;
    private final dgfy m;
    private final bwrs<ilo> n;
    private final boolean o;
    private final boolean p;
    private final View.OnAttachStateChangeListener q = new beom(this);
    @dzsi
    private cjtd r;
    @dzsi
    private cjtd s;
    @dzsi
    private final String t;
    @dzsi
    private cjtd u;
    @dzsi
    private final bwrs<bvrt<benb>> v;
    @dzsi
    private Bitmap w;
    @dzsi
    private final Integer x;
    @dzsi
    private String y;
    private cjtd z;

    public beoq(bmdq bmdqVar, dxio<beii> dxioVar, cqhn cqhnVar, cqhu cqhuVar, ff ffVar, bgym bgymVar, String str, @dzsi Integer num, @dzsi bwrs<bvrt<benb>> bwrsVar, dgfy dgfyVar, bwrs<ilo> bwrsVar2, @dzsi Integer num2, boolean z) {
        this.k = dxioVar;
        this.i = bmdqVar;
        this.l = ffVar;
        this.e = bgymVar;
        this.C = str;
        this.v = bwrsVar;
        this.m = dgfyVar;
        this.n = bwrsVar2;
        this.x = num2;
        this.p = z;
        String string = ffVar.getString(R.string.MERCHANT_PANEL_CALLS_LIST_ACTION_CALL);
        this.j = string;
        boolean z2 = true;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + str.length());
        sb.append(string);
        sb.append(" ");
        sb.append(str);
        this.A = sb.toString();
        this.b = ffVar.getString(R.string.MERCHANT_PANEL_CALLS_LIST_ACTION_COPIED);
        String string2 = ffVar.getString(R.string.MERCHANT_PANEL_CALLS_LIST_ACTION_COPY);
        this.c = string2;
        this.g = string2;
        String str2 = dgfyVar.d;
        this.t = str2;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 1 + String.valueOf(str2).length());
        sb2.append(string2);
        sb2.append(" ");
        sb2.append(str2);
        this.B = sb2.toString();
        this.d = new Handler();
        boolean z3 = bmdqVar.c() && (dgfyVar.a & 4) != 0;
        this.o = z3;
        z2 = (dgfyVar.a & 4) == 0 ? false : z2;
        this.f = z2;
        this.h = z2;
        ilo c = bwrsVar2.c();
        cjta c2 = cjtd.c(c != null ? c.bZ() : null);
        if (num != null) {
            c2.i(num.intValue());
        }
        c2.d = z ? dtxv.aK : dtxv.aB;
        this.z = c2.a();
        if (z3) {
            c2.d = z ? dtxv.aJ : dtxv.aA;
            this.r = c2.a();
        }
        if (z2) {
            c2.d = z ? dtxv.aL : dtxv.aC;
            this.s = c2.a();
        }
        if (z) {
            c2.d = dtxv.aM;
            this.u = c2.a();
        }
    }

    @Override // defpackage.benq
    public cjtd a() {
        return this.z;
    }

    @Override // defpackage.benq
    public String b() {
        return this.A;
    }

    @Override // defpackage.benq
    @dzsi
    public cjtd c() {
        return this.r;
    }

    @Override // defpackage.benq
    public String d() {
        return this.h ? this.B : this.b;
    }

    @Override // defpackage.benq
    public View.OnAttachStateChangeListener e() {
        return this.q;
    }

    @Override // defpackage.benq
    public String f() {
        return this.g;
    }

    @Override // defpackage.benq
    @dzsi
    public cjtd g() {
        return this.s;
    }

    @Override // defpackage.benq
    @dzsi
    public cjtd h() {
        return this.u;
    }

    @Override // defpackage.benq
    public cqkl i() {
        if (this.o) {
            bmdq bmdqVar = this.i;
            String valueOf = String.valueOf(this.t);
            bmdqVar.e(Uri.parse(valueOf.length() != 0 ? "tel:".concat(valueOf) : new String("tel:")), this.l, null);
        }
        return cqkl.a;
    }

    @Override // defpackage.benq
    public cqkl j() {
        if (!this.f) {
            return cqkl.a;
        }
        ClipboardManager clipboardManager = (ClipboardManager) this.l.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(this.l.getString(R.string.COPIED_PHONE_LABEL), this.t));
            View o = cqkx.o(this);
            LottieAnimationView lottieAnimationView = o == null ? null : (LottieAnimationView) cqhu.a(o, bejw.a);
            if (lottieAnimationView != null) {
                this.h = false;
                cqkx.p(this);
                s(this.b);
                lottieAnimationView.a();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.benq
    public cqkl k() {
        if (this.p && this.C != null && this.v != null && this.m != null && this.n != null && this.x != null) {
            beii a2 = this.k.a();
            String str = this.C;
            dbsk.s(str);
            bwrs<bvrt<benb>> bwrsVar = this.v;
            dgfy dgfyVar = this.m;
            bwrs<ilo> bwrsVar2 = this.n;
            Bitmap bitmap = this.w;
            int intValue = this.x.intValue();
            String str2 = this.y;
            gga ggaVar = a2.a;
            bwqv bwqvVar = a2.b;
            beiy beiyVar = new beiy();
            Bundle bundle = new Bundle();
            bundle.putString("MerchantCallsHistoryFragment.displayName", str);
            bvrs.k(bundle, "MerchantCallsHistoryFragment.phoneNumber", dgfyVar);
            bwqvVar.c(bundle, "MerchantCallsHistoryFragment.placemark", bwrsVar2);
            bwqvVar.c(bundle, "BaseMerchantCallsFragment.merchantCallsState", bwrsVar);
            bundle.putParcelable("MerchantCallsHistoryFragment.profileImagePlaceholder", bitmap);
            bundle.putInt("MerchantCallsHistoryFragment.profileImagePlaceholderAvatarColor", intValue);
            bundle.putString("MerchantCallsHistoryFragment.profileImageUrl", str2);
            beiyVar.B(bundle);
            beiyVar.aJ();
            ggaVar.D(beiyVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.benq
    public Boolean l() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.benq
    public Boolean m() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.benq
    public Boolean n() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.benq
    public Boolean o() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.benq
    @dzsi
    public cqfc p() {
        if (!this.f) {
            return null;
        }
        return new beon(this);
    }

    public void q(String str, @dzsi Bitmap bitmap, @dzsi String str2) {
        this.C = str;
        this.w = bitmap;
        this.y = str2;
        String str3 = this.j;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str).length());
        sb.append(str3);
        sb.append(" ");
        sb.append(str);
        this.A = sb.toString();
        String str4 = this.c;
        String str5 = this.t;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(str5).length());
        sb2.append(str4);
        sb2.append(" ");
        sb2.append(str5);
        this.B = sb2.toString();
    }

    public void r(int i) {
        cjta c = cjtd.c(this.z);
        c.i(i);
        this.z = c.a();
        cjtd cjtdVar = this.r;
        if (cjtdVar != null) {
            cjta c2 = cjtd.c(cjtdVar);
            c2.i(i);
            this.r = c2.a();
        }
        cjtd cjtdVar2 = this.s;
        if (cjtdVar2 != null) {
            cjta c3 = cjtd.c(cjtdVar2);
            c3.i(i);
            this.s = c3.a();
        }
        cjtd cjtdVar3 = this.u;
        if (cjtdVar3 != null) {
            cjta c4 = cjtd.c(cjtdVar3);
            c4.i(i);
            this.u = c4.a();
        }
    }

    public final void s(String str) {
        View a2;
        View o = cqkx.o(this);
        if (o == null || (a2 = cqhu.a(o, bejw.b)) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(a);
        alphaAnimation.setDuration(133L);
        alphaAnimation.setAnimationListener(new beop(this, str, a2));
        a2.startAnimation(alphaAnimation);
    }
}
