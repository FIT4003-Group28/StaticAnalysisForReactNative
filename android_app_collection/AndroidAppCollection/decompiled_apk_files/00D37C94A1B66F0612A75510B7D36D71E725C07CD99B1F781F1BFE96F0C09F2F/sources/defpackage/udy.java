package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: udy  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class udy {
    public static Drawable a(Drawable drawable, int i) {
        Drawable l = iy.l(drawable);
        l.mutate().setTint(i);
        return l;
    }

    public static Drawable b(Context context, int i, int i2) {
        return a(po.b(context, i), i2);
    }

    public static ThreadFactory c() {
        anlk anlkVar = new anlk();
        anlkVar.d("OneGoogle #%d");
        anlkVar.c(false);
        aqxo.v(true, "Thread priority (%s) must be >= %s", 5, 1);
        aqxo.v(true, "Thread priority (%s) must be <= %s", 5, 10);
        anlkVar.a = 5;
        anlkVar.e(pgw.d);
        return anlk.b(anlkVar);
    }
}
