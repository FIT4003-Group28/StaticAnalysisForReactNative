package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* compiled from: PG */
/* renamed from: dh  reason: default package */
/* loaded from: classes3.dex */
public class dh extends dp implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private boolean WA;
    private boolean WD;
    private Handler Ww;
    private boolean am;
    private boolean an;
    public Dialog d;
    private final Runnable Wx = new dc(this);
    private final DialogInterface.OnCancelListener Wy = new dd(this);
    public final DialogInterface.OnDismissListener a = new de(this);
    private int Wz = 0;
    public int b = 0;
    private boolean ai = true;
    public boolean c = true;
    private int Wt = -1;
    private final u WE = new df(this);
    public boolean e = false;

    private final void oA(boolean z, boolean z2) {
        if (this.an) {
            return;
        }
        this.an = true;
        this.WA = false;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.Ww.getLooper()) {
                    onDismiss(this.d);
                } else {
                    this.Ww.post(this.Wx);
                }
            }
        }
        this.am = true;
        if (this.Wt >= 0) {
            F().ae(this.Wt, z);
            this.Wt = -1;
            return;
        }
        ex l = F().l();
        l.m(this);
        if (z) {
            l.k();
        } else {
            l.a();
        }
    }

    public void dismiss() {
        oA(false, false);
    }

    @Override // defpackage.dp
    public void kt(Context context) {
        super.kt(context);
        this.Z.f(this.WE);
        if (!this.WA) {
            this.an = false;
        }
    }

    public void ku() {
        oA(true, false);
    }

    @Override // defpackage.dp
    public final dw kz() {
        return new dg(this, super.kz());
    }

    @Override // defpackage.dp
    public final void lJ(Bundle bundle) {
        Bundle bundle2;
        super.lJ(bundle);
        if (this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.dp
    public final void lK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.lK(layoutInflater, viewGroup, bundle);
        if (this.O != null || this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.dp
    public LayoutInflater lS(Bundle bundle) {
        LayoutInflater ax = ax();
        if (!this.c || this.WD) {
            if (eo.X(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("getting layout inflater for DialogFragment ");
                sb.append(this);
            }
            return ax;
        }
        if (!this.e) {
            try {
                this.WD = true;
                Dialog oy = oy(bundle);
                this.d = oy;
                if (this.c) {
                    p(oy, this.Wz);
                    Context rb = rb();
                    if (rb instanceof Activity) {
                        this.d.setOwnerActivity((Activity) rb);
                    }
                    this.d.setCancelable(this.ai);
                    this.d.setOnCancelListener(this.Wy);
                    this.d.setOnDismissListener(this.a);
                    this.e = true;
                } else {
                    this.d = null;
                }
            } finally {
                this.WD = false;
            }
        }
        if (eo.X(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("get layout inflater for DialogFragment ");
            sb2.append(this);
            sb2.append(" from dialog context");
        }
        Dialog dialog = this.d;
        return dialog != null ? ax.cloneInContext(dialog.getContext()) : ax;
    }

    @Override // defpackage.dp
    public void lU() {
        super.lU();
        if (!this.WA && !this.an) {
            this.an = true;
        }
        this.Z.j(this.WE);
    }

    public final void mN(int i, int i2) {
        if (eo.X(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
        }
        this.Wz = i;
        if (i == 2) {
            this.b = 16973913;
        }
        if (i2 != 0) {
            this.b = i2;
        }
    }

    @Override // defpackage.dp
    public void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.Ww = new Handler();
        this.c = this.E == 0;
        if (bundle != null) {
            this.Wz = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.ai = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.Wt = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.dp
    public void mR() {
        super.mR();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.am = true;
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!this.an) {
                onDismiss(this.d);
            }
            this.d = null;
            this.e = false;
        }
    }

    @Override // defpackage.dp
    public void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.am = false;
            dialog.show();
            View decorView = this.d.getWindow().getDecorView();
            ao.d(decorView, this);
            ao.c(decorView, this);
            le.d(decorView, this);
        }
    }

    @Override // defpackage.dp
    public void my() {
        super.my();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void n(boolean z) {
        this.ai = z;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.am) {
            if (eo.X(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
            }
            oA(true, true);
        }
    }

    public Dialog oy(Bundle bundle) {
        if (eo.X(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new Dialog(rg(), this.b);
    }

    @Override // defpackage.dp
    public void oz(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.Wz;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.ai) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.Wt;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
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

    public void qv(eo eoVar, String str) {
        this.an = false;
        this.WA = true;
        ex l = eoVar.l();
        l.r(this, str);
        l.a();
    }

    public final void qw(eo eoVar, String str) {
        this.an = false;
        this.WA = true;
        ex l = eoVar.l();
        l.r(this, str);
        l.d();
    }

    public final void s(ex exVar, String str) {
        this.an = false;
        this.WA = true;
        exVar.r(this, str);
        this.am = false;
        this.Wt = exVar.a();
    }
}
