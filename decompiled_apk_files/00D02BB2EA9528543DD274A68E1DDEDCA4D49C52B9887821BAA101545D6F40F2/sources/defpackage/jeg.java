package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.apps.gmm.base.views.core.GmmProgressBar;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: jeg  reason: default package */
/* loaded from: classes7.dex */
public final class jeg extends Handler {
    final WeakReference<GmmProgressBar> a;

    public jeg(WeakReference<GmmProgressBar> weakReference) {
        super(Looper.getMainLooper());
        this.a = weakReference;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        GmmProgressBar gmmProgressBar = this.a.get();
        if (gmmProgressBar == null) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            gmmProgressBar.b = SystemClock.elapsedRealtime();
            gmmProgressBar.setVisibility(0);
        } else if (i != 2) {
        } else {
            gmmProgressBar.b = -1L;
            gmmProgressBar.setVisibility(4);
            gmmProgressBar.c();
        }
    }
}
