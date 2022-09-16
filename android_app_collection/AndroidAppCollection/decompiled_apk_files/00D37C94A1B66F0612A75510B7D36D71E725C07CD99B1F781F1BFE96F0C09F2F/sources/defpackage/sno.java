package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: sno  reason: default package */
/* loaded from: classes4.dex */
public final class sno implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final /* synthetic */ int e;

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, byte[] bArr) {
        this.e = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
        this.d = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, char[] cArr) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.c = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, float[] fArr) {
        this.e = i;
        this.d = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
        this.b = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, int[] iArr) {
        this.e = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.d = azqbVar3;
        this.c = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, short[] sArr) {
        this.e = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.a = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.b = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, byte[][] bArr) {
        this.e = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
        this.d = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, char[][] cArr) {
        this.e = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
        this.c = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, float[][] fArr) {
        this.e = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
        this.d = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, int[][] iArr) {
        this.e = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.d = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, short[][] sArr) {
        this.e = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.a = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.c = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.c = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, char[][][] cArr) {
        this.e = i;
        this.d = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
        this.b = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, float[][][] fArr) {
        this.e = i;
        this.b = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.a = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, int[][][] iArr) {
        this.e = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
        this.d = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, short[][][] sArr) {
        this.e = i;
        this.d = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
        this.b = azqbVar4;
    }

    public sno(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.b = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.a = azqbVar4;
    }

    public static sno A(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 15, (byte[][][]) null);
    }

    public static sno B(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 16, (char[][][]) null);
    }

    public static sno C(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 17, (short[][][]) null);
    }

    public static sno D(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 18, (int[][][]) null);
    }

    public static sno E(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar6, 19, (boolean[][][]) null);
    }

    public static sno F(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 20, (float[][][]) null);
    }

    public static ankx a(ankx ankxVar, int i, spm spmVar, ampq ampqVar, ampq ampqVar2) {
        return soa.a(anlz.e(soi.a(ampqVar2, snr.d(i, ((Boolean) ampqVar.e(false)).booleanValue(), spmVar, snr.e("Lite", snr.a(0, snr.f(swm.e(), pgw.b)))))), ankxVar);
    }

    public static sno b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    public static vzn c(vzw vzwVar, Context context, ynz ynzVar, whp whpVar) {
        return new vzn(vzwVar, context, ynzVar, whpVar);
    }

    public static wma d(azqb azqbVar, azqb azqbVar2, aasu aasuVar, yni yniVar) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new xep(azqbVar));
        wxd wxdVar = (wxd) azqbVar2.get();
        return new wma(aasuVar, arrayList, yniVar);
    }

    public static wmc e(Executor executor, abeb abebVar, abec abecVar, wwf wwfVar) {
        return new wmc(executor, abebVar, abecVar);
    }

    public static wta f(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, Executor executor) {
        return new wta(azqbVar, azqbVar2, azqbVar3, executor);
    }

    public static wte g(azqb azqbVar, azqb azqbVar2, amvn amvnVar, aadd aaddVar) {
        return new wte(azqbVar, azqbVar2, amvnVar, aaddVar);
    }

    public static xes h(Context context, aizr aizrVar, aizp aizpVar, aynx aynxVar) {
        return new xes(context, aizrVar, aizpVar, aynxVar);
    }

    public static xey i(aacz aaczVar, afwu afwuVar, afwu afwuVar2, snc sncVar) {
        return new xey(aaczVar, afwuVar, afwuVar2, sncVar);
    }

    public static ypx j(azqb azqbVar, Object obj, axxb axxbVar, ayor ayorVar) {
        return new ypx(azqbVar, (ypq) obj, axxbVar, ayorVar);
    }

    public static ywm k(Context context, Optional optional, ScheduledExecutorService scheduledExecutorService) {
        return new ywm(context, optional, scheduledExecutorService);
    }

    public static aajg l(aagi aagiVar, aahf aahfVar, aajd aajdVar, aaki aakiVar) {
        return new aajg(aagiVar, aahfVar, aajdVar, aakiVar);
    }

    public static aapn m(amqo amqoVar) {
        return new aapn(amqoVar);
    }

    public static sno n(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 1);
    }

    public static sno o(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 3, (char[]) null);
    }

    public static sno p(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 4, (short[]) null);
    }

    public static sno q(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 5, (int[]) null);
    }

    public static sno r(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 6);
    }

    public static sno s(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 7, (boolean[]) null);
    }

    public static sno t(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 8, (float[]) null);
    }

    public static sno u(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 9, (byte[][]) null);
    }

    public static sno v(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 10, (char[][]) null);
    }

    public static sno w(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 11, (short[][]) null);
    }

    public static sno x(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 12, (int[][]) null);
    }

    public static sno y(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 13, (boolean[][]) null);
    }

    public static sno z(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new sno(azqbVar, azqbVar2, azqbVar3, azqbVar4, 14, (float[][]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                return a((ankx) this.a.get(), opf.e().intValue(), ((spr) this.b).get(), (ampq) ((axov) this.c).a, (ampq) ((axov) this.d).a);
            case 1:
                return new oog((ykw) this.a.get(), (afug) this.b.get(), (afuj) this.c.get(), ((yim) this.d).get());
            case 2:
                return c((vzw) this.c.get(), (Context) ((axov) this.b).a, ((yid) this.a).get(), (whp) this.d.get());
            case 3:
                return d(this.a, this.b, (aasu) this.d.get(), (yni) this.c.get());
            case 4:
                return e((Executor) this.d.get(), (abeb) this.b.get(), (abec) this.c.get(), (wwf) this.a.get());
            case 5:
                return f(this.b, this.a, this.d, (Executor) this.c.get());
            case 6:
                return g(this.a, this.b, (amvn) this.c.get(), (aadd) this.d.get());
            case 7:
                return new wty(this.a, ((axpa) this.c).get(), this.d, (CopyOnWriteArrayList) this.b.get());
            case 8:
                return h((Context) ((axov) this.d).a, (aizr) this.c.get(), (aizp) this.a.get(), (aynx) this.b.get());
            case 9:
                return i((aacz) this.a.get(), (afwu) this.c.get(), (afwu) this.b.get(), (snc) this.d.get());
            case 10:
                return new xfc((xey) this.d.get(), (afvn) this.b.get(), (Executor) this.a.get(), (afzo) this.c.get());
            case 11:
                return xrz.p((Context) ((axov) this.d).a, this.b, ((yin) this.c).b(), (ankx) this.a.get());
            case 12:
                return j(this.c, this.a.get(), (axxb) this.b.get(), (ayor) this.d.get());
            case 13:
                return new yrr((yme) this.a.get(), (Context) ((axov) this.b).a, (ExecutorService) this.d.get(), (ExecutorService) this.c.get());
            case 14:
                return new ysh(this.a, this.c, this.b, (yme) this.d.get());
            case 15:
                ywm k = k((Context) ((axov) this.a).a, (Optional) ((axov) this.b).a, (ScheduledExecutorService) this.d.get());
                k.b((ywr) this.c.get());
                return k;
            case 16:
                return aaly.c((Context) ((axov) this.d).a, ((yin) this.c).b(), (ankw) this.a.get(), (vlk) this.b.get());
            case 17:
                return aaly.d((Context) ((axov) this.d).a, ((yin) this.c).b(), (ankw) this.a.get(), (vlk) this.b.get());
            case 18:
                return l((aagi) this.a.get(), (aahf) this.c.get(), (aajd) this.b.get(), (aaki) this.d.get());
            case 19:
                Context context = (Context) ((axov) this.b).a;
                afsm afsmVar = (afsm) this.d.get();
                SharedPreferences sharedPreferences = (SharedPreferences) this.c.get();
                return m(((wjw) this.a).b());
            default:
                return new aare((aarc) this.b.get(), (ScheduledExecutorService) this.d.get(), (snc) this.c.get(), (aadd) this.a.get());
        }
    }
}
