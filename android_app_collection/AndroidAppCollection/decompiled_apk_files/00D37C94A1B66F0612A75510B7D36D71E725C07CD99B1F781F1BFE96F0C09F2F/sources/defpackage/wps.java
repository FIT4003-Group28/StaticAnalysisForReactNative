package defpackage;
/* compiled from: PG */
/* renamed from: wps  reason: default package */
/* loaded from: classes4.dex */
public final class wps implements wpr {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public wps(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    @Override // defpackage.wpr
    public final void a() {
        this.b.get();
        wtu wtuVar = (wtu) this.a.get();
        ((wng) wtuVar.a.get()).a.add(wtuVar);
        ((wll) this.c.get()).b();
    }
}
