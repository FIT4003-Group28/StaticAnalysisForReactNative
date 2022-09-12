package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: blyq  reason: default package */
/* loaded from: classes3.dex */
final class blyq implements View.OnTouchListener {
    final GestureDetector a;
    final /* synthetic */ blyv b;

    public blyq(blyv blyvVar) {
        this.b = blyvVar;
        this.a = new GestureDetector(blyvVar.e, new blyp(this), new Handler(Looper.getMainLooper()));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent) || this.b.x().onTouch(view, motionEvent);
    }
}
