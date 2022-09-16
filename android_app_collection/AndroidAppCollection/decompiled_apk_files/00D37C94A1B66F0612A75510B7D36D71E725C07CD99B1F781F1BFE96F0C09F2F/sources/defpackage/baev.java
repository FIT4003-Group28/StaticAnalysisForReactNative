package defpackage;

import J.N;
import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.CronetUrlRequestContext;
/* compiled from: PG */
/* renamed from: baev  reason: default package */
/* loaded from: classes2.dex */
public final class baev implements Runnable {
    final /* synthetic */ CronetUrlRequestContext a;

    public baev(CronetUrlRequestContext cronetUrlRequestContext) {
        this.a = cronetUrlRequestContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetLibraryLoader.b();
        synchronized (this.a.c) {
            CronetUrlRequestContext cronetUrlRequestContext = this.a;
            N.M6Dz0nZ5(cronetUrlRequestContext.d, cronetUrlRequestContext);
        }
    }
}
