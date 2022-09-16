package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: yzo  reason: default package */
/* loaded from: classes4.dex */
public final class yzo {
    public final View a;
    private GradientDrawable b;

    public yzo(View view) {
        this.a = view;
    }

    public final void a(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            zag.o(this.a, false);
            return;
        }
        if (this.b == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.b = gradientDrawable;
            this.a.setBackground(gradientDrawable);
        }
        if (length == 1) {
            iArr = new int[]{iArr[0], iArr[0]};
        }
        this.b.setColors(iArr);
        zag.o(this.a, true);
    }
}
