package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: mqr  reason: default package */
/* loaded from: classes3.dex */
public final class mqr implements mpx {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final /* synthetic */ int d;

    public mqr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i) {
        this.d = i;
        azqbVar.getClass();
        this.c = azqbVar;
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.a = azqbVar3;
    }

    @Override // defpackage.mpx
    public final /* bridge */ /* synthetic */ mpy a(ViewGroup viewGroup) {
        if (this.d == 0) {
            aafo aafoVar = (aafo) this.a.get();
            aafoVar.getClass();
            ajxz ajxzVar = (ajxz) this.b.get();
            ajxzVar.getClass();
            Context context = (Context) ((axov) this.c).a;
            context.getClass();
            return new mqq(aafoVar, ajxzVar, context, viewGroup);
        }
        ajhl ajhlVar = (ajhl) this.c.get();
        ajhlVar.getClass();
        axnm axnmVar = ((axoz) this.b).get();
        axnmVar.getClass();
        Context context2 = (Context) this.a.get();
        context2.getClass();
        return new mqd(ajhlVar, axnmVar, context2);
    }

    public mqr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        azqbVar.getClass();
        this.a = azqbVar;
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
    }
}
