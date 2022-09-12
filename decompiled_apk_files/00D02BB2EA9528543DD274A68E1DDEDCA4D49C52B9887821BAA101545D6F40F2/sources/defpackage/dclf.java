package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dclf  reason: default package */
/* loaded from: classes5.dex */
final class dclf<E> extends dclc<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final E a;
    private final int b;

    public dclf(E e, int i) {
        this.a = e;
        this.b = i;
        dbzb.d(i, "count");
    }

    @Override // defpackage.dcla
    public final E a() {
        return this.a;
    }

    @Override // defpackage.dcla
    public final int b() {
        return this.b;
    }
}
