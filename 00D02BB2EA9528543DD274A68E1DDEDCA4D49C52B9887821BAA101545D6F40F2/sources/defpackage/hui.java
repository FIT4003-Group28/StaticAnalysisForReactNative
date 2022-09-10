package defpackage;
/* compiled from: PG */
/* renamed from: hui  reason: default package */
/* loaded from: classes.dex */
public final class hui {
    public final cqat a;
    public final ckcw b;
    private final cjqy c;
    private final hug<ckjd> d = new hug<>(this, ckjd.class, ckjg.e, hud.a);
    private final hug<ckje> e = new hug<>(this, ckje.class, ckjg.f, hue.a);
    private final hug<ckjc> f = new hug<>(this, ckjc.class, ckjg.g, huf.a);

    public hui(cqat cqatVar, ckcw ckcwVar, cjqy cjqyVar) {
        this.a = cqatVar;
        this.b = ckcwVar;
        this.c = cjqyVar;
    }

    public final void a() {
        this.d.b();
        this.e.b();
        this.f.b();
    }

    public final void b(gcd gcdVar, boolean z) {
        ckjd ckjdVar;
        ckjc ckjcVar;
        ckjd ckjdVar2 = ckjd.FOLLOW_SYSTEM;
        gcd gcdVar2 = gcd.FOLLOW_SYSTEM;
        int ordinal = gcdVar.ordinal();
        if (ordinal != 0) {
            ckjdVar = ordinal != 1 ? ckjd.ALWAYS_LIGHT : ckjd.ALWAYS_DARK;
        } else {
            ckjdVar = ckjd.FOLLOW_SYSTEM;
        }
        ckje ckjeVar = z ? ckje.DARK_UI : ckje.LIGHT_UI;
        int ordinal2 = ckjdVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 2) {
                if (ckjeVar == ckje.DARK_UI) {
                    ckjcVar = ckjc.ALWAYS_LIGHT_WITH_DARK_UI;
                } else {
                    ckjcVar = ckjc.ALWAYS_LIGHT_WITH_LIGHT_UI;
                }
            } else if (ckjeVar == ckje.DARK_UI) {
                ckjcVar = ckjc.ALWAYS_DARK_WITH_DARK_UI;
            } else {
                ckjcVar = ckjc.ALWAYS_DARK_WITH_LIGHT_UI;
            }
        } else if (ckjeVar == ckje.DARK_UI) {
            ckjcVar = ckjc.FOLLOW_SYSTEM_WITH_DARK_UI;
        } else {
            ckjcVar = ckjc.FOLLOW_SYSTEM_WITH_LIGHT_UI;
        }
        this.d.a(ckjdVar);
        this.e.a(ckjeVar);
        this.f.a(ckjcVar);
        cjqy cjqyVar = this.c;
        cjsx i = cjsy.i();
        i.b(z ? ddda.ci : ddda.ch);
        cjqyVar.k(i.a());
    }
}
