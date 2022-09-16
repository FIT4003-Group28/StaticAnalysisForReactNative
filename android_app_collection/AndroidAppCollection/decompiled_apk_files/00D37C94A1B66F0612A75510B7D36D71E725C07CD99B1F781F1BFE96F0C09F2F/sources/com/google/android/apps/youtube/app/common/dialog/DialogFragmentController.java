package com.google.android.apps.youtube.app.common.dialog;

import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class DialogFragmentController implements f {
    private final String a;
    private final dt b;
    private boolean c;
    private dh d;
    private int e = 1;
    public dh i;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogFragmentController(dt dtVar, String str) {
        dtVar.getClass();
        this.b = dtVar;
        zgh.m(str);
        this.a = str;
    }

    private final void g() {
        this.b.getLifecycle().c(this);
        this.c = !(this.b.getLifecycle().a() == apt.RESUMED);
    }

    public final dh i() {
        dh dhVar = this.i;
        return dhVar != null ? dhVar : (dh) this.b.getSupportFragmentManager().f(this.a);
    }

    public final void j(dh dhVar) {
        dhVar.getClass();
        g();
        if (this.c) {
            this.e = 2;
            this.d = dhVar;
        } else if (this.i != null) {
        } else {
            this.d = null;
            this.i = dhVar;
            ex l = this.b.getSupportFragmentManager().l();
            l.z(R.anim.bottom_translate_in, 0);
            l.r(this.i, this.a);
            l.a();
            dhVar.X.c(new f() { // from class: com.google.android.apps.youtube.app.common.dialog.DialogFragmentController.1
                @Override // defpackage.f, defpackage.g
                public final /* synthetic */ void kG(apy apyVar) {
                }

                @Override // defpackage.f, defpackage.g
                public final /* synthetic */ void lc(apy apyVar) {
                }

                @Override // defpackage.f, defpackage.g
                public final void ld(apy apyVar) {
                    DialogFragmentController.this.i = null;
                }

                @Override // defpackage.g
                public final /* synthetic */ void nA(apy apyVar) {
                }

                @Override // defpackage.g
                public final /* synthetic */ void nv(apy apyVar) {
                }

                @Override // defpackage.f, defpackage.g
                public final /* synthetic */ void nz(apy apyVar) {
                }
            });
        }
    }

    public final void k() {
        if (this.c) {
            this.e = 16;
            return;
        }
        dh i = i();
        this.i = i;
        if (i != null) {
            ex l = this.b.getSupportFragmentManager().l();
            l.z(R.anim.bottom_translate_in, R.anim.bottom_translate_out);
            l.m(this.i);
            l.a();
            this.i = null;
        }
        this.b.getLifecycle().e(this);
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        this.c = false;
        int i = this.e;
        if (i == 2) {
            j(this.d);
        } else if (i == 4) {
            n();
        } else if (i == 8) {
            l();
        } else if (i == 16) {
            k();
        }
        this.e = 1;
    }

    public final void l() {
        if (this.c) {
            this.e = 8;
            return;
        }
        dh i = i();
        this.i = i;
        if (i == null || !i.at()) {
            return;
        }
        ex l = this.b.getSupportFragmentManager().l();
        l.z(0, R.anim.bottom_translate_out);
        l.l(this.i);
        l.a();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    public final void m() {
        this.i = null;
    }

    public void n() {
        g();
        if (this.c) {
            this.e = 4;
            return;
        }
        dh i = i();
        this.i = i;
        if (i == null || i.at()) {
            return;
        }
        ex l = this.b.getSupportFragmentManager().l();
        l.z(R.anim.bottom_translate_in, 0);
        l.n(this.i);
        l.a();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        this.c = true;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
