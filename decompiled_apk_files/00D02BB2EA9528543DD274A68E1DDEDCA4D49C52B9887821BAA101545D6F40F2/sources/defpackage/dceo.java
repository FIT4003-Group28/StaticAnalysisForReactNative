package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dceo  reason: default package */
/* loaded from: classes5.dex */
final class dceo implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public dceo(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return dcep.M(this.a);
    }
}
