package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
/* compiled from: PG */
/* renamed from: agwr  reason: default package */
/* loaded from: classes2.dex */
public final class agwr extends FrameLayout {
    private static final cqkv d = new agws(cqlg.a);
    @dzsi
    private Drawable a;
    private final RectF b;
    private final Path c;

    public agwr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RectF();
        this.c = new Path();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(agwr.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(cqtd cqtdVar) {
        return cqjv.i(agwq.a, cqtdVar, d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        CardView cardView;
        int i = 0;
        int i2 = 0;
        View view = this;
        while (true) {
            if (!(view instanceof CardView)) {
                i += view.getLeft();
                i2 += view.getTop();
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    cardView = null;
                    break;
                }
                view = (View) parent;
            } else {
                cardView = (CardView) view;
                break;
            }
        }
        int save = canvas.save();
        if (cardView != null) {
            this.b.set(cardView.getPaddingLeft() - cardView.Sy(), cardView.getPaddingTop() - cardView.c(), cardView.getWidth() - (cardView.getPaddingRight() - cardView.b()), cardView.getHeight() - (cardView.getPaddingBottom() - cardView.d()));
            this.b.offset(-i, -i2);
            float e = cardView.e();
            this.c.rewind();
            this.c.addRoundRect(this.b, e, e, Path.Direction.CCW);
            canvas.clipPath(this.c);
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.a.draw(canvas);
        }
        if (!getClipChildren()) {
            canvas.restoreToCount(save);
        }
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void setCardViewClippedBackground(@dzsi Drawable drawable) {
        this.a = drawable;
    }
}
