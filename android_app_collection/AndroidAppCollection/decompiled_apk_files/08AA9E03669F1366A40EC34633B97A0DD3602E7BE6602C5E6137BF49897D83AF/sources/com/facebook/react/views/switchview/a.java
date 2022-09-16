package com.facebook.react.views.switchview;

import android.content.Context;
import android.support.v7.widget.ag;
/* compiled from: ReactSwitch.java */
/* loaded from: classes.dex */
class a extends ag {

    /* renamed from: b  reason: collision with root package name */
    private boolean f4065b;

    public a(Context context) {
        super(context);
        this.f4065b = true;
    }

    @Override // android.support.v7.widget.ag, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f4065b || isChecked() == z) {
            return;
        }
        this.f4065b = false;
        super.setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.f4065b = true;
    }
}
