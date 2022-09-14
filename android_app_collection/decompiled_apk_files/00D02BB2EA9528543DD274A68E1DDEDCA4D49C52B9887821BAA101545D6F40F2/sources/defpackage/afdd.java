package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.gmm.base.activities.GmmRestartActivity;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afdd  reason: default package */
/* loaded from: classes.dex */
public final class afdd extends afas {
    public static final dcqe k = dcqe.c("afdd");
    private final dxio<araj> A;
    private final dxio<asat> B;
    private final dxio<bvkx> C;
    public final gga o;
    public final dxio<akfa> p;
    public final dxio<ckcw> q;
    public final affa r;
    public final dxio<afha> s;
    public final auhi t;
    public final dxio<ine> u;
    public final dxio<cqkj> v;
    private final cqkj w;
    private final dxio<afgy> x;
    private final Executor y;
    private final dehq z;

    public afdd(gga ggaVar, btvo btvoVar, dxio<akfa> dxioVar, dxio<ckcw> dxioVar2, cqkj cqkjVar, affa affaVar, bvjj bvjjVar, dxio<afgy> dxioVar3, dxio<afha> dxioVar4, auhi auhiVar, Executor executor, dehq dehqVar, dxio<ine> dxioVar5, cqat cqatVar, dxio<afeh> dxioVar6, btwr btwrVar, dxio<cqkj> dxioVar7, dxio<araj> dxioVar8, dxio<asat> dxioVar9, dxio<afee> dxioVar10, dxio<bvkx> dxioVar11) {
        super(ggaVar, btvoVar, dxioVar, dxioVar2, bvjjVar, executor, dehqVar, cqatVar, dxioVar6, btwrVar, dxioVar10);
        this.o = ggaVar;
        this.p = dxioVar;
        this.q = dxioVar2;
        this.w = cqkjVar;
        this.r = affaVar;
        this.x = dxioVar3;
        this.s = dxioVar4;
        this.t = auhiVar;
        this.y = executor;
        this.z = dehqVar;
        this.u = dxioVar5;
        this.v = dxioVar7;
        this.A = dxioVar8;
        this.B = dxioVar9;
        this.C = dxioVar11;
    }

    private final boolean s() {
        if (btsj.e(this.o.getApplicationContext(), 16200000) != 2) {
            return false;
        }
        gga ggaVar = this.o;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", "com.google.android.gms").build());
        intent.setPackage("com.android.vending");
        AlertDialog.Builder message = new AlertDialog.Builder(ggaVar).setTitle(ggaVar.getString(R.string.UPDATE_PLAY_SERVICES_FOR_LOCATION_TITLE)).setMessage(ggaVar.getString(R.string.UPDATE_PLAY_SERVICES_FOR_INCOGNITO_MESSAGE));
        message.setPositiveButton(ggaVar.getString(R.string.DIALOG_UPDATE), new afcw(this, intent, ggaVar)).setNegativeButton(ggaVar.getString(R.string.CANCEL_BUTTON), (DialogInterface.OnClickListener) null).setOnCancelListener(null);
        message.create().show();
        ((ckcn) this.q.a().a(ckfn.o)).a();
        return true;
    }

    @Override // defpackage.afas, defpackage.itb
    public final void Ns() {
        super.Ns();
        if (this.i.m(bvjk.n, false)) {
            this.C.a().k(new Runnable(this) { // from class: afct
                private final afdd a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    afdd afddVar = this.a;
                    afddVar.i.S(bvjk.n, false);
                    afddVar.h.a().b();
                }
            }, this.y, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
    }

    @Override // defpackage.afas, defpackage.itb
    public final void PX() {
        super.PX();
        this.z.execute(new Runnable(this) { // from class: afcs
            private final afdd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afdd afddVar = this.a;
                if (!btsj.f(afddVar.o, 16200000)) {
                    return;
                }
                boolean m = afddVar.p.a().j().m();
                afddVar.r.a(m).m(new afcx(afddVar, m));
            }
        });
    }

    @Override // defpackage.afas
    protected final boolean k() {
        this.o.getApplicationContext();
        if (!s()) {
            return false;
        }
        ((ckco) this.q.a().a(ckfn.n)).a(afed.a(7));
        s();
        p();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afas
    public final void l(boolean z, Runnable runnable, Runnable runnable2) {
        this.r.a(z).m(new afcv(this, z, runnable, runnable2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afas
    public final void m(boolean z) {
        new Handler(Looper.getMainLooper()).post(new afdc(this, this.o.getString(true != z ? R.string.INCOGNITO_TRANSITION_DIALOG_FAILED_TO_EXIT_TEXT : R.string.INCOGNITO_TRANSITION_DIALOG_FAILED_TO_ENTER_TEXT)));
    }

    @Override // defpackage.afas
    protected final dcdc<deig<Void>> n() {
        deig<Void> d = deig.d();
        deig d2 = deig.d();
        this.A.a().p(d);
        this.B.a();
        asat.a(d2);
        return dcdc.g(d, d2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afas
    public final Intent o(@dzsi Intent intent, boolean z) {
        return efw.a(this.o.getApplicationContext(), intent, z, GmmRestartActivity.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afas
    public final void p() {
        Runnable runnable = new Runnable(this) { // from class: afcu
            private final afdd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.u.a().j(false);
            }
        };
        if (bvrj.UI_THREAD.b()) {
            runnable.run();
        } else {
            this.y.execute(runnable);
        }
    }

    @Override // defpackage.afef
    public final boolean q(Intent intent) {
        if (!this.p.a().d()) {
            return true;
        }
        if (this.x.a().l(intent)) {
            ((ckcn) this.q.a().a(ckfn.d)).a();
            return true;
        }
        afdn afdnVar = new afdn();
        afdh afdhVar = new afdh(this.o, afdnVar, this.w);
        afdnVar.a = new afcz(this, intent, afdhVar);
        afdhVar.show();
        return false;
    }

    @Override // defpackage.afef
    public final void r() {
        this.h.a().g(new Runnable(this) { // from class: afcr
            private final afdd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f(false, null);
            }
        });
    }
}
