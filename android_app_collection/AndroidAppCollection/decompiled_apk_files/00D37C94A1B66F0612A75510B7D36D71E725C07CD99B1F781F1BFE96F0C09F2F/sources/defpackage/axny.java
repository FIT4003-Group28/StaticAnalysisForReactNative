package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: axny  reason: default package */
/* loaded from: classes2.dex */
final class axny extends ac {
    public final eam a;

    public axny(eam eamVar) {
        this.a = eamVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ac
    public final void b() {
        axoa a = ((axnz) awwc.u(this.a, axnz.class)).a();
        if (awwc.a == null) {
            awwc.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == awwc.a) {
            for (axnn axnnVar : a.a) {
                axnnVar.a();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
