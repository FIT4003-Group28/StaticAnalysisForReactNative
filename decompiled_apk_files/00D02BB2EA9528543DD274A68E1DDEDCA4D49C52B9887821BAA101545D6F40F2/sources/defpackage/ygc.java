package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
/* compiled from: PG */
/* renamed from: ygc  reason: default package */
/* loaded from: classes7.dex */
final class ygc extends TouchDelegate {
    final /* synthetic */ View a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygc(Rect rect, View view, View view2) {
        super(rect, view);
        this.a = view2;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.setLocation(motionEvent.getX() - this.a.getLeft(), motionEvent.getY() - this.a.getTop());
        return this.a.dispatchTouchEvent(motionEvent);
    }
}
