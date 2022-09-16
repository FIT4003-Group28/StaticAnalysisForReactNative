package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acff  reason: default package */
/* loaded from: classes2.dex */
public final class acff extends ex {
    static final String ad = "acff";
    @dzsi
    public btrm ae;
    @dzsi
    public bvjj af;

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        ((acfg) btsx.a(acfg.class, this)).bL(this);
        super.Qi(context);
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        btrm btrmVar = this.ae;
        dbsk.s(btrmVar);
        btrmVar.b(new acfl(acfk.INACTIVE, null));
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        cjkp B = cjkr.B();
        B.t(J().getString(R.string.DISABLE_SHAKE_DIALOG_TITLE));
        ((cjke) B).e = J().getString(R.string.DISABLE_SHAKE_DIALOG_MESSAGE);
        B.x(2131231800);
        B.z(J().getString(R.string.DISABLE_SHAKE_DIALOG_YES), new View.OnClickListener(this) { // from class: acfd
            private final acff a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bvjj bvjjVar = this.a.af;
                dbsk.s(bvjjVar);
                bvjjVar.S(bvjk.I, false);
            }
        }, null);
        B.y(J().getString(R.string.DISABLE_SHAKE_DIALOG_NO), acfe.a, null);
        return B.u(J()).q();
    }
}
