package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    TextInputLayout f8215a;

    /* renamed from: b  reason: collision with root package name */
    Context f8216b;

    /* renamed from: c  reason: collision with root package name */
    CheckableImageButton f8217c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(TextInputLayout textInputLayout) {
        this.f8215a = textInputLayout;
        this.f8216b = textInputLayout.getContext();
        this.f8217c = textInputLayout.getEndIconView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return false;
    }
}
