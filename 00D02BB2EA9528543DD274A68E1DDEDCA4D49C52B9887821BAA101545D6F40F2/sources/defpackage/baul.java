package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: baul  reason: default package */
/* loaded from: classes3.dex */
final class baul implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ baup b;

    public baul(baup baupVar, View view) {
        this.b = baupVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View w = this.b.w(this.a);
        if (w != null) {
            this.b.ai.b(w);
        }
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
