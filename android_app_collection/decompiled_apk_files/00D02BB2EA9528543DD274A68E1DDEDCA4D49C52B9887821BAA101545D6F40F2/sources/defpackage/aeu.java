package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: aeu  reason: default package */
/* loaded from: classes2.dex */
public final class aeu implements vt {
    vf a;
    public vi b;
    final /* synthetic */ Toolbar c;

    public aeu(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.vt
    public final void a(Context context, vf vfVar) {
        vi viVar;
        vf vfVar2 = this.a;
        if (vfVar2 != null && (viVar = this.b) != null) {
            vfVar2.A(viVar);
        }
        this.a = vfVar;
    }

    @Override // defpackage.vt
    public final void b(vs vsVar) {
        throw null;
    }

    @Override // defpackage.vt
    public final void d(vf vfVar, boolean z) {
    }

    @Override // defpackage.vt
    public final boolean e(wb wbVar) {
        return false;
    }

    @Override // defpackage.vt
    public final boolean f() {
        return false;
    }

    @Override // defpackage.vt
    public final boolean g(vi viVar) {
        View view = this.c.c;
        if (view instanceof ue) {
            ((ue) view).b();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.c);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.b);
        Toolbar toolbar3 = this.c;
        toolbar3.c = null;
        int size = toolbar3.k.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar3.addView(toolbar3.k.get(size));
            } else {
                toolbar3.k.clear();
                this.b = null;
                this.c.requestLayout();
                viVar.t(false);
                return true;
            }
        }
    }

    @Override // defpackage.vt
    public final boolean h(vi viVar) {
        this.c.l();
        ViewParent parent = this.c.b.getParent();
        Toolbar toolbar = this.c;
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.b);
            }
            Toolbar toolbar2 = this.c;
            toolbar2.addView(toolbar2.b);
        }
        this.c.c = viVar.getActionView();
        this.b = viVar;
        ViewParent parent2 = this.c.c.getParent();
        Toolbar toolbar3 = this.c;
        if (parent2 != toolbar3) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar3.c);
            }
            aev n = Toolbar.n();
            Toolbar toolbar4 = this.c;
            n.a = (toolbar4.d & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
            n.b = 2;
            toolbar4.c.setLayoutParams(n);
            Toolbar toolbar5 = this.c;
            toolbar5.addView(toolbar5.c);
        }
        Toolbar toolbar6 = this.c;
        int childCount = toolbar6.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar6.getChildAt(childCount);
            if (((aev) childAt.getLayoutParams()).b != 2 && childAt != toolbar6.a) {
                toolbar6.removeViewAt(childCount);
                toolbar6.k.add(childAt);
            }
        }
        this.c.requestLayout();
        viVar.t(true);
        View view = this.c.c;
        if (view instanceof ue) {
            ((ue) view).a();
        }
        return true;
    }

    @Override // defpackage.vt
    public final void i() {
        if (this.b != null) {
            vf vfVar = this.a;
            if (vfVar != null) {
                int size = vfVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }
}
