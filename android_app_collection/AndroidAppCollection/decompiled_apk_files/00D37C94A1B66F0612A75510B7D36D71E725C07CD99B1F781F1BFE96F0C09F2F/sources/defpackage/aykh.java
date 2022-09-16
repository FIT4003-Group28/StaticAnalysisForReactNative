package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aykh  reason: default package */
/* loaded from: classes2.dex */
public final class aykh extends ayah {
    public final ayag a;
    final /* synthetic */ ayki b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public aykh(ayki aykiVar, ayag ayagVar) {
        this.b = aykiVar;
        this.a = ayagVar;
    }

    @Override // defpackage.ayah
    public final ayac a() {
        if (this.c.compareAndSet(false, true)) {
            ((ayiv) this.b.b).c.o.execute(new aykg(this));
        }
        return ayac.a;
    }
}
