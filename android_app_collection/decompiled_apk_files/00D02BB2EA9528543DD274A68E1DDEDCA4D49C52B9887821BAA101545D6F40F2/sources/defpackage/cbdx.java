package defpackage;

import android.text.Editable;
import android.text.style.CharacterStyle;
/* compiled from: PG */
/* renamed from: cbdx  reason: default package */
/* loaded from: classes4.dex */
class cbdx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(Editable editable) {
        CharacterStyle[] characterStyleArr;
        for (CharacterStyle characterStyle : (CharacterStyle[]) editable.getSpans(0, editable.length(), CharacterStyle.class)) {
            if ((editable.getSpanFlags(characterStyle) & 256) != 256) {
                editable.removeSpan(characterStyle);
            }
        }
    }
}
