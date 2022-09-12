package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acgv  reason: default package */
/* loaded from: classes2.dex */
public final class acgv extends ex {
    public btrm ad;
    public bvju ae;

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        ((acgw) btsx.a(acgw.class, this)).bO(this);
        super.Qi(context);
    }

    public final void aJ(acfk acfkVar) {
        btrm btrmVar = this.ad;
        dbsk.s(btrmVar);
        btrmVar.b(new acfl(acfkVar, null));
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aJ(acfk.INACTIVE);
    }

    @Override // defpackage.ex
    public final synchronized Dialog q(@dzsi Bundle bundle) {
        cjkp B;
        B = cjkr.B();
        B.t(J().getString(R.string.SHAKE_DIALOG_TITLE));
        ((cjke) B).e = J().getString(R.string.SHAKE_DIALOG_MESSAGE);
        B.x(2131231800);
        B.z(J().getString(R.string.SEND_FEEDBACK), new View.OnClickListener(this) { // from class: acgt
            private final acgv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acgv acgvVar = this.a;
                SharedPreferences a = acgvVar.ae.a("ShakenDialog");
                acgvVar.aJ(acfk.FEEDBACK_WAIT_UNTIL_SCREENSHOT);
                a.edit().putBoolean("dismissLastTime", false).commit();
                gen genVar = (gen) acgvVar.J().g().H(gfu.DIALOG_FRAGMENT.c);
                if (genVar != null) {
                    genVar.aT();
                }
            }
        }, cjtd.a(dtyb.dm));
        B.y(J().getString(R.string.DISMISS), new View.OnClickListener(this) { // from class: acgu
            private final acgv a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acgv acgvVar = this.a;
                SharedPreferences a = acgvVar.ae.a("ShakenDialog");
                if (!a.getBoolean("dismissLastTime", false) || a.getBoolean("neverShowShakeDismissDialog", false)) {
                    a.edit().putBoolean("dismissLastTime", true).commit();
                    acgvVar.aJ(acfk.INACTIVE);
                    return;
                }
                gei.b(acgvVar.J(), new acff(), acff.ad);
                a.edit().putBoolean("dismissLastTime", false).putBoolean("neverShowShakeDismissDialog", true).commit();
                acgvVar.aJ(acfk.FEEDBACK_DISABLE_SHAKE_DIALOG_START);
            }
        }, cjtd.a(dtyb.dl));
        ((cjke) B).a = ibn.l();
        return B.u(J()).q();
    }
}
