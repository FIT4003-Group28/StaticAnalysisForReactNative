package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final List a;

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.size() > 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                bfp bfpVar = (bfp) it.next();
                BitmapDrawable bitmapDrawable = bfpVar.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (!bfpVar.l) {
                    float f = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - bfpVar.j)) / ((float) bfpVar.e)));
                    if (true == bfpVar.k) {
                        f = max;
                    }
                    Interpolator interpolator = bfpVar.d;
                    float interpolation = interpolator == null ? f : interpolator.getInterpolation(f);
                    int i = (int) (bfpVar.g * interpolation);
                    bfpVar.c.top = bfpVar.f.top + i;
                    bfpVar.c.bottom = bfpVar.f.bottom + i;
                    float f2 = bfpVar.h;
                    float f3 = f2 + ((bfpVar.i - f2) * interpolation);
                    bfpVar.b = f3;
                    BitmapDrawable bitmapDrawable2 = bfpVar.a;
                    if (bitmapDrawable2 != null) {
                        Rect rect = bfpVar.c;
                        bitmapDrawable2.setAlpha((int) (f3 * 255.0f));
                        bfpVar.a.setBounds(bfpVar.c);
                    }
                    if (bfpVar.k && f >= 1.0f) {
                        bfpVar.l = true;
                        bex bexVar = bfpVar.m;
                        if (bexVar != null) {
                            bexVar.a();
                        }
                    }
                    if (bfpVar.l) {
                    }
                }
                it.remove();
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
    }
}
