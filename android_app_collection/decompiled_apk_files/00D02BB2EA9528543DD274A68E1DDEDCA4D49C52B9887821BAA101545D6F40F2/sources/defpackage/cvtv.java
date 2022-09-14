package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: cvtv  reason: default package */
/* loaded from: classes5.dex */
public final class cvtv<T extends dssj> {
    public T a;
    public Throwable b;
    private Boolean c;

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final cvty<T> a() {
        String str = this.c == null ? " isRetryableError" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cvtw(this.a, this.b, this.c.booleanValue());
    }
}
