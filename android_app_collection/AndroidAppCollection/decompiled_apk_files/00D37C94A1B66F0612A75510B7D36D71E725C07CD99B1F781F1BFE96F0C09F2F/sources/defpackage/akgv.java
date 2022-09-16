package defpackage;
/* compiled from: PG */
/* renamed from: akgv  reason: default package */
/* loaded from: classes.dex */
public final class akgv {
    public final yqw a;
    public final akgt b;
    public final akgx c;
    private final yjn d;
    private final yjs e;

    public akgv(yqw yqwVar, yjs yjsVar, akgt akgtVar, akgx akgxVar) {
        yqwVar.getClass();
        this.a = yqwVar;
        yjsVar.getClass();
        this.e = yjsVar;
        akgtVar.getClass();
        this.b = akgtVar;
        akgxVar.getClass();
        this.c = akgxVar;
        long d = akgtVar.d();
        akgtVar.n();
        this.d = new yjn(0, (int) d);
    }

    public final void a() {
        zep.g("OnDeviceSuggestIndexFetcher: Created fetch task.");
        this.e.e("OnDeviceSuggestIndexFetcher", this.b.d(), true, 0, null, this.d, false);
        long d = this.b.d();
        StringBuilder sb = new StringBuilder(87);
        sb.append("OnDeviceSuggestIndexFetcher: Schedule a download task to run after ");
        sb.append(d);
        zep.g(sb.toString());
    }
}
