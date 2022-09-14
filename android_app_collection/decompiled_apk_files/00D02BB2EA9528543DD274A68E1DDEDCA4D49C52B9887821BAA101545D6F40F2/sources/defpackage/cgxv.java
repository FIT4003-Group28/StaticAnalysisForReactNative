package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgxv  reason: default package */
/* loaded from: classes4.dex */
public class cgxv extends cgwu {
    private final afha d;

    public cgxv(Activity activity, @dzsi String str, String str2, boolean z, cgwj cgwjVar, afha afhaVar) {
        super(activity, str, str2, z, cgwjVar);
        this.d = afhaVar;
    }

    private final boolean i() {
        return this.a.getPackageManager().hasSystemFeature("android.hardware.telephony") && !this.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.DIAL"), 0).isEmpty();
    }

    @Override // defpackage.cgwu, defpackage.cguz
    public CharSequence c() {
        return i() ? this.a.getString(R.string.FACTUAL_MODERATION_PHONE_CALLOUT, new Object[]{this.b}) : this.b;
    }

    @Override // defpackage.cgwu, defpackage.cguz
    public Boolean d() {
        return Boolean.valueOf(i());
    }

    @Override // defpackage.cgwu, defpackage.cguz
    public cqkl f() {
        if (i()) {
            this.c.ab(doab.PRIOR_RESEARCH_CALLED_PHONE);
            afha afhaVar = this.d;
            Activity activity = this.a;
            String valueOf = String.valueOf(this.b);
            afhaVar.f(activity, new Intent("android.intent.action.DIAL", Uri.parse(valueOf.length() != 0 ? "tel:".concat(valueOf) : new String("tel:"))), 4);
        }
        return cqkl.a;
    }

    @Override // defpackage.cgwu, defpackage.cguz
    @dzsi
    public cjtd g() {
        if (d().booleanValue()) {
            return cjtd.a(dtyd.r);
        }
        return null;
    }

    @Override // defpackage.cgwu, defpackage.cguz
    @dzsi
    public cqtd h() {
        return cqrt.f(2131231713);
    }
}
