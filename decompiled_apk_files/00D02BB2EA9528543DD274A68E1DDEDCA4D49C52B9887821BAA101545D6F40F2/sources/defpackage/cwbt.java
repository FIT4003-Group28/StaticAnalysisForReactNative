package defpackage;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cwbt  reason: default package */
/* loaded from: classes5.dex */
abstract class cwbt {
    public final Context a;
    public final cwbn b;
    public ViewGroup c;
    public View d;
    public ViewGroup e;

    public cwbt(Context context, cwbn cwbnVar) {
        this.a = context;
        this.b = cwbnVar;
    }

    public static Shape b() {
        return new RoundRectShape(null, null, null);
    }

    public final PaintDrawable c(Shape shape) {
        PaintDrawable paintDrawable = new PaintDrawable(new cwiy(this.a).a(cwix.COLOR_HAIRLINE));
        paintDrawable.setShape(shape);
        paintDrawable.setIntrinsicWidth(-1);
        paintDrawable.setIntrinsicHeight(-1);
        return paintDrawable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(m mVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(m mVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f(ViewGroup viewGroup);
}
