package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: jue  reason: default package */
/* loaded from: classes3.dex */
public final class jue implements jus {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final /* synthetic */ int d;

    public jue(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i) {
        this.d = i;
        azqbVar.getClass();
        this.b = azqbVar;
        this.c = azqbVar2;
        azqbVar3.getClass();
        this.a = azqbVar3;
    }

    public jue(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
    }

    @Override // defpackage.jus
    public final /* bridge */ /* synthetic */ jut a(ampq ampqVar) {
        int i = this.d;
        if (i == 0) {
            Context context = (Context) this.a.get();
            context.getClass();
            jgo jgoVar = (jgo) this.b.get();
            jgoVar.getClass();
            jsf jsfVar = (jsf) this.c.get();
            jsfVar.getClass();
            return new jud(context, jgoVar, jsfVar);
        } else if (i == 1) {
            jml jmlVar = (jml) this.b.get();
            jmlVar.getClass();
            fcl fclVar = (fcl) this.c.get();
            fclVar.getClass();
            fbu fbuVar = (fbu) this.a.get();
            fbuVar.getClass();
            return new jtk(jmlVar, fclVar, fbuVar);
        } else {
            jml jmlVar2 = (jml) this.b.get();
            jmlVar2.getClass();
            snc sncVar = (snc) this.a.get();
            sncVar.getClass();
            aagi aagiVar = (aagi) this.c.get();
            aagiVar.getClass();
            return new jun(jmlVar2, sncVar, aagiVar, ampqVar);
        }
    }

    public jue(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[] bArr) {
        this.d = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.a = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
    }
}
