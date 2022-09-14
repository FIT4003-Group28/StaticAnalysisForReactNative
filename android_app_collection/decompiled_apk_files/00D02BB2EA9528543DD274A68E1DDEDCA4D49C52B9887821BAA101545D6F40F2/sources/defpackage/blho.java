package defpackage;
/* compiled from: PG */
/* renamed from: blho  reason: default package */
/* loaded from: classes3.dex */
public abstract class blho {
    @dzsi
    private blhn a;
    public final blhw e;
    public boolean f = false;

    public blho(blhw blhwVar) {
        this.e = blhwVar;
    }

    public abstract boolean a();

    protected abstract void b();

    public final boolean d() {
        return this.a != null;
    }

    public final void e(blhn blhnVar) {
        if (this.f) {
            return;
        }
        if (d()) {
            blhnVar.a(blhy.a);
        } else if (!a()) {
            blhnVar.a(blhy.a);
        } else {
            this.a = blhnVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(blhy blhyVar) {
        blhn blhnVar = this.a;
        if (this.f || !d() || blhnVar == null) {
            return;
        }
        this.a = null;
        blhnVar.a(blhyVar);
    }
}
