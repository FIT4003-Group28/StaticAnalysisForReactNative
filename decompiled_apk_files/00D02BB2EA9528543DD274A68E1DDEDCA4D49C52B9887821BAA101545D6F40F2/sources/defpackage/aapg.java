package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aapg  reason: default package */
/* loaded from: classes2.dex */
public class aapg implements aapc {
    public final AlertDialog a;
    private final boolean b;
    private final Activity c;

    public aapg(AlertDialog alertDialog, boolean z, Activity activity) {
        this.a = alertDialog;
        this.b = z;
        this.c = activity;
    }

    @Override // defpackage.aapc
    public CharSequence a() {
        return this.c.getString(true != this.b ? R.string.EXPERIENCE_FEEDBACK_FAILURE_DIALOG_TITLE : R.string.EXPERIENCE_FEEDBACK_THANK_YOU_TITLE);
    }

    @Override // defpackage.aapc
    public CharSequence b() {
        return this.c.getString(true != this.b ? R.string.EXPERIENCE_FEEDBACK_FAILURE_DIALOG_BODY : R.string.EXPERIENCE_FEEDBACK_THANK_YOU_BODY);
    }

    @Override // defpackage.aapc
    public CharSequence c() {
        return this.c.getString(true != this.b ? R.string.EXPERIENCE_FEEDBACK_OK : R.string.EXPERIENCE_FEEDBACK_DONE);
    }

    @Override // defpackage.aapc
    public View.OnClickListener d() {
        return new View.OnClickListener(this) { // from class: aapf
            private final aapg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.dismiss();
            }
        };
    }
}
