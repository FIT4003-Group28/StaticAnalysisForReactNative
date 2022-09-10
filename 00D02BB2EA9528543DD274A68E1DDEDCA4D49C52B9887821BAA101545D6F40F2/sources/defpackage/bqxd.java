package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqxd  reason: default package */
/* loaded from: classes4.dex */
public final class bqxd implements bqlb {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ bqxe b;

    public bqxd(bqxe bqxeVar, ProgressDialog progressDialog) {
        this.b = bqxeVar;
        this.a = progressDialog;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        this.a.dismiss();
        this.b.c.a(bqlfVar);
    }

    @Override // defpackage.bqlb
    public final void e() {
        this.a.dismiss();
        bqxf bqxfVar = this.b.d;
        bqxfVar.aj.a(bqxfVar.as);
        final bqxe bqxeVar = this.b;
        bqrv bqrvVar = bqxeVar.d.am;
        bqla bqlaVar = bqxeVar.a;
        final Runnable runnable = new Runnable(bqxeVar) { // from class: bqxb
            private final bqxe a;

            {
                this.a = bqxeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        };
        final Runnable runnable2 = new Runnable(this) { // from class: bqxc
            private final bqxd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bqxe bqxeVar2 = this.a.b;
                bqxeVar2.d.aT(bqlf.f(bqxeVar2.b, 6));
            }
        };
        akqi a = bqlaVar.a().a();
        dqgr dqgrVar = dqgr.UNKNOWN_REVIEW_STATE;
        int ordinal = bqlaVar.a().d().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                gcz a2 = bqrvVar.a.a();
                a2.d(R.string.SUBMIT_REVIEW_RETRY);
                cjta b = cjtd.b();
                b.g = a.n();
                b.d = dtyf.J;
                a2.i = b.a();
                cjta b2 = cjtd.b();
                b2.g = a.n();
                b2.d = dtyf.O;
                a2.h(R.string.YES_BUTTON, b2.a(), new gdd(runnable) { // from class: bqrr
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
                b3.g = a.n();
                b3.d = dtyf.N;
                a2.e(R.string.NO_BUTTON, b3.a(), new gdd(runnable2) { // from class: bqrs
                    private final Runnable a;

                    {
                        this.a = runnable2;
                    }

                    @Override // defpackage.gdd
                    public final void a(DialogInterface dialogInterface) {
                        this.a.run();
                    }
                });
                a2.b();
                return;
            } else if (ordinal != 2) {
                return;
            } else {
                gcz a3 = bqrvVar.a.a();
                a3.d(R.string.SAVE_DRAFT_REVIEW_FAILURE);
                cjta b4 = cjtd.b();
                b4.g = a.n();
                b4.d = dtyf.K;
                a3.i = b4.a();
                cjta b5 = cjtd.b();
                b5.g = a.n();
                b5.d = dtyf.M;
                a3.h(R.string.RETRY_SAVING_DRAFT_REVIEW_BUTTON, b5.a(), new gdd(runnable) { // from class: bqrt
                    private final Runnable a;

                    {
                        this.a = runnable;
                    }

                    @Override // defpackage.gdd
                    public final void a(DialogInterface dialogInterface) {
                        this.a.run();
                    }
                });
                cjta b6 = cjtd.b();
                b6.g = a.n();
                b6.d = dtyf.L;
                a3.e(R.string.DISCARD_DRAFT_REVIEW_BUTTON, b6.a(), new gdd(runnable2) { // from class: bqru
                    private final Runnable a;

                    {
                        this.a = runnable2;
                    }

                    @Override // defpackage.gdd
                    public final void a(DialogInterface dialogInterface) {
                        this.a.run();
                    }
                });
                a3.b();
                return;
            }
        }
        throw new IllegalArgumentException("Can't open a dialog for an unknown review state.");
    }
}
