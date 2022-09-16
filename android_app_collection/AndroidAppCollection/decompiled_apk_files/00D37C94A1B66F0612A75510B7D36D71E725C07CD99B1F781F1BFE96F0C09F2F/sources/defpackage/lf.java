package defpackage;

import android.graphics.Paint;
import android.text.StaticLayout;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: lf  reason: default package */
/* loaded from: classes3.dex */
public class lf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence a(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static Paint.Join e(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 2 ? Paint.Join.ROUND : Paint.Join.BEVEL : Paint.Join.MITER;
    }

    public static int[] f() {
        return new int[]{1, 2, 3};
    }

    public static Paint.Cap g(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }

    public static int[] h() {
        return new int[]{1, 2, 3};
    }

    public void c(StaticLayout.Builder builder, TextView textView) {
    }

    public boolean d(TextView textView) {
        return ((Boolean) vc.d(textView, "getHorizontallyScrolling", false)).booleanValue();
    }
}
