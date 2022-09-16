package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afse  reason: default package */
/* loaded from: classes.dex */
public final class afse extends yjg {
    public final azqb a;
    public final azqb c;
    public final azqb d;
    private final Executor e;
    private final azqb f;

    public afse(Executor executor, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.e = executor;
        this.a = azqbVar;
        this.f = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    @Override // defpackage.yjg
    public final void a() {
        this.e.execute(new afsd(this));
        ylx.j(((yve) ((afzk) this.f.get()).a.get()).b(adrz.o), anjk.a, afsc.a);
        this.e.execute(new afsd(this, 1));
    }
}
