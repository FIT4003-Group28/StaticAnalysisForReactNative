package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: gen  reason: default package */
/* loaded from: classes.dex */
public abstract class gen extends ges {
    private Dialog a;
    private boolean b;
    private boolean c;
    private boolean d;
    public dxio<glj> f;

    @Override // defpackage.ges, defpackage.ggg
    public final gfu Nx() {
        return gfu.DIALOG_FRAGMENT;
    }

    @Override // defpackage.ges, defpackage.fd
    public void Qe() {
        super.Qe();
        if (aU()) {
            this.c = true;
            this.a.dismiss();
        }
        this.a = null;
    }

    public final void Ra(@dzsi Object obj) {
        if (aU()) {
            gn Q = Q();
            if (Q.J()) {
                return;
            }
            this.c = true;
            this.a.dismiss();
            Nw(obj);
            aX();
            Q.g(bc(), 1);
        }
    }

    public final void aJ(ff ffVar) {
        this.c = false;
        gz b = ffVar.g().b();
        b.z(bc());
        b.y(this, gfu.DIALOG_FRAGMENT.c);
        b.f();
        ffVar.g().aq();
    }

    @Override // defpackage.ges
    protected final void aQ() {
        this.d = false;
        if (p() == null) {
            this.aG = null;
        } else if (!bd().a()) {
            this.aG = this.aH.j(aP());
            this.d = true;
        } else {
            bd().b().d(cjtd.a(p()));
        }
    }

    protected boolean aR() {
        return false;
    }

    public final void aT() {
        Ra(null);
    }

    public final boolean aU() {
        return !this.c;
    }

    protected boolean aV() {
        return !this.b;
    }

    @Override // defpackage.ges
    protected final void aW() {
        if (!bd().a() || !this.d) {
            return;
        }
        this.aH.l(bd().b());
        this.d = false;
    }

    protected void aX() {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void aj(Bundle bundle) {
        Bundle bundle2;
        super.aj(bundle);
        this.a = i(bundle);
        View view = this.P;
        if (view != null) {
            if (view.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            this.a.setContentView(view);
        }
        this.a.setOwnerActivity(J());
        this.a.setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: gem
            private final gen a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.a.aT();
            }
        });
        if (bundle == null || (bundle2 = bundle.getBundle("savedDialogState")) == null) {
            return;
        }
        this.a.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.ges, defpackage.fd
    public void ak() {
        super.ak();
        if (!aR() || J() == null || J().isFinishing()) {
            return;
        }
        this.a.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Dialog i(Bundle bundle) {
        return new gdf(J());
    }

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        this.c = false;
        if (!aR() && J() != null && !J().isFinishing()) {
            this.a.show();
        }
        this.b = this.a.getWindow().isFloating();
        if (aV()) {
            this.f.a().g(false);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void t(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.t(bundle);
        Dialog dialog = this.a;
        if (dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null) {
            return;
        }
        bundle.putBundle("savedDialogState", onSaveInstanceState);
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        super.u();
        if (aV()) {
            this.f.a().g(true);
        }
        this.a.hide();
    }
}
