package defpackage;

import android.content.Context;
import android.graphics.Canvas;
/* compiled from: PG */
/* renamed from: ahqn  reason: default package */
/* loaded from: classes.dex */
final class ahqn extends aiba {
    private final ahmr a;

    public ahqn(Context context, ahmr ahmrVar) {
        super(context);
        this.a = ahmrVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas t = this.a.t();
        if (t != null) {
            super.dispatchDraw(t);
            this.a.x();
        }
    }
}
