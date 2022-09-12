package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rbu  reason: default package */
/* loaded from: classes7.dex */
public class rbu implements rbg {
    private final Activity a;

    public rbu(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.rbg
    public cqtd a() {
        return iup.e(R.raw.general_error);
    }

    @Override // defpackage.rbg
    public CharSequence b() {
        return this.a.getText(R.string.COMMUTE_HUB_ERROR_TITLE);
    }

    @Override // defpackage.rbg
    public CharSequence c() {
        return this.a.getText(R.string.COMMUTE_HUB_ERROR_SUBTITLE);
    }
}
