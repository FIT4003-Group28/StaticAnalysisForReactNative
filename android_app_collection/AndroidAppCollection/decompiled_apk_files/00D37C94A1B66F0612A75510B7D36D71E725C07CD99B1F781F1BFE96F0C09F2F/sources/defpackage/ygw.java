package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ygw  reason: default package */
/* loaded from: classes4.dex */
public final class ygw implements ajry {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public ygw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.d = azqbVar4;
    }

    @Override // defpackage.ajry
    /* renamed from: a */
    public final ygv b(ViewGroup viewGroup) {
        Context context = (Context) ((axov) this.a).a;
        context.getClass();
        aafo aafoVar = (aafo) this.b.get();
        aafoVar.getClass();
        viewGroup.getClass();
        return new ygv(context, aafoVar, (yhl) this.c.get(), (yho) this.d.get(), viewGroup);
    }
}
