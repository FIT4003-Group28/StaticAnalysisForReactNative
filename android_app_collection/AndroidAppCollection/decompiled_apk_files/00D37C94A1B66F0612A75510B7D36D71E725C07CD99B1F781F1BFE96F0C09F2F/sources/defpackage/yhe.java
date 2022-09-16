package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: yhe  reason: default package */
/* loaded from: classes4.dex */
public final class yhe implements ajry {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public yhe(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    @Override // defpackage.ajry
    /* renamed from: a */
    public final yhd b(ViewGroup viewGroup) {
        Context context = (Context) ((axov) this.a).a;
        context.getClass();
        aafo aafoVar = (aafo) this.b.get();
        aafoVar.getClass();
        ajmy ajmyVar = (ajmy) this.c.get();
        ajmyVar.getClass();
        viewGroup.getClass();
        return new yhd(context, aafoVar, ajmyVar, viewGroup);
    }
}
