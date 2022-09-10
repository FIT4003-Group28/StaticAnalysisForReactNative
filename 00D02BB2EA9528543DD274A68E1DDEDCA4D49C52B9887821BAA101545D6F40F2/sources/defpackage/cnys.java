package defpackage;

import com.google.android.gms.contextmanager.ContextData;
/* compiled from: PG */
/* renamed from: cnys  reason: default package */
/* loaded from: classes5.dex */
final class cnys implements Runnable {
    final /* synthetic */ ContextData a;
    final /* synthetic */ cnyt b;

    public cnys(cnyt cnytVar, ContextData contextData) {
        this.b = cnytVar;
        this.a = contextData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cnyt cnytVar = this.b;
        ContextData contextData = this.a;
        synchronized (cnytVar.c) {
            cnyf cnyfVar = cnytVar.a;
            if (cnyfVar == null) {
                return;
            }
            cnyfVar.a(contextData);
        }
    }
}
