package defpackage;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: alpy  reason: default package */
/* loaded from: classes.dex */
public abstract class alpy {
    final TextInputLayout k;
    final Context l;
    final CheckableImageButton m;
    final int n;

    public alpy(TextInputLayout textInputLayout, int i) {
        this.k = textInputLayout;
        this.l = textInputLayout.getContext();
        this.m = textInputLayout.l;
        this.n = i;
    }

    public abstract void b();

    public void c(boolean z) {
    }

    public boolean f(int i) {
        return true;
    }

    public boolean i() {
        return false;
    }
}
