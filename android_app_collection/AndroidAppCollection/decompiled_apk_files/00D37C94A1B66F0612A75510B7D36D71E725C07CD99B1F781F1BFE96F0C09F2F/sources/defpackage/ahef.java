package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ahef  reason: default package */
/* loaded from: classes.dex */
public final class ahef implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;

    public ahef(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    public static ahef a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new ahef(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5);
    }

    public static aioa c(Context context, azqb azqbVar, aizp aizpVar, ahfm ahfmVar, azqb azqbVar2) {
        return new aioa(context, azqbVar, aizpVar, ahfmVar.e, azqbVar2);
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final aioa get() {
        return c((Context) ((axov) this.a).a, this.b, (aizp) this.c.get(), (ahfm) ((axov) this.d).a, this.e);
    }
}
