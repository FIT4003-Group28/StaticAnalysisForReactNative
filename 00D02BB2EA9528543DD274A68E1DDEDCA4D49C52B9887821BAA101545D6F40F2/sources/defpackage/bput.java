package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bput  reason: default package */
/* loaded from: classes4.dex */
public final class bput implements bnyn<dige, digi> {
    public final akqi a;
    @dzsi
    private digi b;
    @dzsi
    private bpus c;
    @dzsi
    private ProgressDialog d;
    @dzsi
    private btzc e;
    private final bnyo f;
    private final Activity g;

    public bput(akqi akqiVar, bnyo bnyoVar, Activity activity) {
        this.f = bnyoVar;
        this.g = activity;
        this.a = akqiVar;
    }

    private final void f() {
        ProgressDialog progressDialog = this.d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.d = null;
    }

    @Override // defpackage.bnyn
    public final /* bridge */ /* synthetic */ void Rb(dssj dssjVar, @dzsi dssj dssjVar2) {
        dige digeVar = (dige) dssjVar;
        digi digiVar = (digi) dssjVar2;
        bvrj.UI_THREAD.c();
        if (this.e == null) {
            return;
        }
        this.e = null;
        if (digiVar != null) {
            this.b = digiVar;
        }
        bpus bpusVar = this.c;
        if (bpusVar == null) {
            return;
        }
        if (digiVar != null) {
            bpusVar.a(digiVar);
        } else {
            Toast.makeText(this.g, (int) R.string.UNKNOWN_ERROR, 1).show();
        }
        f();
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        if (this.e == null && this.b == null) {
            digd bZ = dige.c.bZ();
            dpsn i = this.a.i();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dige digeVar = (dige) bZ.b;
            i.getClass();
            digeVar.b = i;
            digeVar.a |= 4;
            this.e = this.f.b(bZ.bK(), this);
        }
    }

    public final void c() {
        bvrj.UI_THREAD.c();
        btzc btzcVar = this.e;
        if (btzcVar != null) {
            btzcVar.a();
            this.e = null;
        }
    }

    public final void d(bpus bpusVar) {
        bvrj.UI_THREAD.c();
        this.c = bpusVar;
        digi digiVar = this.b;
        if (digiVar != null) {
            bpusVar.a(digiVar);
            return;
        }
        if (this.e == null) {
            b();
        }
        f();
        ProgressDialog progressDialog = new ProgressDialog(this.g, 0);
        this.d = progressDialog;
        progressDialog.setCancelable(true);
        this.d.setCanceledOnTouchOutside(false);
        this.d.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bpuq
            private final bput a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.e();
            }
        });
        this.d.setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: bpur
            private final bput a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.a.e();
            }
        });
        this.d.setMessage(this.g.getString(R.string.VIEWPORT_CHECK_WAIT));
        this.d.show();
    }

    public final void e() {
        bvrj.UI_THREAD.c();
        this.c = null;
    }
}
