package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bdvl  reason: default package */
/* loaded from: classes3.dex */
public final class bdvl implements View.OnTouchListener {
    public boolean a;
    private final ImageView b;
    private final bdvg c;
    private final aljd d;
    private final float[] e = new float[9];

    public bdvl(final ImageView imageView, int i, int i2, Callable<Boolean> callable, dbrn<aliy, aljd> dbrnVar) {
        this.b = imageView;
        bdvg bdvgVar = new bdvg(new Callable(imageView) { // from class: bdvj
            private final ImageView a;

            {
                this.a = imageView;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a;
            }
        }, i, i2, callable, new bdvk(this));
        this.c = bdvgVar;
        this.d = dbrnVar.a(bdvgVar);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        this.a = false;
        this.d.e(motionEvent);
        if (!this.a) {
            this.b.getImageMatrix().getValues(this.e);
            if (this.e[0] > 1.0f || this.c.a || motionEvent.getActionMasked() == 0) {
                z = true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return z;
    }
}
