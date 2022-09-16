package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ainr  reason: default package */
/* loaded from: classes.dex */
public final class ainr implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final /* synthetic */ int e;

    public ainr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public ainr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i) {
        this.e = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public ainr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.b = azqbVar4;
    }

    public ainr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, char[] cArr) {
        this.e = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
        this.d = azqbVar4;
    }

    public ainr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, float[] fArr) {
        this.e = i;
        this.b = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.a = azqbVar4;
    }

    public ainr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, int[] iArr) {
        this.e = i;
        this.a = azqbVar;
        this.d = azqbVar2;
        this.b = azqbVar3;
        this.c = azqbVar4;
    }

    public ainr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, short[] sArr) {
        this.e = i;
        this.a = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.b = azqbVar4;
    }

    public ainr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.b = azqbVar4;
    }

    public static ainr a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new ainr(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    public static aiuy b(afvn afvnVar, aasw aaswVar, aiut aiutVar, aacz aaczVar) {
        return new aiuy(afvnVar, aaswVar, aiutVar, aaczVar);
    }

    public static aizu c(aizn aiznVar, aijh aijhVar, aizr aizrVar, yni yniVar) {
        return new aizu(aiznVar, aijhVar, aizrVar, yniVar);
    }

    public static ajdv d(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        return new ajdv(aaqjVar, aaqfVar, afvnVar, yqwVar);
    }

    public static ajei e(Executor executor, azqb azqbVar, aiix aiixVar, acrr acrrVar) {
        return new ajei(executor, azqbVar, aiixVar, acrrVar);
    }

    public static ainr f(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new ainr(azqbVar, azqbVar2, azqbVar3, azqbVar4, 1);
    }

    public static ainr g(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new ainr(azqbVar, azqbVar2, azqbVar3, azqbVar4, 2, (byte[]) null);
    }

    public static ainr h(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new ainr(azqbVar, azqbVar2, azqbVar3, azqbVar4, 3, (char[]) null);
    }

    public static ainr i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new ainr(azqbVar, azqbVar2, azqbVar3, azqbVar4, 4, (short[]) null);
    }

    public static ainr j(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new ainr(azqbVar, azqbVar2, azqbVar3, azqbVar4, 5, (int[]) null);
    }

    public static ainr k(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new ainr(azqbVar, azqbVar2, azqbVar3, azqbVar4, 6, (boolean[]) null);
    }

    public static ainr l(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new ainr(azqbVar, azqbVar2, azqbVar3, azqbVar4, 7, (float[]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                return new ainq(this.a, (aacz) this.b.get(), (ainx) this.c.get(), this.d);
            case 1:
                aiqa aiqaVar = (aiqa) this.d.get();
                return new aimr((yni) this.b.get(), (abeb) this.a.get(), (abec) this.c.get());
            case 2:
                return new aisq((bame) this.a.get(), ((aisc) this.d).get(), (ailu) this.c.get(), (aisx) this.b.get());
            case 3:
                return b((afvn) this.c.get(), (aasw) this.b.get(), ((aiuu) this.a).get(), (aacz) this.d.get());
            case 4:
                aizu c = c((aizn) this.a.get(), (aijh) this.d.get(), (aizr) this.c.get(), (yni) this.b.get());
                c.a();
                return c;
            case 5:
                return d((aaqj) this.a.get(), (aaqf) this.d.get(), (afvn) this.b.get(), (yqw) this.c.get());
            case 6:
                return e((Executor) this.a.get(), this.c, (aiix) this.d.get(), (acrr) this.b.get());
            default:
                return aqmv.q((Context) ((axov) this.b).a, (ankw) this.d.get(), ((yin) this.c).b(), (vlk) this.a.get());
        }
    }
}
