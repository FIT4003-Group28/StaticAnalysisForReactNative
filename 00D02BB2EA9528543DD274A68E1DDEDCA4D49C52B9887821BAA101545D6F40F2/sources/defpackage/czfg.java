package defpackage;
/* compiled from: PG */
/* renamed from: czfg  reason: default package */
/* loaded from: classes5.dex */
final class czfg implements czfi {
    private final cyph a;
    private final czfd b;
    private final dcdc<cywi> c;
    private final dcde<Character, cywi> d;

    public czfg(cyph cyphVar, czfd czfdVar, dcdc<cywi> dcdcVar, dcde<Character, cywi> dcdeVar) {
        this.a = cyphVar;
        this.b = czfdVar;
        this.c = dcdcVar;
        this.d = dcdeVar;
    }

    @Override // defpackage.czfi
    public final dcdc<cywi> a(@dzsi String str) {
        String trim = dbsj.e(str).trim();
        if (dbsj.d(trim)) {
            return this.c;
        }
        Character c = this.b.c(trim);
        dcdc<cywi> h = this.d.h(c);
        if (c.equals(czfd.a)) {
            this.a.c(23, cyor.a);
        }
        this.a.d(21, (int) ((h.size() * 100.0f) / this.c.size()), cyor.a);
        return h;
    }
}
