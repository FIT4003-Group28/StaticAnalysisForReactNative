package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Optional;
import j$.util.function.Supplier;
import java.security.SecureRandom;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yrn  reason: default package */
/* loaded from: classes4.dex */
public final class yrn implements axou {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public yrn(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public yrn(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public yrn(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public yrn(azqb azqbVar, azqb azqbVar2, int i, char[] cArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public yrn(azqb azqbVar, azqb azqbVar2, int i, float[] fArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public yrn(azqb azqbVar, azqb azqbVar2, int i, int[] iArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public yrn(azqb azqbVar, azqb azqbVar2, int i, short[] sArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public yrn(azqb azqbVar, azqb azqbVar2, int i, boolean[] zArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public yrn(azqb azqbVar, azqb azqbVar2, int i, byte[][] bArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public yrn(azqb azqbVar, azqb azqbVar2, int i, char[][] cArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public static yrn A(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 12, (short[]) null);
    }

    public static yrn B(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 13);
    }

    public static yrn C(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 14);
    }

    public static yrn D(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 15);
    }

    public static yrn E(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new yrn(azqbVar, azqbVar2, 17, (boolean[]) null);
    }

    public static yrn F(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 18, (float[]) null);
    }

    public static yrn G(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 19, (byte[][]) null);
    }

    public static yrn H(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 20, (char[][]) null);
    }

    public static yqh a(azqb azqbVar, ampq ampqVar) {
        return (yqh) ampqVar.e((yqh) azqbVar.get());
    }

    public static yrn b(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2);
    }

    public static yqh c(yqn yqnVar, yqj yqjVar) {
        return yqnVar.a(yqjVar);
    }

    public static String d(Context context, ampq ampqVar) {
        String b;
        if (ampqVar.h()) {
            b = (String) ((amqo) ampqVar.c()).get();
        } else {
            b = zgt.b(context, zfm.c(context), null);
        }
        axzl.o(b);
        return b;
    }

    public static yui e(Executor executor, azqb azqbVar) {
        return new yui(executor, azqbVar);
    }

    public static vlk f(Executor executor, vjb vjbVar) {
        vll vllVar = new vll();
        vllVar.a = executor;
        vllVar.b = vjbVar;
        vllVar.b(vmo.a);
        return vllVar.a();
    }

    public static SecureRandom g(final zej zejVar, Optional optional) {
        SecureRandom secureRandom = (SecureRandom) optional.orElseGet(new Supplier() { // from class: zfp
            @Override // j$.util.function.Supplier
            /* renamed from: get */
            public final Object mo515get() {
                try {
                    zej.this.a();
                } catch (IllegalStateException unused) {
                }
                return new SecureRandom();
            }
        });
        axzl.o(secureRandom);
        return secureRandom;
    }

    public static Set h(aadd aaddVar, azqb azqbVar) {
        Set r;
        athe atheVar = aaddVar.a().f;
        if (atheVar == null) {
            atheVar = athe.a;
        }
        if (!atheVar.e) {
            athe atheVar2 = aaddVar.a().f;
            if (atheVar2 == null) {
                atheVar2 = athe.a;
            }
            if (!atheVar2.f) {
                r = amyg.a;
                axzl.o(r);
                return r;
            }
        }
        r = amvn.r((afxq) azqbVar.get());
        axzl.o(r);
        return r;
    }

    public static aaki i(azqb azqbVar) {
        aaki aakiVar = (aaki) azqbVar.get();
        axzl.o(aakiVar);
        return aakiVar;
    }

    public static aajd j(azqb azqbVar, aagi aagiVar) {
        return new aajd(azqbVar, aagiVar);
    }

    public static aaje k(aajg aajgVar, aaki aakiVar) {
        return new aaje(aajgVar, aakiVar);
    }

    public static aaoi l(Executor executor, afuw afuwVar) {
        return new aaoi(executor, afuwVar);
    }

    public static aavp m(aaay aaayVar, azqb azqbVar) {
        boolean z = aaayVar.h;
        aavp aavpVar = (aavp) azqbVar.get();
        axzl.o(aavpVar);
        return aavpVar;
    }

    public static abfm n(azqb azqbVar, azqb azqbVar2) {
        return new abfm(azqbVar, azqbVar2);
    }

    public static acrs o(aacz aaczVar, snc sncVar) {
        return new acrs(aaczVar, sncVar);
    }

    public static yrn p(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 1);
    }

    public static yrn q(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 2);
    }

    public static yrn r(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 3);
    }

    public static yrn s(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 4);
    }

    public static yrn t(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 5);
    }

    public static yrn u(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 6, (byte[]) null);
    }

    public static yrn v(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 7);
    }

    public static yrn w(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 8, (char[]) null);
    }

    public static yrn x(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 9);
    }

    public static yrn y(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 10);
    }

    public static yrn z(azqb azqbVar, azqb azqbVar2) {
        return new yrn(azqbVar, azqbVar2, 11);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return a(this.a, (ampq) ((axov) this.b).a);
            case 1:
                return c((yqn) this.b.get(), (yqj) this.a.get());
            case 2:
                return d((Context) ((axov) this.b).a, (ampq) this.a.get());
            case 3:
                return e((Executor) this.b.get(), this.a);
            case 4:
                return f((Executor) this.b.get(), (vjb) this.a.get());
            case 5:
                zgt zgtVar = (zgt) this.a.get();
                return new zdz((snc) this.b.get(), yie.f());
            case 6:
                return g((zej) this.a.get(), (Optional) ((axov) this.b).a);
            case 7:
                return h((aadd) this.b.get(), this.a);
            case 8:
                return ((yke) this.b.get()).b(this.a);
            case 9:
                Context context = (Context) ((axov) this.b).a;
                return i(this.a);
            case 10:
                return new aahc((aacz) this.b.get(), (acrq) this.a.get());
            case 11:
                return j(this.b, (aagi) this.a.get());
            case 12:
                return k((aajg) this.a.get(), (aaki) this.b.get());
            case 13:
                return new aakf((snc) this.b.get(), (aadd) this.a.get());
            case 14:
                azqb azqbVar = this.b;
                zfq zfqVar = (zfq) this.a.get();
                return new aakl(azqbVar, amyc.b);
            case 15:
                return l((Executor) this.b.get(), (afuw) this.a.get());
            case 16:
                return new aarf((SharedPreferences) this.a.get(), (afvn) this.b.get());
            case 17:
                return m((aaay) ((axov) this.a).a, this.b);
            case 18:
                return n(this.a, this.b);
            case 19:
                return o((aacz) this.a.get(), (snc) this.b.get());
            default:
                return ((zdv) this.b).get().b((SharedPreferences) this.a.get());
        }
    }
}
