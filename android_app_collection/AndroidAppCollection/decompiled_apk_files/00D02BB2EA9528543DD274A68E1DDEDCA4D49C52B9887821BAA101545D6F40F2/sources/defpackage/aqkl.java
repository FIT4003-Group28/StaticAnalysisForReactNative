package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqkl  reason: default package */
/* loaded from: classes2.dex */
public class aqkl implements aqoh {
    private final Activity a;
    private final aqru b;
    private final aqci c;
    private final apyx d;
    private final String e;

    public aqkl(Activity activity, aqru aqruVar, aqci aqciVar, apyx apyxVar, String str) {
        this.a = activity;
        this.b = aqruVar;
        this.c = aqciVar;
        this.d = apyxVar;
        this.e = str;
    }

    @Override // defpackage.aqoh
    public cqtd a() {
        return iva.e(iup.e(R.raw.ic_merchant_messaging_empty_inbox), iup.e(R.raw.ic_merchant_messaging_empty_inbox_dark_mode));
    }

    @Override // defpackage.aqoh
    public String b() {
        return this.d.b() ? this.a.getString(R.string.MERCHANT_MESSAGING_ENABLE_MESSAGING_BUTTON_TEXT) : "";
    }

    @Override // defpackage.aqoh
    public Boolean c() {
        return true;
    }

    @Override // defpackage.aqoh
    public cjtd d() {
        return aqdb.a(dtxv.bN, this.e).a();
    }

    @Override // defpackage.aqoh
    public cqkl e() {
        this.b.a(this.e);
        return cqkl.a;
    }

    @Override // defpackage.aqoh
    public String f() {
        return this.a.getString(R.string.LEARN_MORE);
    }

    @Override // defpackage.aqoh
    public String g() {
        return this.a.getString(R.string.MERCHANT_MESSAGING_ENABLE_MESSAGING_LEARN_MORE);
    }

    @Override // defpackage.aqoh
    public Boolean h() {
        return true;
    }

    @Override // defpackage.aqoh
    public cqkl i() {
        this.c.a();
        return cqkl.a;
    }

    @Override // defpackage.aqoh
    public String j() {
        return this.d.b() ? this.a.getString(R.string.MERCHANT_MESSAGING_ENABLE_MESSAGING_TITLE) : "";
    }

    @Override // defpackage.aqoh
    public String k() {
        return this.d.b() ? this.a.getString(R.string.MERCHANT_MESSAGING_ENABLE_MESSAGING_BODY_TEXT) : "";
    }
}
