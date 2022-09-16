package defpackage;

import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: alqm  reason: default package */
/* loaded from: classes.dex */
public final class alqm implements Runnable {
    final /* synthetic */ TextInputLayout a;
    private final /* synthetic */ int b;

    public alqm(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public alqm(TextInputLayout textInputLayout, int i) {
        this.b = i;
        this.a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a.requestLayout();
            return;
        }
        this.a.l.performClick();
        this.a.l.jumpDrawablesToCurrentState();
    }
}
