package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcda  reason: default package */
/* loaded from: classes5.dex */
final class dcda implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public dcda(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return dcdc.t(this.a);
    }
}
