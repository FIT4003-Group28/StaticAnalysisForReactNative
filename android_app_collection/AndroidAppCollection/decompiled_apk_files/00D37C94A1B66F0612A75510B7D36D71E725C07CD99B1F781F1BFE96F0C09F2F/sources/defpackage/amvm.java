package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amvm  reason: default package */
/* loaded from: classes.dex */
final class amvm implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public amvm(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return amvn.q(this.a);
    }
}
