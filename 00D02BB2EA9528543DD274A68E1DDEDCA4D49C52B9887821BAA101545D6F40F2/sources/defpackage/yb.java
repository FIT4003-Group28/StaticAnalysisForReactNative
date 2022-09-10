package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yb  reason: default package */
/* loaded from: classes7.dex */
public final class yb extends aaq implements yd {
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    final /* synthetic */ ye d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(ye yeVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = yeVar;
        this.c = new Rect();
        this.l = yeVar;
        y();
        this.m = new xy(this);
    }

    @Override // defpackage.aaq, defpackage.yd
    public final void MZ(ListAdapter listAdapter) {
        super.MZ(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.yd
    public final void b(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.yd
    public final CharSequence c() {
        return this.a;
    }

    @Override // defpackage.yd
    public final void d(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean m = m();
        n();
        x();
        super.MY();
        zh zhVar = this.e;
        zhVar.setChoiceMode(1);
        zhVar.setTextDirection(i);
        zhVar.setTextAlignment(i2);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        zh zhVar2 = this.e;
        if (m() && zhVar2 != null) {
            zhVar2.a = false;
            zhVar2.setSelection(selectedItemPosition);
            if (zhVar2.getChoiceMode() != 0) {
                zhVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!m && (viewTreeObserver = this.d.getViewTreeObserver()) != null) {
            xz xzVar = new xz(this);
            viewTreeObserver.addOnGlobalLayoutListener(xzVar);
            s(new ya(this, xzVar));
        }
    }

    @Override // defpackage.yd
    public final void l(int i) {
        this.r = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.SpinnerAdapter, android.widget.ListAdapter] */
    public final void n() {
        Drawable h = h();
        int i = 0;
        if (h != null) {
            h.getPadding(this.d.d);
            i = afm.a(this.d) ? this.d.d.right : -this.d.d.left;
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        ye yeVar = this.d;
        int i2 = yeVar.c;
        if (i2 == -2) {
            int a = yeVar.a(this.b, h());
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
        this.g = afm.a(this.d) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}
