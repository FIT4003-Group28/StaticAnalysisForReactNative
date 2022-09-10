package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cvxe  reason: default package */
/* loaded from: classes5.dex */
public final class cvxe<AccountT> extends ConstraintLayout {
    public final MaterialButton c;
    public final MaterialButton d;
    public final MaterialButton e;
    public final ImageView f;
    public final ImageView g;
    public final ArrayList<cvxa> h;
    public final int i;
    public cwjw<AccountT> j;
    public dtgb k;
    public nc<AccountT> l;
    public cvxa m;
    public cwii n;
    public cwla o;

    public cvxe(Context context) {
        this(context, null);
    }

    public static void f(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static void g(MaterialButton materialButton) {
        materialButton.setMaxLines(3);
        materialButton.setEllipsize(null);
    }

    public static void h(ImageView imageView, int i) {
        ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).setMargins(i, 0, i, 0);
    }

    public final void c(int i) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i);
    }

    public final void d(int i, int i2, int i3) {
        this.c.setGravity(i | 16);
        this.d.setGravity(i2 | 16);
        this.e.setGravity(i3 | 16);
    }

    public final void e(int[][] iArr) {
        ds dsVar = new ds();
        dsVar.c(this);
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                break;
            }
            int i2 = i == 0 ? 0 : iArr[i - 1][0];
            int i3 = i == length + (-1) ? 0 : iArr[i + 1][0];
            int i4 = iArr[i][0];
            dsVar.f(i4, 3, i2, i2 == 0 ? 3 : 4, 0);
            dsVar.f(i4, 4, i3, i3 == 0 ? 4 : 3, 0);
            if (i2 != 0) {
                dsVar.f(i2, 4, i4, 3, 0);
                if (i2 != 0) {
                    dsVar.f(i3, 3, i4, 4, 0);
                }
            }
            i++;
        }
        for (int[] iArr2 : iArr) {
            int i5 = 0;
            while (true) {
                int length2 = iArr2.length;
                if (i5 < length2) {
                    int i6 = i5 == 0 ? 0 : iArr2[i5 - 1];
                    int i7 = i5 == length2 + (-1) ? 0 : iArr2[i5 + 1];
                    int i8 = iArr2[i5];
                    dsVar.f(i8, 6, i6, i6 == 0 ? 6 : 7, 0);
                    dsVar.f(i8, 7, i7, i7 == 0 ? 7 : 6, 0);
                    if (i6 != 0) {
                        dsVar.f(i6, 7, i8, 6, 0);
                    }
                    if (i7 != 0) {
                        dsVar.f(i7, 6, i8, 7, 0);
                    }
                    if (i5 > 0) {
                        dsVar.g(iArr2[i5], 3, iArr2[0], 3);
                        dsVar.g(iArr2[i5], 4, iArr2[0], 4);
                    }
                    i5++;
                }
            }
        }
        dsVar.d(this);
    }

    public final View.OnClickListener i(final cvub<AccountT> cvubVar, final int i) {
        cwiw cwiwVar = new cwiw(new View.OnClickListener(this, i, cvubVar) { // from class: cvwz
            private final cvxe a;
            private final cvub b;
            private final int c;

            {
                this.a = this;
                this.c = i;
                this.b = cvubVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cvxe cvxeVar = this.a;
                int i2 = this.c;
                cvub cvubVar2 = this.b;
                cwjx cwjxVar = cvxeVar.j;
                Object a = cvxeVar.l.a();
                dtgb dtgbVar = cvxeVar.k;
                dsqp dsqpVar = (dsqp) dtgbVar.cu(5);
                dsqpVar.bC(dtgbVar);
                dtga dtgaVar = (dtga) dsqpVar;
                if (dtgaVar.c) {
                    dtgaVar.bF();
                    dtgaVar.c = false;
                }
                dtgb dtgbVar2 = (dtgb) dtgaVar.b;
                dtgb dtgbVar3 = dtgb.g;
                dtgbVar2.b = i2 - 1;
                dtgbVar2.a |= 1;
                cwjxVar.a(a, dtgaVar.bK());
                cvxeVar.o.d(csgw.a(), view);
                cvubVar2.a(view, cvxeVar.l.a());
            }
        });
        cwiwVar.c = this.n.a();
        cwiwVar.d = this.n.b();
        return cwiwVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.constraint.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            if (this.m == null) {
                super.onMeasure(i, i2);
                return;
            }
            while (!this.h.isEmpty()) {
                this.m.b(i2);
                if (getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                    break;
                }
                cvxa remove = this.h.remove(0);
                this.m = remove;
                remove.a();
            }
            cvxa cvxaVar = this.m;
            if (cvxaVar != null) {
                cvxaVar.a();
            }
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            cvxa cvxaVar2 = this.m;
            if (cvxaVar2 != null) {
                cvxaVar2.a();
            }
            super.onMeasure(i, i2);
            throw th;
        }
    }

    public final void setRippleColor(ColorStateList colorStateList) {
        this.c.setRippleColor(colorStateList);
        this.d.setRippleColor(colorStateList);
        this.e.setRippleColor(colorStateList);
    }

    public cvxe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new ArrayList<>();
        LayoutInflater.from(context).inflate(R.layout.policy_footer, this);
        this.c = (MaterialButton) findViewById(R.id.og_privacy_policy_button);
        this.d = (MaterialButton) findViewById(R.id.og_tos_button);
        this.e = (MaterialButton) findViewById(R.id.og_custom_button);
        this.f = (ImageView) findViewById(R.id.og_separator1);
        this.g = (ImageView) findViewById(R.id.og_separator2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvxf.a, R.attr.ogPolicyFooterStyle, 2132017734);
        try {
            setRippleColor(cwja.a(context, obtainStyledAttributes, 0));
            obtainStyledAttributes.recycle();
            this.i = getResources().getDimensionPixelSize(R.dimen.og_footer_added_separator_margin);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
