package com.facebook.react.views.checkbox;

import android.content.Context;
import androidx.appcompat.widget.g;
/* loaded from: classes.dex */
class a extends g {

    /* renamed from: e  reason: collision with root package name */
    private boolean f6144e;

    public a(Context context) {
        super(context);
        this.f6144e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.f6144e = true;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f6144e) {
            this.f6144e = false;
            super.setChecked(z);
        }
    }
}
