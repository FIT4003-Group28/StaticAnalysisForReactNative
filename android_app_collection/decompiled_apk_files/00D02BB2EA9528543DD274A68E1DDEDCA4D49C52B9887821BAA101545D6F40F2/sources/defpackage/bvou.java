package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
/* compiled from: PG */
/* renamed from: bvou  reason: default package */
/* loaded from: classes4.dex */
public abstract class bvou implements View.OnLayoutChangeListener {
    private final Handler a;
    private final Runnable b;

    public bvou(View view) {
        bvot bvotVar = new bvot(this, view);
        this.b = bvotVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = handler;
        handler.postDelayed(bvotVar, 1000L);
        view.addOnLayoutChangeListener(this);
    }

    public abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        a();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(this.b);
        }
        view.removeOnLayoutChangeListener(this);
        a();
    }
}
