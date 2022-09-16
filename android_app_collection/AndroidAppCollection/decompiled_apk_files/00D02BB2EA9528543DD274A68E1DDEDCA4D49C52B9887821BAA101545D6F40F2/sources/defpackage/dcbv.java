package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcbv  reason: default package */
/* loaded from: classes5.dex */
public final class dcbv<R, C, V> extends dcoc<R, C, V> {
    private static final long serialVersionUID = 0;

    public dcbv(Map<R, Map<C, V>> map, dcbu<C, V> dcbuVar) {
        super(map);
    }

    public static <R, C, V> dcbv<R, C, V> j() {
        return new dcbv<>(new LinkedHashMap(), new dcbu());
    }
}
