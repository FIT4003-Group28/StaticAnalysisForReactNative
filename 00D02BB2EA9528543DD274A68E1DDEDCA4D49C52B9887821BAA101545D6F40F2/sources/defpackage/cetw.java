package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cetw  reason: default package */
/* loaded from: classes4.dex */
public class cetw implements cetb {
    private final Activity a;
    private final chnm b;
    private final cese c;

    public cetw(Activity activity, chnm chnmVar, cese ceseVar) {
        this.a = activity;
        this.b = chnmVar;
        this.c = ceseVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.cetb
    public Boolean b() {
        return false;
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.b.f();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        if (this.c.b()) {
            return cjtd.a(dtxl.fL);
        }
        return cjtd.a(dtxl.eO);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.getString(R.string.CONTRIBUTE_SIDE_MENU_BUTTON);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.cetb, defpackage.jad
    public cqtd i() {
        return cqrt.i(iup.e(R.raw.ic_rate_review_white), ibm.x());
    }
}
