package defpackage;

import android.app.Dialog;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fhz  reason: default package */
/* loaded from: classes3.dex */
final class fhz extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ fib a;

    public fhz(fib fibVar) {
        this.a = fibVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        fib fibVar = this.a;
        float f = ((int) ((fibVar.c * scaleFactor) * 100.0f)) / 100.0f;
        fibVar.c = f;
        fibVar.c = Math.max(1.0f, Math.min(f, 10.0f));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        int[] iArr;
        fib fibVar = this.a;
        if (!fibVar.d) {
            fibVar.l = false;
            if (fibVar.m) {
                fibVar.d = true;
                FrameLayout frameLayout = new FrameLayout(fibVar.getContext());
                if (fibVar.n) {
                    fibVar.getLocationInWindow(new int[2]);
                    ImageView a = fibVar.a();
                    a.setBackground(fibVar.getBackground());
                    a.setX(iArr[0]);
                    a.setY(iArr[1]);
                    frameLayout.addView(a, new FrameLayout.LayoutParams(fibVar.getWidth(), fibVar.getHeight()));
                    if (fibVar.s == 2) {
                        ImageView a2 = fibVar.a();
                        a2.setBackgroundColor(fibVar.getResources().getColor(R.color.zoom_overlay_translucent_black));
                        a2.setX(iArr[0]);
                        a2.setY(iArr[1]);
                        frameLayout.addView(a2, new FrameLayout.LayoutParams(fibVar.getWidth(), fibVar.getHeight()));
                    }
                }
                fibVar.g = fibVar.a();
                fibVar.g.setImageDrawable(fibVar.getDrawable());
                frameLayout.addView(fibVar.g, new FrameLayout.LayoutParams(fibVar.getWidth(), fibVar.getHeight()));
                fibVar.f = new Dialog(fibVar.getContext(), 16973841);
                int i = fibVar.s;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && fibVar.f.getWindow() != null) {
                    fibVar.f.getWindow().setBackgroundDrawableResource(R.color.zoom_overlay_translucent_black);
                }
                fibVar.f.addContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                fibVar.f.show();
                fib fibVar2 = this.a;
                if (fibVar2.i != null && fibVar2.j != null) {
                    tcq a3 = tcs.a();
                    tda tdaVar = fibVar2.h;
                    if (tdaVar != null) {
                        a3.f = tdaVar.r;
                    }
                    fibVar2.i.b(fibVar2.j, a3.a()).Q();
                }
            }
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
