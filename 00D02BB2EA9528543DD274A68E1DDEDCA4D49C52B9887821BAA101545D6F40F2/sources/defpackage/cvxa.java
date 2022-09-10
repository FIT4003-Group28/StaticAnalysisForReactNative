package defpackage;

import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cvxa  reason: default package */
/* loaded from: classes5.dex */
public class cvxa {
    final /* synthetic */ cvxe a;

    public cvxa(cvxe cvxeVar) {
        this.a = cvxeVar;
    }

    public void a() {
    }

    public void b(int i) {
        this.a.c(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(TextView textView, int i) {
        CharSequence text = textView.getText();
        textView.setText("");
        this.a.c(i);
        textView.setText(text);
    }
}
