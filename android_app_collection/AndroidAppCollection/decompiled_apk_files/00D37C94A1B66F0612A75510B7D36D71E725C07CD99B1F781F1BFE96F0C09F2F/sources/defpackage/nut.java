package defpackage;
/* compiled from: PG */
/* renamed from: nut  reason: default package */
/* loaded from: classes3.dex */
public final class nut implements nva {
    private static final amxt a;
    private static final amxt b;
    private amxt c = a;

    static {
        Float valueOf = Float.valueOf(1.777f);
        a = amxt.d(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.25f);
        b = amxt.d(valueOf2, valueOf2);
    }

    @Override // defpackage.nva
    public final int a() {
        return 0;
    }

    @Override // defpackage.nva
    public final amxt b(float f) {
        aqxo.p(f >= 0.0f);
        if (ggs.f(f, ((Float) this.c.g()).floatValue())) {
            return this.c;
        }
        if (ggs.h(f)) {
            amxt amxtVar = a;
            this.c = amxtVar;
            return amxtVar;
        } else if (ggs.g(f, 1.25f)) {
            amxt amxtVar2 = b;
            this.c = amxtVar2;
            return amxtVar2;
        } else {
            Float valueOf = Float.valueOf(f);
            amxt d = amxt.d(valueOf, valueOf);
            this.c = d;
            return d;
        }
    }
}
