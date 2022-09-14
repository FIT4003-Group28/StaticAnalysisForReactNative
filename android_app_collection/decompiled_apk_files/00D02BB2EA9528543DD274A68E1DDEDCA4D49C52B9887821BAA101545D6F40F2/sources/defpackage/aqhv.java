package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqhv  reason: default package */
/* loaded from: classes2.dex */
public class aqhv implements aqoh {
    private final Activity a;
    private final dxio<afef> b;

    public aqhv(Activity activity, dxio<afef> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // defpackage.aqoh
    public cqtd a() {
        return iva.e(iup.e(R.raw.ic_messaging_empty_inbox), iup.e(R.raw.ic_messaging_empty_inbox_dark_mode));
    }

    @Override // defpackage.aqoh
    public String b() {
        return this.a.getString(R.string.TURN_OFF_INCOGNITO_ZERO_SUGGEST_PROMO_CARD_BUTTON_TITLE);
    }

    @Override // defpackage.aqoh
    public Boolean c() {
        return true;
    }

    @Override // defpackage.aqoh
    @dzsi
    public cjtd d() {
        return null;
    }

    @Override // defpackage.aqoh
    public cqkl e() {
        this.b.a().e(false);
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
        return "";
    }

    @Override // defpackage.aqoh
    public String k() {
        return this.a.getString(R.string.MESSAGING_INBOX_INCOGNITO_BODY_TEXT);
    }
}
