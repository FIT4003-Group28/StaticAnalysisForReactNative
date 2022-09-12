package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsrf  reason: default package */
/* loaded from: classes4.dex */
public class bsrf implements bssq {
    private final Activity a;
    private final jkf b;
    private final bsqw c;
    private Boolean d = false;
    private jic e = new jic();
    private dwii f;
    @dzsi
    private cjtd g;

    public bsrf(Activity activity, jkf jkfVar, bsqw bsqwVar, @dzsi dwij dwijVar) {
        this.a = activity;
        this.b = jkfVar;
        this.c = bsqwVar;
        a(dwijVar);
    }

    public void a(@dzsi dwij dwijVar) {
        if (dwijVar == null || dwijVar == dwij.c) {
            return;
        }
        this.d = true;
        this.e = new jic(dwijVar.a, ckqc.FIFE, 2131232078);
        dwii b = dwii.b(dwijVar.b);
        if (b == null) {
            b = dwii.UNKNOWN;
        }
        this.f = b;
        if (b == dwii.CONTACT) {
            this.g = cjtd.a(dtxy.aa);
        } else {
            this.g = cjtd.a(dtxy.bB);
        }
    }

    @Override // defpackage.bssq
    public Boolean b() {
        return this.d;
    }

    @Override // defpackage.bssq
    public jic c() {
        return this.e;
    }

    @Override // defpackage.bssq
    @dzsi
    public CharSequence d() {
        if (this.f == null) {
            return null;
        }
        if (dwii.CONTACT == this.f) {
            return this.a.getString(R.string.PERSONAL_SEARCH_CONTACTS_PRIVACY_TITLE);
        }
        if (dwii.FLIGHT != this.f && dwii.RESERVATION != this.f) {
            return null;
        }
        return this.a.getString(R.string.PERSONAL_SEARCH_RESERVATIONS_PRIVACY_TITLE);
    }

    @Override // defpackage.bssq
    @dzsi
    public CharSequence e() {
        if (this.d.booleanValue()) {
            return this.a.getString(R.string.PERSONAL_SEARCH_PRIVACY_SUBTITLE);
        }
        return null;
    }

    @Override // defpackage.bssq
    @dzsi
    public cjtd f() {
        if (this.d.booleanValue()) {
            return this.g;
        }
        return null;
    }

    @Override // defpackage.bssq
    public cqkl g() {
        this.b.B(jjn.FULLY_EXPANDED);
        return cqkl.a;
    }

    @Override // defpackage.bssq
    @dzsi
    public jht h() {
        dwii dwiiVar;
        if (!this.d.booleanValue() || (dwiiVar = this.f) == null) {
            return null;
        }
        bsqw bsqwVar = this.c;
        Activity activity = (Activity) ((dxjd) bsqwVar.a).a;
        bsqw.a(activity, 1);
        cjqy a = bsqwVar.b.a();
        bsqw.a(a, 2);
        cklf a2 = bsqwVar.c.a();
        bsqw.a(a2, 3);
        bsqw.a(dwiiVar, 4);
        return new bsqv(activity, a, a2, dwiiVar).b();
    }
}
