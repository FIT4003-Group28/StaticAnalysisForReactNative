package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.contextmanager.ContextData;
/* compiled from: PG */
/* renamed from: cnyt  reason: default package */
/* loaded from: classes5.dex */
public final class cnyt extends cnze {
    public static final cnyr d = new cnyr();
    public cnyf a;
    public Handler b;
    public final Object c = new Object();

    public cnyt(cnyf cnyfVar, Looper looper) {
        this.a = cnyfVar;
        cnwc.a(looper);
        this.b = new cojb(looper);
    }

    @Override // defpackage.cnzf
    public final void b(ContextData contextData) {
        synchronized (this.c) {
            Handler handler = this.b;
            if (handler != null && this.a != null) {
                handler.post(new cnys(this, contextData));
            }
        }
    }
}
