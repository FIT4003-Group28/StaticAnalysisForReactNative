package defpackage;
/* compiled from: PG */
/* renamed from: azot  reason: default package */
/* loaded from: classes2.dex */
public abstract class azot extends ayoi {
    public abstract void a(ayqb ayqbVar);

    public final ayoi aI() {
        azot azotVar;
        if (this instanceof azhh) {
            azotVar = new azhk(((azhh) this).a);
            azqc.l();
        } else {
            azotVar = this;
        }
        azhq azhqVar = new azhq(azotVar);
        azqc.i();
        return azhqVar;
    }

    public final ayoi d() {
        return e(1);
    }

    public final ayoi e(int i) {
        ayqb ayqbVar = ayrb.d;
        if (i <= 0) {
            a(ayqbVar);
            azqc.l();
            return this;
        }
        azds azdsVar = new azds(this, ayqbVar);
        azqc.i();
        return azdsVar;
    }
}
