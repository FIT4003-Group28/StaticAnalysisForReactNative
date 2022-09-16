package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ScaleXSpan;
import android.text.style.TextAppearanceSpan;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: abrh  reason: default package */
/* loaded from: classes.dex */
public final class abrh {
    public abrh() {
    }

    public abrh(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        azqbVar.getClass();
        azqbVar2.getClass();
        azqbVar3.getClass();
        azqbVar4.getClass();
    }

    public static void a(Context context, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i) {
        b(context, spannableStringBuilder, charSequence, i, false);
    }

    public static void b(Context context, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i, boolean z) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        if (i != 0) {
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, i), length, charSequence.length() + length, (true != z ? 0 : 65536) | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, float f) {
        char[] cArr = new char[1];
        Arrays.fill(cArr, 0, 1, ' ');
        spannableStringBuilder.append((CharSequence) new String(cArr));
        if (f != 0.0f) {
            d(spannableStringBuilder, 1, new ScaleXSpan(f));
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(obj, length - i, length, 33);
    }

    public static ankt e(ankt anktVar, ampg ampgVar) {
        return anii.h(anktVar, ampgVar, anjk.a);
    }
}
