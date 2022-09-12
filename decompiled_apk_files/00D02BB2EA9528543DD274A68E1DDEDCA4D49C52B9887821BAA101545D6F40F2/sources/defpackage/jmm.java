package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: jmm  reason: default package */
/* loaded from: classes7.dex */
public class jmm implements TextView.OnEditorActionListener {
    private final jml a;

    public jmm(jml jmlVar) {
        this.a = jmlVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int action;
        if (textView.getText() == null) {
            return false;
        }
        if (i == 0 ? keyEvent == null || !((action = keyEvent.getAction()) == 0 || action == 23 || action == 66) : !(i == 6 || i == 2 || i == 3 || i == 4)) {
            return false;
        }
        this.a.a(textView.getText());
        return true;
    }
}
