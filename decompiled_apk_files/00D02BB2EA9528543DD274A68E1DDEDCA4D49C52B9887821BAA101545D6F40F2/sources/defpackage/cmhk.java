package defpackage;

import android.text.Spannable;
/* compiled from: PG */
/* renamed from: cmhk  reason: default package */
/* loaded from: classes5.dex */
public final class cmhk {
    public static void a(Spannable spannable, Object obj, int i, int i2) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, 33);
    }
}
