package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
import org.spongycastle.i18n.TextBundle;
/* compiled from: RCTRawText.java */
/* loaded from: classes.dex */
final class y extends r {

    /* renamed from: d  reason: collision with root package name */
    private String f3434d;

    @Override // com.facebook.react.flat.r
    protected void b(SpannableStringBuilder spannableStringBuilder) {
        if (this.f3434d != null) {
            spannableStringBuilder.append((CharSequence) this.f3434d);
        }
    }

    @Override // com.facebook.react.flat.r
    protected void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, boolean z) {
        spannableStringBuilder.setSpan(this, i, i2, 17);
    }

    @com.facebook.react.uimanager.a.a(a = TextBundle.TEXT_ENTRY)
    public void setText(String str) {
        this.f3434d = str;
        a(true);
    }
}
