package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjxu  reason: default package */
/* loaded from: classes3.dex */
public class bjxu implements bjwh {
    private final jic a;
    private final CharSequence b;

    public bjxu(gga ggaVar, ilo iloVar, djag djagVar, String str, boolean z) {
        this.a = bjgr.e(djagVar);
        String a = bjgr.a(ggaVar, iloVar, djagVar);
        boolean z2 = false;
        dbsk.a(a.length() != 0);
        dbsk.a(str.length() != 0 ? true : z2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean b = bvox.b(ggaVar);
        if (b) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) "  •  ").append((CharSequence) a);
        } else {
            spannableStringBuilder.append((CharSequence) a);
            spannableStringBuilder.append((CharSequence) "  •  ").append((CharSequence) str);
        }
        bjqx.a(spannableStringBuilder, b, new TextAppearanceSpan(ggaVar, 2132018142), 0, a.length(), 512);
        bjqx.a(spannableStringBuilder, b, new ForegroundColorSpan(ggaVar.getResources().getColor(R.color.mod_daynight_grey900)), 0, a.length(), 256);
        bjqx.a(spannableStringBuilder, b, new TextAppearanceSpan(ggaVar, 2132018113), a.length(), spannableStringBuilder.length(), 512);
        bjqx.a(spannableStringBuilder, b, new ForegroundColorSpan(ggaVar.getResources().getColor(true != z ? R.color.mod_daynight_grey700 : R.color.mod_daynight_grey650)), a.length(), spannableStringBuilder.length(), 256);
        this.b = spannableStringBuilder;
    }

    @Override // defpackage.bjwh
    public jic a() {
        return this.a;
    }

    @Override // defpackage.bjwh
    public CharSequence b() {
        return this.b;
    }
}
