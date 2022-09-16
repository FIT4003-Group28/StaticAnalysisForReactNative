package defpackage;
/* compiled from: PG */
/* renamed from: adiu  reason: default package */
/* loaded from: classes.dex */
public final class adiu {
    private final yni a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;
    private boolean j;
    private boolean k;

    public adiu(yni yniVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        this.a = yniVar;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.f = azqbVar5;
        this.g = azqbVar6;
        this.h = azqbVar7;
        this.i = azqbVar8;
    }

    public final synchronized void a() {
        if (this.j) {
            return;
        }
        this.j = true;
        adlh adlhVar = (adlh) this.b.get();
        yni yniVar = this.a;
        adlhVar.e = false;
        yniVar.g(adlhVar.f);
        this.a.g(this.d.get());
        this.a.g(this.e.get());
        this.a.g(((adew) this.c.get()).m);
        ((adah) this.g.get()).a((acvp) this.f.get());
        ((adhv) this.h.get()).a();
        ((adcd) this.i.get()).c();
    }

    public final synchronized void b() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((adhv) this.h.get()).a();
    }
}
