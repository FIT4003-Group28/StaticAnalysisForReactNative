package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: afnj  reason: default package */
/* loaded from: classes.dex */
public abstract class afnj extends ViewGroup {
    private int WL;

    public afnj(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(Runnable runnable, Runnable runnable2, int i) {
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (i > 0) {
            postDelayed(runnable2, i);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable2.run();
        } else {
            post(runnable2);
        }
    }

    public final void g(int i) {
        int i2 = i | this.WL;
        this.WL = i2;
        if (i2 != 0) {
            M(new afni(this), new afni(this, 1), 0);
        }
    }

    public final void rO(int i) {
        int i2 = (i ^ (-1)) & this.WL;
        this.WL = i2;
        if (i2 == 0) {
            M(new afni(this, 1), new afni(this), 0);
        }
    }
}
