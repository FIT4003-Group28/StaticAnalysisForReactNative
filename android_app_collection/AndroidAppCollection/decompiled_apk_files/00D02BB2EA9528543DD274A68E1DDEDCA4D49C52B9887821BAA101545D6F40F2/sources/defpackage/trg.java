package defpackage;
/* compiled from: PG */
/* renamed from: trg  reason: default package */
/* loaded from: classes7.dex */
class trg implements trb {
    private final String a;
    private final dcdc<trc> b;
    @dzsi
    private final String c;
    @dzsi
    private final cqtd d;
    private final boolean e;

    public trg(String str, Iterable<trc> iterable, @dzsi String str2, @dzsi cqtd cqtdVar, boolean z) {
        this.a = str;
        this.b = dcdc.q(iterable);
        this.c = str2;
        this.d = cqtdVar;
        this.e = z;
    }

    @Override // defpackage.trb
    public dcdc<cqix<?>> a() {
        if (this.e) {
            return dcdc.q(dcft.o(this.b, tre.a));
        }
        return dcdc.q(dcft.o(this.b, trf.a));
    }

    @Override // defpackage.trb
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.trb
    @dzsi
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.trb
    @dzsi
    public cqtd d() {
        return this.d;
    }
}
