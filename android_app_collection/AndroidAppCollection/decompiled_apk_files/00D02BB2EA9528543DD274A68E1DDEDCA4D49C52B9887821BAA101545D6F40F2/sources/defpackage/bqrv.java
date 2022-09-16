package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqrv  reason: default package */
/* loaded from: classes4.dex */
public class bqrv {
    public final gdc a;
    private final Activity b;
    private final cqkj c;
    private final btvo d;

    public bqrv(btvo btvoVar, Activity activity, cqkj cqkjVar, gdc gdcVar) {
        this.b = activity;
        this.c = cqkjVar;
        this.a = gdcVar;
        this.d = btvoVar;
    }

    public final void a(akqi akqiVar, final Runnable runnable) {
        gcz a = this.a.a();
        a.d(R.string.CONFIRM_DELETE_DRAFT);
        cjta b = cjtd.b();
        b.g = akqiVar.n();
        b.d = dtyf.z;
        a.i = b.a();
        cjta b2 = cjtd.b();
        b2.g = akqiVar.n();
        b2.d = dtyf.B;
        a.h(R.string.YES_BUTTON, b2.a(), new gdd(runnable) { // from class: bqro
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.run();
            }
        });
        cjta b3 = cjtd.b();
        b3.g = akqiVar.n();
        b3.d = dtyf.A;
        a.e(R.string.NO_BUTTON, b3.a(), bqrp.a);
        a.b();
    }

    public final ProgressDialog b(bqla bqlaVar) {
        bqkx a = bqlaVar.a();
        dqgr dqgrVar = dqgr.UNKNOWN_REVIEW_STATE;
        int ordinal = a.d().ordinal();
        if (ordinal != 0) {
            int i = R.string.SENDING;
            if (ordinal != 1 && ordinal == 2) {
                i = a.m() ? R.string.DELETE_DRAFT_REVIEW_SPINNER : R.string.SAVING_DRAFT_REVIEW_SPINNER;
            }
            Activity activity = this.b;
            return ProgressDialog.show(activity, "", activity.getString(i), true, false);
        }
        throw new IllegalArgumentException("Can't open a dialog for an unknown review state.");
    }

    public final void c(bquu bquuVar) {
        if (!this.d.getUgcParameters().ao()) {
            jmw.g(this.b, R.string.REVIEW_NO_RATING_TITLE, R.string.REVIEW_NO_RATING_MESSAGE);
            return;
        }
        gdf gdfVar = new gdf(this.b, (int) R.style.ModNoRatingDialogTheme);
        cqkf e = this.c.e(new bqrh());
        e.e(new bquv(bquuVar, gdfVar));
        gdfVar.setContentView(e.c());
        gdfVar.show();
    }

    public final void d(akqi akqiVar, bqst bqstVar, final Runnable runnable) {
        Dialog dialog = new Dialog(this.b, R.style.ModNoRatingDialogTheme);
        cqkf e = this.c.e(new bqrm());
        e.e(new bqxl(dialog, akqiVar, bqstVar));
        dialog.setContentView(e.c());
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener(runnable) { // from class: bqrq
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.a.run();
            }
        });
        dialog.show();
    }
}
