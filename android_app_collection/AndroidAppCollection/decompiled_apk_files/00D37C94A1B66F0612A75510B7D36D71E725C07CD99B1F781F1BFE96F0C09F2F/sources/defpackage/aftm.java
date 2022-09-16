package defpackage;
/* compiled from: PG */
/* renamed from: aftm  reason: default package */
/* loaded from: classes.dex */
public final class aftm extends aftk {
    private final aftk a;
    private final afzq b;

    public aftm(snc sncVar, aftk aftkVar) {
        this.a = aftkVar;
        this.b = new afzq(sncVar);
    }

    @Override // defpackage.aftk
    /* renamed from: a */
    public final afsk d(yrb yrbVar) {
        h(yrbVar);
        return new afsk((byte[]) this.a.f(yrbVar.d), this.b.a(yrbVar.c.a("cache-control")));
    }
}
