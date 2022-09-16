package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.StrictMode;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: txr  reason: default package */
/* loaded from: classes4.dex */
public final class txr implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final /* synthetic */ int f;

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i) {
        this.f = i;
        this.e = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
        this.d = azqbVar4;
        this.a = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, byte[] bArr) {
        this.f = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.e = azqbVar4;
        this.d = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.d = azqbVar;
        this.e = azqbVar2;
        this.c = azqbVar3;
        this.b = azqbVar4;
        this.a = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, char[] cArr) {
        this.f = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, float[] fArr) {
        this.f = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.e = azqbVar3;
        this.d = azqbVar4;
        this.b = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, int[] iArr) {
        this.f = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.e = azqbVar3;
        this.d = azqbVar4;
        this.c = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, short[] sArr) {
        this.f = i;
        this.c = azqbVar;
        this.e = azqbVar2;
        this.a = azqbVar3;
        this.d = azqbVar4;
        this.b = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, boolean[] zArr) {
        this.f = i;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.a = azqbVar3;
        this.b = azqbVar4;
        this.e = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, byte[][] bArr) {
        this.f = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.e = azqbVar3;
        this.d = azqbVar4;
        this.b = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, char[][] cArr) {
        this.f = i;
        this.a = azqbVar;
        this.e = azqbVar2;
        this.d = azqbVar3;
        this.c = azqbVar4;
        this.b = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, float[][] fArr) {
        this.f = i;
        this.a = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
        this.b = azqbVar4;
        this.c = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, int[][] iArr) {
        this.f = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.e = azqbVar3;
        this.a = azqbVar4;
        this.d = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, short[][] sArr) {
        this.f = i;
        this.a = azqbVar;
        this.e = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.b = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.c = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.b = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, char[][][] cArr) {
        this.f = i;
        this.e = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
        this.b = azqbVar4;
        this.d = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, float[][][] fArr) {
        this.f = i;
        this.d = azqbVar;
        this.e = azqbVar2;
        this.c = azqbVar3;
        this.b = azqbVar4;
        this.a = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, int[][][] iArr) {
        this.f = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.e = azqbVar3;
        this.d = azqbVar4;
        this.b = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, short[][][] sArr) {
        this.f = i;
        this.b = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
        this.a = azqbVar4;
        this.c = azqbVar5;
    }

    public txr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.a = azqbVar4;
        this.e = azqbVar5;
    }

    public static txr A(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 20, null, null);
    }

    public static ankx a(ankx ankxVar, int i, ampq ampqVar, spm spmVar, ampq ampqVar2) {
        boolean booleanValue = ((Boolean) ampqVar.e(false)).booleanValue();
        StrictMode.ThreadPolicy.Builder penaltyLog = new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyLog();
        if (Build.VERSION.SDK_INT >= 23) {
            penaltyLog.detectResourceMismatches();
            if (Build.VERSION.SDK_INT >= 26) {
                penaltyLog.detectUnbufferedIo();
            }
        }
        return soa.a(anlz.e(soi.a(ampqVar2, snr.d(i, booleanValue, spmVar, snr.e("BG", snr.a(10, snr.f(penaltyLog.build(), pgw.b)))))), ankxVar);
    }

    public static Set b(wmd wmdVar, wna wnaVar, wve wveVar, wtj wtjVar, wvu wvuVar) {
        return new LinkedHashSet(Arrays.asList(wmdVar, wnaVar, wveVar, wtjVar, wvuVar));
    }

    public static wna c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, wwf wwfVar) {
        return new wna(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    public static wpj d(azqb azqbVar, azqb azqbVar2, Executor executor, Executor executor2, wwf wwfVar) {
        return new wpj(azqbVar, azqbVar2, executor, executor2, wwfVar);
    }

    public static wrk e(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, Executor executor) {
        return new wrk(azqbVar, azqbVar2, azqbVar3, azqbVar4, executor);
    }

    public static wvd f(azqb azqbVar, azqb azqbVar2, wwf wwfVar, wtv wtvVar, wtx wtxVar) {
        return new wvd(azqbVar, azqbVar2, wtvVar, wtxVar);
    }

    public static wvq g(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, wwf wwfVar) {
        return new wvq(azqbVar, azqbVar2, azqbVar3);
    }

    public static wwa h(snc sncVar, wnb wnbVar, wmu wmuVar, azqb azqbVar, wwf wwfVar) {
        return new wwa(sncVar, wnbVar, wmuVar, azqbVar);
    }

    public static yqf i(yug yugVar, ConnectivityManager connectivityManager, azqb azqbVar, Object obj) {
        return new yqf(yugVar, connectivityManager, azqbVar, (ypq) obj);
    }

    public static txr j(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 1);
    }

    public static txr k(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 4, (short[]) null);
    }

    public static txr l(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 5, (int[]) null);
    }

    public static txr m(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new txr(azqbVar, azqbVar2, azqbVar4, azqbVar5, azqbVar6, 6, (boolean[]) null);
    }

    public static txr n(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 7, (float[]) null);
    }

    public static txr o(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 8, (byte[][]) null);
    }

    public static txr p(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 9, (char[][]) null);
    }

    public static txr q(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 10, (short[][]) null);
    }

    public static txr r(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 11, (int[][]) null);
    }

    public static txr s(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 12, (boolean[][]) null);
    }

    public static txr t(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 13, (float[][]) null);
    }

    public static txr u(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 14, (byte[][][]) null);
    }

    public static txr v(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 15, (char[][][]) null);
    }

    public static txr w(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 16, (short[][][]) null);
    }

    public static txr x(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 17, (int[][][]) null);
    }

    public static txr y(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 18, (boolean[][][]) null);
    }

    public static txr z(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new txr(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, 19, (float[][][]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.f) {
            case 0:
                return new twg(((txh) this.a).get(), (trv) this.b.get(), (vne) this.c.get(), (Executor) this.d.get(), (tqe) this.e.get());
            case 1:
                return a((ankx) this.e.get(), ((snn) this.c).get().intValue(), (ampq) ((axov) this.b).a, ((spr) this.d).get(), (ampq) ((axov) this.a).a);
            case 2:
                ((txh) this.c).get();
                return new tvy((snc) this.a.get(), (trv) this.b.get(), (vne) this.e.get(), (Executor) this.d.get());
            case 3:
                return new twg(((txh) this.a).get(), (trv) this.b.get(), (vne) this.c.get(), (Executor) this.d.get(), (tqe) this.e.get());
            case 4:
                return b((wmd) this.c.get(), (wna) this.e.get(), (wve) this.a.get(), (wtj) this.d.get(), (wvu) this.b.get());
            case 5:
                return c(this.b, this.a, this.e, this.d, (wwf) this.c.get());
            case 6:
                return d(this.c, this.d, (Executor) this.a.get(), (Executor) this.b.get(), (wwf) this.e.get());
            case 7:
                return e(this.c, this.a, this.e, this.d, (Executor) this.b.get());
            case 8:
                azqb azqbVar = this.a;
                azqb azqbVar2 = this.c;
                azqb azqbVar3 = this.e;
                azqb azqbVar4 = this.d;
                azqb azqbVar5 = this.b;
                amum h = amup.h();
                h.f(apcd.SLOT_TYPE_BELOW_PLAYER, azqbVar);
                h.f(apcd.SLOT_TYPE_IN_PLAYER, azqbVar3);
                h.f(apcd.SLOT_TYPE_LOCKSCREEN, azqbVar4);
                h.f(apcd.SLOT_TYPE_FIXED_FOOTER, azqbVar3);
                h.f(apcd.SLOT_TYPE_FORECASTING, azqbVar2);
                h.f(apcd.SLOT_TYPE_PLAYER_BYTES, azqbVar5);
                return h.b();
            case 9:
                azqb azqbVar6 = this.a;
                azqb azqbVar7 = this.e;
                azqb azqbVar8 = this.d;
                azqb azqbVar9 = this.c;
                azqb azqbVar10 = this.b;
                amum h2 = amup.h();
                h2.f(apcd.SLOT_TYPE_BELOW_PLAYER, azqbVar6);
                h2.f(apcd.SLOT_TYPE_IN_PLAYER, azqbVar7);
                h2.f(apcd.SLOT_TYPE_LOCKSCREEN, azqbVar8);
                h2.f(apcd.SLOT_TYPE_FORECASTING, azqbVar9);
                h2.f(apcd.SLOT_TYPE_PLAYER_BYTES, azqbVar10);
                return h2.b();
            case 10:
                return f(this.a, this.e, (wwf) this.c.get(), (wtv) this.d.get(), (wtx) this.b.get());
            case 11:
                azqb azqbVar11 = this.c;
                azqb azqbVar12 = this.b;
                azqb azqbVar13 = this.e;
                azqb azqbVar14 = this.a;
                wwf wwfVar = (wwf) this.d.get();
                return new wvg(azqbVar11, azqbVar12, azqbVar13, azqbVar14);
            case 12:
                azqb azqbVar15 = this.a;
                azqb azqbVar16 = this.b;
                azqb azqbVar17 = this.d;
                aadd aaddVar = (aadd) this.e.get();
                return g(azqbVar15, azqbVar16, azqbVar17, (wwf) this.c.get());
            case 13:
                return h((snc) this.a.get(), (wnb) this.d.get(), (wmu) this.e.get(), this.b, (wwf) this.c.get());
            case 14:
                return new wzf((wkn) ((axov) this.a).a, (snc) this.c.get(), (zah) this.d.get(), (yrj) this.e.get(), (zdw) this.b.get());
            case 15:
                return new ykw((ywk) this.e.get(), (ScheduledExecutorService) this.c.get(), (Executor) this.a.get(), this.b, this.d);
            case 16:
                ConnectivityManager connectivityManager = ((amgd) this.d).get();
                azqb azqbVar18 = this.e;
                Executor executor = (Executor) this.a.get();
                return i((yug) this.b.get(), connectivityManager, azqbVar18, this.c.get());
            case 17:
                boolean booleanValue = yie.a().booleanValue();
                azqb azqbVar19 = this.c;
                Context context = (Context) ((axov) this.a).a;
                return new zej(booleanValue, azqbVar19, (Executor) this.e.get(), (zeh) this.d.get(), ((zek) this.b).get());
            case 18:
                return new aaau((SharedPreferences) this.b.get(), (snc) this.c.get(), this.d, (ywk) this.a.get(), (Context) ((axov) this.e).a);
            case 19:
                return new aasu((aaqj) this.d.get(), (aaqf) this.e.get(), (afvn) this.c.get(), (yqw) this.b.get(), (snc) this.a.get());
            default:
                afvn afvnVar = (afvn) this.c.get();
                return new aazp((aaqj) this.d.get(), (aaqf) this.e.get(), (yqw) this.b.get(), (aacz) this.a.get());
        }
    }
}
