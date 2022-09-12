package defpackage;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwy  reason: default package */
/* loaded from: classes5.dex */
public class cwy {
    private final btvo a;

    public cwy(btvo btvoVar) {
        this.a = btvoVar;
    }

    public static final void a(SpannableStringBuilder spannableStringBuilder, Resources resources, boolean z) {
        int color;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) resources.getString(R.string.AD));
        if (z) {
            spannableStringBuilder.append(" · ");
        }
        int length2 = spannableStringBuilder.length();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.stark_badge_text_size);
        if (gct.a(resources.getConfiguration())) {
            color = resources.getColor(R.color.qu_night_black_alpha_87);
        } else {
            color = resources.getColor(R.color.stark_badge_foreground);
        }
        spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), length, length2, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), length, length2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), length, length2, 33);
    }

    public static final void c(SpannableStringBuilder spannableStringBuilder, Resources resources) {
        a(spannableStringBuilder, resources, true);
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, Resources resources) {
        String string = resources.getString(R.string.AD);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string);
        int length2 = spannableStringBuilder.length();
        int a = dujv.a(this.a.getAdsParameters().b);
        if (a == 0) {
            a = 1;
        }
        int c = acpd.c(a, resources);
        int color = resources.getColor(R.color.badge_foreground);
        spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), length, length2, 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(resources.getDimensionPixelSize(R.dimen.default_badge_text_size)), length, length2, 33);
        if (a == 4) {
            spannableStringBuilder.setSpan(new cjxn(string, color, c, c), length, length2, 33);
        } else {
            spannableStringBuilder.setSpan(new cjxm(string, c, color, 0.1f, 0.2f), length, length2, 33);
        }
    }
}
