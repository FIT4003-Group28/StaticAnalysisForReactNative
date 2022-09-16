package defpackage;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: wze  reason: default package */
/* loaded from: classes4.dex */
public final class wze implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final /* synthetic */ int d;

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i) {
        this.d = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[] bArr, byte[] bArr2) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[] cArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, float[] fArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, int[] iArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, short[] sArr) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, boolean[] zArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[][] bArr) {
        this.d = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, float[][] fArr) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, int[][] iArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, short[][] sArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[][][] cArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, float[][][] fArr) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, int[][][] iArr) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, short[][][] sArr) {
        this.d = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
    }

    public wze(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, boolean[][][] zArr) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public static wze A(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 14, (byte[][][]) null);
    }

    public static wze B(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 15, (char[][][]) null);
    }

    public static wze C(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 16, (short[][][]) null);
    }

    public static wze D(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 17, (int[][][]) null);
    }

    public static wze E(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 18, (boolean[][][]) null);
    }

    public static wze F(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 19, (float[][][]) null);
    }

    public static wze G(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 20, null, null);
    }

    public static wze a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3);
    }

    public static wwe b(aadd aaddVar, snc sncVar, wkl wklVar) {
        return new wwe(aaddVar, sncVar, wklVar);
    }

    public static File c(Context context, String str, Object obj) {
        File b = yih.b("CacheDir", context.getCacheDir());
        for (int i = 0; i < 5 && b == null; i++) {
            Thread.yield();
            StringBuilder sb = new StringBuilder(19);
            sb.append("CacheDir");
            sb.append(i);
            b = yih.b(sb.toString(), context.getCacheDir());
        }
        if (b == null) {
            b = yih.b("ExternalCacheDir", context.getExternalCacheDir());
        }
        String property = System.getProperty("java.io.tmpdir");
        String packageName = context.getPackageName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(property).length() + 1 + String.valueOf(packageName).length());
        sb2.append(property);
        sb2.append("/");
        sb2.append(packageName);
        final File file = new File(sb2.toString());
        if (b != null) {
            if (file.isDirectory()) {
                final yig yigVar = (yig) obj;
                yigVar.a.execute(new Runnable() { // from class: yif
                    @Override // java.lang.Runnable
                    public final void run() {
                        File[] listFiles;
                        yig yigVar2 = yig.this;
                        for (File file2 : file.listFiles()) {
                            if (file2.isDirectory() && file2.getName().startsWith("failovercache-")) {
                                yigVar2.a(file2);
                            }
                        }
                    }
                });
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("failovercache-");
            sb3.append(currentTimeMillis);
            b = new File(file, sb3.toString());
            String valueOf = String.valueOf(b.getPath());
            zep.g(valueOf.length() != 0 ? "Could not obtain a cache directory - using failover dir: ".concat(valueOf) : new String("Could not obtain a cache directory - using failover dir: "));
            b.mkdirs();
        }
        if (str != null) {
            File file2 = new File(b, str);
            file2.mkdir();
            return file2;
        }
        return b;
    }

    public static yke d(Executor executor, yjt yjtVar, Runnable runnable) {
        return new yke(executor, yjtVar, runnable);
    }

    public static ankx e(Set set, Context context, sof sofVar) {
        ankx a = sofVar.a(ylr.a(Math.max(4, zgd.z()), 0, "critical", set));
        axzl.o(a);
        return a;
    }

    public static ankx f(Set set, Context context, sof sofVar) {
        ankx a = sofVar.a(ylr.a(2, 9, "init", set));
        axzl.o(a);
        return a;
    }

    public static ankx g(Set set, Context context, sof sofVar) {
        ankx a = sofVar.a(ylr.a(2, 10, "logging", set));
        axzl.o(a);
        return a;
    }

    public static ypq h(Context context, yme ymeVar, Handler handler) {
        return new ypq(context, ymeVar, handler);
    }

    public static aapv i(Set set, aadd aaddVar) {
        return new aapv(set, aaddVar);
    }

    public static aeqf j(axxl axxlVar, axnm axnmVar, axnm axnmVar2) {
        aeqf aeqfVar;
        if (((Boolean) axxlVar.a().aw()).booleanValue()) {
            ampq ampqVar = (ampq) axnmVar.get();
            if (ampqVar.h()) {
                aeqfVar = (aeqf) ampqVar.c();
                axzl.o(aeqfVar);
                return aeqfVar;
            }
        }
        aeqfVar = (aeqf) axnmVar2.get();
        axzl.o(aeqfVar);
        return aeqfVar;
    }

    public static ampq k(ampq ampqVar, acrr acrrVar, ankw ankwVar) {
        return ampqVar.h() ? ampq.j(new aeqe((aaed) ampqVar.c(), acrrVar, ankwVar)) : amon.a;
    }

    public static Executor l(Executor executor, afjz afjzVar) {
        int i = 1;
        if (afjzVar.am() && (afjzVar.n().b & 16777216) != 0) {
            apfv apfvVar = afjzVar.n().t;
            if (apfvVar == null) {
                apfvVar = apfv.a;
            }
            int a = apfu.a(apfvVar.b);
            if (a != 0) {
                i = a;
            }
        }
        Executor c = aeik.c(i, executor);
        axzl.o(c);
        return c;
    }

    public static Executor m(Executor executor, atts attsVar) {
        int i = 1;
        if (attsVar != null && (attsVar.c & 67108864) != 0) {
            apfv apfvVar = attsVar.p;
            if (apfvVar == null) {
                apfvVar = apfv.a;
            }
            int a = apfu.a(apfvVar.b);
            if (a != 0) {
                i = a;
            }
        }
        Executor c = aeik.c(i, executor);
        axzl.o(c);
        return c;
    }

    public static wze n(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 1);
    }

    public static wze o(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 2, (byte[]) null);
    }

    public static wze p(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 3, (char[]) null);
    }

    public static wze q(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 4, (short[]) null);
    }

    public static wze r(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 5, (int[]) null);
    }

    public static wze s(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 6, (boolean[]) null);
    }

    public static wze t(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 7, (float[]) null);
    }

    public static wze u(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 8, (byte[][]) null);
    }

    public static wze v(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 9, (char[][]) null);
    }

    public static wze w(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 10, (short[][]) null);
    }

    public static wze x(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 11, (int[][]) null);
    }

    public static wze y(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 12, (boolean[][]) null);
    }

    public static wze z(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wze(azqbVar, azqbVar2, azqbVar3, 13, (float[][]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                return new wzb((wkn) ((axov) this.a).a, (snc) this.b.get(), (wxb) this.c.get());
            case 1:
                return b((aadd) this.b.get(), (snc) this.c.get(), (wkl) this.a.get());
            case 2:
                return new xff((afwu) this.b.get(), (xio) this.a.get(), (Executor) this.c.get());
            case 3:
                return c((Context) ((axov) this.c).a, (String) ((axov) this.b).a, ((yii) this.a).get());
            case 4:
                return d((Executor) this.a.get(), (yjt) this.c.get(), (Runnable) this.b.get());
            case 5:
                return e(((axpa) this.b).get(), (Context) ((axov) this.a).a, ((sog) this.c).get());
            case 6:
                return f(((axpa) this.b).get(), (Context) ((axov) this.a).a, ((sog) this.c).get());
            case 7:
                return g(((axpa) this.b).get(), (Context) ((axov) this.a).a, ((sog) this.c).get());
            case 8:
                return h((Context) ((axov) this.c).a, (yme) this.a.get(), (Handler) this.b.get());
            case 9:
                return new yuf(((amgd) this.c).get(), ((amgf) this.b).get(), (zdj) this.a.get());
            case 10:
                return new yyx((Context) ((axov) this.c).a, (yrj) this.b.get(), (axxb) this.a.get());
            case 11:
                return new zdp((Context) ((axov) this.c).a, (ExecutorService) this.b.get(), (snc) this.a.get());
            case 12:
                azqb azqbVar = this.c;
                azqb azqbVar2 = this.b;
                ((afsf) this.a).get();
                return new aadh(azqbVar, azqbVar2);
            case 13:
                Context context = (Context) ((axov) this.a).a;
                return i(((axpa) this.b).get(), (aadd) this.c.get());
            case 14:
                return new aaqp(this.a, (aadd) this.c.get(), (afvn) this.b.get());
            case 15:
                return new aavl(this.c, (yjs) this.b.get(), (aacz) this.a.get());
            case 16:
                return new acrk((Context) ((axov) this.c).a, (snc) this.a.get(), this.b);
            case 17:
                return j((axxl) this.a.get(), axot.a(this.c), axot.a(this.b));
            case 18:
                return k((ampq) ((axov) this.a).a, (acrr) this.c.get(), (ankw) this.b.get());
            case 19:
                Context context2 = (Context) ((axov) this.c).a;
                return l((Executor) this.a.get(), (afjz) this.b.get());
            default:
                atts attsVar = ((adym) this.b).get();
                Context context3 = (Context) ((axov) this.c).a;
                return m((Executor) this.a.get(), attsVar);
        }
    }
}
