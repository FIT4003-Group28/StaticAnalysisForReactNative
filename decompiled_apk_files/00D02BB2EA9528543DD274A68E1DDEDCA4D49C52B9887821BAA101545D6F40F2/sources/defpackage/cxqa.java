package defpackage;

import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: cxqa  reason: default package */
/* loaded from: classes5.dex */
final class cxqa implements PopupWindow.OnDismissListener {
    final /* synthetic */ cxqh a;

    public cxqa(cxqh cxqhVar) {
        this.a = cxqhVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.b.performClick();
        cxoy cxoyVar = this.a.o;
        if (cxoyVar == null || !cxoyVar.a.e.hasFocus()) {
            return;
        }
        cxoyVar.a.e.setCursorVisible(true);
    }
}
