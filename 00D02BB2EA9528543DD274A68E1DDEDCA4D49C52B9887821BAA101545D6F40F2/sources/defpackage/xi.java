package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: xi  reason: default package */
/* loaded from: classes.dex */
public final class xi {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static xi b;
    private acv c;

    public static synchronized void a() {
        synchronized (xi.class) {
            if (b == null) {
                xi xiVar = new xi();
                b = xiVar;
                xiVar.c = acv.a();
                b.c.b(new xh());
            }
        }
    }

    public static synchronized xi b() {
        xi xiVar;
        synchronized (xi.class) {
            if (b == null) {
                a();
            }
            xiVar = b;
        }
        return xiVar;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        synchronized (xi.class) {
            h = acv.h(i, mode);
        }
        return h;
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void d(Context context) {
        this.c.e(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList e(Context context, int i) {
        return this.c.f(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
