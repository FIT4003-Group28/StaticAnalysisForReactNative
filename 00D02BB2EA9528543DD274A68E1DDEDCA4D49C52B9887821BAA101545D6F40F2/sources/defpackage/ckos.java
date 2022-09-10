package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
/* compiled from: PG */
/* renamed from: ckos  reason: default package */
/* loaded from: classes4.dex */
public final class ckos {
    public static dafk a(View view, CharSequence charSequence, int i) {
        dafk n = dafk.n(view, charSequence, i);
        c(n, view.getContext());
        return n;
    }

    public static dafk b(View view, int i, int i2) {
        dafk o = dafk.o(view, i, i2);
        c(o, view.getContext());
        return o;
    }

    private static void c(dafk dafkVar, Context context) {
        if (!cpv.a.e(context) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        dafkVar.g = -2;
    }
}
