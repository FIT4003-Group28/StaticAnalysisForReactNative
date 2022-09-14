package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: cvmp  reason: default package */
/* loaded from: classes5.dex */
public final class cvmp<I extends dssj, O extends dssj> {
    public I a;
    public O b;
    public Throwable c;
    private Boolean d;

    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final cvmr<I, O> a() {
        String str = this.d == null ? " isRetryableError" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cvmq(this.a, this.b, this.c, this.d.booleanValue());
    }
}
