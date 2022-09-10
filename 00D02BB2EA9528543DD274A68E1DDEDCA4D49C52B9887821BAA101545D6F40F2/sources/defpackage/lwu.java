package defpackage;

import android.os.RemoteException;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
/* compiled from: PG */
/* renamed from: lwu  reason: default package */
/* loaded from: classes7.dex */
final class lwu {
    final /* synthetic */ lww a;

    public lwu(lww lwwVar) {
        this.a = lwwVar;
    }

    public final void a(NavigationSummary navigationSummary) {
        bvrj.BACKGROUND_THREADPOOL.c();
        try {
            lww lwwVar = this.a;
            synchronized (lwwVar) {
                if (lwwVar.b()) {
                    cnu cnuVar = lwwVar.d;
                    if (cnuVar != null) {
                        cnuVar.e(navigationSummary);
                    }
                }
            }
            this.a.h.incrementAndGet();
        } catch (RemoteException unused) {
        }
    }
}
