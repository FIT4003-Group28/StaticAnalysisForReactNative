package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
/* compiled from: PG */
/* renamed from: qx  reason: default package */
/* loaded from: classes7.dex */
public class qx {
    public final qt a;
    private final int b;

    public qx(Context context) {
        this(context, qy.a(context, 0));
    }

    public final Context a() {
        return this.a.a;
    }

    public qy b() {
        int i;
        ListAdapter listAdapter;
        qy qyVar = new qy(this.a.a, this.b);
        qt qtVar = this.a;
        qw qwVar = qyVar.a;
        View view = qtVar.e;
        if (view != null) {
            qwVar.x = view;
        } else {
            CharSequence charSequence = qtVar.d;
            if (charSequence != null) {
                qwVar.b(charSequence);
            }
            Drawable drawable = qtVar.c;
            if (drawable != null) {
                qwVar.t = drawable;
                qwVar.s = 0;
                ImageView imageView = qwVar.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    qwVar.u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = qtVar.f;
        if (charSequence2 != null) {
            qwVar.c(charSequence2);
        }
        CharSequence charSequence3 = qtVar.g;
        if (charSequence3 != null) {
            qwVar.h(-1, charSequence3, qtVar.h);
        }
        CharSequence charSequence4 = qtVar.i;
        if (charSequence4 != null) {
            qwVar.h(-2, charSequence4, qtVar.j);
        }
        if (qtVar.n != null || qtVar.o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) qtVar.b.inflate(qwVar.C, (ViewGroup) null);
            if (qtVar.s) {
                listAdapter = new qq(qtVar, qtVar.a, qwVar.D, qtVar.n, alertController$RecycleListView);
            } else {
                if (qtVar.t) {
                    i = qwVar.E;
                } else {
                    i = qwVar.F;
                }
                listAdapter = qtVar.o;
                if (listAdapter == null) {
                    listAdapter = new qv(qtVar.a, i, qtVar.n);
                }
            }
            qwVar.y = listAdapter;
            qwVar.z = qtVar.u;
            if (qtVar.p != null) {
                alertController$RecycleListView.setOnItemClickListener(new qr(qtVar, qwVar));
            } else if (qtVar.v != null) {
                alertController$RecycleListView.setOnItemClickListener(new qs(qtVar, alertController$RecycleListView, qwVar));
            }
            if (qtVar.t) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (qtVar.s) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            qwVar.f = alertController$RecycleListView;
        }
        View view2 = qtVar.q;
        if (view2 != null) {
            qwVar.d(view2);
        }
        qyVar.setCancelable(true);
        qyVar.setCanceledOnTouchOutside(true);
        qyVar.setOnCancelListener(this.a.k);
        qyVar.setOnDismissListener(this.a.l);
        DialogInterface.OnKeyListener onKeyListener = this.a.m;
        if (onKeyListener != null) {
            qyVar.setOnKeyListener(onKeyListener);
        }
        return qyVar;
    }

    public final qy c() {
        qy b = b();
        b.show();
        return b;
    }

    public final void d(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        qt qtVar = this.a;
        qtVar.o = listAdapter;
        qtVar.p = onClickListener;
    }

    public final void e(Drawable drawable) {
        this.a.c = drawable;
    }

    public final void f(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        qt qtVar = this.a;
        qtVar.i = charSequence;
        qtVar.j = onClickListener;
    }

    public final void h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        qt qtVar = this.a;
        qtVar.g = charSequence;
        qtVar.h = onClickListener;
    }

    public final void i(int i) {
        qt qtVar = this.a;
        qtVar.d = qtVar.a.getText(i);
    }

    public final void j(CharSequence charSequence) {
        this.a.d = charSequence;
    }

    public final void k(View view) {
        this.a.q = view;
    }

    public void l(int i, DialogInterface.OnClickListener onClickListener) {
        qt qtVar = this.a;
        qtVar.i = qtVar.a.getText(i);
        this.a.j = onClickListener;
    }

    public void m(DialogInterface.OnCancelListener onCancelListener) {
        this.a.k = onCancelListener;
    }

    public void n(DialogInterface.OnDismissListener onDismissListener) {
        this.a.l = onDismissListener;
    }

    public final void o(int i, DialogInterface.OnClickListener onClickListener) {
        qt qtVar = this.a;
        qtVar.g = qtVar.a.getText(i);
        this.a.h = onClickListener;
    }

    public qx(Context context, int i) {
        this.a = new qt(new ContextThemeWrapper(context, qy.a(context, i)));
        this.b = i;
    }
}
