package defpackage;

import android.graphics.Rect;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: he  reason: default package */
/* loaded from: classes6.dex */
public final class he implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ Rect b;

    public he(View view, Rect rect) {
        this.a = view;
        this.b = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = hh.c;
        View view = this.a;
        if (view != null) {
            hr.u(view, this.b);
        }
    }
}
