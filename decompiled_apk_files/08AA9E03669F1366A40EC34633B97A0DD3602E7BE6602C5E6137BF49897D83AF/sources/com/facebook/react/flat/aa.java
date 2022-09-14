package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
import com.facebook.react.bridge.am;
/* compiled from: RCTTextInlineImage.java */
/* loaded from: classes.dex */
class aa extends r {

    /* renamed from: d  reason: collision with root package name */
    private u f3372d = new u();

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public void setStyleWidth(float f) {
        super.setStyleWidth(f);
        if (this.f3372d.c() != f) {
            h().a(f);
            a(true);
        }
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public void setStyleHeight(float f) {
        super.setStyleHeight(f);
        if (this.f3372d.d() != f) {
            h().b(f);
            a(true);
        }
    }

    @Override // com.facebook.react.flat.r
    protected void b(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append("I");
    }

    @Override // com.facebook.react.flat.r
    protected void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, boolean z) {
        this.f3372d.e();
        spannableStringBuilder.setSpan(this.f3372d, i, i2, 17);
    }

    @com.facebook.react.uimanager.a.a(a = "src")
    public void setSource(am amVar) {
        com.facebook.imagepipeline.n.b bVar = null;
        String string = (amVar == null || amVar.size() == 0) ? null : amVar.c(0).getString("uri");
        com.facebook.react.views.b.a aVar = string == null ? null : new com.facebook.react.views.b.a(getThemedContext(), string);
        u h = h();
        if (aVar != null) {
            bVar = com.facebook.imagepipeline.n.c.a(aVar.b()).n();
        }
        h.a(bVar);
    }

    private u h() {
        if (this.f3372d.f()) {
            this.f3372d = this.f3372d.b();
        }
        return this.f3372d;
    }
}
