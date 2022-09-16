package defpackage;

import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: dcct  reason: default package */
/* loaded from: classes5.dex */
final class dcct<K extends Enum<K>, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap<K, V> a;

    public dcct(EnumMap<K, V> enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new dccu(this.a);
    }
}
