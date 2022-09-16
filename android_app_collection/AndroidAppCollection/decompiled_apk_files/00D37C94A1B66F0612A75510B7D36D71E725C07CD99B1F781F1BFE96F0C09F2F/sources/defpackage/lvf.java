package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lvf  reason: default package */
/* loaded from: classes3.dex */
public final class lvf implements fry {
    private final Activity a;

    public lvf(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_privacy_policy;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.menu_privacy_policy;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        eog.g(this.a, Uri.parse(this.a.getResources().getString(R.string.mobile_privacy_uri)));
        return true;
    }
}
