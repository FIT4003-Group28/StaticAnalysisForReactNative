package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aafr  reason: default package */
/* loaded from: classes2.dex */
public final class aafr {
    private static final Map<dmti, akqn> a = new EnumMap(dcdn.l(dmti.WORLD_ENCODING_LAT_LNG_E7, new akqu(), dmti.WORLD_ENCODING_LAT_LNG_DOUBLE, new akqt()));

    @dzsi
    public static akqn a(dmni dmniVar) {
        dmti b = dmti.b(dmniVar.b);
        if (b == null) {
            b = dmti.WORLD_ENCODING_UNKNOWN;
        }
        return a.get(b);
    }
}
