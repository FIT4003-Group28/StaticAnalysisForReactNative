package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
/* compiled from: FlatTextShadowNode.java */
/* loaded from: classes.dex */
abstract class r extends q {

    /* renamed from: d  reason: collision with root package name */
    private int f3413d;
    private int e;

    protected abstract void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, boolean z);

    protected abstract void b(SpannableStringBuilder spannableStringBuilder);

    boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return false;
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        com.facebook.react.uimanager.x parent = getParent();
        if (parent instanceof r) {
            ((r) parent).a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(SpannableStringBuilder spannableStringBuilder) {
        this.f3413d = spannableStringBuilder.length();
        b(spannableStringBuilder);
        this.e = spannableStringBuilder.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(SpannableStringBuilder spannableStringBuilder, boolean z) {
        if (this.f3413d != this.e || f()) {
            a(spannableStringBuilder, this.f3413d, this.e, z);
        }
    }
}
