package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aboo  reason: default package */
/* loaded from: classes.dex */
public final class aboo implements TextView.OnEditorActionListener {
    final /* synthetic */ abop a;

    public aboo(abop abopVar) {
        this.a = abopVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 4 || (keyEvent != null && keyEvent.getAction() == 0)) {
            this.a.C();
            return true;
        }
        return false;
    }
}
