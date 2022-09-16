package defpackage;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.text.Spannable;
/* compiled from: PG */
/* renamed from: pnq  reason: default package */
/* loaded from: classes4.dex */
public final class pnq {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }

    public static void c(pne pneVar, pne pneVar2) {
        if (pneVar == pneVar2) {
            return;
        }
        if (pneVar2 != null) {
            pneVar2.f(null);
        }
        if (pneVar == null) {
            return;
        }
        pneVar.m(null);
    }

    public static void d(Spannable spannable, Object obj, int i, int i2) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, 33);
    }
}
