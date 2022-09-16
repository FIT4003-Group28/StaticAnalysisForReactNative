package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: igc  reason: default package */
/* loaded from: classes3.dex */
public final class igc implements afzf {
    public final afzf a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public igc(afzf afzfVar) {
        this.a = afzfVar;
    }

    private final void d(Runnable runnable) {
        if (!this.b.get() && this.b.compareAndSet(false, true)) {
            runnable.run();
        }
    }

    @Override // defpackage.cez
    public final void kV(final cff cffVar) {
        d(new Runnable() { // from class: iga
            @Override // java.lang.Runnable
            public final void run() {
                igc igcVar = igc.this;
                igcVar.a.kV(cffVar);
            }
        });
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final void lG(final Object obj) {
        d(new Runnable() { // from class: igb
            @Override // java.lang.Runnable
            public final void run() {
                igc igcVar = igc.this;
                igcVar.a.lG(obj);
            }
        });
    }
}
