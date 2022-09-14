package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmdu  reason: default package */
/* loaded from: classes3.dex */
public final class bmdu {
    public final Activity a;
    public final ProgressDialog b;
    public boolean c = false;

    public bmdu(Activity activity) {
        this.a = activity;
        ProgressDialog progressDialog = new ProgressDialog(activity, 0);
        this.b = progressDialog;
        progressDialog.setMessage(activity.getString(R.string.LOADING_DATA_TEXT));
    }

    public final void a() {
        this.c = true;
        if (!this.a.isFinishing()) {
            this.b.dismiss();
        }
    }
}
