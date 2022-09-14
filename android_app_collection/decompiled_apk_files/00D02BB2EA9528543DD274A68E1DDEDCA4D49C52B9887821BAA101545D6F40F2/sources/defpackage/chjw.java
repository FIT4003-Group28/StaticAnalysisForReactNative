package defpackage;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.animation.Interpolator;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: chjw  reason: default package */
/* loaded from: classes4.dex */
public class chjw implements chmi {
    private final CharSequence a;
    private final CharSequence b;
    private final String c;
    private boolean d;

    public chjw(Resources resources, int i, boolean z) {
        this.d = z;
        String quantityString = resources.getQuantityString(R.plurals.THANKS_PAGE_ACHIEVED_LG_POINTS, i, Integer.valueOf(i));
        this.c = quantityString;
        String f = f(i);
        if (z || i <= 0 || quantityString.replace(f, "").length() != quantityString.length() - f.length()) {
            this.a = "";
            this.b = "";
            this.d = true;
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(quantityString);
        int indexOf = quantityString.indexOf(f);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(0), indexOf, f.length() + indexOf, 33);
        this.a = spannableStringBuilder;
        int min = Math.min(40, i);
        float max = 1.0f - (40.0f / Math.max(40, i));
        float f2 = min;
        float f3 = i;
        float f4 = (max * f2) / f3;
        Interpolator a = eho.a(max, f4, 1.0f - max, 1.0f - f4);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        int i2 = 0;
        while (i2 <= min) {
            int round = i2 == min ? i : Math.round((a.getInterpolation(i2 / f2) * f3) + 0.0f);
            if (round > 0) {
                int length = spannableStringBuilder2.length();
                String f5 = f(round);
                spannableStringBuilder2.append((CharSequence) this.c.replace(f, f5));
                int i3 = length + indexOf;
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(0), length, i3, 33);
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(0), i3 + f5.length(), spannableStringBuilder2.length(), 33);
            }
            if (i2 < min) {
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            i2++;
        }
        this.b = spannableStringBuilder2;
    }

    private static String f(int i) {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(i));
    }

    @Override // defpackage.chmi
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.chmi
    public void b() {
        this.d = true;
    }

    @Override // defpackage.chmi
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.chmi
    public CharSequence d() {
        return this.a;
    }

    @Override // defpackage.chmi
    public CharSequence e() {
        return this.b;
    }
}
