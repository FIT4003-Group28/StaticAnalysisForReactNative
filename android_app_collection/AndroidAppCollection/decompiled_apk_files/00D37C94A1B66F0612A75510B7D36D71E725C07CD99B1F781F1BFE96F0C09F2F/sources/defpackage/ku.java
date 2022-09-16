package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: ku  reason: default package */
/* loaded from: classes3.dex */
public class ku {
    private static Field a;
    private static boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Display d(View view) {
        return view.getDisplay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view, int i) {
        view.setLayoutDirection(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(View view) {
        return view.isPaddingRelative();
    }

    public static void h(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            compoundButton.getButtonDrawable();
            return;
        }
        if (!b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field == null) {
            return;
        }
        try {
            Drawable drawable = (Drawable) field.get(compoundButton);
        } catch (IllegalAccessException unused2) {
            a = null;
        }
    }

    public void i(String str, Bundle bundle) {
        throw null;
    }

    public void j(Bundle bundle) {
        throw null;
    }
}
