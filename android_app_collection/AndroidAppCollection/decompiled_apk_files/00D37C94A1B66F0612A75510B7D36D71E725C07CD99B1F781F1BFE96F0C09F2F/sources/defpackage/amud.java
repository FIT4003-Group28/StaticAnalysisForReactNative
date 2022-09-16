package defpackage;

import java.io.Serializable;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: amud  reason: default package */
/* loaded from: classes.dex */
final class amud implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public amud(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new amue(this.a);
    }
}
