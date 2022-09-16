package defpackage;
/* compiled from: PG */
/* renamed from: axwy  reason: default package */
/* loaded from: classes2.dex */
public final class axwy implements axou {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public axwy(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public axwy(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static axwy a(azqb azqbVar, azqb azqbVar2) {
        return new axwy(azqbVar, azqbVar2);
    }

    public static axwy b(azqb azqbVar, azqb azqbVar2) {
        return new axwy(azqbVar, azqbVar2, 1);
    }

    public static axwy c(azqb azqbVar, azqb azqbVar2) {
        return new axwy(azqbVar, azqbVar2, 2);
    }

    public static axwy d(azqb azqbVar, azqb azqbVar2) {
        return new axwy(azqbVar, azqbVar2, 3);
    }

    public static axwy e(azqb azqbVar, azqb azqbVar2) {
        return new axwy(azqbVar, azqbVar2, 4);
    }

    public static axwy f(azqb azqbVar, azqb azqbVar2) {
        return new axwy(azqbVar, azqbVar2, 5);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.c;
        if (i == 0) {
            aadd aaddVar = (aadd) this.b.get();
            return new axwx((aacz) this.a.get());
        } else if (i == 1) {
            aadd aaddVar2 = (aadd) this.b.get();
            return new axwp((aacz) this.a.get());
        } else if (i == 2) {
            return new axxb((aacz) this.a.get(), (aadd) this.b.get());
        } else {
            if (i == 3) {
                return new axxl((aacz) this.a.get(), (aadd) this.b.get());
            }
            if (i == 4) {
                return new axxm((aacz) this.a.get(), (aadd) this.b.get());
            }
            aacz aaczVar = (aacz) this.a.get();
            return new axxj((aadd) this.b.get());
        }
    }
}
