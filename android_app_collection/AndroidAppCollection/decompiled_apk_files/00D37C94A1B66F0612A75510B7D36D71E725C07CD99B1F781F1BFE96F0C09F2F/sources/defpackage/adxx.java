package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adxx  reason: default package */
/* loaded from: classes.dex */
public final class adxx implements axou {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public adxx(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public adxx(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public adxx(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public adxx(azqb azqbVar, azqb azqbVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public adxx(azqb azqbVar, azqb azqbVar2, int i, float[] fArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public adxx(azqb azqbVar, azqb azqbVar2, int i, int[] iArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public adxx(azqb azqbVar, azqb azqbVar2, int i, short[] sArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public adxx(azqb azqbVar, azqb azqbVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public adxx(azqb azqbVar, azqb azqbVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public adxx(azqb azqbVar, azqb azqbVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public static adxx A(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 9, (int[]) null);
    }

    public static adxx B(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 10, (boolean[]) null);
    }

    public static adxx C(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 11);
    }

    public static adxx D(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 12, (float[]) null);
    }

    public static adxx E(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 13, (byte[][]) null);
    }

    public static adxx F(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 14);
    }

    public static adxx G(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 15);
    }

    public static adxx H(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 16);
    }

    public static adxx I(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 17);
    }

    public static adxx J(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 18);
    }

