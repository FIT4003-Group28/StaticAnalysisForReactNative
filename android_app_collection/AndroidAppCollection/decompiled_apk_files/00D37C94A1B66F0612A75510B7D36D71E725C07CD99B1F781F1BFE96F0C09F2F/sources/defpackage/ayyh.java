package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayyh  reason: default package */
/* loaded from: classes2.dex */
public final class ayyh extends AtomicLong implements bamf {
    private static final long serialVersionUID = 2845000326761540265L;
    final bame a;
    final ayyi b;
    long c;

    public ayyh(bame bameVar, ayyi ayyiVar) {
        this.a = bameVar;
        this.b = ayyiVar;
    }

    public final boolean a() {
        return get() == Long.MIN_VALUE;
    }

    @Override // defpackage.bamf
    public final void si() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.b.g(this);
            this.b.d();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        ayno.b(this, j);
        this.b.d();
    }
}
