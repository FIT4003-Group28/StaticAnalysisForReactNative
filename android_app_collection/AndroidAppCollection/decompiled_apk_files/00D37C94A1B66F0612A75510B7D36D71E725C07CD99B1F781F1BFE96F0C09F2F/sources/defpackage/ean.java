package defpackage;
/* compiled from: PG */
/* renamed from: ean  reason: default package */
/* loaded from: classes3.dex */
public final class ean implements ambg, amhg, axom {
    public final dyo a;
    public final eaj b;

    public ean() {
    }

    public ean(dyo dyoVar, eaj eajVar) {
        this.a = dyoVar;
        this.b = eajVar;
    }

    @Override // defpackage.amhg
    public final amhh a() {
        return new amhh(amyg.a, new dyc());
    }

    @Override // defpackage.amhg
    public final amhu b() {
        return (amhu) this.b.c.get();
    }
}
