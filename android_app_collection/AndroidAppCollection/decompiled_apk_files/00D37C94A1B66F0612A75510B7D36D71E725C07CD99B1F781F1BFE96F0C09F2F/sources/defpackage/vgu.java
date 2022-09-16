package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: vgu  reason: default package */
/* loaded from: classes4.dex */
public final class vgu {
    public static Drawable a;

    public static boolean a(vgt vgtVar) {
        return "true".equals(viv.a(vgtVar.a, "false"));
    }

    public static int b(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
