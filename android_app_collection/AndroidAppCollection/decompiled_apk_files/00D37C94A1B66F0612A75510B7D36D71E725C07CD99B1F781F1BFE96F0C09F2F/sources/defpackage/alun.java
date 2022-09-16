package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: alun  reason: default package */
/* loaded from: classes.dex */
public final class alun implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final /* synthetic */ int e;

    public alun(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public alun(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i) {
        this.e = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.b = azqbVar4;
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.e == 0) {
            return new alum(((alts) this.a).get(), (File) this.b.get(), (altm) this.c.get(), axot.a(this.d));
        }
        return new altq((alty) this.a.get(), (altn) this.c.get(), (altm) this.d.get(), (alua) this.b.get());
    }
}
