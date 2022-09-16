package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aah  reason: default package */
/* loaded from: classes.dex */
public final class aah implements st {
    sf a;
    public si b;
    final /* synthetic */ Toolbar c;

    public aah(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.st
    public final void b(Context context, sf sfVar) {
        si siVar;
        sf sfVar2 = this.a;
        if (sfVar2 != null && (siVar = this.b) != null) {
            sfVar2.t(siVar);
        }
        this.a = sfVar;
    }

    @Override // defpackage.st
    public final void c(sf sfVar, boolean z) {
    }

    @Override // defpackage.st
    public final void d(ss ssVar) {
        throw null;
    }

    @Override // defpackage.st
    public final boolean e() {
        return false;
    }

    @Override // defpackage.st
    public final boolean f(tb tbVar) {
        return false;
    }

    @Override // defpackage.st
    public final boolean g(si siVar) {
        View view = this.c.e;
        if (view instanceof rf) {
            ((rf) view).onActionViewCollapsed();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.e);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.d);
        Toolbar toolbar3 = this.c;
        toolbar3.e = null;
        int size = toolbar3.p.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar3.addView((View) toolbar3.p.get(size));
            } else {
                toolbar3.p.clear();
                this.b = null;
                this.c.requestLayout();
                siVar.h(false);
                return true;
            }
        }
    }

    @Override // defpackage.st
    public final boolean h(si siVar) {
        Toolbar toolbar = this.c;
        if (toolbar.d == null) {
            toolbar.d = new AppCompatImageButton(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.d.setImageDrawable(toolbar.b);
            toolbar.d.setContentDescription(toolbar.c);
            aai C = Toolbar.C();
            C.a = (toolbar.h & 112) | 8388611;
            C.b = 2;
            toolbar.d.setLayoutParams(C);
            toolbar.d.setOnClickListener(new aag(toolbar));
        }
        ViewParent parent = this.c.d.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.d);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.d);
        }
        this.c.e = siVar.getActionView();
        this.b = siVar;
        ViewParent parent2 = this.c.e.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.e);
            }
            aai C2 = Toolbar.C();
            Toolbar toolbar5 = this.c;
            C2.a = 8388611 | (toolbar5.h & 112);
            C2.b = 2;
            toolbar5.e.setLayoutParams(C2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.e);
        }
        Toolbar toolbar7 = this.c;
        int childCount = toolbar7.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar7.getChildAt(childCount);
            if (((aai) childAt.getLayoutParams()).b != 2 && childAt != toolbar7.a) {
                toolbar7.removeViewAt(childCount);
                toolbar7.p.add(childAt);
            }
        }
        this.c.requestLayout();
        siVar.h(true);
        View view = this.c.e;
        if (view instanceof rf) {
            ((rf) view).onActionViewExpanded();
        }
        return true;
    }

    @Override // defpackage.st
    public final void i() {
        if (this.b != null) {
            sf sfVar = this.a;
            if (sfVar != null) {
                int size = sfVar.size();
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
