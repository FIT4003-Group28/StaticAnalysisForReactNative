package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dfy  reason: default package */
/* loaded from: classes3.dex */
public final class dfy implements dfw {
    public static final dfw a = new dfy();
    public final Handler b;
    public Choreographer c;

    public dfy() {
        if (czu.y()) {
            this.c = Choreographer.getInstance();
            this.b = null;
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = handler;
        handler.post(new dfx(this));
    }

    @Override // defpackage.dfw
    public final void a(dfv dfvVar) {
        AtomicReference atomicReference = dfvVar.a;
        dew dewVar = czu.l;
        atomicReference.set(null);
        if (this.c == null) {
            this.b.postDelayed(dfvVar.b(), 0L);
            return;
        }
        this.c.postFrameCallback(dfvVar.a());
    }
}
