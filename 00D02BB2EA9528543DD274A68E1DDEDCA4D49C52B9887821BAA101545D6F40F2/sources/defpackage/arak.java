package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arak  reason: default package */
/* loaded from: classes2.dex */
final class arak implements View.OnTouchListener {
    final /* synthetic */ aral a;

    public arak(aral aralVar) {
        this.a = aralVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.h();
        if (motionEvent.getAction() != 1) {
            return view.onTouchEvent(motionEvent);
        }
        gga ggaVar = this.a.a;
        int i = ardr.a;
        View findViewById = ggaVar.findViewById(R.id.tutorial_blue_dot);
        if (findViewById != null) {
            Rect rect = new Rect();
            findViewById.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.a.d.a().q();
                this.a.e.i(cjtd.a(dtxk.G));
            }
        }
        this.a.b.a().a();
        if (csld.a(this.a.a)) {
            csld.b(this.a.a);
        }
        view.performClick();
        return view.onTouchEvent(motionEvent);
    }
}
