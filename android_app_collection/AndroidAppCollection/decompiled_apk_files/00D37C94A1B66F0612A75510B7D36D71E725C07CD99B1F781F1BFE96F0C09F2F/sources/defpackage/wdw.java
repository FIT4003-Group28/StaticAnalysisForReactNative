package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.security.Key;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.NetworkQualityRttListener;
/* compiled from: PG */
/* renamed from: wdw  reason: default package */
/* loaded from: classes4.dex */
public final class wdw implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final /* synthetic */ int g;

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i) {
        this.g = i;
        this.b = azqbVar;
        this.d = azqbVar2;
        this.a = azqbVar3;
        this.c = azqbVar4;
        this.f = azqbVar5;
        this.e = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, byte[] bArr) {
        this.g = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.f = azqbVar4;
        this.e = azqbVar5;
        this.a = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, byte[] bArr, byte[] bArr2) {
        this.g = i;
        this.b = azqbVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.d = azqbVar4;
        this.a = azqbVar5;
        this.c = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, char[] cArr) {
        this.g = i;
        this.a = azqbVar;
        this.d = azqbVar2;
        this.c = azqbVar3;
        this.b = azqbVar4;
        this.f = azqbVar5;
        this.e = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, float[] fArr) {
        this.g = i;
        this.f = azqbVar;
        this.e = azqbVar2;
        this.c = azqbVar3;
        this.b = azqbVar4;
        this.d = azqbVar5;
        this.a = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, int[] iArr) {
        this.g = i;
        this.b = azqbVar;
        this.f = azqbVar2;
        this.e = azqbVar3;
        this.c = azqbVar4;
        this.d = azqbVar5;
        this.a = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, short[] sArr) {
        this.g = i;
        this.f = azqbVar;
        this.e = azqbVar2;
        this.a = azqbVar3;
        this.c = azqbVar4;
        this.d = azqbVar5;
        this.b = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, boolean[] zArr) {
        this.g = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.e = azqbVar3;
        this.c = azqbVar4;
        this.f = azqbVar5;
        this.d = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, byte[][] bArr) {
        this.g = i;
        this.e = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
        this.a = azqbVar4;
        this.d = azqbVar5;
        this.f = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, char[][] cArr) {
        this.g = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.f = azqbVar4;
        this.a = azqbVar5;
        this.e = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, float[][] fArr) {
        this.g = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.f = azqbVar3;
        this.a = azqbVar4;
        this.c = azqbVar5;
        this.e = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, int[][] iArr) {
        this.g = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
        this.f = azqbVar4;
        this.c = azqbVar5;
        this.e = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, short[][] sArr) {
        this.g = i;
        this.f = azqbVar;
        this.e = azqbVar2;
        this.c = azqbVar3;
        this.a = azqbVar4;
        this.b = azqbVar5;
        this.d = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.d = azqbVar;
        this.c = azqbVar2;
        this.f = azqbVar3;
        this.a = azqbVar4;
        this.b = azqbVar5;
        this.e = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.f = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.c = azqbVar4;
        this.e = azqbVar5;
        this.d = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, char[][][] cArr) {
        this.g = i;
        this.b = azqbVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.c = azqbVar4;
        this.a = azqbVar5;
        this.d = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, float[][][] fArr) {
        this.g = i;
        this.d = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.a = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, int[][][] iArr) {
        this.g = i;
        this.a = azqbVar;
        this.f = azqbVar2;
        this.d = azqbVar3;
        this.b = azqbVar4;
        this.c = azqbVar5;
        this.e = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, short[][][] sArr) {
        this.g = i;
        this.a = azqbVar;
        this.d = azqbVar2;
        this.f = azqbVar3;
        this.e = azqbVar4;
        this.b = azqbVar5;
        this.c = azqbVar6;
    }

    public wdw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, int i, boolean[][][] zArr) {
        this.g = i;
        this.e = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.d = azqbVar4;
        this.c = azqbVar5;
        this.f = azqbVar6;
    }

    public static wdw A(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 18, (boolean[][][]) null);
    }

    public static wdw B(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 19, (float[][][]) null);
    }

    public static wdw C(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 20, null, null);
    }

    public static wea a(azqb azqbVar, aacz aaczVar, Context context, ankw ankwVar, vlk vlkVar, String str) {
        vjf a = vjg.a(context);
        a.e("account");
        a.f("account.pb");
        Uri a2 = a.a();
        vlo d = vlr.d(context, ankwVar);
        d.d("pre_incognito_signed_in_user_id");
        d.b();
        d.c = str;
        d.e(fdg.k);
        vlr a3 = d.a();
        yvh d2 = yvi.d(azqbVar, ankwVar);
        d2.a = mem.u;
        d2.b(wdp.g);
        d2.b = wdp.f;
        d2.c = lto.f;
        yvi a4 = d2.a();
        vli a5 = vlj.a();
        a5.e(awtd.a);
        a5.f(a2);
        a5.b(a3);
        a5.b(a4);
        return new wea(azqbVar, vlkVar.a(a5.a()), aaczVar);
    }

    public static Set b(wmd wmdVar, wna wnaVar, wve wveVar, wtj wtjVar, wte wteVar, wvu wvuVar) {
        return new LinkedHashSet(Arrays.asList(wmdVar, wnaVar, wveVar, wtjVar, wteVar, wvuVar));
    }

    public static aizr c(Context context, azqb azqbVar, azqb azqbVar2, aiix aiixVar, Executor executor, Executor executor2) {
        return new aizr(context, azqbVar, azqbVar2, aiixVar, executor, executor2);
    }

    public static xiw d(afzo afzoVar, xix xixVar, xis xisVar, xfc xfcVar, airw airwVar, aynx aynxVar) {
        return new xiw(afzoVar, xixVar, xisVar, xfcVar, airwVar, aynxVar);
    }

    public static CronetEngine e(CronetEngine cronetEngine, yrr yrrVar, final Context context, final yme ymeVar, final File file, final azqb azqbVar) {
        if (cronetEngine == null && (cronetEngine = yrrVar.a(new yjd() { // from class: yrv
            @Override // defpackage.yjd
            public final Object a(Object obj, Object obj2) {
                atnv atnvVar;
                Context context2 = context;
                yme ymeVar2 = ymeVar;
                File file2 = file;
                azqb azqbVar2 = azqbVar;
                try {
                    apfo apfoVar = ymeVar2.a().d;
                    if (apfoVar == null) {
                        apfoVar = apfo.a;
                    }
                    apfp apfpVar = apfoVar.f;
                    if (apfpVar == null) {
                        apfpVar = apfp.a;
                    }
                    if ((apfpVar.b & 1) != 0) {
                        apfp apfpVar2 = apfoVar.f;
                        if (apfpVar2 == null) {
                            apfpVar2 = apfp.a;
                        }
                        atnvVar = apfpVar2.c;
                        if (atnvVar == null) {
                            atnvVar = atnv.a;
                        }
                    } else {
                        aopa createBuilder = atnv.a.createBuilder();
                        createBuilder.copyOnWrite();
                        atnv atnvVar2 = (atnv) createBuilder.instance;
                        atnvVar2.b |= 2;
                        atnvVar2.d = true;
                        createBuilder.copyOnWrite();
                        atnv atnvVar3 = (atnv) createBuilder.instance;
                        atnvVar3.b |= 1;
                        atnvVar3.c = true;
                        atnvVar = (atnv) createBuilder.mo39build();
                    }
                    ((ExperimentalCronetEngine.Builder) obj).mo558enableQuic(atnvVar.d).mo555enableHttp2(atnvVar.c).mo560setLibraryLoader((CronetEngine.Builder.LibraryLoader) new yrw(context2));
                    File file3 = new File(file2, "cronet_metadata_cache");
                    file3.mkdirs();
                    if (file3.isDirectory()) {
                        ((ExperimentalCronetEngine.Builder) obj).mo561setStoragePath(file3.getAbsolutePath());
                        ((ExperimentalCronetEngine.Builder) obj).mo556enableHttpCache(2, 0L);
                    }
                    apfw apfwVar = ymf.a(ymeVar2.a()).d;
                    if (apfwVar == null) {
                        apfwVar = apfw.a;
                    }
                    apft apftVar = apfwVar.c;
                    if (apftVar == null) {
                        apftVar = apft.a;
                    }
                    String str = apftVar.b;
                    if (!TextUtils.isEmpty(str)) {
                        ((ExperimentalCronetEngine.Builder) obj).setExperimentalOptions(str);
                    }
                    boolean z = ymeVar2.c().j;
                    ((ExperimentalCronetEngine.Builder) obj).enableNetworkQualityEstimator(z);
                    if (atnvVar.d) {
                        List<String> list = apftVar.c;
                        if (list.isEmpty()) {
                            list = amuk.A("www.googleapis.com", "www.googleadservices.com", "youtubei.googleapis.com", "yt3.ggpht.com", "yt3.googleusercontent.com", "www.gstatic.com", "csi.gstatic.com", "myphonenumbers-pa.googleapis.com", "people-pa.googleapis.com", "i.ytimg.com", "video.google.com", "s.youtube.com", "www.youtube.com", "googleads.g.doubleclick.net");
                        }
                        for (String str2 : list) {
                            ((ExperimentalCronetEngine.Builder) obj).mo553addQuicHint(str2, 443, 443);
                        }
                    }
                    ((CronetEngine.Builder) obj).enableBrotli(true);
                    ExperimentalCronetEngine mo554build = ((ExperimentalCronetEngine.Builder) obj).mo554build();
                    if (!z) {
                        return mo554build;
                    }
                    mo554build.addRttListener((NetworkQualityRttListener) azqbVar2.get());
                    return mo554build;
                } catch (Throwable th) {
                    String valueOf = String.valueOf(obj2);
                    zep.d(valueOf.length() != 0 ? "Failed to construct CronetEngine using ".concat(valueOf) : new String("Failed to construct CronetEngine using "), th);
                    return null;
                }
            }
        })) == null) {
            throw new IllegalStateException("Could not create CronetEngine");
        }
        return cronetEngine;
    }

    public static yqw f(aaay aaayVar, yqy yqyVar, ces cesVar, yqx yqxVar, Executor executor, aabf aabfVar) {
        int i = aaayVar.c;
        yqw b = yqyVar.b(cesVar, yqxVar, executor, aabfVar, "bg-innertube");
        axzl.o(b);
        return b;
    }

    public static yqw g(aaay aaayVar, yqy yqyVar, ces cesVar, yqx yqxVar, Executor executor, aabf aabfVar) {
        int i = aaayVar.c;
        yqw b = yqyVar.b(cesVar, yqxVar, executor, aabfVar, "ui-innertube");
        axzl.o(b);
        return b;
    }

    public static acrb h(Executor executor, ywk ywkVar, aadd aaddVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new acrb(executor, ywkVar, aaddVar, azqbVar, azqbVar2, azqbVar3);
    }

    public static acsc i(acrf acrfVar, Object obj, aazp aazpVar, afvn afvnVar, ykw ykwVar, afug afugVar) {
        return new acsc(acrfVar, (acrs) obj, aazpVar, afvnVar, ykwVar, afugVar);
    }

    public static afig j(amqo amqoVar, ankx ankxVar, afjz afjzVar, acvh acvhVar, acrr acrrVar, afvn afvnVar) {
        return new afig(amqoVar, ankxVar, afjzVar, acvhVar, acrrVar, afvnVar);
    }

    public static wdw k(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 2, (byte[]) null);
    }

    public static wdw l(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 3, (char[]) null);
    }

    public static wdw m(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 4, (short[]) null);
    }

    public static wdw n(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 5, (int[]) null);
    }

    public static wdw o(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 6, (boolean[]) null);
    }

    public static wdw p(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 7, (float[]) null);
    }

    public static wdw q(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 8, (byte[][]) null);
    }

    public static wdw r(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 9, (char[][]) null);
    }

    public static wdw s(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 10, (short[][]) null);
    }

    public static wdw t(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 11, (int[][]) null);
    }

    public static wdw u(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 12, (boolean[][]) null);
    }

    public static wdw v(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 13, (float[][]) null);
    }

    public static wdw w(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 14, (byte[][][]) null);
    }

    public static wdw x(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 15, (char[][][]) null);
    }

    public static wdw y(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 16, (short[][][]) null);
    }

    public static wdw z(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new wdw(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, 17, (int[][][]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.g) {
            case 0:
                return a(this.a, (aacz) this.b.get(), (Context) ((axov) this.c).a, (ankw) this.d.get(), (vlk) this.e.get(), ((yin) this.f).b());
            case 1:
                ((txh) this.b).get();
                tqe tqeVar = (tqe) this.e.get();
                return new tvy((snc) this.d.get(), (trv) this.a.get(), (vne) this.c.get(), (Executor) this.f.get());
            case 2:
                return b((wmd) this.b.get(), (wna) this.c.get(), (wve) this.d.get(), (wtj) this.f.get(), (wte) this.e.get(), (wvu) this.a.get());
            case 3:
                return new wuz(this.a, this.d, this.c, this.b, (Executor) this.f.get(), this.e);
            case 4:
                wnb wnbVar = (wnb) this.f.get();
                wvy wvyVar = (wvy) this.e.get();
                wwc wwcVar = (wwc) this.a.get();
                wvw wvwVar = (wvw) this.c.get();
                wwe wweVar = (wwe) this.d.get();
                wwf wwfVar = (wwf) this.b.get();
                return new wvx(wnbVar, wvyVar, wwcVar, wvwVar, wweVar);
            case 5:
                return c((Context) ((axov) this.b).a, this.f, this.e, (aiix) this.c.get(), (Executor) this.d.get(), (Executor) this.a.get());
            case 6:
                return d((afzo) this.a.get(), (xix) this.b.get(), (xis) this.e.get(), (xfc) this.c.get(), (airw) this.f.get(), (aynx) this.d.get());
            case 7:
                return e((CronetEngine) ((axov) this.f).a, (yrr) this.e.get(), (Context) ((axov) this.c).a, (yme) this.b.get(), (File) this.d.get(), this.a);
            case 8:
                return f((aaay) ((axov) this.e).a, (yqy) this.c.get(), (ces) this.b.get(), (yqx) this.a.get(), (Executor) this.d.get(), ((aabg) this.f).get());
            case 9:
                return g((aaay) ((axov) this.c).a, (yqy) this.b.get(), (ces) this.d.get(), (yqx) this.f.get(), (Executor) this.a.get(), ((aabg) this.e).get());
            case 10:
                return new abbe((aaqj) this.f.get(), (aaqf) this.e.get(), (afvn) this.c.get(), (yqw) this.a.get(), (yni) this.b.get(), (aagi) this.d.get());
            case 11:
                return h((Executor) this.d.get(), (ywk) this.b.get(), (aadd) this.a.get(), this.f, this.c, this.e);
            case 12:
                return i((acrf) this.d.get(), this.c.get(), (aazp) this.f.get(), (afvn) this.a.get(), (ykw) this.b.get(), (afug) this.e.get());
            case 13:
                ((afsh) this.d).get();
                Context context = (Context) ((axov) this.b).a;
                return new actp((SharedPreferences) this.f.get(), (yve) this.a.get(), (acrr) this.c.get(), (aadd) this.e.get());
            case 14:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f.get();
                zfq zfqVar = (zfq) this.a.get();
                snc sncVar = (snc) this.b.get();
                acrr acrrVar = (acrr) this.c.get();
                Executor executor = (Executor) this.e.get();
                Context context2 = (Context) ((axov) this.d).a;
                return new acvf(sharedPreferences, zfqVar, sncVar, acrrVar, executor);
            case 15:
                return new aegh((amqo) this.b.get(), (Key) this.e.get(), (afkf) this.f.get(), (aadd) this.c.get(), (afjz) this.a.get(), (aeai) this.d.get());
            case 16:
                return j(((adyq) this.a).get(), (ankx) this.d.get(), (afjz) this.f.get(), (acvh) this.e.get(), (acrr) this.b.get(), (afvn) this.c.get());
            case 17:
                return new afja((snc) this.a.get(), (snc) this.f.get(), (Context) ((axov) this.d).a, (afst) this.b.get(), (aadd) this.c.get(), ((afjg) this.e).get());
            case 18:
                return new afuw((Executor) this.e.get(), this.a, axot.a(this.b), (yme) this.d.get(), this.c, (ampq) ((axov) this.f).a);
            case 19:
                return new aiiv((yni) this.d.get(), (aynx) this.b.get(), (aijh) this.c.get(), (aiqo) this.a.get(), (aynx) this.e.get(), (aynx) this.f.get());
            default:
                return new aitv((aitp) this.b.get(), (aity) this.e.get(), ((aiuh) this.f).get(), ((aiuu) this.d).get(), ((aiun) this.a).get(), (aadd) this.c.get());
        }
    }
}
