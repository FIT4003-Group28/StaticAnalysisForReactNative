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
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: nw  reason: default package */
/* loaded from: classes3.dex */
public final class nw {
    public final ns a;
    private final int b;

    public nw(Context context) {
        this(context, nx.a(context, 0));
    }

    public final Context a() {
        return this.a.a;
    }

    public final nx b() {
        int i;
        ListAdapter listAdapter;
        nx nxVar = new nx(this.a.a, this.b);
        ns nsVar = this.a;
        nv nvVar = nxVar.a;
        View view = nsVar.e;
        if (view != null) {
            nvVar.w = view;
        } else {
            CharSequence charSequence = nsVar.d;
            if (charSequence != null) {
                nvVar.b(charSequence);
            }
            Drawable drawable = nsVar.c;
            if (drawable != null) {
                nvVar.s = drawable;
                nvVar.r = 0;
                ImageView imageView = nvVar.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    nvVar.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = nsVar.f;
        if (charSequence2 != null) {
            nvVar.e = charSequence2;
            TextView textView = nvVar.v;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = nsVar.g;
        if (charSequence3 != null) {
            nvVar.g(-1, charSequence3, nsVar.h);
        }
        CharSequence charSequence4 = nsVar.i;
        if (charSequence4 != null) {
            nvVar.g(-2, charSequence4, nsVar.j);
        }
        if (nsVar.o != null || nsVar.p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) nsVar.b.inflate(nvVar.B, (ViewGroup) null);
            if (nsVar.t) {
                listAdapter = new np(nsVar, nsVar.a, nvVar.C, nsVar.o, alertController$RecycleListView);
            } else {
                if (nsVar.u) {
                    i = nvVar.D;
                } else {
                    i = nvVar.E;
                }
                listAdapter = nsVar.p;
                if (listAdapter == null) {
                    listAdapter = new nu(nsVar.a, i, nsVar.o);
                }
            }
            nvVar.x = listAdapter;
            nvVar.y = nsVar.v;
            if (nsVar.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new nq(nsVar, nvVar));
            } else if (nsVar.w != null) {
                alertController$RecycleListView.setOnItemClickListener(new nr(nsVar, alertController$RecycleListView, nvVar));
            }
            if (nsVar.u) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (nsVar.t) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            nvVar.f = alertController$RecycleListView;
        }
        View view2 = nsVar.r;
        if (view2 != null) {
            nvVar.c(view2);
        }
        nxVar.setCancelable(this.a.k);
        if (this.a.k) {
            nxVar.setCanceledOnTouchOutside(true);
        }
        nxVar.setOnCancelListener(this.a.l);
        nxVar.setOnDismissListener(this.a.m);
        DialogInterface.OnKeyListener onKeyListener = this.a.n;
        if (onKeyListener != null) {
            nxVar.setOnKeyListener(onKeyListener);
        }
        return nxVar;
    }

    public final void c(boolean z) {
        this.a.k = z;
    }

    public final void d(View view) {
        this.a.e = view;
    }

    public final void e(Drawable drawable) {
        this.a.c = drawable;
    }

    public final void f(int i) {
        ns nsVar = this.a;
        nsVar.f = nsVar.a.getText(i);
    }

    public final void g(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public final void h(int i, DialogInterface.OnClickListener onClickListener) {
        ns nsVar = this.a;
        nsVar.i = nsVar.a.getText(i);
        this.a.j = onClickListener;
    }

    public final void i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        ns nsVar = this.a;
        nsVar.i = charSequence;
        nsVar.j = onClickListener;
    }

    public final void j(DialogInterface.OnCancelListener onCancelListener) {
        this.a.l = onCancelListener;
    }

    public final void k(int i, DialogInterface.OnClickListener onClickListener) {
        ns nsVar = this.a;
        nsVar.g = nsVar.a.getText(i);
        this.a.h = onClickListener;
    }

    public final void l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        ns nsVar = this.a;
        nsVar.g = charSequence;
        nsVar.h = onClickListener;
    }

    public final void m(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        ns nsVar = this.a;
        nsVar.p = listAdapter;
        nsVar.q = onClickListener;
        nsVar.v = i;
        nsVar.u = true;
    }

    public final void n(int i) {
        ns nsVar = this.a;
        nsVar.d = nsVar.a.getText(i);
    }

    public final void o(CharSequence charSequence) {
        this.a.d = charSequence;
    }

    public final void p(View view) {
        this.a.r = view;
    }

    public final void q() {
        b().show();
    }

    public nw(Context context, int i) {
        this.a = new ns(new ContextThemeWrapper(context, nx.a(context, i)));
        this.b = i;
    }
}
