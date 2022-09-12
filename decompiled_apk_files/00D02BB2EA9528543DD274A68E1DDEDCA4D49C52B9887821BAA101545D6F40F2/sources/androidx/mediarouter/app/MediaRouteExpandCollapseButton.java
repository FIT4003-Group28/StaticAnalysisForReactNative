package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaRouteExpandCollapseButton extends xl {
    public final AnimationDrawable a;
    public final AnimationDrawable b;
    public final String c;
    public final String d;
    public boolean e;
    public View.OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r5 != 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaRouteExpandCollapseButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            r10 = 2131231939(0x7f0804c3, float:1.8079973E38)
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            android.graphics.drawable.AnimationDrawable r10 = (android.graphics.drawable.AnimationDrawable) r10
            r8.a = r10
            r0 = 2131231938(0x7f0804c2, float:1.8079971E38)
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r8.b = r0
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r2 = 1
            r3 = 2130968921(0x7f040159, float:1.754651E38)
            r4 = 0
            if (r11 == 0) goto L34
            int[] r5 = new int[r2]
            r5[r4] = r3
            android.content.res.TypedArray r11 = r9.obtainStyledAttributes(r11, r5)
            int r5 = r11.getColor(r4, r4)
            r11.recycle()
            if (r5 == 0) goto L34
            goto L51
        L34:
            android.util.TypedValue r11 = new android.util.TypedValue
            r11.<init>()
            android.content.res.Resources$Theme r5 = r9.getTheme()
            r5.resolveAttribute(r3, r11, r2)
            int r2 = r11.resourceId
            if (r2 == 0) goto L4f
            android.content.res.Resources r2 = r9.getResources()
            int r11 = r11.resourceId
            int r5 = r2.getColor(r11)
            goto L51
        L4f:
            int r5 = r11.data
        L51:
            r11 = -1
            double r2 = defpackage.kc.c(r11, r5)
            r5 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L5d
            goto L5f
        L5d:
            r11 = -570425344(0xffffffffde000000, float:-2.30584301E18)
        L5f:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r11, r2)
            r10.setColorFilter(r1)
            r0.setColorFilter(r1)
            r11 = 2131959345(0x7f131e31, float:1.9555328E38)
            java.lang.String r11 = r9.getString(r11)
            r8.c = r11
            r0 = 2131959343(0x7f131e2f, float:1.9555324E38)
            java.lang.String r9 = r9.getString(r0)
            r8.d = r9
            android.graphics.drawable.Drawable r9 = r10.getFrame(r4)
            r8.setImageDrawable(r9)
            r8.setContentDescription(r11)
            apx r9 = new apx
            r9.<init>(r8)
            super.setOnClickListener(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteExpandCollapseButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
