package defpackage;

import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: daht  reason: default package */
/* loaded from: classes5.dex */
public final class daht implements Runnable {
    final /* synthetic */ TextInputLayout a;

    public daht(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.requestLayout();
    }
}
