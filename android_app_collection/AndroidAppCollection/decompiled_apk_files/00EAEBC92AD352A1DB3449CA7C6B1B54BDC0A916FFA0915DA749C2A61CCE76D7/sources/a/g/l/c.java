package a.g.l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public class c implements Spannable {

    /* renamed from: b  reason: collision with root package name */
    private final Spannable f292b;

    /* renamed from: c  reason: collision with root package name */
    private final a f293c;

    /* renamed from: d  reason: collision with root package name */
    private final PrecomputedText f294d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f295a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f296b;

        /* renamed from: c  reason: collision with root package name */
        private final int f297c;

        /* renamed from: d  reason: collision with root package name */
        private final int f298d;

        /* renamed from: a.g.l.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0011a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f299a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f300b;

            /* renamed from: c  reason: collision with root package name */
            private int f301c;

            /* renamed from: d  reason: collision with root package name */
            private int f302d;

            public C0011a(TextPaint textPaint) {
                this.f299a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f301c = 1;
                    this.f302d = 1;
                } else {
                    this.f302d = 0;
                    this.f301c = 0;
                }
                this.f300b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public C0011a a(int i) {
                this.f301c = i;
                return this;
            }

            public C0011a a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f300b = textDirectionHeuristic;
                return this;
            }

            public a a() {
                return new a(this.f299a, this.f300b, this.f301c, this.f302d);
            }

            public C0011a b(int i) {
                this.f302d = i;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f295a = params.getTextPaint();
            this.f296b = params.getTextDirection();
            this.f297c = params.getBreakStrategy();
            this.f298d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f295a = textPaint;
            this.f296b = textDirectionHeuristic;
            this.f297c = i;
            this.f298d = i2;
        }

        public int a() {
            return this.f297c;
        }

        public boolean a(a aVar) {
            if ((Build.VERSION.SDK_INT < 23 || (this.f297c == aVar.a() && this.f298d == aVar.b())) && this.f295a.getTextSize() == aVar.d().getTextSize() && this.f295a.getTextScaleX() == aVar.d().getTextScaleX() && this.f295a.getTextSkewX() == aVar.d().getTextSkewX()) {
                if ((Build.VERSION.SDK_INT >= 21 && (this.f295a.getLetterSpacing() != aVar.d().getLetterSpacing() || !TextUtils.equals(this.f295a.getFontFeatureSettings(), aVar.d().getFontFeatureSettings()))) || this.f295a.getFlags() != aVar.d().getFlags()) {
                    return false;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    if (!this.f295a.getTextLocales().equals(aVar.d().getTextLocales())) {
                        return false;
                    }
                } else if (i >= 17 && !this.f295a.getTextLocale().equals(aVar.d().getTextLocale())) {
                    return false;
                }
                return this.f295a.getTypeface() == null ? aVar.d().getTypeface() == null : this.f295a.getTypeface().equals(aVar.d().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f298d;
        }

        public TextDirectionHeuristic c() {
            return this.f296b;
        }

        public TextPaint d() {
            return this.f295a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f296b == aVar.c();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return androidx.core.util.c.a(Float.valueOf(this.f295a.getTextSize()), Float.valueOf(this.f295a.getTextScaleX()), Float.valueOf(this.f295a.getTextSkewX()), Float.valueOf(this.f295a.getLetterSpacing()), Integer.valueOf(this.f295a.getFlags()), this.f295a.getTextLocales(), this.f295a.getTypeface(), Boolean.valueOf(this.f295a.isElegantTextHeight()), this.f296b, Integer.valueOf(this.f297c), Integer.valueOf(this.f298d));
            }
            if (i >= 21) {
                return androidx.core.util.c.a(Float.valueOf(this.f295a.getTextSize()), Float.valueOf(this.f295a.getTextScaleX()), Float.valueOf(this.f295a.getTextSkewX()), Float.valueOf(this.f295a.getLetterSpacing()), Integer.valueOf(this.f295a.getFlags()), this.f295a.getTextLocale(), this.f295a.getTypeface(), Boolean.valueOf(this.f295a.isElegantTextHeight()), this.f296b, Integer.valueOf(this.f297c), Integer.valueOf(this.f298d));
            }
            if (i < 18 && i < 17) {
                return androidx.core.util.c.a(Float.valueOf(this.f295a.getTextSize()), Float.valueOf(this.f295a.getTextScaleX()), Float.valueOf(this.f295a.getTextSkewX()), Integer.valueOf(this.f295a.getFlags()), this.f295a.getTypeface(), this.f296b, Integer.valueOf(this.f297c), Integer.valueOf(this.f298d));
            }
            return androidx.core.util.c.a(Float.valueOf(this.f295a.getTextSize()), Float.valueOf(this.f295a.getTextScaleX()), Float.valueOf(this.f295a.getTextSkewX()), Integer.valueOf(this.f295a.getFlags()), this.f295a.getTextLocale(), this.f295a.getTypeface(), this.f296b, Integer.valueOf(this.f297c), Integer.valueOf(this.f298d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a.g.l.c.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f293c;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f292b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f292b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f292b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f292b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f292b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f294d.getSpans(i, i2, cls) : (T[]) this.f292b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f292b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f292b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f294d.removeSpan(obj);
                return;
            } else {
                this.f292b.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f294d.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.f292b.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f292b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f292b.toString();
    }
}
