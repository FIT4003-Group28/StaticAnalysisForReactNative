package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzsr  reason: default package */
/* loaded from: classes6.dex */
public final class dzsr<T> implements Serializable, dzss {
    private final T a;

    public dzsr(T t) {
        this.a = t;
    }

    @Override // defpackage.dzss
    public final T a() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
