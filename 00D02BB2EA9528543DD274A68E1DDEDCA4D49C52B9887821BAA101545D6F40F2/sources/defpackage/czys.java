package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czys  reason: default package */
/* loaded from: classes5.dex */
public final class czys extends qx {
    private Drawable b;
    private final Rect c;

    public czys(Context context) {
        this(context, 0);
    }

    private static int u(Context context) {
        TypedValue a = dacz.a(context, R.attr.materialAlertDialogTheme);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    @Override // defpackage.qx
    public final qy b() {
        qy b = super.b();
        Window window = b.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.b;
        if (drawable instanceof dadr) {
            ((dadr) drawable).aa(od.G(decorView));
        }
        Drawable drawable2 = this.b;
        Rect rect = this.c;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new czyr(b, this.c));
        return b;
    }

    public final void p(Drawable drawable) {
        super.e(drawable);
    }

    public final void q(CharSequence charSequence) {
        super.f(charSequence);
    }

    public final void r(int i) {
        super.o(i, null);
    }

    public final void s(int i) {
        super.i(i);
    }

    public final void t(View view) {
        super.k(view);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public czys(android.content.Context r12, int r13) {
        /*
            r11 = this;
            int r0 = u(r12)
            r1 = 0
            r2 = 2130968629(0x7f040035, float:1.7545917E38)
            r3 = 2132017672(0x7f140208, float:1.967363E38)
            android.content.Context r4 = defpackage.daib.a(r12, r1, r2, r3)
            if (r0 != 0) goto L12
            goto L18
        L12:
            uf r5 = new uf
            r5.<init>(r4, r0)
            r4 = r5
        L18:
            if (r13 != 0) goto L1e
            int r13 = u(r12)
        L1e:
            r11.<init>(r4, r13)
            android.content.Context r12 = r11.a()
            android.content.res.Resources$Theme r13 = r12.getTheme()
            r6 = 0
            int[] r7 = defpackage.czyt.a
            r8 = 2130968629(0x7f040035, float:1.7545917E38)
            r9 = 2132017672(0x7f140208, float:1.967363E38)
            r0 = 0
            int[] r10 = new int[r0]
            r5 = r12
            android.content.res.TypedArray r4 = defpackage.daaz.a(r5, r6, r7, r8, r9, r10)
            r5 = 2
            android.content.res.Resources r6 = r12.getResources()
            r7 = 2131165955(0x7f070303, float:1.7946142E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r5 = r4.getDimensionPixelSize(r5, r6)
            r6 = 3
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131165956(0x7f070304, float:1.7946144E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r6 = r4.getDimensionPixelSize(r6, r7)
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131165954(0x7f070302, float:1.794614E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 1
            int r7 = r4.getDimensionPixelSize(r8, r7)
            android.content.res.Resources r9 = r12.getResources()
            r10 = 2131165953(0x7f070301, float:1.7946138E38)
            int r9 = r9.getDimensionPixelSize(r10)
            int r0 = r4.getDimensionPixelSize(r0, r9)
            r4.recycle()
            android.content.res.Resources r4 = r12.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.getLayoutDirection()
            if (r4 != r8) goto L8c
            r9 = r5
            goto L8d
        L8c:
            r9 = r7
        L8d:
            if (r4 != r8) goto L90
            r5 = r7
        L90:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r5, r6, r9, r0)
            r11.c = r4
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            int r0 = defpackage.czxb.d(r12, r0)
            dadr r4 = new dadr
            r4.<init>(r12, r1, r2, r3)
            r4.W(r12)
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r0)
            r4.Q(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r12 < r0) goto Le8
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r13.resolveAttribute(r0, r12, r8)
            android.content.Context r13 = r11.a()
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r12.getDimension(r13)
            int r12 = r12.type
            r0 = 5
            if (r12 != r0) goto Le8
            r12 = 0
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 < 0) goto Le8
            dadq r12 = r4.w
            dadx r12 = r12.a
            dadx r12 = r12.f(r13)
            r4.setShapeAppearanceModel(r12)
        Le8:
            r11.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czys.<init>(android.content.Context, int):void");
    }
}
