package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
/* compiled from: PG */
/* renamed from: cjkr  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjkr implements cjme {
    public cqhn a;
    private boolean b = false;
    private boolean c = false;

    public static cjkp B() {
        cjke cjkeVar = new cjke();
        cjkeVar.a = cqrp.d(280.0d);
        cjkeVar.o(false);
        cjkeVar.s(true);
        cjkeVar.c = Float.valueOf(cjki.RATIO_16_9.c);
        return cjkeVar;
    }

    public final void A(boolean z, boolean z2) {
        boolean z3 = true;
        if (z == this.b && z2 == this.c) {
            z3 = false;
        }
        this.b = z;
        this.c = z2;
        if (z3) {
            cqkx.p(this);
        }
    }

    public abstract AlertDialog q();

    public abstract boolean r();

    public abstract DialogInterface.OnCancelListener s();

    public abstract boolean t();

    public void u() {
        q().show();
    }

    public void v() {
        q().dismiss();
    }

    @Override // defpackage.cjme
    public Boolean w() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.cjme
    public Boolean x() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.cjme
    public qa y() {
        return new qa(this) { // from class: cjkg
            private final cjkr a;

            {
                this.a = this;
            }

            @Override // defpackage.qa
            public final void a(NestedScrollView nestedScrollView, int i) {
                this.a.A(nestedScrollView.canScrollVertically(-1), nestedScrollView.canScrollVertically(1));
            }
        };
    }

    @Override // defpackage.cjme
    public View.OnLayoutChangeListener z() {
        return new View.OnLayoutChangeListener(this) { // from class: cjkh
            private final cjkr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                cjkr cjkrVar = this.a;
                if (view instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    cjkrVar.A(nestedScrollView.canScrollVertically(-1), nestedScrollView.canScrollVertically(1));
                }
            }
        };
    }
}
