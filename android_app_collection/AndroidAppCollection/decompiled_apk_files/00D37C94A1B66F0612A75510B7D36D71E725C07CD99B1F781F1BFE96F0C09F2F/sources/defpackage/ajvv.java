package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.regex.Matcher;
/* compiled from: PG */
/* renamed from: ajvv  reason: default package */
/* loaded from: classes.dex */
public final class ajvv {
    private static boolean a = false;
    private static final amuk b;

    static {
        amuf f = amuk.f();
        f.h(35);
        f.h(42);
        for (int i = 0; i <= 9; i++) {
            f.h(Integer.valueOf(i + 48));
        }
        b = f.g();
    }

    public static CharSequence a(CharSequence charSequence, int i, int i2, float f, int i3) {
        Spannable spannableString;
        anu[] anuVarArr;
        if (a) {
            if (anp.b().a() == 1) {
                CharSequence d = anp.b().d(charSequence, i, i2);
                if ((f != 0.0f || i3 != 0) && (d instanceof Spannable)) {
                    Spannable spannable = (Spannable) d;
                    for (anu anuVar : (anu[]) spannable.getSpans(i, i2, anu.class)) {
                        spannable.setSpan(new akan(f, i3), spannable.getSpanStart(anuVar), spannable.getSpanEnd(anuVar), 33);
                    }
                }
                return d;
            }
        } else {
            Log.e("UnicodeEmojiUtils", "Try to use EmojiCompat before EmojiCompat.init() is called.");
        }
        if (f == 0.0f && i3 == 0) {
            return charSequence;
        }
        Matcher matcher = ajvu.a.matcher(charSequence.subSequence(i, i2));
        if (!matcher.find()) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        matcher.reset();
        while (matcher.find()) {
            spannableString.setSpan(new akan(f, i3), matcher.start() + i, matcher.end() + i, 33);
        }
        return spannableString;
    }

    public static void b(Context context) {
        aoa aoaVar = new aoa(context, new akv("Noto Color Emoji Compat", R.array.com_google_android_gms_fonts_certs));
        aoaVar.a();
        aoaVar.c(new anz(2000L));
        amuk amukVar = b;
        aoaVar.c = true;
        if (amukVar != null) {
            aoaVar.d = new int[((amxx) amukVar).c];
            amzt listIterator = amukVar.listIterator();
            int i = 0;
            while (listIterator.hasNext()) {
                aoaVar.d[i] = ((Integer) listIterator.next()).intValue();
                i++;
            }
            Arrays.sort(aoaVar.d);
        } else {
            aoaVar.d = null;
        }
        anp.f(aoaVar);
        a = true;
        anp b2 = anp.b();
        b2.i(new ajvt(b2));
    }
}
