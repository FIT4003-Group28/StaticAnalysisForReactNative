package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: fii  reason: default package */
/* loaded from: classes3.dex */
final class fii implements fin {
    public WeakReference a;
    private final fio b;
    private final AtomicBoolean c;

    public fii(fio fioVar, WeakReference weakReference, AtomicBoolean atomicBoolean) {
        this.b = fioVar;
        this.a = weakReference;
        this.c = atomicBoolean;
    }

    @Override // defpackage.fin
    public final void a(boolean z) {
        WeakReference weakReference = this.a;
        cyv cyvVar = weakReference == null ? null : (cyv) weakReference.get();
        if (cyvVar != null && this.c.compareAndSet(!z, z)) {
            if (z) {
                this.b.a(true);
                AtomicBoolean atomicBoolean = this.c;
                int i = fie.w;
                if (cyvVar.f == null) {
                    return;
                }
                cyvVar.g(new ddk(0, atomicBoolean), "updateState:InlinePlayback.updatePlayerTrackingViewVisibilityState");
                return;
            }
            AtomicBoolean atomicBoolean2 = this.c;
            int i2 = fie.w;
            if (cyvVar.f == null) {
                return;
            }
            cyvVar.h(new ddk(0, atomicBoolean2), "updateState:InlinePlayback.updatePlayerTrackingViewVisibilityState");
        }
    }

    @Override // defpackage.fin
    public final void b(mcr mcrVar) {
        fin finVar = this.b.a;
        if (finVar != null) {
            finVar.b(mcrVar);
        }
    }
}
