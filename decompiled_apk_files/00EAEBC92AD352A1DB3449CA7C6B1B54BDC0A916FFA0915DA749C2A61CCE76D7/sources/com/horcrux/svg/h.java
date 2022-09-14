package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h {
    static final h p = new h();

    /* renamed from: a  reason: collision with root package name */
    final double f9592a;

    /* renamed from: b  reason: collision with root package name */
    final String f9593b;

    /* renamed from: c  reason: collision with root package name */
    final g0 f9594c;

    /* renamed from: d  reason: collision with root package name */
    final ReadableMap f9595d;

    /* renamed from: e  reason: collision with root package name */
    i0 f9596e;

    /* renamed from: f  reason: collision with root package name */
    int f9597f;

    /* renamed from: g  reason: collision with root package name */
    final String f9598g;

    /* renamed from: h  reason: collision with root package name */
    final String f9599h;
    final h0 i;
    final j0 j;
    private final k0 k;
    final double l;
    final double m;
    final double n;
    final boolean o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final i0[] f9600a;

        /* renamed from: b  reason: collision with root package name */
        private static final int[] f9601b;

        static {
            i0 i0Var = i0.w100;
            i0 i0Var2 = i0.w900;
            f9600a = new i0[]{i0Var, i0Var, i0.w200, i0.w300, i0.Normal, i0.w500, i0.w600, i0.Bold, i0.w800, i0Var2, i0Var2};
            f9601b = new int[]{400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};
        }

        private static int a(int i) {
            if (i < 350) {
                return 400;
            }
            if (i < 550) {
                return 700;
            }
            if (i >= 900) {
                return i;
            }
            return 900;
        }

        static int a(i0 i0Var, h hVar) {
            return i0Var == i0.Bolder ? a(hVar.f9597f) : i0Var == i0.Lighter ? b(hVar.f9597f) : f9601b[i0Var.ordinal()];
        }

        private static int b(int i) {
            if (i < 100) {
                return i;
            }
            if (i < 550) {
                return 100;
            }
            return i < 750 ? 400 : 700;
        }

        static i0 c(int i) {
            return f9600a[Math.round(i / 100.0f)];
        }
    }

    private h() {
        this.f9595d = null;
        this.f9593b = "";
        this.f9594c = g0.normal;
        this.f9596e = i0.Normal;
        this.f9597f = 400;
        this.f9598g = "";
        this.f9599h = "";
        this.i = h0.normal;
        this.j = j0.start;
        this.k = k0.None;
        this.o = false;
        this.l = 0.0d;
        this.f9592a = 12.0d;
        this.m = 0.0d;
        this.n = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(com.facebook.react.bridge.ReadableMap r12, com.horcrux.svg.h r13, double r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.h.<init>(com.facebook.react.bridge.ReadableMap, com.horcrux.svg.h, double):void");
    }

    private double a(ReadableMap readableMap, String str, double d2, double d3, double d4) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : w.a(readableMap.getString(str), d4, d2, d3);
    }

    private void a(h hVar) {
        this.f9597f = hVar.f9597f;
        this.f9596e = hVar.f9596e;
    }

    private void a(h hVar, double d2) {
        long round = Math.round(d2);
        if (round < 1 || round > 1000) {
            a(hVar);
            return;
        }
        this.f9597f = (int) round;
        this.f9596e = a.c(this.f9597f);
    }
}
