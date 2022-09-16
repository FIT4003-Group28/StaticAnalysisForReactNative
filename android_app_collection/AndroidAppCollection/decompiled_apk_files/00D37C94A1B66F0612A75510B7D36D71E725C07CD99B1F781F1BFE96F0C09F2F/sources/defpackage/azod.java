package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: azod  reason: default package */
/* loaded from: classes2.dex */
public final class azod extends AtomicInteger implements ayrk {
    private static final long serialVersionUID = -3830916580126663321L;
    final Object a;
    final bame b;

    public azod(bame bameVar, Object obj) {
        this.b = bameVar;
        this.a = obj;
    }

    @Override // defpackage.ayrn
    public final void d() {
        lazySet(1);
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return get() != 0;
    }

    @Override // defpackage.ayrn
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.bamf
    public final void si() {
        lazySet(2);
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return i & 1;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        if (get() == 0) {
            lazySet(1);
            return this.a;
        }
        return null;
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j) && compareAndSet(0, 1)) {
            bame bameVar = this.b;
            bameVar.c(this.a);
            if (get() == 2) {
                return;
            }
            bameVar.sm();
        }
    }
}
