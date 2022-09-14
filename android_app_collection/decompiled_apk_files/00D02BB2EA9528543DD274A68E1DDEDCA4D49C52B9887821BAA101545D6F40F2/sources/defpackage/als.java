package defpackage;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: als  reason: default package */
/* loaded from: classes2.dex */
public final class als {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public als(PrecomputedText.Params params) {
        this.a = params.getTextPaint();
        this.b = params.getTextDirection();
        this.c = params.getBreakStrategy();
        this.d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof als)) {
            return false;
        }
        als alsVar = (als) obj;
        return (Build.VERSION.SDK_INT < 23 || (this.c == alsVar.c && this.d == alsVar.d)) && this.a.getTextSize() == alsVar.a.getTextSize() && this.a.getTextScaleX() == alsVar.a.getTextScaleX() && this.a.getTextSkewX() == alsVar.a.getTextSkewX() && this.a.getLetterSpacing() == alsVar.a.getLetterSpacing() && TextUtils.equals(this.a.getFontFeatureSettings(), alsVar.a.getFontFeatureSettings()) && this.a.getFlags() == alsVar.a.getFlags() && (Build.VERSION.SDK_INT < 24 ? this.a.getTextLocale().equals(alsVar.a.getTextLocale()) : this.a.getTextLocales().equals(alsVar.a.getTextLocales())) && (this.a.getTypeface() != null ? this.a.getTypeface().equals(alsVar.a.getTypeface()) : alsVar.a.getTypeface() == null) && this.b == alsVar.b;
    }

    public final int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }
        return Objects.hash(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("textSize=" + this.a.getTextSize());
        sb.append(", textScaleX=" + this.a.getTextScaleX());
        sb.append(", textSkewX=" + this.a.getTextSkewX());
        sb.append(", letterSpacing=" + this.a.getLetterSpacing());
        sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
        if (Build.VERSION.SDK_INT >= 24) {
            sb.append(", textLocale=" + this.a.getTextLocales());
        } else {
            sb.append(", textLocale=" + this.a.getTextLocale());
        }
        sb.append(", typeface=" + this.a.getTypeface());
        if (Build.VERSION.SDK_INT >= 26) {
            sb.append(", variationSettings=" + this.a.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.b);
        sb.append(", breakStrategy=" + this.c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }

    public als(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.a = textPaint;
        this.b = textDirectionHeuristic;
        this.c = i;
        this.d = i2;
    }
}
