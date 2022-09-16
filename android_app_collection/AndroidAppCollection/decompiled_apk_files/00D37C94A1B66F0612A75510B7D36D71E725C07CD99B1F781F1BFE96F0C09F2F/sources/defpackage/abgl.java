package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: abgl  reason: default package */
/* loaded from: classes.dex */
public final class abgl implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final /* synthetic */ int f;

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i) {
        this.f = i;
        this.b = azqbVar;
        this.e = azqbVar2;
        this.d = azqbVar3;
        this.a = azqbVar4;
        this.c = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, byte[] bArr) {
        this.f = i;
        this.d = azqbVar;
        this.e = azqbVar2;
        this.a = azqbVar3;
        this.c = azqbVar4;
        this.b = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, char[] cArr) {
        this.f = i;
        this.d = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
        this.e = azqbVar4;
        this.b = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, float[] fArr) {
        this.f = i;
        this.e = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
        this.b = azqbVar4;
        this.d = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, int[] iArr) {
        this.f = i;
        this.e = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.a = azqbVar4;
        this.b = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, short[] sArr) {
        this.f = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.c = azqbVar4;
        this.e = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, boolean[] zArr) {
        this.f = i;
        this.e = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
        this.a = azqbVar4;
        this.d = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, byte[][] bArr) {
        this.f = i;
        this.e = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
        this.d = azqbVar4;
        this.a = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, char[][] cArr) {
        this.f = i;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.a = azqbVar3;
        this.e = azqbVar4;
        this.b = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, int[][] iArr) {
        this.f = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.e = azqbVar3;
        this.d = azqbVar4;
        this.c = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, short[][] sArr) {
        this.f = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.e = azqbVar3;
        this.c = azqbVar4;
        this.a = azqbVar5;
    }

    public abgl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.c = azqbVar;
        this.e = azqbVar2;
        this.a = azqbVar3;
        this.d = azqbVar4;
        this.b = azqbVar5;
    }

    public static abgl a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5);
    }

    public static abgk b(SharedPreferences sharedPreferences, azqb azqbVar, azqb azqbVar2, aabw aabwVar, Executor executor) {
        return new abgk(sharedPreferences, azqbVar, azqbVar2, aabwVar, executor);
    }

    public static yvc c(aacz aaczVar, Context context, String str, ankw ankwVar, vlk vlkVar) {
        vjf a = vjg.a(context);
        a.e("logging");
        a.f("logging_settings.pb");
        Uri a2 = a.a();
        vli a3 = vlj.a();
        a3.f(a2);
        a3.e(awtn.a);
        athd athdVar = aaczVar.b().o;
        if (athdVar == null) {
            athdVar = athd.a;
        }
        aujq aujqVar = athdVar.g;
        if (aujqVar == null) {
            aujqVar = aujq.a;
        }
        if (aujqVar.g) {
            vlo d = vlr.d(context, ankwVar);
            d.b();
            d.c = str;
            d.d("interaction_logging_client_side_ve_counter");
            d.e(fdg.s);
            a3.b(d.a());
        }
        vlo d2 = vlr.d(context, ankwVar);
        d2.b();
        d2.c = str;
        d2.d("foreground_heartbeat_index", "LastCrashTimestamp", "LastCrashException");
        d2.e(fdg.t);
        a3.b(d2.a());
        return new yvc(vmu.b(vlkVar.a(a3.a())), awtn.a);
    }

    public static aeqn d(akqq akqqVar, yqw yqwVar, ScheduledExecutorService scheduledExecutorService, afvn afvnVar, acrr acrrVar) {
        return new aeqn(akqqVar, yqwVar, scheduledExecutorService, afvnVar, acrrVar);
    }

    public static afse e(Executor executor, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new afse(executor, azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    public static aiix f(aacz aaczVar, aadd aaddVar, axxl axxlVar, axxj axxjVar, axxb axxbVar) {
        return new aiix(aaczVar, aaddVar, axxlVar, axxjVar, axxbVar);
    }

    public static yve g(Context context, String str, ankw ankwVar, vlk vlkVar, yke ykeVar) {
        vlo d = vlr.d(context, ankwVar);
        d.b();
        d.c = str;
        d.d(ahfn.SUBTITLES_ENABLED, ahfn.SUBTITLES_LANGUAGE_CODE);
        d.e(adiz.h);
        vlr a = d.a();
        vli a2 = vlj.a();
        a2.f(aiwv.i(context));
        a2.e(awve.a);
        a2.b(a);
        return ykeVar.a(vmu.b(vlkVar.a(a2.a())), awve.a);
    }

    public static ajba h(axnm axnmVar, aant aantVar, snc sncVar, aynx aynxVar, aacz aaczVar) {
        return new ajba(axnmVar, aantVar, sncVar, aynxVar, aaczVar);
    }

    public static aktj i(acud acudVar, yme ymeVar, snc sncVar, zex zexVar) {
        return new aktj(acudVar, ymeVar, sncVar, zexVar);
    }

    public static abgl j(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 1);
    }

    public static abgl k(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 2, (byte[]) null);
    }

    public static abgl l(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 3, (char[]) null);
    }

    public static abgl m(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 4, (short[]) null);
    }

    public static abgl n(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 5, (int[]) null);
    }

    public static abgl o(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 6, (boolean[]) null);
    }

    public static abgl p(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 7, (float[]) null);
    }

    public static abgl q(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 8, (byte[][]) null);
    }

    public static abgl r(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 9, (char[][]) null);
    }

    public static abgl s(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 10, (short[][]) null);
    }

    public static abgl t(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 11, (int[][]) null);
    }

    public static abgl u(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new abgl(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 12, (boolean[][]) null);
    }

    public static aeab v(aacz aaczVar, azqb azqbVar, zew zewVar, axnm axnmVar, SharedPreferences sharedPreferences) {
        aeab a = adxj.a.a(aaczVar, azqbVar, zewVar, axnmVar, sharedPreferences);
        axzl.o(a);
        return a;
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.f) {
            case 0:
                return b((SharedPreferences) this.a.get(), this.b, this.c, (aabw) this.d.get(), (Executor) this.e.get());
            case 1:
                return new abdi((aaqj) this.b.get(), (aaqf) this.e.get(), (afvn) this.d.get(), (yqw) this.a.get(), (abdh) this.c.get());
            case 2:
                return c((aacz) this.d.get(), (Context) ((axov) this.e).a, ((yin) this.a).b(), (ankw) this.c.get(), (vlk) this.b.get());
            case 3:
                return v((aacz) this.d.get(), this.a, (zew) this.c.get(), axot.a(this.e), (SharedPreferences) this.b.get());
            case 4:
                return d((akqq) this.a.get(), (yqw) this.b.get(), (ScheduledExecutorService) this.d.get(), (afvn) this.c.get(), (acrr) this.e.get());
            case 5:
                return e((Executor) this.e.get(), this.d, this.c, this.a, this.b);
            case 6:
                return f((aacz) this.e.get(), (aadd) this.c.get(), (axxl) this.b.get(), (axxj) this.a.get(), (axxb) this.d.get());
            case 7:
                return g((Context) ((axov) this.e).a, ((yin) this.a).b(), (ankw) this.c.get(), (vlk) this.b.get(), (yke) this.d.get());
            case 8:
                return new aiww((Executor) this.e.get(), (yqh) this.c.get(), (zie) this.b.get(), (snc) this.d.get(), (ykg) this.a.get());
            case 9:
                return new aizn(this.c, this.d, (zah) this.a.get(), (aijf) this.e.get(), (bame) this.b.get());
            case 10:
                return new ajad((Context) ((axov) this.d).a, (Handler) this.b.get(), this.e, (aizp) this.c.get(), this.a, aisw.b());
            case 11:
                ajba h = h(axot.a(this.b), (aant) this.a.get(), (snc) this.e.get(), (aynx) this.d.get(), (aacz) this.c.get());
                h.w();
                return h;
            default:
                arey areyVar = (arey) this.a.get();
                return i((acud) this.c.get(), (yme) this.e.get(), (snc) this.d.get(), (zex) this.b.get());
        }
    }
}
