package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcll  reason: default package */
/* loaded from: classes5.dex */
final class dcll<B> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Map<Class<? extends B>, B> a;

    public dcll(Map<Class<? extends B>, B> map) {
        this.a = map;
    }

    Object readResolve() {
        return dclm.a(this.a);
    }
}
