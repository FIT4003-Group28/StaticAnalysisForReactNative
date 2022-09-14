package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler X;
    private Runnable Y = new a();
    DialogInterface.OnCancelListener Z = new b();
    DialogInterface.OnDismissListener a0 = new c();
    int b0 = 0;
    int c0 = 0;
    boolean d0 = true;
    boolean e0 = true;
    int f0 = -1;
    Dialog g0;
    boolean h0;
    boolean i0;
    boolean j0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogFragment dialogFragment = DialogFragment.this;
            dialogFragment.a0.onDismiss(dialogFragment.g0);
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.g0;
            if (dialog != null) {
                dialogFragment.onCancel(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.g0;
            if (dialog != null) {
                dialogFragment.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void S() {
        super.S();
        Dialog dialog = this.g0;
        if (dialog != null) {
            this.h0 = true;
            dialog.setOnDismissListener(null);
            this.g0.dismiss();
            if (!this.i0) {
                onDismiss(this.g0);
            }
            this.g0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void T() {
        super.T();
        if (this.j0 || this.i0) {
            return;
        }
        this.i0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void W() {
        super.W();
        Dialog dialog = this.g0;
        if (dialog != null) {
            this.h0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void X() {
        super.X();
        Dialog dialog = this.g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void a(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Context context) {
        super.a(context);
        if (!this.j0) {
            this.i0 = false;
        }
    }

    public void a(l lVar, String str) {
        this.i0 = false;
        this.j0 = true;
        s b2 = lVar.b();
        b2.a(this, str);
        b2.a();
    }

    void a(boolean z, boolean z2) {
        if (this.i0) {
            return;
        }
        this.i0 = true;
        this.j0 = false;
        Dialog dialog = this.g0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.g0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.X.getLooper()) {
                    onDismiss(this.g0);
                } else {
                    this.X.post(this.Y);
                }
            }
        }
        this.h0 = true;
        if (this.f0 >= 0) {
            w().a(this.f0, 1);
            this.f0 = -1;
            return;
        }
        s b2 = w().b();
        b2.a(this);
        if (z) {
            b2.b();
        } else {
            b2.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void b(Bundle bundle) {
        Bundle bundle2;
        super.b(bundle);
        if (!this.e0) {
            return;
        }
        View F = F();
        if (F != null) {
            if (F.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            this.g0.setContentView(F);
        }
        androidx.fragment.app.c g2 = g();
        if (g2 != null) {
            this.g0.setOwnerActivity(g2);
        }
        this.g0.setCancelable(this.d0);
        this.g0.setOnCancelListener(this.Z);
        this.g0.setOnDismissListener(this.a0);
        if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.g0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        this.X = new Handler();
        this.e0 = this.x == 0;
        if (bundle != null) {
            this.b0 = bundle.getInt("android:style", 0);
            this.c0 = bundle.getInt("android:theme", 0);
            this.d0 = bundle.getBoolean("android:cancelable", true);
            this.e0 = bundle.getBoolean("android:showsDialog", this.e0);
            this.f0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater d(Bundle bundle) {
        Context f2;
        if (!this.e0) {
            return super.d(bundle);
        }
        this.g0 = n(bundle);
        Dialog dialog = this.g0;
        if (dialog != null) {
            a(dialog, this.b0);
            f2 = this.g0.getContext();
        } else {
            f2 = this.t.f();
        }
        return (LayoutInflater) f2.getSystemService("layout_inflater");
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.e(bundle);
        Dialog dialog = this.g0;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.b0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.c0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.d0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.e0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void h(boolean z) {
        this.d0 = z;
        Dialog dialog = this.g0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void i(boolean z) {
        this.e0 = z;
    }

    public void m0() {
        a(false, false);
    }

    public Dialog n(Bundle bundle) {
        return new Dialog(j0(), p0());
    }

    public void n0() {
        a(true, false);
    }

    public Dialog o0() {
        return this.g0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.h0) {
            a(true, true);
        }
    }

    public int p0() {
        return this.c0;
    }

    public final Dialog q0() {
        Dialog o0 = o0();
        if (o0 != null) {
            return o0;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }
}
