package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
/* compiled from: PG */
/* renamed from: boyc  reason: default package */
/* loaded from: classes3.dex */
public class boyc {
    @dzsi
    public ProgressDialog a;
    public final Activity b;

    public boyc(Activity activity) {
        this.b = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ProgressDialog progressDialog = this.a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.a = null;
    }
}
