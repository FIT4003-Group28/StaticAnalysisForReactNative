package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vwo  reason: default package */
/* loaded from: classes4.dex */
public final class vwo implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final /* synthetic */ int d;

    public vwo(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public vwo(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.d == 0) {
            return a();
        }
        return a();
    }

    public final afxq a() {
        if (this.d == 0) {
            return wpu.d((Context) ((axov) this.a).a, (afsm) this.b.get(), (afvy) this.c.get());
        }
        return wpu.c((Context) ((axov) this.a).a, (afsm) this.b.get(), (afvy) this.c.get());
    }
}
