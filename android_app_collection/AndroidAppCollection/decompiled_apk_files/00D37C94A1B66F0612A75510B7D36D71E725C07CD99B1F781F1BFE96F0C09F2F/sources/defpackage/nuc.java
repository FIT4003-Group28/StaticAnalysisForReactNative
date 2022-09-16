package defpackage;
/* compiled from: PG */
/* renamed from: nuc  reason: default package */
/* loaded from: classes3.dex */
final class nuc implements nva {
    private static final amxt a;
    private amxt b = a;

    static {
        Float valueOf = Float.valueOf(1.777f);
        a = amxt.d(valueOf, valueOf);
    }

    @Override // defpackage.nva
    public final int a() {
        return 0;
    }

    @Override // defpackage.nva
    public final amxt b(float f) {
        aqxo.p(f >= 0.0f);
        if (f == ((Float) this.b.g()).floatValue()) {
            return this.b;
        }
        if (f >= 1.777f) {
            return a;
        }
        amxt d = amxt.d(Float.valueOf(f), Float.valueOf(1.777f));
        this.b = d;
        return d;
    }
}
