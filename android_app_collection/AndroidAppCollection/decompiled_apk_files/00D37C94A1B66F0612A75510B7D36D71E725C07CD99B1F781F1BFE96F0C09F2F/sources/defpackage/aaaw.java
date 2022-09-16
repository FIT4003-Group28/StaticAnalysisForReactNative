package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aaaw  reason: default package */
/* loaded from: classes.dex */
public final class aaaw extends yjg {
    private final azqb a;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;

    public aaaw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7) {
        this.a = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.f = azqbVar5;
        this.g = azqbVar6;
        this.h = azqbVar7;
    }

    public static void d(aavp aavpVar) {
        aavpVar.b();
    }

    @Override // defpackage.yjg
    protected final void a() {
        this.h.get();
        ((yqw) this.f.get()).c();
        ((yqw) this.g.get()).c();
        ((aagi) this.d.get()).g();
        ((aahf) this.e.get()).g();
        ((Application) this.c.get()).registerActivityLifecycleCallbacks((aara) this.a.get());
    }
}
