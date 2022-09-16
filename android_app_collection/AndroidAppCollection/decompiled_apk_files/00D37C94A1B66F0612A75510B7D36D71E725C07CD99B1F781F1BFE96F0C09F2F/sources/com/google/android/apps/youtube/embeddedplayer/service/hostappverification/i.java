package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final /* synthetic */ int d;

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i) {
        this.d = i;
        this.c = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[] bArr) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[] cArr) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, float[] fArr) {
        this.d = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, int[] iArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, short[] sArr) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, boolean[] zArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[][] bArr) {
        this.d = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[][] cArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, float[][] fArr) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, int[][] iArr) {
        this.d = i;
        this.c = azqbVar;
        this.b = azqbVar2;
        this.a = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, short[][] sArr) {
        this.d = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[][][] cArr) {
        this.d = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, int[][][] iArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, short[][][] sArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, boolean[][][] zArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public static i A(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 16, (byte[][][]) null);
    }

    public static i B(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 17, (char[][][]) null);
    }

    public static i C(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 18, (short[][][]) null);
    }

    public static i D(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 19, (int[][][]) null);
    }

    public static i E(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 20, (boolean[][][]) null);
    }

    public static i a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3);
    }

    public static ankx b(ankx ankxVar, ampq ampqVar, sof sofVar) {
        ankx a;
        if (((Boolean) ampqVar.e(false)).booleanValue()) {
            a = sofVar.a(swm.f(ankxVar));
        } else {
            a = sofVar.a(soc.a(ankxVar));
        }
        axzl.o(a);
        return a;
    }

    public static ankx c(ankx ankxVar, ampq ampqVar, sof sofVar) {
        ankx a;
        if (((Boolean) ampqVar.e(false)).booleanValue()) {
            a = sofVar.a(swm.f(ankxVar));
        } else {
            a = sofVar.a(soc.a(ankxVar));
        }
        axzl.o(a);
        return a;
    }

    public static ankx d(ankx ankxVar, ampq ampqVar, sof sofVar) {
        ankx a;
        if (((Boolean) ampqVar.e(false)).booleanValue()) {
            a = sofVar.a(swm.f(ankxVar));
        } else {
            a = sofVar.a(soc.a(ankxVar));
        }
        axzl.o(a);
        return a;
    }

    public static ankx e(ankx ankxVar, spm spmVar, ampq ampqVar) {
        final pgw pgwVar = pgw.b;
        ThreadFactory e = snr.e("Blocking", snr.a(11, new ThreadFactory() { // from class: snj
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return pgwVar.newThread(new ibx(runnable, 2, (byte[]) null));
            }
        }));
        return soa.a(anlz.e(soi.a(ampqVar, snr.g(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), (ThreadFactory) (!spmVar.a.h() ? amon.a : ampq.j(new spf((spn) spmVar.a.c(), e))).e(e)))), ankxVar);
    }

    public static wnd f(Executor executor, Executor executor2) {
        return new wnd(executor, executor2);
    }

    public static wnm g(afvn afvnVar, Executor executor) {
        return new wnm(afvnVar, executor);
    }

    public static wps h(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wps(azqbVar, azqbVar2, azqbVar3);
    }

    public static wre i(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new wre(azqbVar, azqbVar2, azqbVar3);
    }

    public static wtw j(wli wliVar, Map map, wwf wwfVar) {
        return new wtw(wliVar, map);
    }

    public static wux k(wmi wmiVar, wwf wwfVar) {
        return new wux(wmiVar, wwfVar);
    }

    public static wvi l(azqb azqbVar, wwf wwfVar, wnj wnjVar) {
        return new wvi(azqbVar, wnjVar);
    }

    public static i m(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 1);
    }

    public static i n(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 2);
    }

    public static i o(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 3, (byte[]) null);
    }

    public static i p(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 4, (char[]) null);
    }

    public static i q(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 5, (short[]) null);
    }

    public static i r(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 6);
    }

    public static i s(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 7, (int[]) null);
    }

    public static i t(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 9, (float[]) null);
    }

    public static i u(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 10, (byte[][]) null);
    }

    public static i v(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 11, (char[][]) null);
    }

    public static i w(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new i(azqbVar, azqbVar3, azqbVar4, 12, (short[][]) null);
    }

    public static i x(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 13, (int[][]) null);
    }

    public static i y(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 14, (boolean[][]) null);
    }

    public static i z(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new i(azqbVar, azqbVar2, azqbVar3, 15, (float[][]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        afuj afujVar;
        switch (this.d) {
            case 0:
                return new h((yqw) this.a.get(), (com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f) this.b.get(), (String) this.c.get());
            case 1:
                azqb azqbVar = this.c;
                azqb azqbVar2 = this.a;
                if (((ywk) this.b.get()).c(ywk.S) == 1) {
                    afujVar = (afuj) azqbVar.get();
                } else {
                    afujVar = (afuj) azqbVar2.get();
                }
                axzl.o(afujVar);
                return afujVar;
            case 2:
                return new com.google.android.apps.youtube.embeddedplayer.service.permissions.c((b) this.c.get(), (Executor) this.a.get(), (aacz) this.b.get());
            case 3:
                return b((ankx) this.a.get(), (ampq) this.b.get(), ((sog) this.c).get());
            case 4:
                return c((ankx) this.a.get(), (ampq) this.b.get(), ((sog) this.c).get());
            case 5:
                return d((ankx) this.a.get(), (ampq) this.b.get(), ((sog) this.c).get());
            case 6:
                return e((ankx) this.c.get(), ((spr) this.a).get(), (ampq) ((axov) this.b).a);
            case 7:
                return new vnq(this.b, this.a, this.c);
            case 8:
                return new whp(((amgc) this.b).get(), (whn) this.a.get(), akve.a(), (Context) ((axov) this.c).a);
            case 9:
                aadd aaddVar = (aadd) this.b.get();
                return f((Executor) this.c.get(), (Executor) this.a.get());
            case 10:
                wwf wwfVar = (wwf) this.c.get();
                return g((afvn) this.a.get(), (Executor) this.b.get());
            case 11:
                return h(this.b, this.a, this.c);
            case 12:
                return i(this.b, this.c, this.a);
            case 13:
                return new wtc(this.c, this.b, this.a);
            case 14:
                azqb azqbVar3 = this.a;
                azqb azqbVar4 = this.c;
                wwf wwfVar2 = (wwf) this.b.get();
                return new wtq(azqbVar3, azqbVar4);
            case 15:
                return j((wli) this.a.get(), ((axow) this.c).get(), (wwf) this.b.get());
            case 16:
                aadd aaddVar2 = (aadd) this.a.get();
                return k((wmi) this.b.get(), (wwf) this.c.get());
            case 17:
                return l(this.b, (wwf) this.c.get(), (wnj) this.a.get());
            case 18:
                azqb azqbVar5 = this.b;
                azqb azqbVar6 = this.a;
                wwf wwfVar3 = (wwf) this.c.get();
                return new wvp(azqbVar5, azqbVar6);
            case 19:
                aadd aaddVar3 = (aadd) this.c.get();
                return new wvw((wkn) ((axov) this.b).a, (wnb) this.a.get());
            default:
                return new wwd((wkn) ((axov) this.b).a, (wvw) this.a.get(), (aadd) this.c.get());
        }
    }
}
