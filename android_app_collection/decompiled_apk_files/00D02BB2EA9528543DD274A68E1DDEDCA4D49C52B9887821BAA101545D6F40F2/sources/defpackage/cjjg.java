package defpackage;

import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: cjjg  reason: default package */
/* loaded from: classes4.dex */
final class cjjg implements PopupWindow.OnDismissListener {
    final /* synthetic */ View a;
    final /* synthetic */ cjkc b;
    final /* synthetic */ cjjf c;

    public cjjg(View view, cjkc cjkcVar, cjjf cjjfVar) {
        this.a = view;
        this.b = cjkcVar;
        this.c = cjjfVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        cjjc.a(this.a, false);
        this.b.a();
        Runnable f = this.c.f();
        if (f != null) {
            f.run();
        }
    }
}
