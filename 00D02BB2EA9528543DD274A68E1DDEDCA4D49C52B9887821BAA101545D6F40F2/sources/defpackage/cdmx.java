package defpackage;

import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdmx  reason: default package */
/* loaded from: classes4.dex */
public final class cdmx {
    public akqi a;
    public final ff b;
    public final gdc c;

    public cdmx(ff ffVar, gdc gdcVar) {
        dzvx.c(ffVar, "activity");
        dzvx.c(gdcVar, "gmmAlertDialogFactory");
        this.b = ffVar;
        this.c = gdcVar;
        this.a = akqi.a;
    }

    public final ProgressDialog a(String str) {
        dzvx.c(str, "message");
        ff ffVar = this.b;
        dzvx.c(ffVar, "context");
        dzvx.c(str, "message");
        ProgressDialog show = ProgressDialog.show(ffVar, "", str, true, false);
        dzvx.b(show, "android.app.ProgressDial…ndeterminate, cancelable)");
        return show;
    }

    public final void b() {
        cdmy.a(R.string.DRAFT_REVIEW_DELETED_TOAST, this.b).show();
    }

    public final void c() {
        cdmy.a(R.string.DELETE_DRAFT_REVIEW_FAILURE_TOAST, this.b).show();
    }
}
