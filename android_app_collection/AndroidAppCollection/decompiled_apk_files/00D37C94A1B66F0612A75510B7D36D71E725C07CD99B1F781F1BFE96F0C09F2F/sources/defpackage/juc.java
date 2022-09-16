package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: juc  reason: default package */
/* loaded from: classes3.dex */
public final class juc implements jus {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public juc(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        azqbVar.getClass();
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public juc(azqb azqbVar, azqb azqbVar2) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
    }

    public juc(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
    }

    public juc(azqb azqbVar, azqb azqbVar2, int i, char[] cArr) {
        this.c = i;
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
    }

    @Override // defpackage.jus
    public final /* bridge */ /* synthetic */ jut a(ampq ampqVar) {
        int i = this.c;
        if (i == 0) {
            Context context = (Context) this.a.get();
            context.getClass();
            jgo jgoVar = (jgo) this.b.get();
            jgoVar.getClass();
            return new jub(context, jgoVar);
        } else if (i == 1) {
            jml jmlVar = (jml) this.b.get();
            jmlVar.getClass();
            fbj fbjVar = (fbj) this.a.get();
            fbjVar.getClass();
            return new jtj(jmlVar, fbjVar, ampqVar);
        } else if (i == 2) {
            Context context2 = (Context) this.a.get();
            context2.getClass();
            jgo jgoVar2 = (jgo) this.b.get();
            jgoVar2.getClass();
            return new juf(context2, jgoVar2, ampqVar);
        } else if (i == 3) {
            Context context3 = (Context) this.a.get();
            context3.getClass();
            jgo jgoVar3 = (jgo) this.b.get();
            jgoVar3.getClass();
            return new juf(context3, jgoVar3, ampqVar, 2);
        } else if (i == 4) {
            jml jmlVar2 = (jml) this.b.get();
            jmlVar2.getClass();
            aagi aagiVar = (aagi) this.a.get();
            aagiVar.getClass();
            return new juo(jmlVar2, aagiVar, ampqVar);
        } else {
            jml jmlVar3 = (jml) this.b.get();
            jmlVar3.getClass();
            fcl fclVar = (fcl) this.a.get();
            fclVar.getClass();
            return new juq(jmlVar3, fclVar);
        }
    }

    public juc(azqb azqbVar, azqb azqbVar2, int i, short[] sArr) {
        this.c = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.a = azqbVar2;
    }

    public juc(azqb azqbVar, azqb azqbVar2, int i, int[] iArr) {
        this.c = i;
        azqbVar.getClass();
        this.b = azqbVar;
        this.a = azqbVar2;
    }
}
