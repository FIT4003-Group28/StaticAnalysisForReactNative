package defpackage;

import android.text.SpannableStringBuilder;
/* compiled from: PG */
/* renamed from: bjqx  reason: default package */
/* loaded from: classes3.dex */
public final class bjqx {
    public static void a(SpannableStringBuilder spannableStringBuilder, boolean z, Object obj, int i, int i2, int i3) {
        int length = z ? spannableStringBuilder.length() - i2 : i;
        if (z) {
            i2 = spannableStringBuilder.length() - i;
        }
        spannableStringBuilder.setSpan(obj, length, i2, i3);
    }
}
