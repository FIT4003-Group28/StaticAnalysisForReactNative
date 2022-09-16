package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ckih  reason: default package */
/* loaded from: classes.dex */
public final class ckih {
    public static final ckgz a = new ckgz("PassiveAssistLoadFromDiskStatus", ckgy.PASSIVE_ASSIST);
    public static final ckgz b = new ckgz("PassiveAssistCacheWipeCount", ckgy.PASSIVE_ASSIST);
    public static final ckgz c = new ckgz("PassiveAssistPerContentTypeCacheWipeCount", ckgy.PASSIVE_ASSIST);
    public static final ckhf d = new ckhf("PassiveAssistCacheFileReadTime", ckgy.PASSIVE_ASSIST);
    public static final ckhf e = new ckhf("PassiveAssistEnforcementPassTime", ckgy.PASSIVE_ASSIST);
    public static final ckha f = new ckha("PassiveAssistCacheTotalSizeBytes", ckgy.PASSIVE_ASSIST, ckde.e);
    public static final ckgz g = new ckgz("PassiveAssistCacheTotalItemCount", ckgy.PASSIVE_ASSIST);
    public static final ckgu h = new ckgu("PassiveAssistRequestBasedInvalidationCount", ckgy.PASSIVE_ASSIST);
    public static final Map<awvv<?>, ckgz> i;
    public static final Map<awvv<?>, ckgt> j;

    static {
        awvv<?>[] a2;
        awvv<?>[] a3;
        dcdg p = dcdn.p();
        for (awvv<?> awvvVar : awvv.a()) {
            p.f(awvvVar, new ckgz(String.format("PassiveAssistCacheItemCount%s", a(awvvVar)), ckgy.PASSIVE_ASSIST));
        }
        i = p.b();
        dcdg p2 = dcdn.p();
        for (awvv<?> awvvVar2 : awvv.a()) {
            p2.f(awvvVar2, new ckgt(String.format("PassiveAssistCacheIsInitiallyDisplayable%s", a(awvvVar2)), ckgy.PASSIVE_ASSIST));
        }
        j = p2.b();
    }

    private static String a(awvv<?> awvvVar) {
        return dbqg.e.b(dbqg.UPPER_CAMEL, awvvVar.b());
    }
}
