package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmzw  reason: default package */
/* loaded from: classes3.dex */
public class bmzw extends bmzp {
    private final cjtd c = cjtd.a(dtxj.aN);
    private final cjtd d = cjtd.a(dtxj.aO);
    private final cjtd e = cjtd.a(dtxj.aP);
    private final Activity f;

    public bmzw(Activity activity) {
        this.f = activity;
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public cjtd a() {
        return this.c;
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public cjtd b() {
        return this.d;
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public cjtd c() {
        return this.e;
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public CharSequence g() {
        return this.f.getString(R.string.ALIASING_NEW_PLACE_DIALOG_TITLE);
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public CharSequence h() {
        return this.f.getString(R.string.ALIASING_NEW_PLACE_SIGN_IN_PROMPT);
    }

    @Override // defpackage.bmzp, defpackage.bmzo
    public CharSequence i() {
        return this.f.getString(R.string.SIGN_IN);
    }
}
