package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqkn  reason: default package */
/* loaded from: classes2.dex */
public class aqkn implements aqoh {
    private final Activity a;
    private final aqrk b;
    private final apyx c;
    private final dxio<auhi> d;
    private final dxio<aqrp> e;

    public aqkn(Activity activity, apyx apyxVar, aqrl aqrlVar, dxio<auhi> dxioVar, dxio<aqrp> dxioVar2, auur auurVar) {
        this.a = activity;
        this.c = apyxVar;
        this.b = aqrlVar.a(auurVar);
        this.d = dxioVar;
        this.e = dxioVar2;
    }

    @Override // defpackage.aqoh
    public cqtd a() {
        return iup.e(R.raw.ic_merchant_messaging_empty_inbox);
    }

    @Override // defpackage.aqoh
    public String b() {
        return this.c.b() ? this.a.getString(R.string.MERCHANT_MESSAGING_ENABLE_NOTIFICATIONS_BUTTON_TEXT) : "";
    }

    @Override // defpackage.aqoh
    public Boolean c() {
        return true;
    }

    @Override // defpackage.aqoh
    public cjtd d() {
        return cjtd.a(dtxv.bO);
    }

    @Override // defpackage.aqoh
    public cqkl e() {
        this.d.a().e(dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm, aufs.ENABLED);
        if (!this.b.d()) {
            this.b.e();
        }
        this.e.a().b();
        return cqkl.a;
    }

    @Override // defpackage.aqoh
    public String f() {
        return "";
    }

    @Override // defpackage.aqoh
    public String g() {
        return "";
    }

    @Override // defpackage.aqoh
    public Boolean h() {
        return false;
    }

    @Override // defpackage.aqoh
    public cqkl i() {
        return cqkl.a;
    }

    @Override // defpackage.aqoh
    public String j() {
        return this.c.b() ? this.a.getString(R.string.MERCHANT_MESSAGING_ENABLE_NOTIFICATIONS_TITLE) : "";
    }

    @Override // defpackage.aqoh
    public String k() {
        return this.c.b() ? this.a.getString(R.string.MERCHANT_MESSAGING_ENABLE_NOTIFICATIONS_BODY_TEXT) : "";
    }
}
