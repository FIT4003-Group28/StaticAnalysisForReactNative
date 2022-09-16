package defpackage;
/* compiled from: PG */
/* renamed from: adyl  reason: default package */
/* loaded from: classes.dex */
public final class adyl implements axou {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public adyl(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public adyl(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public static adyl a(azqb azqbVar, azqb azqbVar2) {
        return new adyl(azqbVar, azqbVar2);
    }

    public static afjm c(aant aantVar, afle afleVar) {
        return aflf.a(afleVar, aantVar, adyd.a, false, 2);
    }

    public static afjm d(afle afleVar, aant aantVar) {
        return aflf.a(afleVar, aantVar, adyd.b, true, 2);
    }

    public static adyl e(azqb azqbVar, azqb azqbVar2) {
        return new adyl(azqbVar, azqbVar2, 1);
    }

    public final afjm b() {
        if (this.c == 0) {
            return c((aant) this.a.get(), (afle) this.b.get());
        }
        return d((afle) this.b.get(), (aant) this.a.get());
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.c == 0) {
            return b();
        }
        return b();
    }
}
