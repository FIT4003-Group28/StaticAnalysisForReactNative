package defpackage;

import android.widget.EditText;
/* compiled from: PG */
/* renamed from: abml  reason: default package */
/* loaded from: classes.dex */
final class abml implements Runnable {
    final /* synthetic */ abmo a;

    public abml(abmo abmoVar) {
        this.a = abmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText = this.a.j;
        if (editText != null) {
            editText.setSelection(editText.length());
        }
    }
}
