package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.TypedValue;
/* compiled from: PG */
/* renamed from: npv  reason: default package */
/* loaded from: classes7.dex */
public final class npv {
    @Deprecated
    public static Boolean a() {
        Boolean bool = new Boolean(false);
        cqny.e(bool, new npu());
        return bool;
    }

    public static boolean c(int i, int i2, Context context) {
        return !b(i, i2, context);
    }

    public static boolean d(Context context) {
        while (!(context instanceof nqn)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((nqn) context).a.h();
    }

    @Deprecated
    public static Boolean e(int i) {
        return cqjv.u(f(i));
    }

    @Deprecated
    public static Boolean f(int i) {
        Boolean bool = new Boolean(false);
        cqny.e(bool, new npt(i));
        return bool;
    }

    public static boolean b(int i, int i2, Context context) {
        return (i2 == 1 ? cqsz.c() : cqsz.d()).a(context) < TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }
}
