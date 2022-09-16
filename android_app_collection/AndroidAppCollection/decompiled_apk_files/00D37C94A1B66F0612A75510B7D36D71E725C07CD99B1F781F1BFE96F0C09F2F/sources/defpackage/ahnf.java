package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: ahnf  reason: default package */
/* loaded from: classes.dex */
final class ahnf extends TextView {
    private final ahmr a;

    public ahnf(Context context, ahmr ahmrVar) {
        super(context);
        this.a = ahmrVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas t = this.a.t();
        if (t != null) {
            super.onDraw(t);
            this.a.x();
        }
    }
}
