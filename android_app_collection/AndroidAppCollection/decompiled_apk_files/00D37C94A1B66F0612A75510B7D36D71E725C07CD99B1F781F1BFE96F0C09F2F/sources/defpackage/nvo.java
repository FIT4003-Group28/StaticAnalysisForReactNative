package defpackage;

import android.widget.TextView;
/* compiled from: PG */
/* renamed from: nvo  reason: default package */
/* loaded from: classes3.dex */
public final class nvo {
    public final TextView a;
    public final Runnable b;
    public boolean c = false;
    public CharSequence d;

    public nvo(final TextView textView) {
        this.a = textView;
        textView.addOnAttachStateChangeListener(new nvn(this));
        this.b = new Runnable() { // from class: nvm
            @Override // java.lang.Runnable
            public final void run() {
                nvo nvoVar = nvo.this;
                textView.setText(nvoVar.d);
                nvoVar.c = false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.removeCallbacks(this.b);
        this.a.setText(this.d);
        this.c = false;
    }

    public final void b(CharSequence charSequence) {
        this.d = charSequence;
        if (!this.c) {
            this.a.setText(charSequence);
        }
    }
}
