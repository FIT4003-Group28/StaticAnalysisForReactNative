package defpackage;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahf  reason: default package */
/* loaded from: classes5.dex */
public abstract class dahf {
    final TextInputLayout k;
    final Context l;
    final CheckableImageButton m;

    public dahf(TextInputLayout textInputLayout) {
        this.k = textInputLayout;
        this.l = textInputLayout.getContext();
        this.m = textInputLayout.l;
    }

    public abstract void a();

    public void b(boolean z) {
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i) {
        return true;
    }
}
