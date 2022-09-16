package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aheo  reason: default package */
/* loaded from: classes.dex */
public final class aheo implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;

    public aheo(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    public static aheo b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new aheo(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final ahen get() {
        return new ahen((Context) ((axov) this.a).a, (aijf) this.b.get(), (aant) this.c.get(), (Executor) this.d.get(), (bame) this.e.get());
    }
}
