package defpackage;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: wzh  reason: default package */
/* loaded from: classes4.dex */
final class wzh implements View.OnTouchListener {
    final /* synthetic */ float a;
    final /* synthetic */ wzi b;

    public wzh(wzi wziVar, float f) {
        this.b = wziVar;
        this.a = f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.b.d((int) (motionEvent.getX() / this.a), (int) (motionEvent.getY() / this.a));
            return false;
        }
        return false;
    }
}
