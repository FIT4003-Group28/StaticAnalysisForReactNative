package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: sqn  reason: default package */
/* loaded from: classes4.dex */
public final class sqn {
    public final azqb a;
    public final azqb b;
    public final azqb c;

    public sqn(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        azqbVar.getClass();
        this.b = azqbVar;
        this.a = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
    }

    public sqn(Context context) {
        axou a = axov.a(context);
        this.a = a;
        sql sqlVar = new sql(a);
        this.b = sqlVar;
        this.c = axot.b(new oql((azqb) a, (azqb) sqlVar, 6, (short[]) null));
    }
}
