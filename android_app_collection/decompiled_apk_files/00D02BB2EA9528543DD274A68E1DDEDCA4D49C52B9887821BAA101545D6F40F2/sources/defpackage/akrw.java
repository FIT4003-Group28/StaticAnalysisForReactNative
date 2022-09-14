package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akrw  reason: default package */
/* loaded from: classes.dex */
public final class akrw implements Comparable<akrw> {
    private static final Map<akry, akrw> d;
    public final String a;
    public final akry b;
    public final boolean c;

    static {
        akry[] values;
        HashMap hashMap = new HashMap(akry.values().length, 1.0f);
        for (akry akryVar : akry.values()) {
            hashMap.put(akryVar, new akrw(akryVar.J + "." + akryVar, akryVar, true));
        }
        d = dcdn.r(hashMap);
    }

    public akrw(String str, akry akryVar) {
        this(str, akryVar, false);
    }

    private akrw(String str, akry akryVar, boolean z) {
        this.a = str;
        this.b = akryVar;
        this.c = z;
    }

    public static akrw a(akry akryVar) {
        akrw akrwVar = d.get(akryVar);
        dbsk.s(akrwVar);
        return akrwVar;
    }

    public static akrw b(String str) {
        return new akrw("psm." + str, akry.PERSONALIZED_SMARTMAPS);
    }

    public static akrw c(String str) {
        return new akrw("basemap_p13n." + str, akry.BASEMAP_PERSONALIZATION);
    }

    public static akrw d(String str) {
        return new akrw("local_recs." + str, akry.LOCAL_RECOMMENDATIONS);
    }

    public static akrw e(akqi akqiVar) {
        return new akrw("hl_rap." + akqiVar.hashCode(), akry.HIGHLIGHT_RAP);
    }

    public static akrw f(dfpo dfpoVar) {
        StringBuilder sb = new StringBuilder("search_results.");
        int i = dfpoVar.bC;
        if (i == 0) {
            i = dsst.a.b(dfpoVar).c(dfpoVar);
            dfpoVar.bC = i;
        }
        sb.append(i);
        return new akrw(sb.toString(), akry.SEARCH_RESULTS);
    }

    public static akrw g(dfpo dfpoVar) {
        StringBuilder sb = new StringBuilder("categorical_search.");
        int i = dfpoVar.bC;
        if (i == 0) {
            i = dsst.a.b(dfpoVar).c(dfpoVar);
            dfpoVar.bC = i;
        }
        sb.append(i);
        return new akrw(sb.toString(), akry.CATEGORICAL_SEARCH);
    }

    public static akrw h(dfpo dfpoVar) {
        StringBuilder sb = new StringBuilder("categorical_search_results_injection.");
        int i = dfpoVar.bC;
        if (i == 0) {
            i = dsst.a.b(dfpoVar).c(dfpoVar);
            dfpoVar.bC = i;
        }
        sb.append(i);
        return new akrw(sb.toString(), akry.CATEGORICAL_SEARCH_RESULTS_INJECTION);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(akrw akrwVar) {
        return this.a.compareTo(akrwVar.a);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akrw) {
            return dbsd.a(this.a, ((akrw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
