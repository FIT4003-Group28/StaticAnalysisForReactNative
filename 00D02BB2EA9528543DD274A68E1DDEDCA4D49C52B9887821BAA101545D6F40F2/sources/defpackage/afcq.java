package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afcq  reason: default package */
/* loaded from: classes2.dex */
public final class afcq implements afee {
    public final gga a;
    public final afey b;
    public final ckcw c;
    public final eff d;
    public final cqkj e;
    public final dxio<akfa> f;
    @dzsi
    public View g = null;
    private final Executor h;
    private final dehq i;

    public afcq(gga ggaVar, afey afeyVar, ckcw ckcwVar, eff effVar, cqkj cqkjVar, dxio<akfa> dxioVar, Executor executor, dehq dehqVar) {
        this.a = ggaVar;
        this.c = ckcwVar;
        this.b = afeyVar;
        this.d = effVar;
        this.e = cqkjVar;
        this.f = dxioVar;
        this.h = executor;
        this.i = dehqVar;
    }

    @Override // defpackage.afee
    public final void a() {
        this.a.D(new afel());
    }

    @Override // defpackage.afee
    public final void b() {
        ((ckco) this.c.a(ckfn.n)).a(afed.a(4));
        iii iiiVar = new iii();
        iiiVar.b = this.a.getString(R.string.INCOGNITO_TRANSITION_DIALOG_FAILED_TO_EXIT_TEXT);
        iiiVar.d(this.a.getString(R.string.INCOGNITO_TRANSITION_DIALOG_DISMISS_TEXT), null, null);
        iiiVar.a(this.a, this.e).k();
    }

    @Override // defpackage.afee
    public final void c() {
        this.a.runOnUiThread(new Runnable(this) { // from class: afcm
            private final afcq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afcq afcqVar = this.a;
                if (afcqVar.e()) {
                    return;
                }
                cqkf d = afcqVar.e.d(new afew(), afcqVar.d.a(), false);
                d.e(afcqVar.b);
                afcqVar.g = d.c();
                afcqVar.d.e(efe.INCOGNITO_BANNER, afcqVar.g);
            }
        });
    }

    @Override // defpackage.afee
    public final void d() {
        if (e()) {
            this.d.d(efe.INCOGNITO_BANNER);
        }
    }

    public final boolean e() {
        return this.g != null && this.d.b(efe.INCOGNITO_BANNER);
    }

    @Override // defpackage.afee
    public final void f(boolean z) {
        if (z) {
            this.a.D(afdg.g(true));
        } else {
            this.i.a(new Runnable(this) { // from class: afcn
                private final afcq a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f.a().h();
                }
            }).Pk(new Runnable(this) { // from class: afco
                private final afcq a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    afcq afcqVar = this.a;
                    afcqVar.d();
                    afcqVar.a.D(afdg.g(false));
                }
            }, this.h);
        }
    }

    @Override // defpackage.afee
    public final void g(Runnable runnable) {
        afdn afdnVar = new afdn();
        afdh afdhVar = new afdh(this.a, afdnVar, this.e);
        afdnVar.a = new afcp(this, afdhVar, runnable);
        afdhVar.show();
    }
}
