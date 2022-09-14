package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
/* compiled from: PG */
/* renamed from: cjkp  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjkp {
    public cqkj h;

    public abstract View.OnClickListener a();

    public abstract View.OnClickListener b();

    public abstract boolean c();

    public abstract DialogInterface.OnCancelListener d();

    public abstract boolean e();

    public abstract cjkr f();

    public abstract void g(AlertDialog alertDialog);

    public abstract void h(cqtd cqtdVar);

    public abstract void i(View.OnClickListener onClickListener);

    public abstract void j(CharSequence charSequence);

    public abstract void k(cjtd cjtdVar);

    public abstract void l(View.OnClickListener onClickListener);

    public abstract void m(CharSequence charSequence);

    public abstract void n(cjtd cjtdVar);

    public abstract void o(boolean z);

    public abstract void p(View.OnClickListener onClickListener);

    public abstract void q(CharSequence charSequence);

    public abstract void r(cjtd cjtdVar);

    public abstract void s(boolean z);

    public abstract void t(CharSequence charSequence);

    public final cjkr u(Activity activity) {
        ((cjko) btsq.c(cjko.class, activity)).wb(this);
        final cqkf c = this.h.c(new cjmd(c()), null);
        final AlertDialog create = new AlertDialog.Builder(activity, 2132018255).create();
        create.setCancelable(true);
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        final View.OnClickListener a = a();
        p(new View.OnClickListener(this, a, create, c) { // from class: cjkj
            private final cjkp a;
            private final View.OnClickListener b;
            private final AlertDialog c;
            private final cqkf d;

            {
                this.a = this;
                this.b = a;
                this.c = create;
                this.d = c;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cjkp cjkpVar = this.a;
                View.OnClickListener onClickListener = this.b;
                AlertDialog alertDialog = this.c;
                cqkf cqkfVar = this.d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (!cjkpVar.e() || !alertDialog.isShowing()) {
                    return;
                }
                cqkfVar.e(null);
                alertDialog.dismiss();
            }
        });
        final View.OnClickListener b = b();
        l(new View.OnClickListener(this, b, create, c) { // from class: cjkk
            private final cjkp a;
            private final View.OnClickListener b;
            private final AlertDialog c;
            private final cqkf d;

            {
                this.a = this;
                this.b = b;
                this.c = create;
                this.d = c;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cjkp cjkpVar = this.a;
                View.OnClickListener onClickListener = this.b;
                AlertDialog alertDialog = this.c;
                cqkf cqkfVar = this.d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (!cjkpVar.e() || !alertDialog.isShowing()) {
                    return;
                }
                cqkfVar.e(null);
                alertDialog.dismiss();
            }
        });
        final DialogInterface.OnCancelListener d = d();
        create.setOnCancelListener(new DialogInterface.OnCancelListener(d, c) { // from class: cjkl
            private final DialogInterface.OnCancelListener a;
            private final cqkf b;

            {
                this.a = d;
                this.b = c;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DialogInterface.OnCancelListener onCancelListener = this.a;
                cqkf cqkfVar = this.b;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(dialogInterface);
                }
                cqkfVar.e(null);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener(c) { // from class: cjkm
            private final cqkf a;

            {
                this.a = c;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.a.e(null);
            }
        });
        g(create);
        cjkr f = f();
        ((cjkq) btsq.c(cjkq.class, activity)).wa(f);
        c.e(f);
        create.setView(c.c());
        return f;
    }

    public final void v(CharSequence charSequence, View.OnClickListener onClickListener, cjtd cjtdVar) {
        j(charSequence);
        i(onClickListener);
        k(cjtdVar);
    }

    public final void w(CharSequence charSequence, View.OnClickListener onClickListener, cjtd cjtdVar, boolean z) {
        q(charSequence);
        p(onClickListener);
        r(cjtdVar);
        s(z);
    }

    public final void x(int i) {
        h(cqrt.f(i));
    }

    public final void y(CharSequence charSequence, View.OnClickListener onClickListener, cjtd cjtdVar) {
        m(charSequence);
        l(onClickListener);
        n(cjtdVar);
        s(true);
    }

    public final void z(CharSequence charSequence, View.OnClickListener onClickListener, cjtd cjtdVar) {
        w(charSequence, onClickListener, cjtdVar, true);
    }
}
