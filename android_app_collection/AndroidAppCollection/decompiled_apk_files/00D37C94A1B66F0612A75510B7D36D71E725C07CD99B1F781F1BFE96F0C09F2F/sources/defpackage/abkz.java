package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
/* compiled from: PG */
/* renamed from: abkz  reason: default package */
/* loaded from: classes.dex */
public final class abkz implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.contains("\n") && !charSequence2.contains("\r")) {
                return null;
            }
            return charSequence2.replace("\n", "").replace("\r", "");
        }
        return null;
    }
}
