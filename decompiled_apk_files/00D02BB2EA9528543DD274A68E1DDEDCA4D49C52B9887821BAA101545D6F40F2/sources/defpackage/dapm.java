package defpackage;

import android.text.Spannable;
/* compiled from: PG */
/* renamed from: dapm  reason: default package */
/* loaded from: classes5.dex */
public final class dapm {
    public static void a(Spannable spannable, Object obj, Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        for (Object obj2 : objArr) {
            spannable.setSpan(obj2, spanStart, spanEnd, 0);
        }
    }
}
