package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axqr  reason: default package */
/* loaded from: classes3.dex */
public final class axqr extends gen {
    public View.OnClickListener a;
    public Runnable b;
    axqv c;

    @Override // defpackage.ges
    public final void Nv() {
        ((axqs) btsx.b(axqs.class, this)).cv(this);
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        cjkp B = cjkr.B();
        B.x(2131231715);
        B.t(ggaVar.getResources().getString(R.string.BGL_PRE_PROMPT_DIALOG_TITLE));
        B.z(ggaVar.getResources().getString(R.string.BGL_PRE_PROMPT_SETTINGS_BUTTON), this.a, null);
        cjke cjkeVar = (cjke) B;
        cjkeVar.g = new DialogInterface.OnCancelListener(this) { // from class: axqp
            private final axqr a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.b.run();
            }
        };
        B.y(ggaVar.getResources().getString(R.string.BGL_PRE_PROMPT_CANCEL_BUTTON), new View.OnClickListener(this) { // from class: axqq
            private final axqr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.run();
            }
        }, null);
        cjkeVar.f = cqgr.fT(new axqu(), this.c);
        cjkeVar.a = ibn.l();
        return B.u(ggaVar).q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        this.c = new axqw(this.o.getString("JUSTIFICATION_KEY"));
    }
}
