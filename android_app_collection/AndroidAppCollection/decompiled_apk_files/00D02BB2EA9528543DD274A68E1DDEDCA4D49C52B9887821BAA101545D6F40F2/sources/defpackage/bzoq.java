package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzoq  reason: default package */
/* loaded from: classes4.dex */
public class bzoq extends bzoo {
    public bzoq(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        int i;
        boolean z;
        Rect rect;
        Rect rect2;
        if (this.d) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f.size()) {
                    i = 0;
                    z = false;
                    break;
                }
                bzon bzonVar = this.f.get(i2);
                if ((bzonVar.a instanceof ExpandingScrollView) && (rect2 = bzonVar.b) != null) {
                    i = rect2.top;
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                Paint paint = new Paint();
                paint.setColor(getContext().getResources().getColor(R.color.qu_tutorial_background));
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), i, paint);
            } else {
                canvas.drawColor(getContext().getResources().getColor(R.color.qu_tutorial_background));
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                bzon bzonVar2 = this.f.get(i3);
                if (!(bzonVar2.a instanceof ExpandingScrollView) && (rect = bzonVar2.b) != null) {
                    canvas.translate(rect.left, rect.top);
                    bzonVar2.a.draw(canvas);
                    canvas.translate(-rect.left, -rect.top);
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public bzoq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public bzoq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
