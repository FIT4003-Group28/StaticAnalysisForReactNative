package defpackage;
/* compiled from: PG */
/* renamed from: adlh  reason: default package */
/* loaded from: classes.dex */
public abstract class adlh {
    protected final yni a;
    public final adli b;
    public final adoa c;
    public boolean e;
    private final azqb g;
    private final azqb h;
    private airr i;
    private aire j;
    private final adlf k;
    public final aypf d = new aypf();
    public final adlg f = new adlg(this);

    static {
        zep.a("MDX.player.localPlaybackControl");
    }

    public adlh(yni yniVar, adli adliVar, azqb azqbVar, azqb azqbVar2, adoa adoaVar) {
        adlf adlfVar = new adlf(this);
        this.k = adlfVar;
        this.a = yniVar;
        this.b = adliVar;
        this.g = azqbVar;
        this.h = azqbVar2;
        this.c = adoaVar;
        adoaVar.g(adlfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(adnl adnlVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c(adnl adnlVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d(aifh aifhVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final aire e() {
        if (this.j == null) {
            this.j = (aire) this.h.get();
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final airr f() {
        if (this.i == null) {
            this.i = (airr) this.g.get();
        }
        return this.i;
    }
}
