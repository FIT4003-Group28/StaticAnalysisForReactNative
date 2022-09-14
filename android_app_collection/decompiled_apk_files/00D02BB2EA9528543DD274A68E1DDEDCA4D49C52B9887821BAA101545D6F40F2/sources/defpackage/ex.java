package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
/* compiled from: PG */
/* renamed from: ex  reason: default package */
/* loaded from: classes.dex */
public class ex extends fd implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler IK;
    private boolean Jg;
    private boolean al;
    public Dialog d;
    public boolean e;
    public boolean f;
    private Runnable IL = new es(this);
    private DialogInterface.OnCancelListener Je = new et(this);
    public DialogInterface.OnDismissListener a = new eu(this);
    private int Jf = 0;
    public int b = 0;
    private boolean IM = true;
    public boolean c = true;
    private int IO = -1;
    private aa<m> Jh = new ev(this);
    public boolean g = false;

    private final void aJ(boolean z, boolean z2) {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f = false;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.IK.getLooper()) {
                    onDismiss(this.d);
                } else {
                    this.IK.post(this.IL);
                }
            }
        }
        this.al = true;
        if (this.IO >= 0) {
            gn Q = Q();
            int i = this.IO;
            if (i >= 0) {
                Q.K(new gl(Q, null, i, 1), false);
                this.IO = -1;
                return;
            }
            throw new IllegalArgumentException("Bad id: " + i);
        }
        gz b = Q().b();
        b.u(this);
        if (z) {
            b.r();
        } else {
            b.f();
        }
    }

    @Override // defpackage.fd
    public final void NB(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.NB(layoutInflater, viewGroup, bundle);
        if (this.P != null || this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.fd
    public final fn PW() {
        return new ew(this, super.PW());
    }

    public final void Pl(gz gzVar, String str) {
        this.e = false;
        this.f = true;
        gzVar.y(this, str);
        this.al = false;
        this.IO = gzVar.f();
    }

    @Override // defpackage.fd
    public final void Qd() {
        super.Qd();
        if (!this.f && !this.e) {
            this.e = true;
        }
        this.ab.d(this.Jh);
    }

    @Override // defpackage.fd
    public void Qe() {
        super.Qe();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.al = true;
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!this.e) {
                onDismiss(this.d);
            }
            this.d = null;
            this.g = false;
        }
    }

    @Override // defpackage.fd
    public final LayoutInflater Qh(Bundle bundle) {
        LayoutInflater aD = aD();
        if (!this.c || this.Jg) {
            if (gn.a(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.c) {
                    String str2 = "mShowsDialog = false: " + str;
                } else {
                    String str3 = "mCreatingDialog = true: " + str;
                }
            }
            return aD;
        }
        if (!this.g) {
            try {
                this.Jg = true;
                Dialog q = q(bundle);
                this.d = q;
                if (this.c) {
                    p(q, this.Jf);
                    Context H = H();
                    if (H instanceof Activity) {
                        this.d.setOwnerActivity((Activity) H);
                    }
                    this.d.setCancelable(this.IM);
                    this.d.setOnCancelListener(this.Je);
                    this.d.setOnDismissListener(this.a);
                    this.g = true;
                } else {
                    this.d = null;
                }
            } finally {
                this.Jg = false;
            }
        }
        if (gn.a(2)) {
            String str4 = "get layout inflater for DialogFragment " + this + " from dialog context";
        }
        Dialog dialog = this.d;
        return dialog != null ? aD.cloneInContext(dialog.getContext()) : aD;
    }

    @Override // defpackage.fd
    public void Qi(Context context) {
        super.Qi(context);
        this.ab.c(this.Jh);
        if (!this.f) {
            this.e = false;
        }
    }

    @Override // defpackage.fd
    public final void Qj(Bundle bundle) {
        Bundle bundle2;
        super.Qj(bundle);
        if (this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    public final void d(int i, int i2) {
        if (gn.a(2)) {
            String str = "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2;
        }
        this.Jf = i;
        this.b = i2;
    }

    public final void e(gn gnVar, String str) {
        this.e = false;
        this.f = true;
        gz b = gnVar.b();
        b.y(this, str);
        b.f();
    }

    public void f() {
        aJ(false, false);
    }

    public final void g() {
        aJ(true, false);
    }

    public final Dialog h() {
        Dialog dialog = this.d;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void i(boolean z) {
        this.IM = z;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    @Override // defpackage.fd
    public void l(Bundle bundle) {
        super.l(bundle);
        this.IK = new Handler();
        this.c = this.F == 0;
        if (bundle != null) {
            this.Jf = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.IM = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.IO = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.al) {
            if (gn.a(3)) {
                String str = "onDismiss called for DialogFragment " + this;
            }
            aJ(true, true);
        }
    }

    public void p(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog q(Bundle bundle) {
        if (gn.a(3)) {
            String str = "onCreateDialog called for DialogFragment " + this;
        }
        return new Dialog(I(), this.b);
    }

    @Override // defpackage.fd
    public void s() {
        super.s();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.al = false;
            dialog.show();
        }
    }

    @Override // defpackage.fd
    public void t(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.Jf;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.IM) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.IO;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.fd
    public void u() {
        super.u();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
