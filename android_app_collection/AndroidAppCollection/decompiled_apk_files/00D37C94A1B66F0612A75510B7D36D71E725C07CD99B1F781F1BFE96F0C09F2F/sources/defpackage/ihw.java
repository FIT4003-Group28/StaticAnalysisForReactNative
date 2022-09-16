package defpackage;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ihw  reason: default package */
/* loaded from: classes3.dex */
public final class ihw implements SpanWatcher {
    final /* synthetic */ ihz a;

    public ihw(ihz ihzVar) {
        this.a = ihzVar;
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        ihz ihzVar = this.a;
        if (ihzVar.l != null) {
            Editable text = ihzVar.b.getText();
            int spanStart = text.getSpanStart(this.a.l);
            int spanEnd = text.getSpanEnd(this.a.l);
            int selectionStart = this.a.b.getSelectionStart();
            int selectionEnd = this.a.b.getSelectionEnd();
            if (selectionStart >= spanStart && selectionEnd >= spanStart && selectionStart <= spanEnd && selectionEnd <= spanEnd) {
                return;
            }
            this.a.b();
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }
}
