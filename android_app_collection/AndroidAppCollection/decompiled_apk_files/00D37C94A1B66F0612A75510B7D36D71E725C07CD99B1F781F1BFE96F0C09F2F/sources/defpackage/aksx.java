package defpackage;
/* compiled from: PG */
/* renamed from: aksx  reason: default package */
/* loaded from: classes.dex */
public final class aksx implements axou {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public aksx(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public aksx(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public aksx(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public aksx(azqb azqbVar, azqb azqbVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public static aksx a(azqb azqbVar, azqb azqbVar2) {
        return new aksx(azqbVar, azqbVar2);
    }

    public static ajfd b(adww adwwVar, aijh aijhVar) {
        return new ajfd(adwwVar, aijhVar);
    }

    public static akth c(acrm acrmVar, axwx axwxVar, akto aktoVar) {
        return new akth(acrmVar, axwxVar, aktoVar);
    }

    public static aksx d(azqb azqbVar, azqb azqbVar2) {
        return new aksx(azqbVar, azqbVar2, 1);
    }

    public static aksx e(azqb azqbVar, azqb azqbVar2) {
        return new aksx(azqbVar, azqbVar2, 2);
    }

    public static aksx f(azqb azqbVar, azqb azqbVar2) {
        return new aksx(azqbVar, azqbVar2, 3);
    }

    public static aksx g(azqb azqbVar, azqb azqbVar2) {
        return new aksx(azqbVar, azqbVar2, 4, (byte[]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return b(((adwx) this.a).get(), (aijh) this.b.get());
            }
            if (i == 2) {
                return aqmv.p((yme) this.a.get(), this.b);
            }
            if (i == 3) {
                return c((acrm) this.a.get(), (axwx) this.b.get(), ajnk.d());
            }
            if (i == 4) {
                return new akwn((yve) this.b.get(), axot.a(this.a));
            }
            return new alri(((alrb) this.b).get(), (alrj) this.a.get());
        }
        return aqmv.r((yme) this.a.get(), this.b);
    }
}
