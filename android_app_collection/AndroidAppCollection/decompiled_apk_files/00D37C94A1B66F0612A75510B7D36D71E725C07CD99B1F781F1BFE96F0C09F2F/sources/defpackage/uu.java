package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
/* compiled from: PG */
/* renamed from: uu  reason: default package */
/* loaded from: classes4.dex */
public final class uu extends ww implements uv {
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    final /* synthetic */ AppCompatSpinner d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = appCompatSpinner;
        this.c = new Rect();
        this.l = appCompatSpinner;
        z();
        this.m = new ur(this);
    }

    @Override // defpackage.uv
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.ww, defpackage.uv
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.uv
    public final void h(int i) {
        this.r = i;
    }

    @Override // defpackage.uv
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.uv
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean u = u();
        n();
        y();
        super.s();
        vv vvVar = this.e;
        vvVar.setChoiceMode(1);
        vvVar.setTextDirection(i);
        vvVar.setTextAlignment(i2);
        w(this.d.getSelectedItemPosition());
        if (!u && (viewTreeObserver = this.d.getViewTreeObserver()) != null) {
            us usVar = new us(this);
            viewTreeObserver.addOnGlobalLayoutListener(usVar);
            v(new ut(this, usVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.SpinnerAdapter, android.widget.ListAdapter] */
    public final void n() {
        Drawable c = c();
        int i = 0;
        if (c != null) {
            c.getPadding(this.d.d);
            i = aav.b(this.d) ? this.d.d.right : -this.d.d.left;
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        AppCompatSpinner appCompatSpinner = this.d;
        int i2 = appCompatSpinner.c;
        if (i2 == -2) {
            int a = appCompatSpinner.a(this.b, c());
            int i3 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = aav.b(this.d) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}
