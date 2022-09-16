package defpackage;
/* compiled from: PG */
/* renamed from: fcu  reason: default package */
/* loaded from: classes3.dex */
public final class fcu {
    public final yve a;
    public final yve b;
    public final azqb c;

    public fcu(yve yveVar, yve yveVar2, azqb azqbVar) {
        this.a = yveVar;
        this.b = yveVar2;
        this.c = azqbVar;
    }

    public final ankt a() {
        return anii.h(this.b.a(), fcq.b, anjk.a);
    }

    public final ankt b(String str) {
        return anii.h(((yvc) this.c.get()).a(), new fct(str, 3), anjk.a);
    }

    public final ankt c(boolean z) {
        return this.b.b(new ehf(z, 2));
    }

    public final ankt d(boolean z) {
        return this.b.b(new ehf(z, 3));
    }

    public final ankt e(String str, boolean z) {
        return ((yvc) this.c.get()).b(new fco(str, z));
    }

    public final boolean f() {
        return ((fcy) this.b.c()).d;
    }

    public final boolean g() {
        return ((fda) this.a.c()).k;
    }
}
