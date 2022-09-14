package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class i extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    private int f8152b;

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f8152b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f8152b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }
}
