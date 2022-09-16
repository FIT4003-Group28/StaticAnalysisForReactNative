package defpackage;

import android.text.TextPaint;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kxe  reason: default package */
/* loaded from: classes3.dex */
public final class kxe extends actt {
    final /* synthetic */ kxf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxe(kxf kxfVar, aafo aafoVar, apzg apzgVar, String str) {
        super(aafoVar, apzgVar, str);
        this.a = kxfVar;
    }

    @Override // defpackage.aaft, defpackage.zae, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(zhn.d(this.a.a, R.attr.ytCallToAction));
    }
}
