package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amui  reason: default package */
/* loaded from: classes.dex */
final class amui implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public amui(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return amuk.p(this.a);
    }
}
