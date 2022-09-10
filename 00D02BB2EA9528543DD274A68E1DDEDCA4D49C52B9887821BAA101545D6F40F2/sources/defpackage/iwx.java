package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: iwx  reason: default package */
/* loaded from: classes6.dex */
public abstract class iwx implements jbf {
    private final Activity a;
    private final cqtd b = itd.c();

    public iwx(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return this.b;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.a.getString(R.string.OFFLINE_TOUCH_TO_RETRY);
    }
}
