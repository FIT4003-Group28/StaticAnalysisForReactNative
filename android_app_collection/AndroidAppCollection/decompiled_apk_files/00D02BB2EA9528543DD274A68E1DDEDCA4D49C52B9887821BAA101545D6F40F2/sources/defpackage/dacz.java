package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
/* compiled from: PG */
/* renamed from: dacz  reason: default package */
/* loaded from: classes.dex */
public final class dacz {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int b(Context context, int i, String str) {
        TypedValue a = a(context, i);
        if (a == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
        }
        return a.data;
    }

    public static int c(View view, int i) {
        return b(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static boolean d(Context context, int i, boolean z) {
        TypedValue a = a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }
}
