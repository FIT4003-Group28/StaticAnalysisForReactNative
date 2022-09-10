package defpackage;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqmc  reason: default package */
/* loaded from: classes4.dex */
final class bqmc implements bqlb {
    final /* synthetic */ gga a;
    final /* synthetic */ ProgressDialog b;
    final /* synthetic */ bqlb c;
    final /* synthetic */ bqla d;
    final /* synthetic */ bwrs e;
    final /* synthetic */ bqmf f;

    public bqmc(bqmf bqmfVar, gga ggaVar, ProgressDialog progressDialog, bqlb bqlbVar, bqla bqlaVar, bwrs bwrsVar) {
        this.f = bqmfVar;
        this.a = ggaVar;
        this.b = progressDialog;
        this.c = bqlbVar;
        this.d = bqlaVar;
        this.e = bwrsVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        if (!this.a.isFinishing() && !this.a.isDestroyed()) {
            this.b.dismiss();
        }
        this.c.d(bqlfVar);
    }

    @Override // defpackage.bqlb
    public final void e() {
        if (this.a.isFinishing() || this.a.isDestroyed()) {
            return;
        }
        this.b.dismiss();
        final gga ggaVar = this.a;
        if (!ggaVar.aZ) {
            return;
        }
        final bqla bqlaVar = this.d;
        final bwrs bwrsVar = this.e;
        final bqlb bqlbVar = this.c;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this, ggaVar, bqlaVar, bwrsVar, bqlbVar) { // from class: bqmb
            private final bqmc a;
            private final gga b;
            private final bqla c;
            private final bwrs d;
            private final bqlb e;

            {
                this.a = this;
                this.b = ggaVar;
                this.c = bqlaVar;
                this.d = bwrsVar;
                this.e = bqlbVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bqmc bqmcVar = this.a;
                gga ggaVar2 = this.b;
                bqla bqlaVar2 = this.c;
                bwrs<ilo> bwrsVar2 = this.d;
                bqlb bqlbVar2 = this.e;
                dialogInterface.dismiss();
                if (i == -1) {
                    bqmcVar.f.a(ggaVar2, bqlaVar2, bwrsVar2, bqlbVar2);
                }
            }
        };
        new AlertDialog.Builder(this.a).setMessage(R.string.SUBMIT_REVIEW_RETRY).setPositiveButton(R.string.YES_BUTTON, onClickListener).setNegativeButton(R.string.NO_BUTTON, onClickListener).show();
    }
}
