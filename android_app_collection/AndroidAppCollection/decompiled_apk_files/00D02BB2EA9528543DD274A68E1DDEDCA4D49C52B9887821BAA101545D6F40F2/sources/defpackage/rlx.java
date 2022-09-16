package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rlx  reason: default package */
/* loaded from: classes7.dex */
public final class rlx extends gen {
    public sey a;
    public btvo ad;
    public sex ae;
    public dndr af;
    public dxio<axwy> b;
    public sic c;
    public sbz d;
    public cjqy e;
    public roq g;

    public final boolean g() {
        dktt dkttVar = this.ad.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        return dkttVar.w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(J());
        boolean g = g();
        int i = R.string.WORK_EXPLANATION_DIALOG_TEXT;
        if (g && this.af == dndr.HOME) {
            i = R.string.HOME_EXPLANATION_DIALOG_TEXT;
        }
        return builder.setMessage(i).setPositiveButton(R.string.WORK_EXPLANATION_DIALOG_OKAY_BUTTON, new DialogInterface.OnClickListener(this) { // from class: rlu
            private final rlx a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                rlx rlxVar = this.a;
                rlxVar.e.i(cjtd.a((!rlxVar.g() || rlxVar.af != dndr.HOME) ? dtxl.dh : dtxl.df));
                rlxVar.aT();
            }
        }).setNegativeButton(true != g() ? R.string.WORK_EXPLANATION_DIALOG_EXIT_BUTTON : R.string.NO_THANKS, new DialogInterface.OnClickListener(this) { // from class: rlv
            private final rlx a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                rlx rlxVar = this.a;
                rlxVar.e.i(cjtd.a((!rlxVar.g() || rlxVar.af != dndr.HOME) ? dtxl.di : dtxl.de));
                rlxVar.g.a();
                if (rlxVar.g()) {
                    sex sexVar = rlxVar.ae;
                    rzp h = sexVar.b.h(rzo.e());
                    if (!sexVar.a.b() || h == null) {
                        sexVar.a();
                        return;
                    } else {
                        sexVar.c.c(h);
                        return;
                    }
                }
                rlxVar.c.d(dndr.WORK, rlxVar.b.a());
                sbz sbzVar = rlxVar.d;
                final sex sexVar2 = rlxVar.ae;
                sexVar2.getClass();
                sbzVar.a(new Runnable(sexVar2) { // from class: rlw
                    private final sex a;

                    {
                        this.a = sexVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                });
            }
        }).show();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        sey seyVar = this.a;
        Bundle bundle3 = bundle2.getBundle("screen_flow_state");
        dbsk.s(bundle3);
        this.ae = seyVar.a(rzp.k(bundle3));
        dndr b = dndr.b(bundle2.getInt("alias_type"));
        dbsk.s(b);
        this.af = b;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return (!g() || this.af != dndr.HOME) ? dtxl.dj : dtxl.dg;
    }
}
