package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: bwtn  reason: default package */
/* loaded from: classes4.dex */
final class bwtn implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.performClick();
            return false;
        }
        return false;
    }
}
