package defpackage;
/* compiled from: PG */
/* renamed from: bxkr  reason: default package */
/* loaded from: classes4.dex */
public final class bxkr {
    public final bxkq a;
    public final String b;
    public final cjqm c;
    public final int d;
    public final dcdc<bxmh> e;

    public bxkr(bxkq bxkqVar, String str, cjqm cjqmVar, dcdc<bxmh> dcdcVar, int i) {
        this.a = bxkqVar;
        this.b = str;
        this.c = cjqmVar;
        this.d = i;
        this.e = dcdcVar;
    }

    public final String toString() {
        dbsb c = dbsc.c(bxkr.class);
        c.b("searchMethod", this.a);
        c.b("originalQuery", this.b);
        c.f("clickedSuggestionIndex", this.d);
        c.b("suggestionList", this.e);
        return c.toString();
    }
}
