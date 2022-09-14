package com.facebook.react.views.switchview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.r0;
/* loaded from: classes.dex */
class a extends r0 {
    private boolean Q;
    private Integer R;
    private Integer S;

    public a(Context context) {
        super(context);
        this.Q = true;
        this.R = null;
        this.S = null;
    }

    private void b(boolean z) {
        if (this.S == null && this.R == null) {
            return;
        }
        b(z ? this.S : this.R);
    }

    void a(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void a(Integer num) {
        a(super.getThumbDrawable(), num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            b(z);
        }
        this.Q = true;
    }

    public void b(Integer num) {
        a(super.getTrackDrawable(), num);
    }

    public void c(Integer num) {
        if (num == this.R) {
            return;
        }
        this.R = num;
        if (isChecked()) {
            return;
        }
        b(this.R);
    }

    public void d(Integer num) {
        if (num == this.S) {
            return;
        }
        this.S = num;
        if (!isChecked()) {
            return;
        }
        b(this.S);
    }

    @Override // androidx.appcompat.widget.r0, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.Q || isChecked() == z) {
            super.setChecked(isChecked());
            return;
        }
        this.Q = false;
        super.setChecked(z);
        b(z);
    }
}
