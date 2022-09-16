package defpackage;
/* compiled from: PG */
/* renamed from: nvb  reason: default package */
/* loaded from: classes3.dex */
final class nvb implements nva {
    private static final amxt a;
    private static final amxt b;
    private final boolean c;
    private amxt d = a;

    static {
        Float valueOf = Float.valueOf(1.777f);
        a = amxt.d(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.333f);
        b = amxt.d(valueOf2, valueOf2);
    }

    public nvb(aacz aaczVar) {
        asxj asxjVar = aaczVar.b().e;
        this.c = (asxjVar == null ? asxj.a : asxjVar).cp;
    }

    @Override // defpackage.nva
    public final int a() {
        return 0;
    }

    @Override // defpackage.nva
    public final amxt b(float f) {
        aqxo.p(f >= 0.0f);
        if (f == ((Float) this.d.g()).floatValue()) {
            return this.d;
        }
        if (f >= 1.777f) {
            this.d = a;
        } else if (f >= 1.333f) {
            Float valueOf = Float.valueOf(f);
            this.d = amxt.d(valueOf, valueOf);
        } else {
            this.d = this.c ? amxt.d(Float.valueOf(f), Float.valueOf(1.333f)) : b;
        }
        return this.d;
    }
}
