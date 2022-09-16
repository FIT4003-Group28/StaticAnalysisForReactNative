package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aijb  reason: default package */
/* loaded from: classes.dex */
public final class aijb {
    private static final Map a = new EnumMap(aija.class);

    static {
        aija[] values;
        for (aija aijaVar : aija.values()) {
            a.put(aijaVar, anay.n(aijaVar.c));
        }
    }

    public static void a(aija aijaVar, String str, Object... objArr) {
        anay anayVar = (anay) a.get(aijaVar);
        if (anayVar != null) {
            ((anav) ((anav) anayVar.g()).i("com/google/android/libraries/youtube/player/internal/utils/PlayerLog", "w", 92, "PlayerLog.java")).w(str, objArr);
        }
    }
}
