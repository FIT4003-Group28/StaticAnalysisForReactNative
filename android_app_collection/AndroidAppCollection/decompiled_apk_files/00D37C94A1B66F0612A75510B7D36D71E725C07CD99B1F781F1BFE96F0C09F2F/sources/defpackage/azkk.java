package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azkk  reason: default package */
/* loaded from: classes2.dex */
public final class azkk extends AtomicBoolean implements aypg {
    private static final long serialVersionUID = 7514387411091976596L;
    final ayot a;
    final azkl b;

    public azkk(ayot ayotVar, azkl azklVar) {
        this.a = ayotVar;
        this.b = azklVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (compareAndSet(false, true)) {
            this.b.Y(this);
        }
    }
}
