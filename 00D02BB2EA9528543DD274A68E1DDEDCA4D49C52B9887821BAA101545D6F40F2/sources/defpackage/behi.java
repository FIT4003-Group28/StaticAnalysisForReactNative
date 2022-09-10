package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: behi  reason: default package */
/* loaded from: classes3.dex */
public class behi implements behh {
    private final Context a;
    private final String b;
    private final CharSequence c;
    private final afha d;

    public behi(Context context, dnoj dnojVar, afha afhaVar) {
        this.a = context;
        this.d = afhaVar;
        dnpq dnpqVar = dnojVar.b;
        dnpqVar = dnpqVar == null ? dnpq.g : dnpqVar;
        String str = dnpqVar.c;
        this.b = str;
        String str2 = dnojVar.a;
        String str3 = dnpqVar.d;
        String str4 = dnojVar.c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!dbsj.d(str2)) {
            spannableStringBuilder.append((CharSequence) c(context, str2, R.style.SmallTertiaryText));
        }
        str3 = true == dbsj.d(str3) ? str : str3;
        if (!dbsj.d(str3)) {
            spannableStringBuilder.append((CharSequence) c(context, str3, true != dbsj.d(str) ? R.style.SmallBlueText : R.style.SmallTertiaryText));
        }
        if (!dbsj.d(str4)) {
            spannableStringBuilder.append((CharSequence) c(context, str4, R.style.SmallTertiaryText));
        }
        this.c = spannableStringBuilder;
    }

    private static SpannableStringBuilder c(Context context, CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, i), 0, charSequence.length(), 33);
        return spannableStringBuilder;
    }

    @Override // defpackage.behh
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.behh
    public cqkl b() {
        this.d.k(this.a, this.b, 1);
        return cqkl.a;
    }
}
