package defpackage;
/* compiled from: PG */
/* renamed from: yrz  reason: default package */
/* loaded from: classes4.dex */
public final class yrz implements axou {
    private final azqb a;
    private final azqb b;

    public yrz(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static yrh b(apfr apfrVar, azqb azqbVar) {
        yrh yrhVar;
        if (apfrVar.k) {
            yrhVar = (yrh) azqbVar.get();
        } else {
            yrhVar = yrh.a;
        }
        axzl.o(yrhVar);
        return yrhVar;
    }

    public static yrz c(azqb azqbVar, azqb azqbVar2) {
        return new yrz(azqbVar, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final yrh get() {
        return b(((yrx) this.a).get(), this.b);
    }
}