    public static adxx K(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 19);
    }

    public static adxw a(azqb azqbVar, azqb azqbVar2) {
        return new adxw(azqbVar, azqbVar2);
    }

    public static adxx b(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2);
    }

    public static adzt c(ampq ampqVar, adzu adzuVar) {
        return (adzt) ampqVar.e(adzuVar);
    }

    public static aepf d(ampq ampqVar, aepj aepjVar) {
        return (aepf) ampqVar.e(aepjVar);
    }

    public static aflq e(snc sncVar, aant aantVar) {
        float f;
        PlayerConfigModel playerConfigModel = aantVar.get();
        aqwu aqwuVar = playerConfigModel.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        if (aqwuVar.aT != 0.0f) {
            aqwu aqwuVar2 = playerConfigModel.c.e;
            if (aqwuVar2 == null) {
                aqwuVar2 = aqwu.b;
            }
            f = aqwuVar2.aT;
        } else {
            f = 5.0f;
        }
        double d = f;
        aqwu aqwuVar3 = playerConfigModel.c.e;
        if (aqwuVar3 == null) {
            aqwuVar3 = aqwu.b;
        }
        return new aflq(sncVar, d, aqwuVar3.aU);
    }

    public static afjm f(aant aantVar, afle afleVar) {
        return aflf.a(afleVar, aantVar, gsh.t, false, 3);
    }

    public static void g(aadd aaddVar, yrd yrdVar) {
        athe atheVar = aaddVar.a().f;
        if (atheVar == null) {
            atheVar = athe.a;
        }
        atnt atntVar = atheVar.k;
        if (atntVar == null) {
            atntVar = atnt.a;
        }
        yrdVar.a(atntVar.c * atntVar.b);
        axzl.o(yrdVar);
    }

    public static afmj h(snc sncVar, afkf afkfVar) {
        return new afmj(sncVar, afkfVar, 2);
    }

    public static afmj i(snc sncVar, afkf afkfVar) {
        return new afmj(sncVar, afkfVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static snc j(aadd aaddVar, zgi zgiVar, aflq aflqVar) {
        aujv aujvVar;
        if (aaddVar == null || aaddVar.a() == null) {
            aujvVar = aujv.b;
        } else {
            atdy atdyVar = aaddVar.a().i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            aujvVar = atdyVar.f;
            if (aujvVar == null) {
                aujvVar = aujv.b;
            }
        }
        int o = alwb.o(aujvVar.g);
        if (o == 0) {
            o = 1;
        }
        if (o - 1 == 2) {
            zgiVar = aflqVar;
        }
        axzl.o(zgiVar);
        return zgiVar;
    }

    public static aegy k(afjz afjzVar, snc sncVar) {
        return new aegy(afjzVar, sncVar);
    }

    public static aeju l(aadd aaddVar, Executor executor) {
        return new aeju(aaddVar, executor);
    }

    public static affu m(afjz afjzVar, snc sncVar) {
        return new affu(afjzVar, sncVar);
    }

    public static afst n(afsz afszVar, Context context) {
        afsr afsrVar;
        String packageName;
        String c;
        context.getClass();
        if (zfm.a.b == null) {
            zfm.a.b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.television"));
        }
        if (zfm.a.b.booleanValue()) {
            afsrVar = afsr.TV;
        } else {
            afsrVar = zew.v(context) ? afsr.TABLET : afsr.MOBILE;
        }
        afsr afsrVar2 = afsrVar;
        amqo amqoVar = afszVar.c;
        if (amqoVar != null) {
            packageName = ((oom) amqoVar).a();
        } else {
            packageName = context.getPackageName();
        }
        String str = packageName;
        amqo amqoVar2 = afszVar.d;
        if (amqoVar2 != null) {
            c = ((oom) amqoVar2).a();
        } else {
            c = zfm.c(context);
        }
        String str2 = c;
        afss afssVar = afszVar.b;
        amqo amqoVar3 = afszVar.e;
        ampq i = ampq.i(null);
        str.getClass();
        str2.getClass();
        afsrVar2.getClass();
        return new afst(str, str2, afsrVar2, afssVar, i);
    }

    public static afsx o(azqb azqbVar) {
        afsx afsxVar = (afsx) azqbVar.get();
        axzl.o(afsxVar);
        return afsxVar;
    }

    public static yqw p(yqy yqyVar, yqx yqxVar) {
        yqw a = yqyVar.a(new cfh(), yqxVar, "netRequest-noncaching");
        axzl.o(a);
        return a;
    }

    public static yve q(Context context, azqb azqbVar) {
        vjf a = vjg.a(context);
        a.e("net");
        a.f("prodnet.pb");
        Uri a2 = a.a();
        vli a3 = vlj.a();
        a3.f(a2);
        a3.e(awut.a);
        return new yvc(vmu.b(((vlk) azqbVar.get()).a(a3.a())), awut.a);
    }

    public static afzb r(azqb azqbVar, azqb azqbVar2) {
        return new afzb(azqbVar, azqbVar2);
    }

    public static adxx s(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 1);
    }

    public static adxx t(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 2, (byte[]) null);
    }

    public static adxx u(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 3, (char[]) null);
    }

    public static adxx v(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 4);
    }

    public static adxx w(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 5, (short[]) null);
    }

    public static adxx x(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 6);
    }

    public static adxx y(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 7);
    }

    public static adxx z(azqb azqbVar, azqb azqbVar2) {
        return new adxx(azqbVar, azqbVar2, 8);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return a(this.a, this.b);
            case 1:
                return adxj.a((aken) this.a.get(), ((yij) this.b).get());
            case 2:
                return c((ampq) ((axov) this.b).a, ((adzv) this.a).get());
            case 3:
                return d((ampq) ((axov) this.b).a, (aepj) this.a.get());
            case 4:
                return e((snc) this.a.get(), (aant) this.b.get());
            case 5:
                return f((aant) this.b.get(), (afle) this.a.get());
            case 6:
                yrd yrdVar = (yrd) this.b.get();
                g((aadd) this.a.get(), yrdVar);
                return yrdVar;
            case 7:
                return h((snc) this.a.get(), (afkf) this.b.get());
            case 8:
                return i((snc) this.a.get(), (afkf) this.b.get());
            case 9:
                return j((aadd) this.b.get(), yie.g(), (aflq) this.a.get());
            case 10:
                return k((afjz) this.b.get(), (snc) this.a.get());
            case 11:
                return l((aadd) this.a.get(), (Executor) this.b.get());
            case 12:
                return m((afjz) this.b.get(), (snc) this.a.get());
            case 13:
                return new aflx((yni) this.b.get(), (snc) this.a.get());
            case 14:
                return n((afsz) ((axov) this.a).a, (Context) ((axov) this.b).a);
            case 15:
                afsz afszVar = (afsz) ((axov) this.a).a;
                return o(this.b);
            case 16:
                return ((afww) this.a).get().a(((axpa) this.b).get());
            case 17:
                return p((yqy) this.a.get(), (yqx) this.b.get());
            case 18:
                return q((Context) ((axov) this.a).a, this.b);
            case 19:
                return r(this.a, this.b);
            default:
                return new afzt((SharedPreferences) this.b.get(), (afvn) this.a.get());
        }
    }
}
