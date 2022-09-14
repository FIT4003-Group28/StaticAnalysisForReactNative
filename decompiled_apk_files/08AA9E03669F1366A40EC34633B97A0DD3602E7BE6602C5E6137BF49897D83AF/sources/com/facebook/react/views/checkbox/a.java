package com.facebook.react.views.checkbox;

import android.content.Context;
import android.widget.CheckBox;
/* compiled from: ReactCheckBox.java */
/* loaded from: classes.dex */
class a extends CheckBox {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3957a;

    public a(Context context) {
        super(context);
        this.f3957a = true;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f3957a) {
            this.f3957a = false;
            super.setChecked(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.f3957a = true;
    }
}
