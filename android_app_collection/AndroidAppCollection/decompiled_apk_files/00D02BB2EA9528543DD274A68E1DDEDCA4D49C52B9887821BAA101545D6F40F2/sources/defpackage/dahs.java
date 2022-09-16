package defpackage;

import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahs  reason: default package */
/* loaded from: classes5.dex */
public final class dahs implements Runnable {
    final /* synthetic */ TextInputLayout a;

    public dahs(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l.performClick();
        this.a.l.jumpDrawablesToCurrentState();
    }
}
