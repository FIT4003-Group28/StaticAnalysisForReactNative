package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: kyn  reason: default package */
/* loaded from: classes3.dex */
public final class kyn implements ajry {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public kyn(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    @Override // defpackage.ajry
    /* renamed from: a */
    public final kym b(ViewGroup viewGroup) {
        Activity activity = (Activity) this.a.get();
        activity.getClass();
        aafo aafoVar = (aafo) this.b.get();
        aafoVar.getClass();
        ajxz ajxzVar = (ajxz) this.c.get();
        ajxzVar.getClass();
        return new kym(activity, aafoVar, ajxzVar, viewGroup);
    }
}
