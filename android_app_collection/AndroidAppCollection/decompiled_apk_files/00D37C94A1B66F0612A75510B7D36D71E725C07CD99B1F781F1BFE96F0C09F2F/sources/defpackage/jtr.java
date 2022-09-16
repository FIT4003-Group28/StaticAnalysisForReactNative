package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: jtr  reason: default package */
/* loaded from: classes3.dex */
public final class jtr implements jus {
    private final azqb a;
    private final /* synthetic */ int b;

    public jtr(azqb azqbVar, int i) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public jtr(azqb azqbVar) {
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public jtr(azqb azqbVar, int i, byte[] bArr) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public jtr(azqb azqbVar, int i, char[] cArr) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public jtr(azqb azqbVar, int i, short[] sArr) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public jtr(azqb azqbVar, int i, int[] iArr) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public jtr(azqb azqbVar, int i, boolean[] zArr) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public jtr(azqb azqbVar, int i, float[] fArr) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    @Override // defpackage.jus
    public final /* bridge */ /* synthetic */ jut a(ampq ampqVar) {
        switch (this.b) {
            case 0:
                jgn jgnVar = (jgn) this.a.get();
                jgnVar.getClass();
                return new jtq(jgnVar, ampqVar);
            case 1:
                jml jmlVar = (jml) this.a.get();
                jmlVar.getClass();
                return new jtw(jmlVar, ampqVar, 1);
            case 2:
                jgn jgnVar2 = (jgn) this.a.get();
                jgnVar2.getClass();
                return new jtu(jgnVar2);
            case 3:
                jml jmlVar2 = (jml) this.a.get();
                jmlVar2.getClass();
                return new jtw(jmlVar2, ampqVar);
            case 4:
                Context context = (Context) this.a.get();
                context.getClass();
                return new jtx(context);
            case 5:
                jgo jgoVar = (jgo) this.a.get();
                jgoVar.getClass();
                return new jum(jgoVar, ampqVar);
            case 6:
                jml jmlVar3 = (jml) this.a.get();
                jmlVar3.getClass();
                return new jtw(jmlVar3, ampqVar, 2);
            default:
                jml jmlVar4 = (jml) this.a.get();
                jmlVar4.getClass();
                return new jtw(jmlVar4, ampqVar, 3);
        }
    }
}
