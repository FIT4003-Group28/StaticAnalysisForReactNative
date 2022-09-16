package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aaft  reason: default package */
/* loaded from: classes2.dex */
public class aaft implements izi {
    private final Activity a;
    private final aafs b;

    public aaft(Activity activity, aafs aafsVar) {
        this.a = activity;
        this.b = aafsVar;
    }

    @Override // defpackage.izi
    public cqtd c() {
        return cqrt.g(2131231588, irg.b());
    }

    @Override // defpackage.izi
    public Boolean d() {
        return true;
    }

    @Override // defpackage.izi
    public cqkl e() {
        this.b.h();
        return cqkl.a;
    }

    @Override // defpackage.izi
    public CharSequence f() {
        return this.a.getString(R.string.BACK_BUTTON);
    }

    @Override // defpackage.izi
    public cjtd h() {
        return cjtd.a(dtxo.bt);
    }

    @Override // defpackage.izi
    public Boolean i() {
        return false;
    }
}
