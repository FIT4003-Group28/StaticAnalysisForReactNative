package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rbw  reason: default package */
/* loaded from: classes7.dex */
public class rbw implements jad {
    private final Activity a;
    private final ros b;

    public rbw(Activity activity, ros rosVar) {
        this.a = activity;
        this.b = rosVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.b.i();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxl.aP);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.getText(R.string.COMMUTE_HUB_SETUP_BUTTON);
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

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}
