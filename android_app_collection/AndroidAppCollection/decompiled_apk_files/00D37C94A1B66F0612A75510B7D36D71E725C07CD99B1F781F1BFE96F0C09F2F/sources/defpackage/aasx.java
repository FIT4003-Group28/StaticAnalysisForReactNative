package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aasx  reason: default package */
/* loaded from: classes.dex */
public final class aasx implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final /* synthetic */ int e;

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.c = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, byte[] bArr, byte[] bArr2) {
        this.e = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.a = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, char[] cArr) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, float[] fArr) {
        this.e = i;
        this.d = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.c = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, int[] iArr) {
        this.e = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.b = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, short[] sArr) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, byte[][] bArr) {
        this.e = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.d = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, char[][] cArr) {
        this.e = i;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.b = azqbVar3;
        this.a = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, float[][] fArr) {
        this.e = i;
        this.d = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
        this.a = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, int[][] iArr) {
        this.e = i;
        this.b = azqbVar;
        this.d = azqbVar2;
        this.a = azqbVar3;
        this.c = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, short[][] sArr) {
        this.e = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.a = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.d = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
        this.b = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.d = azqbVar3;
        this.c = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, char[][][] cArr) {
        this.e = i;
        this.d = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
        this.b = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, float[][][] fArr) {
        this.e = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
        this.c = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, int[][][] iArr) {
        this.e = i;
        this.b = azqbVar;
        this.d = azqbVar2;
        this.a = azqbVar3;
        this.c = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, short[][][] sArr) {
        this.e = i;
        this.d = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.c = azqbVar4;
    }

    public aasx(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.d = azqbVar3;
        this.b = azqbVar4;
    }

    public static aasx A(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 15, (char[][][]) null);
    }

    public static aasx B(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 16, (short[][][]) null);
    }

    public static aasx C(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 17, (int[][][]) null);
    }

    public static aasx D(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 18, (boolean[][][]) null);
    }

    public static aasx E(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 19, (float[][][]) null);
    }

    public static aasx F(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 20, null, null);
    }

    public static aasx a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    public static aasz b(aaqj aaqjVar, aaqf aaqfVar, yqw yqwVar) {
        return new aasz(aaqjVar, aaqfVar, yqwVar);
    }

    public static abgf c(SharedPreferences sharedPreferences, azqb azqbVar, azqb azqbVar2, Executor executor) {
        return new abgf(sharedPreferences, azqbVar, azqbVar2, executor);
    }

    public static abgm d(Object obj, Object obj2, Object obj3, aacb aacbVar) {
        abgg abggVar = (abgg) obj3;
        return new abgm((abgf) obj, (abgk) obj2, aacbVar);
    }

    public static aego e(aegi aegiVar, aegq aegqVar, Executor executor, aegt aegtVar) {
        return new aego(aegiVar, aegqVar, executor, aegtVar);
    }

    public static aepj f(azqb azqbVar, yrj yrjVar, aant aantVar) {
        return new aepj(azqbVar, yrjVar, aantVar);
    }

    public static aeqt g(yve yveVar, ScheduledExecutorService scheduledExecutorService, aadd aaddVar, acrr acrrVar) {
        return new aeqt(yveVar, scheduledExecutorService, aaddVar, acrrVar);
    }

    public static afmq h(yve yveVar, aynx aynxVar, aadd aaddVar, axxl axxlVar) {
        return new afmq(yveVar, aynxVar, aaddVar, axxlVar);
    }

    public static afua i(afum afumVar, afun afunVar, ywk ywkVar) {
        return new afua(afumVar, afunVar, ywkVar);
    }

    public static afum j(afso afsoVar, snc sncVar, ymq ymqVar, ykw ykwVar) {
        return new afum(afsoVar, sncVar, ymqVar, ykwVar);
    }

    public static List k(aino ainoVar, aino ainoVar2, aino ainoVar3, aino ainoVar4) {
        amuk u = amuk.u(ainoVar, ainoVar2, ainoVar3, ainoVar4);
        axzl.o(u);
        return u;
    }

    public static ahfq l(afkf afkfVar) {
        return new ahfq(afkfVar);
    }

    public static BandaidConnectionOpenerController m(aekg aekgVar, yni yniVar, airw airwVar, aacz aaczVar) {
        return new BandaidConnectionOpenerController(aekgVar, yniVar, airwVar, aaczVar);
    }

    public static aids n(ailf ailfVar, Executor executor, aadd aaddVar) {
        return new aids(ailfVar, executor, aaddVar);
    }

    public static aasx o(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 3, (char[]) null);
    }

    public static aasx p(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 4, (short[]) null);
    }

    public static aasx q(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 5, (int[]) null);
    }

    public static aasx r(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 6, (boolean[]) null);
    }

    public static aasx s(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 7, (float[]) null);
    }

    public static aasx t(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 8, (byte[][]) null);
    }

    public static aasx u(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 9, (char[][]) null);
    }

    public static aasx v(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 10, (short[][]) null);
    }

    public static aasx w(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 11, (int[][]) null);
    }

    public static aasx x(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 12, (boolean[][]) null);
    }

    public static aasx y(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 13, (float[][]) null);
    }

    public static aasx z(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aasx(azqbVar, azqbVar2, azqbVar3, azqbVar4, 14, (byte[][][]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                afvn afvnVar = (afvn) this.c.get();
                return new aasw((aaqj) this.a.get(), (aaqf) this.b.get(), (yqw) this.d.get());
            case 1:
                return new aasc((aaqj) this.a.get(), ((aasd) this.b).get(), (yqw) this.d.get(), (aacz) this.c.get());
            case 2:
                afvn afvnVar2 = (afvn) this.c.get();
                return b((aaqj) this.a.get(), (aaqf) this.b.get(), (yqw) this.d.get());
            case 3:
                return new aavo((aaqj) this.a.get(), (aaqf) this.b.get(), (afvn) this.c.get(), (yqw) this.d.get());
            case 4:
                return new aawx((aaqj) this.a.get(), (aaqf) this.b.get(), (afvn) this.c.get(), (yqw) this.d.get());
            case 5:
                return new aaxg((aaqj) this.a.get(), (aaqf) this.c.get(), ((aabd) this.d).get(), ((aabc) this.b).get());
            case 6:
                return new abab((aaqj) this.a.get(), (aaqf) this.b.get(), (afvn) this.c.get(), (yqw) this.d.get());
            case 7:
                return c((SharedPreferences) this.d.get(), this.a, this.b, (Executor) this.c.get());
            case 8:
                return d(this.c.get(), this.a.get(), this.b.get(), (aacb) this.d.get());
            case 9:
                return e((aegi) this.c.get(), (aegq) this.d.get(), (Executor) this.b.get(), (aegt) this.a.get());
            case 10:
                aepv aepvVar = (aepv) this.a.get();
                return f(this.c, (yrj) this.b.get(), (aant) this.d.get());
            case 11:
                return new aepv((yrj) this.b.get(), (yve) this.d.get(), (ScheduledExecutorService) this.a.get(), (aadd) this.c.get());
            case 12:
                return g((yve) this.d.get(), (ScheduledExecutorService) this.c.get(), (aadd) this.a.get(), (acrr) this.b.get());
            case 13:
                return h((yve) this.d.get(), (aynx) this.c.get(), (aadd) this.b.get(), (axxl) this.a.get());
            case 14:
                afso afsoVar = (afso) this.b.get();
                return i((afum) this.a.get(), (afun) this.d.get(), (ywk) this.c.get());
            case 15:
                return j((afso) this.d.get(), (snc) this.c.get(), (ymq) this.a.get(), (ykw) this.b.get());
            case 16:
                return k((aino) this.d.get(), (aino) this.a.get(), (aino) this.b.get(), (aino) this.c.get());
            case 17:
                ahfq l = l((afkf) this.b.get());
                l.b((aynx) this.d.get(), (aynx) this.a.get(), (aynx) this.c.get());
                return l;
            case 18:
                return m((aekg) this.c.get(), (yni) this.a.get(), (airw) this.d.get(), (aacz) this.b.get());
            case 19:
                ((aiiw) this.c).get();
                return n((ailf) this.d.get(), (Executor) this.b.get(), (aadd) this.a.get());
            default:
                return new aiea((Executor) this.c.get(), ((aida) this.b).get(), ((aidf) this.d).get(), (aadd) this.a.get());
        }
    }
}
