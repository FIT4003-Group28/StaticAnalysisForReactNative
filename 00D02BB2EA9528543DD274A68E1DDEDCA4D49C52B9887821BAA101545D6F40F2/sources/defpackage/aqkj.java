package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aqkj  reason: default package */
/* loaded from: classes2.dex */
public class aqkj implements aqoh {
    private final Activity a;
    private final bvjj b;
    private final apzy c;
    private final String d;
    private final apyz e;

    public aqkj(Activity activity, bvjj bvjjVar, apzy apzyVar, apyz apyzVar, String str) {
        this.a = activity;
        this.b = bvjjVar;
        this.c = apzyVar;
        this.e = apyzVar;
        this.d = str;
    }

    @Override // defpackage.aqoh
    public cqtd a() {
        return iva.e(iup.e(R.raw.ic_merchant_messaging_empty_inbox), iup.e(R.raw.ic_merchant_messaging_empty_inbox_dark_mode));
    }

    @Override // defpackage.aqoh
    public String b() {
        return this.c.k() ? this.a.getString(R.string.MERCHANT_MESSAGING_EDIT_WELCOME_MESSAGE_BUTTON_TEXT) : "";
    }

    @Override // defpackage.aqoh
    public Boolean c() {
        return true;
    }

    @Override // defpackage.aqoh
    @dzsi
    public cjtd d() {
        return aqdb.a(dtxv.bM, this.d).a();
    }

    @Override // defpackage.aqoh
    public cqkl e() {
        this.e.e(this.d);
        Set<String> C = this.b.C(bvjk.jy, new HashSet());
        C.add(this.d);
        this.b.af(bvjk.jy, C);
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
        return this.c.k() ? this.a.getString(R.string.MESSAGING_INBOX_NO_MESSAGES_TITLE) : "";
    }

    @Override // defpackage.aqoh
    public String k() {
        return this.c.k() ? this.a.getString(R.string.MERCHANT_MESSAGING_EDIT_WELCOME_MESSAGE_BODY_TEXT) : "";
    }
}
