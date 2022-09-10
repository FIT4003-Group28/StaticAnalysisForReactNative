package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqko  reason: default package */
/* loaded from: classes2.dex */
public class aqko implements aqoh {
    private final Activity a;
    private final apyx b;
    private final aqci c;

    public aqko(Activity activity, apyx apyxVar, aqci aqciVar) {
        this.a = activity;
        this.b = apyxVar;
        this.c = aqciVar;
    }

    @Override // defpackage.aqoh
    public cqtd a() {
        return iva.e(iup.e(R.raw.ic_merchant_messaging_empty_inbox), iup.e(R.raw.ic_merchant_messaging_empty_inbox_dark_mode));
    }

    @Override // defpackage.aqoh
    public String b() {
        return this.a.getString(R.string.LEARN_MORE);
    }

    @Override // defpackage.aqoh
    public Boolean c() {
        return true;
    }

    @Override // defpackage.aqoh
    public cjtd d() {
        return cjtd.a(dtxv.bP);
    }

    @Override // defpackage.aqoh
    public cqkl e() {
        this.c.a();
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
        return this.b.b() ? this.a.getString(R.string.MESSAGING_INBOX_NO_MESSAGES_TITLE) : "";
    }

    @Override // defpackage.aqoh
    public String k() {
        return this.b.b() ? this.a.getString(R.string.MERCHANT_MESSAGING_SHARE_PROFILE_TEXT) : "";
    }
}
