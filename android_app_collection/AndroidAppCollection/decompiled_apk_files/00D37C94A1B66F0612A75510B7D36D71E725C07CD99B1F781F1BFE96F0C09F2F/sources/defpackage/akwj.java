package defpackage;
/* compiled from: PG */
/* renamed from: akwj  reason: default package */
/* loaded from: classes.dex */
public final class akwj implements akwl {
    private final azqb a;
    private boolean b = false;

    public akwj(azqb azqbVar) {
        this.a = azqbVar;
    }

    private final arrh e(aven avenVar) {
        aqxo.y(this.b);
        aopa createBuilder = avem.a.createBuilder();
        createBuilder.copyOnWrite();
        avem avemVar = (avem) createBuilder.instance;
        avenVar.getClass();
        avemVar.c = avenVar;
        avemVar.b |= 1;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dH((avem) createBuilder.mo39build());
        return (arrh) a.mo39build();
    }

    @Override // defpackage.akwl
    public final void a(avff avffVar) {
        if (avffVar == null || (avffVar.b & 64) == 0) {
            return;
        }
        avey aveyVar = avffVar.f;
        if (aveyVar == null) {
            aveyVar = avey.a;
        }
        this.b = aveyVar.b;
    }

    @Override // defpackage.akwl
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.akwl
    public final void c(aven avenVar) {
        ((acrr) this.a.get()).c(e(avenVar));
    }

    @Override // defpackage.akwl
    public final void d(aven avenVar) {
        try {
            ((acrr) this.a.get()).e(e(avenVar));
        } catch (Exception unused) {
            zep.b("UncaughtException error occurred in critical transmission path.");
        }
    }
}
