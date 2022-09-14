package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bptn  reason: default package */
/* loaded from: classes4.dex */
public final class bptn {
    public final eeu a;
    @dzsi
    public dwgz b;
    @dzsi
    public btzc c;
    public final bptp d;
    private final bptm e;
    private final bnyo f;
    private final btpc g;
    private final Activity h;
    @dzsi
    private ProgressDialog i;

    public bptn(bptp bptpVar, bptm bptmVar, bnyo bnyoVar, btpc btpcVar, Activity activity, eeu eeuVar, chht chhtVar) {
        this.d = bptpVar;
        this.e = bptmVar;
        this.f = bnyoVar;
        this.g = btpcVar;
        this.h = activity;
        this.a = eeuVar;
        chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
    }

    public final void a(dwgz dwgzVar, final boolean z) {
        if (!this.a.b()) {
            return;
        }
        if (!this.g.i()) {
            c();
            jmw.g(this.h, this.e.b(), this.e.c());
            return;
        }
        b();
        this.b = dwgzVar;
        this.c = this.f.b(dwgzVar, new bnyn(this, z) { // from class: bpti
            private final bptn a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // defpackage.bnyn
            public final void Rb(dssj dssjVar, dssj dssjVar2) {
                bptn bptnVar = this.a;
                boolean z2 = this.b;
                dwgz dwgzVar2 = (dwgz) dssjVar;
                dwhd dwhdVar = (dwhd) dssjVar2;
                if (dwgzVar2 != bptnVar.b) {
                    return;
                }
                bptnVar.b = null;
                bptnVar.c = null;
                if (!bptnVar.a.b()) {
                    return;
                }
                bptnVar.c();
                if (dwhdVar == null) {
                    bptnVar.d(dwgzVar2, z2);
                    return;
                }
                int a = dwhc.a(dwhdVar.b);
                if (a == 0 || a != 2) {
                    bptnVar.d.a(dwhdVar);
                    int a2 = dwhc.a(dwhdVar.b);
                    if (a2 != 0 && a2 == 4) {
                        return;
                    }
                    bptnVar.d(dwgzVar2, z2);
                    return;
                }
                bptnVar.d.b(dwhdVar, z2);
            }
        });
    }

    public final void b() {
        if (!this.a.b()) {
            return;
        }
        if (this.i == null) {
            ProgressDialog progressDialog = new ProgressDialog(this.h, 0);
            this.i = progressDialog;
            progressDialog.setMessage(this.h.getString(this.e.a()));
            this.i.setCanceledOnTouchOutside(false);
            this.i.setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bptj
                private final bptn a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    bptn bptnVar = this.a;
                    btzc btzcVar = bptnVar.c;
                    if (btzcVar != null) {
                        btzcVar.a();
                        bptnVar.c = null;
                    }
                    bptnVar.b = null;
                }
            });
        }
        if (this.i.isShowing()) {
            return;
        }
        this.i.show();
    }

    public final void c() {
        ProgressDialog progressDialog = this.i;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.i = null;
        }
    }

    public final void d(final dwgz dwgzVar, final boolean z) {
        if (!this.a.b()) {
            return;
        }
        ppw.b(this.h, new DialogInterface.OnClickListener(this, dwgzVar, z) { // from class: bptk
            private final bptn a;
            private final dwgz b;
            private final boolean c;

            {
                this.a = this;
                this.b = dwgzVar;
                this.c = z;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bptn bptnVar = this.a;
                dwgz dwgzVar2 = this.b;
                boolean z2 = this.c;
                if (bptnVar.a.b() && i == -1) {
                    bptnVar.a(dwgzVar2, z2);
                }
            }
        }, null);
    }
}
