package defpackage;
/* compiled from: PG */
/* renamed from: btnd  reason: default package */
/* loaded from: classes4.dex */
public final class btnd<KeyT, ValueT> extends btnc<KeyT, ValueT> {
    private final dzqa<KeyT> a;
    private final long b;
    private final cqat d;

    public btnd(int i, @dzsi btmv btmvVar, eaow eaowVar, cqat cqatVar) {
        super(i, null, null, btmvVar);
        this.a = new dzqa<>();
        this.b = eaowVar.b;
        this.d = cqatVar;
    }

    private final boolean g(KeyT keyt) {
        if (!this.a.containsKey(keyt)) {
            return false;
        }
        return this.d.e() > this.a.g(keyt);
    }

    @Override // defpackage.btnc
    public final synchronized void Pz(KeyT keyt, ValueT valuet) {
        this.a.a(keyt, this.d.e() + this.b);
        super.Pz(keyt, valuet);
    }

    @Override // defpackage.btnc
    @dzsi
    public final synchronized ValueT a(KeyT keyt) {
        if (g((btnd<KeyT, ValueT>) keyt)) {
            o(keyt);
            return null;
        }
        return (ValueT) super.a(keyt);
    }

    @Override // defpackage.btnc
    protected final void d(KeyT keyt, ValueT valuet) {
        this.a.b(keyt);
    }

    @Override // defpackage.btnc
    @dzsi
    public final synchronized ValueT n(KeyT keyt) {
        if (g((btnd<KeyT, ValueT>) keyt)) {
            o(keyt);
            return null;
        }
        return (ValueT) super.n(keyt);
    }

    public btnd(eaow eaowVar, cqat cqatVar) {
        this(1, null, eaowVar, cqatVar);
    }
}
