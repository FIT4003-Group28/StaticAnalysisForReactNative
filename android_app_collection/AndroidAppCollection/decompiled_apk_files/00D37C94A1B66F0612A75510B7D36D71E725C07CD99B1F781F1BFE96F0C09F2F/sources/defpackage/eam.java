package defpackage;
/* compiled from: PG */
/* renamed from: eam  reason: default package */
/* loaded from: classes3.dex */
public final class eam implements axnu, axnz, axom {
    private final dyo a;
    private azqb b;
    private final eam c;

    public eam(dyo dyoVar) {
        this.c = this;
        this.a = dyoVar;
        this.b = axot.b(new ecp(1));
    }

    @Override // defpackage.axnz
    public final axoa a() {
        return (axoa) this.b.get();
    }

    @Override // defpackage.axnu
    public final dwo b() {
        return new dwo(this.a, this.c);
    }

    public eam() {
    }
}
