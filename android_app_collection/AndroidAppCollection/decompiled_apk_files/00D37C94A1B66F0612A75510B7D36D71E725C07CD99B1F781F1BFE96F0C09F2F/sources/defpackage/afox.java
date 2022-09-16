package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
/* compiled from: PG */
/* renamed from: afox  reason: default package */
/* loaded from: classes.dex */
final class afox implements ajvp {
    final /* synthetic */ afoy a;

    public afox(afoy afoyVar) {
        this.a = afoyVar;
    }

    @Override // defpackage.ajvp
    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        int indexOf;
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        String obj = this.a.mo589getText().toString();
        int i2 = 0;
        while (i2 < obj.length() && (indexOf = obj.indexOf(spannableStringBuilder2, i2)) >= 0) {
            int length = spannableStringBuilder2.length() + indexOf;
            if (((ImageSpan[]) this.a.getEditableText().getSpans(indexOf, length, ImageSpan.class)).length == 0) {
                this.a.getEditableText().replace(indexOf, length, spannableStringBuilder);
            }
            i2 = indexOf + 1;
        }
    }
}
