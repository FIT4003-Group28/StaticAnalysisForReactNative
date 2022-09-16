package defpackage;
/* compiled from: PG */
/* renamed from: afbz  reason: default package */
/* loaded from: classes.dex */
public final class afbz {
    public static void a(aetv aetvVar, int i) {
        aetvVar.i("ssfr", new aest((i != 2 ? i != 3 ? "UNRECOGNIZED" : "EXO_PLAYER_STICKY_SFR_FALLBACK_APP_CYCLE" : "EXO_PLAYER_STICKY_SFR_FALLBACK_UNSPECIFIED").replaceFirst("EXO_PLAYER_STICKY_SFR_FALLBACK_", "")));
    }

    public static long b(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j + j2;
    }

    public static long c(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - j2;
    }

    public static boolean d(aelw aelwVar, snc sncVar) {
        return aelwVar != null && sncVar.d() - aelwVar.a < 30000;
    }
}
