package defpackage;

import org.chromium.net.impl.CronetUrlRequest;
/* compiled from: PG */
/* renamed from: baeq  reason: default package */
/* loaded from: classes2.dex */
public final class baeq implements Runnable {
    final /* synthetic */ bagp a;
    final /* synthetic */ String b;
    final /* synthetic */ CronetUrlRequest c;

    public baeq(CronetUrlRequest cronetUrlRequest, bagp bagpVar, String str) {
        this.c = cronetUrlRequest;
        this.a = bagpVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b();
        synchronized (this.c.c) {
            if (this.c.j()) {
                return;
            }
            this.c.b = true;
            try {
                CronetUrlRequest cronetUrlRequest = this.c;
                cronetUrlRequest.d.onRedirectReceived(cronetUrlRequest, this.a, this.b);
            } catch (Exception e) {
                this.c.e(e);
            }
        }
    }
}
