package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayye  reason: default package */
/* loaded from: classes2.dex */
public final class ayye extends AtomicLong implements bamf {
    private static final long serialVersionUID = -4453897557930727610L;
    final bame a;
    volatile ayyf b;
    long c;

    public ayye(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bamf
    public final void si() {
        ayyf ayyfVar;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (ayyfVar = this.b) == null) {
            return;
        }
        ayyfVar.g(this);
        ayyfVar.d();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.b(this, j);
            ayyf ayyfVar = this.b;
            if (ayyfVar == null) {
                return;
            }
            ayyfVar.d();
        }
    }
}
