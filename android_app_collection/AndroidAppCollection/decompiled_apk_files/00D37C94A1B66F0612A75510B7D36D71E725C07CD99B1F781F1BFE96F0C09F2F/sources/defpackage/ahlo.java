package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: ahlo  reason: default package */
/* loaded from: classes.dex */
public final class ahlo extends LinearLayout {
    private final ahmr a;

    public ahlo(Context context, ahmr ahmrVar) {
        super(context);
        this.a = ahmrVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Canvas t = this.a.t();
        if (t != null) {
            super.dispatchDraw(t);
            this.a.x();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }
}
