package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
/* compiled from: PG */
/* renamed from: dcav  reason: default package */
/* loaded from: classes5.dex */
final class dcav<C extends Comparable> implements Serializable {
    private static final long serialVersionUID = 0;
    private final dcau<C> a;

    public dcav(dcau<C> dcauVar) {
        this.a = dcauVar;
    }

    private Object readResolve() {
        return new dcaw(this.a);
    }
}
