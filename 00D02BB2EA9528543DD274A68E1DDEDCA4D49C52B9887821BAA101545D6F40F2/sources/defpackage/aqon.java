package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqon  reason: default package */
/* loaded from: classes2.dex */
public class aqon implements aqoh {
    public final dxio<apyz> a;
    public final String b;
    public boolean c = true;
    private final Activity d;
    private final apzy e;
    private final aqru f;
    private final aqci g;

    public aqon(Activity activity, apzy apzyVar, cqhn cqhnVar, aqru aqruVar, aqci aqciVar, dxio<apyz> dxioVar, String str) {
        this.d = activity;
        this.e = apzyVar;
        this.f = aqruVar;
        this.g = aqciVar;
        this.a = dxioVar;
        this.b = str;
    }

    @Override // defpackage.aqoh
    public cqtd a() {
        return iva.e(iup.e(R.raw.ic_merchant_messaging_empty_inbox), iup.e(R.raw.ic_merchant_messaging_empty_inbox_dark_mode));
    }

    @Override // defpackage.aqoh
    public String b() {
        return this.e.i(null) ? this.d.getString(R.string.MERCHANT_MESSAGING_ENABLE_MESSAGING_BUTTON_TEXT) : "";
    }

    @Override // defpackage.aqoh
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.aqoh
    public cjtd d() {
        return aqdb.a(dtxv.ch, this.b).a();
    }

    @Override // defpackage.aqoh
    public cqkl e() {
        this.f.b(this.b, new Runnable(this) { // from class: aqom
            private final aqon a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqon aqonVar = this.a;
                aqonVar.a.a().H(aqonVar.b);
                aqonVar.c = false;
                cqkx.p(aqonVar);
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.aqoh
    public String f() {
        return this.e.i(null) ? this.d.getString(R.string.MERCHANT_MESSAGING_POLICY_LINK) : "";
    }

    @Override // defpackage.aqoh
    public String g() {
        return f();
    }

    @Override // defpackage.aqoh
    public Boolean h() {
        return true;
    }

    @Override // defpackage.aqoh
    public cqkl i() {
        this.g.a.a().r("https://support.google.com/business?p=messaging_policy", 1);
        return cqkl.a;
    }

    @Override // defpackage.aqoh
    public String j() {
        return this.e.i(null) ? this.d.getString(R.string.MERCHANT_MESSAGING_POLICY_TITLE) : "";
    }

    @Override // defpackage.aqoh
    public String k() {
        return this.e.i(null) ? this.d.getString(R.string.MERCHANT_MESSAGING_POLICY_BODY_TEXT) : "";
    }
}
