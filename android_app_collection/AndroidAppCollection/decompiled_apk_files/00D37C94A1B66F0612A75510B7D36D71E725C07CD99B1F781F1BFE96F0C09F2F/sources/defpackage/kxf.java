package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: kxf  reason: default package */
/* loaded from: classes3.dex */
public abstract class kxf implements ajru {
    public final Context a;
    private final aafo b;

    public kxf(Context context, aafo aafoVar) {
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final CharSequence d(CharSequence charSequence, CharSequence charSequence2, apzg apzgVar, String str) {
        if (charSequence2 == null) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        spannableString.setSpan(new kxe(this, this.b, apzgVar, str), 0, charSequence2.length(), 33);
        return charSequence == null ? spannableString : TextUtils.concat(charSequence, " ", spannableString);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
