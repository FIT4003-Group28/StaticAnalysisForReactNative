package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.text.style.TextAppearanceSpan;
/* compiled from: PG */
/* renamed from: npq  reason: default package */
/* loaded from: classes7.dex */
public final class npq {
    public static SpannableString a(CharSequence charSequence, ColorStateList colorStateList) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, -1, colorStateList, null), 0, charSequence.length(), 0);
        return spannableString;
    }

    public static SpannableString b(Drawable drawable) {
        SpannableString spannableString = new SpannableString("*");
        spannableString.setSpan(d(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()), 0, 1, 0);
        return spannableString;
    }

    public static SpannableString c(Drawable drawable, int i, int i2) {
        SpannableString spannableString = new SpannableString("*");
        spannableString.setSpan(d(drawable, i, i2), 0, 1, 0);
        return spannableString;
    }

    private static ImageSpan d(Drawable drawable, int i, int i2) {
        drawable.setBounds(0, 0, i, i2);
        return new ImageSpan(drawable, 1);
    }
}
