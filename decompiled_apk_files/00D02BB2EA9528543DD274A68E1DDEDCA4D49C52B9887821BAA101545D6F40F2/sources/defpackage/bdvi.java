package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bdvi  reason: default package */
/* loaded from: classes3.dex */
public final class bdvi implements View.OnTouchListener {
    public final ViewPager a;
    public boolean b = true;
    public float c = 0.0f;
    private final aljd d;

    public bdvi(ViewPager viewPager, Callable<ImageView> callable, int i, int i2, Callable<Boolean> callable2, dbrn<aliy, aljd> dbrnVar) {
        this.a = viewPager;
        this.d = dbrnVar.a(new bdvg(callable, i, i2, callable2, new bdvh(this)));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.b = true;
        }
        this.d.e(motionEvent);
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return !this.b;
    }
}
