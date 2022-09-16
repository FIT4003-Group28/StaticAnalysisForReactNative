package defpackage;

import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: dccv  reason: default package */
/* loaded from: classes5.dex */
final class dccv<E extends Enum<E>> implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet<E> a;

    public dccv(EnumSet<E> enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new dccw(this.a.clone());
    }
}
