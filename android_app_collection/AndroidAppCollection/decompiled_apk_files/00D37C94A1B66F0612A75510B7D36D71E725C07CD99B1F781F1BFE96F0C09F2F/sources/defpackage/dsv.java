package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: dsv  reason: default package */
/* loaded from: classes3.dex */
public class dsv extends dsq {
    private static long r = 0;
    protected static final Object s = new Object();
    static boolean t = false;
    private static dta x;
    protected final boolean u;
    protected final String v;
    dtw w;

    /* JADX INFO: Access modifiers changed from: protected */
    public dsv(Context context) {
        super(context);
        this.u = false;
        this.v = "";
    }

    private final synchronized void n(dtq dtqVar, aopa aopaVar) {
        Long l;
        MotionEvent motionEvent;
        try {
            dtr r2 = r(dtqVar, this.b, this.q);
            Long l2 = r2.a;
            if (l2 != null) {
                long longValue = l2.longValue();
                aopaVar.copyOnWrite();
                dnw dnwVar = (dnw) aopaVar.instance;
                dnw dnwVar2 = dnw.a;
                dnwVar.b |= 8192;
                dnwVar.l = longValue;
            }
            Long l3 = r2.b;
            if (l3 != null) {
                long longValue2 = l3.longValue();
                aopaVar.copyOnWrite();
                dnw dnwVar3 = (dnw) aopaVar.instance;
                dnw dnwVar4 = dnw.a;
                dnwVar3.b |= 16384;
                dnwVar3.m = longValue2;
            }
            Long l4 = r2.c;
            if (l4 != null) {
                long longValue3 = l4.longValue();
                aopaVar.copyOnWrite();
                dnw dnwVar5 = (dnw) aopaVar.instance;
                dnw dnwVar6 = dnw.a;
                dnwVar5.b |= 32768;
                dnwVar5.n = longValue3;
            }
            if (this.p) {
                Long l5 = r2.d;
                if (l5 != null) {
                    long longValue4 = l5.longValue();
                    aopaVar.copyOnWrite();
                    dnw dnwVar7 = (dnw) aopaVar.instance;
                    dnw dnwVar8 = dnw.a;
                    dnwVar7.b |= 1073741824;
                    dnwVar7.z = longValue4;
                }
                Long l6 = r2.e;
                if (l6 != null) {
                    long longValue5 = l6.longValue();
                    aopaVar.copyOnWrite();
                    dnw dnwVar9 = (dnw) aopaVar.instance;
                    dnw dnwVar10 = dnw.a;
                    dnwVar9.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                    dnwVar9.A = longValue5;
                }
            }
        } catch (dti unused) {
        }
        aopa createBuilder = dnu.a.createBuilder();
        if (this.d > 0 && dts.h(this.q)) {
            long a = dts.a(this.k, this.q);
            createBuilder.copyOnWrite();
            dnu dnuVar = (dnu) createBuilder.instance;
            dnuVar.b |= 4096;
            dnuVar.o = a;
            long a2 = dts.a(this.n - this.l, this.q);
            createBuilder.copyOnWrite();
            dnu dnuVar2 = (dnu) createBuilder.instance;
            dnuVar2.b |= 8192;
            dnuVar2.p = a2;
            long a3 = dts.a(this.o - this.m, this.q);
            createBuilder.copyOnWrite();
            dnu dnuVar3 = (dnu) createBuilder.instance;
            dnuVar3.b |= 16384;
            dnuVar3.q = a3;
            long a4 = dts.a(this.l, this.q);
            createBuilder.copyOnWrite();
            dnu dnuVar4 = (dnu) createBuilder.instance;
            dnuVar4.b |= 131072;
            dnuVar4.t = a4;
            long a5 = dts.a(this.m, this.q);
            createBuilder.copyOnWrite();
            dnu dnuVar5 = (dnu) createBuilder.instance;
            dnuVar5.b |= 262144;
            dnuVar5.u = a5;
            if (this.p && (motionEvent = this.b) != null) {
                long a6 = dts.a(((this.l - this.n) + motionEvent.getRawX()) - this.b.getX(), this.q);
                if (a6 != 0) {
                    createBuilder.copyOnWrite();
                    dnu dnuVar6 = (dnu) createBuilder.instance;
                    dnuVar6.b = 32768 | dnuVar6.b;
                    dnuVar6.r = a6;
                }
                long a7 = dts.a(((this.m - this.o) + this.b.getRawY()) - this.b.getY(), this.q);
                if (a7 != 0) {
                    createBuilder.copyOnWrite();
                    dnu dnuVar7 = (dnu) createBuilder.instance;
                    dnuVar7.b |= 65536;
                    dnuVar7.s = a7;
                }
            }
        }
        try {
            dtr b = b(this.b);
            Long l7 = b.a;
            if (l7 != null) {
                long longValue6 = l7.longValue();
                createBuilder.copyOnWrite();
                dnu dnuVar8 = (dnu) createBuilder.instance;
                dnuVar8.b |= 1;
                dnuVar8.c = longValue6;
            }
            Long l8 = b.b;
            if (l8 != null) {
                long longValue7 = l8.longValue();
                createBuilder.copyOnWrite();
                dnu dnuVar9 = (dnu) createBuilder.instance;
                dnuVar9.b |= 2;
                dnuVar9.d = longValue7;
            }
            long longValue8 = b.c.longValue();
            createBuilder.copyOnWrite();
            dnu dnuVar10 = (dnu) createBuilder.instance;
            dnuVar10.b |= 128;
            dnuVar10.j = longValue8;
            if (this.p) {
                Long l9 = b.e;
                if (l9 != null) {
                    long longValue9 = l9.longValue();
                    createBuilder.copyOnWrite();
                    dnu dnuVar11 = (dnu) createBuilder.instance;
                    dnuVar11.b |= 4;
                    dnuVar11.e = longValue9;
                }
                Long l10 = b.d;
                if (l10 != null) {
                    long longValue10 = l10.longValue();
                    createBuilder.copyOnWrite();
                    dnu dnuVar12 = (dnu) createBuilder.instance;
                    dnuVar12.b |= 16;
                    dnuVar12.g = longValue10;
                }
                Long l11 = b.f;
                if (l11 != null) {
                    int i = l11.longValue() != 0 ? 2 : 1;
                    createBuilder.copyOnWrite();
                    dnu dnuVar13 = (dnu) createBuilder.instance;
                    dnuVar13.i = i - 1;
                    dnuVar13.b |= 64;
                }
                if (this.e > 0) {
                    if (dts.h(this.q)) {
                        double d = this.j;
                        double d2 = this.e;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        l = Long.valueOf(Math.round(d / d2));
                    } else {
                        l = null;
                    }
                    if (l == null) {
                        createBuilder.copyOnWrite();
                        dnu dnuVar14 = (dnu) createBuilder.instance;
                        dnuVar14.b &= -9;
                        dnuVar14.f = -1L;
                    } else {
                        long longValue11 = l.longValue();
                        createBuilder.copyOnWrite();
                        dnu dnuVar15 = (dnu) createBuilder.instance;
                        dnuVar15.b |= 8;
                        dnuVar15.f = longValue11;
                    }
                    double d3 = this.i;
                    double d4 = this.e;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    long round = Math.round(d3 / d4);
                    createBuilder.copyOnWrite();
                    dnu dnuVar16 = (dnu) createBuilder.instance;
                    dnuVar16.b |= 32;
                    dnuVar16.h = round;
                }
                Long l12 = b.i;
                if (l12 != null) {
                    long longValue12 = l12.longValue();
                    createBuilder.copyOnWrite();
                    dnu dnuVar17 = (dnu) createBuilder.instance;
                    dnuVar17.b |= 512;
                    dnuVar17.l = longValue12;
                }
                Long l13 = b.j;
                if (l13 != null) {
                    long longValue13 = l13.longValue();
                    createBuilder.copyOnWrite();
                    dnu dnuVar18 = (dnu) createBuilder.instance;
                    dnuVar18.b |= 256;
                    dnuVar18.k = longValue13;
                }
                Long l14 = b.k;
                if (l14 != null) {
                    int i2 = l14.longValue() != 0 ? 2 : 1;
                    createBuilder.copyOnWrite();
                    dnu dnuVar19 = (dnu) createBuilder.instance;
                    dnuVar19.m = i2 - 1;
                    dnuVar19.b |= 1024;
                }
            }
        } catch (dti unused2) {
        }
        long j = this.h;
        if (j > 0) {
            createBuilder.copyOnWrite();
            dnu dnuVar20 = (dnu) createBuilder.instance;
            dnuVar20.b |= 2048;
            dnuVar20.n = j;
        }
        dnu dnuVar21 = (dnu) createBuilder.mo39build();
        aopaVar.copyOnWrite();
        dnw dnwVar11 = (dnw) aopaVar.instance;
        dnw dnwVar12 = dnw.a;
        dnuVar21.getClass();
        dnwVar11.P = dnuVar21;
        dnwVar11.c |= 262144;
        long j2 = this.d;
        if (j2 > 0) {
            aopaVar.copyOnWrite();
            dnw dnwVar13 = (dnw) aopaVar.instance;
            dnwVar13.c |= 8;
            dnwVar13.D = j2;
        }
        long j3 = this.e;
        if (j3 > 0) {
            aopaVar.copyOnWrite();
            dnw dnwVar14 = (dnw) aopaVar.instance;
            dnwVar14.c |= 4;
            dnwVar14.C = j3;
        }
        long j4 = this.f;
        if (j4 > 0) {
            aopaVar.copyOnWrite();
            dnw dnwVar15 = (dnw) aopaVar.instance;
            dnwVar15.c |= 2;
            dnwVar15.B = j4;
        }
        long j5 = this.g;
        if (j5 > 0) {
            aopaVar.copyOnWrite();
            dnw dnwVar16 = (dnw) aopaVar.instance;
            dnwVar16.c |= 16;
            dnwVar16.E = j5;
        }
        try {
            int size = this.c.size() - 1;
            if (size > 0) {
                aopaVar.copyOnWrite();
                ((dnw) aopaVar.instance).Q = dnw.emptyProtobufList();
                for (int i3 = 0; i3 < size; i3++) {
                    dtr r3 = r(a, (MotionEvent) this.c.get(i3), this.q);
                    aopa createBuilder2 = dnu.a.createBuilder();
                    long longValue14 = r3.a.longValue();
                    createBuilder2.copyOnWrite();
                    dnu dnuVar22 = (dnu) createBuilder2.instance;
                    dnuVar22.b |= 1;
                    dnuVar22.c = longValue14;
                    long longValue15 = r3.b.longValue();
                    createBuilder2.copyOnWrite();
                    dnu dnuVar23 = (dnu) createBuilder2.instance;
                    dnuVar23.b |= 2;
                    dnuVar23.d = longValue15;
                    dnu dnuVar24 = (dnu) createBuilder2.mo39build();
                    aopaVar.copyOnWrite();
                    dnw dnwVar17 = (dnw) aopaVar.instance;
                    dnuVar24.getClass();
                    aopu aopuVar = dnwVar17.Q;
                    if (!aopuVar.c()) {
                        dnwVar17.Q = aopi.mutableCopy(aopuVar);
                    }
                    dnwVar17.Q.add(dnuVar24);
                }
            }
        } catch (dti unused3) {
            aopaVar.copyOnWrite();
            ((dnw) aopaVar.instance).Q = dnw.emptyProtobufList();
        }
    }

    protected static dtq q(Context context, boolean z) {
        if (a == null) {
            synchronized (s) {
                if (a == null) {
                    dtq dtqVar = new dtq(context);
                    try {
                        dtqVar.b = Executors.newCachedThreadPool(new dtn());
                        dtqVar.f = z;
                        if (z) {
                            dtqVar.g = dtqVar.b.submit(new dtp(dtqVar, 1));
                        }
                        dtqVar.b.execute(new dtp(dtqVar));
                        try {
                            qrr qrrVar = qrr.d;
                            dtqVar.l = qse.a(dtqVar.a) > 0;
                            dtqVar.m = qrrVar.g(dtqVar.a) == 0;
                        } catch (Throwable unused) {
                        }
                        dtqVar.e(0);
                        if (dts.f() && ((Boolean) qdb.u.e()).booleanValue()) {
                            throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                        }
                    } catch (dti unused2) {
                    }
                    try {
                        try {
                            byte[] k = ehi.k("1Z2qgivTzV9YGAbOwKhIw6ujNIgWW1T8VsIvSQbuRnU=", false);
                            if (k.length != 32) {
                                throw new dtb();
                            }
                            byte[] bArr = new byte[16];
                            ByteBuffer.wrap(k, 4, 16).get(bArr);
                            for (int i = 0; i < 16; i++) {
                                bArr[i] = (byte) (bArr[i] ^ 68);
                            }
                            dtqVar.d = bArr;
                            try {
                                File cacheDir = dtqVar.a.getCacheDir();
                                if (cacheDir == null && (cacheDir = dtqVar.a.getDir("dex", 0)) == null) {
                                    throw new dti();
                                }
                                File file = new File(String.format("%s/%s.jar", cacheDir, "1628710143622"));
                                if (!file.exists()) {
                                    byte[] a = dtc.a(dtqVar.d, "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");
                                    file.createNewFile();
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    fileOutputStream.write(a, 0, a.length);
                                    fileOutputStream.close();
                                }
                                dtqVar.f(cacheDir);
                                try {
                                    dtqVar.c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, dtqVar.a.getClassLoader());
                                    dtq.d(file);
                                    dtqVar.h(cacheDir);
                                    dtq.i(String.format("%s/%s.dex", cacheDir, "1628710143622"));
                                    dtqVar.k = new dso(dtqVar);
                                    dtqVar.n = true;
                                    if (dtqVar.n) {
                                        try {
                                            if (((Boolean) qdb.r.e()).booleanValue()) {
                                                dtqVar.g("30h4Fz18uZZbVGzKBLBoKkVF8B42NApMKEHsuvQbqPAyjVAya3fWZA3qi0MZaQmC", "YkD0zXJWncN/k4r6XwqSke5f5DfZ0idBivNJmGcmL5A=", new Class[0]);
                                            }
                                        } catch (IllegalStateException unused3) {
                                        }
                                        dtqVar.g("f70HkFQdiBT8cMNptimLJRMH1W3hPEd6hMsJ3HEMqd86My38P3Zp8TEoBc44fn1Y", "U4v8wqRVOlCdb08Y0ckEaEZgRwV3IyB603RZVIybJJ4=", Context.class);
                                        dtqVar.g("wKbXKo9FRYpF651/RXEAmUYW7OjT2JV8KmXbjruZd9ws7bCFI7lAUfA4vcIc8kFF", "EmX1KyH+75fHxL5GikSeUFMFtWZZrwDC1LRg9yOk6Q4=", Context.class);
                                        dtqVar.g("7FKshcMzQ2JvPaQohfxJtH9Je8aRuZ/whf+X1aCEEwwPu6U1MmOzUdyjQ5ADF7ql", "HFC1WuOf/amlv/T+hPB5sO3NRNYX+s095nHO9xmNpbc=", Context.class);
                                        dtqVar.g("Ut7bAnWbIKSJo3XjoHA4PLqBXjxAIstAab08ID6ImN/vaF9+yMgTBQsosjdDWqwk", "9Odb6fOMcFNJXWQmNVSn0GmBQ9RZp5IhG0YN3lGyJLg=", Context.class);
                                        dtqVar.g("2xhaeBqmljdcxdVRLDf+DsIqiMbtdgVwLAnyjmtzuBrCJQ9V1lc+udLICJmCUjME", "EmUnW+V8SpRlFPWPt2G17q1wScavZbElVhdmnpDMxvs=", Context.class);
                                        dtqVar.g("VYCDm5duSbIrDVEzx16kZEv8WHHF/iAgG7tmpbyNz9JTUOZl7vOBiagQjgSGt6PD", "GcAXLTlOKYjjJu9S8Z1CR6e5L3N6/FK7qoEK2PqRVKU=", Context.class, Boolean.TYPE);
                                        dtqVar.g("LTEc3HkkulP/VaRQsN6PrN1HOrAV6zGjmctLiFjI1HhIVlgJ9grYmd4BvP076r5S", "SogxclqUojanctnDxEiZun9qHyjV295x/AfH4vay8f0=", Context.class);
                                        dtqVar.g("1gMUWiGv0sK0cgryPlvo9jLAJHDCo5NgpzMHcm+jKGIJTp8g1qGgs5dX6atCDfWF", "5ZmmXYdlnDy4dpTQ7gtKfp8zHInfyJK95cOVqvDwe+s=", Context.class);
                                        dtqVar.g("OH01u4R/8nT9bpOkMT2NAfNgJMfa+KPZUX6lcVSpB1M5y0Tp+tlJmp28BZ9KoqJ9", "dnqk5aUJE+X9zhNTJuvCbJ+AdnTqule1KA97BhBi/Mw=", MotionEvent.class, DisplayMetrics.class);
                                        dtqVar.g("z8Mo3lyKSjC4eXQ/QUWYeO5HLnKtXjZATDbchIRCzQZJ7PVjp0Bp3WOrhk5qwe9/", "EuC6wdcA0Q+wNfmQGMLYgY+0tVegwiC4xtemGn/ZUyY=", MotionEvent.class, DisplayMetrics.class);
                                        dtqVar.g("7qQfVBj0qucDMIezkfZznwQ/TgBvJzjDF8gis4aOkX0sgFIOlDV4iWfwg37KzfBn", "M8MzEajoogfW90Zvcmp8+7EhAqEBWPn0oQ/WWLhYD08=", new Class[0]);
                                        dtqVar.g("VNPv7YZKewavdQDinNfpPD3Uz8E+OxSZlMO5yp59uh/qLaDK+tJnelblHJ9uQcZS", "bt6ywc4sDyIrNGz1BkT7NjFxbJ6bQgz1ccyHNtYdKM8=", new Class[0]);
                                        dtqVar.g("8FOfoSg6GUzmarTjoVEwRHyv/8uoJJi2g1L+rZUBWUhEOtIQPWlgr7FjPEHoFhoH", "0HdAPxfDHFp5HJKoXONtKzTL3Y8sTcLsbw89UYSrmrg=", new Class[0]);
                                        dtqVar.g("wWnsnrfaEjgDiT5hP7i+dn7esf1zvlHhC+yrZyt+Oo8EEMo22jHTZ8oimeD7y9Ti", "oWMo7VEx2fkoXIobcreRMHDEMI800p2C3gL485DGf4M=", new Class[0]);
                                        dtqVar.g("EiShIe/SkHUT8hUfhEivWZP8qDouzBOTt8NvLdB4+VXIimf5N5sD/OzoL/12ALlU", "QD/unac3OeKCZGOjxPE6q0VJk2js7FvkG4I1pjn4ySg=", new Class[0]);
                                        dtqVar.g("IgipmhaVUkY4fEO+K2mg3TapMmRR1GDlmcZK2gQZ9+w383vc1oudxrcjS5unTEC8", "7kMMpNRrmsQi7WHF1Que5U/NIKVctUpm62ERsCHIgmI=", new Class[0]);
                                        dtqVar.g("JIe8kIj3R382ivBBuQtMEsg4EGgVW1pnVVx1053uETSK+LqBvlt6HYm9Qd3bhtgC", "QD9dQ8yEk6iHamm5KPxnCPuxMXZqh6R9GdhVEqW1meI=", Context.class, Boolean.TYPE, String.class);
                                        dtqVar.g("V6T1TedZrtcDygIztSohrDr237SOB3B9gkWE2vd5weda6qECSMP3EMcUGqTEe/ql", "TFlUbo+9rNR5d2DBp1l30g/UAqBAxoyCSHApmzmib5A=", StackTraceElement[].class);
                                        dtqVar.g("Kmz5tBXAEaLXDuVtC28R2Eyl8yM/POYxi3NSzFUgrRu50JDfLf5aLi0MhLFpp+iH", "d0cJP5eIgMgE2VJN6x1Ml7ZD0Bx7puAZ4vqh2E5GAvg=", View.class, DisplayMetrics.class, Boolean.TYPE);
                                        dtqVar.g("FNppBUxPUBrne7MLqLDx+dDJA1RrSxvtH4m9zj+3rXLqKVhRHKgv3P+ef/Alz8+T", "u1GQspq8LWa8vRNbR+JVvgCocf8B0huoYc3A7KupNuo=", Context.class, Boolean.TYPE);
                                        dtqVar.g("+xL1e8QZLSvc5avAdhAJ2dPMY9tJ+E+Pcw9vRCpxSgaAdjULLicuRXOYag/oEXim", "7eQogHMGEguTVuu85xhVlPdHON7voa6e8rHTHq9G1io=", View.class, Activity.class, Boolean.TYPE);
                                        dtqVar.g("yOElNmKLikQbWbYlZO7eS7cS10eTGa3vu7bY/6J83fArIj+16FMluTqHzp+DnExg", "vukmknkXmiaeXRGZhbZXDM0DkkvkO8XxmNkNdqrMEQc=", Long.TYPE);
                                        try {
                                            if (((Boolean) qdb.v.e()).booleanValue()) {
                                                dtqVar.g("Cfog4LflgT2iolh3HPox3StcneC5NLf0gw2aUonuaLJPKhbA1Wu66BmCWbM0jSOP", "XRAysRCCrF/RlmJ5xodLZ5BvI0f/oj90F0MWB6a7FmI=", Context.class);
                                            }
                                        } catch (IllegalStateException unused4) {
                                        }
                                        dtqVar.g("EWNBd1AufMT/dQlBsHpOEgrj6TGESza4yroVGFWr1PP+cxObKT1XUomQ8m96KKHU", "SiwatXj9om3qBFCNeuxB6US/i18DTOSuvRAlCZmhg1Y=", Context.class);
                                        try {
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                if (((Boolean) qdb.w.e()).booleanValue()) {
                                                    dtqVar.g("PensvsJnNpL+yMY4XKkStmGa2ptSElaVh4r1XUZqw9XUyy1JGZtm1IlZ+/JN7vku", "iKRtJC3GX2+V8JbfzLbaCxdTcja6vuePh9SVzOC/Kyg=", NetworkCapabilities.class);
                                                }
                                            }
                                        } catch (IllegalStateException unused5) {
                                        }
                                    }
                                    a = dtqVar;
                                } catch (Throwable th) {
                                    dtq.d(file);
                                    dtqVar.h(cacheDir);
                                    dtq.i(String.format("%s/%s.dex", cacheDir, "1628710143622"));
                                    throw th;
                                }
                            } catch (dtb e) {
                                throw new dti(e);
                            } catch (FileNotFoundException e2) {
                                throw new dti(e2);
                            } catch (IOException e3) {
                                throw new dti(e3);
                            } catch (NullPointerException e4) {
                                throw new dti(e4);
                            }
                        } catch (dtb e5) {
                            throw new dti(e5);
                        }
                    } catch (IllegalArgumentException e6) {
                        throw new dtb(e6);
                    }
                }
            }
        }
        return a;
    }

    static dtr r(dtq dtqVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method c = dtqVar.c("OH01u4R/8nT9bpOkMT2NAfNgJMfa+KPZUX6lcVSpB1M5y0Tp+tlJmp28BZ9KoqJ9", "dnqk5aUJE+X9zhNTJuvCbJ+AdnTqule1KA97BhBi/Mw=");
        if (c == null || motionEvent == null) {
            throw new dti();
        }
        try {
            return new dtr((String) c.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new dti(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized void s(Context context, boolean z) {
        synchronized (dsv.class) {
            if (!t) {
                r = System.currentTimeMillis() / 1000;
                a = q(context, z);
                if (((Boolean) qdb.w.e()).booleanValue()) {
                    x = dta.a(context);
                }
                t = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void t(List list) {
        ExecutorService executorService;
        if (a == null || (executorService = a.b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) qdb.l.e()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String.format("class methods got exception: %s", dts.e(e));
        }
    }

    @Override // defpackage.dsq
    protected final long a(StackTraceElement[] stackTraceElementArr) {
        Method c = a.c("V6T1TedZrtcDygIztSohrDr237SOB3B9gkWE2vd5weda6qECSMP3EMcUGqTEe/ql", "TFlUbo+9rNR5d2DBp1l30g/UAqBAxoyCSHApmzmib5A=");
        if (c == null || stackTraceElementArr == null) {
            throw new dti();
        }
        try {
            return new dtj((String) c.invoke(null, stackTraceElementArr)).a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new dti(e);
        }
    }

    @Override // defpackage.dsq
    protected final dtr b(MotionEvent motionEvent) {
        Method c = a.c("z8Mo3lyKSjC4eXQ/QUWYeO5HLnKtXjZATDbchIRCzQZJ7PVjp0Bp3WOrhk5qwe9/", "EuC6wdcA0Q+wNfmQGMLYgY+0tVegwiC4xtemGn/ZUyY=");
        if (c == null || motionEvent == null) {
            throw new dti();
        }
        try {
            return new dtr((String) c.invoke(null, motionEvent, this.q));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new dti(e);
        }
    }

    @Override // defpackage.dsq
    protected aopa j(Context context, View view, Activity activity) {
        aopa createBuilder = dnw.a.createBuilder();
        if (!TextUtils.isEmpty(this.v)) {
            String str = this.v;
            createBuilder.copyOnWrite();
            dnw dnwVar = (dnw) createBuilder.instance;
            str.getClass();
            dnwVar.b |= 2;
            dnwVar.f = str;
        }
        u(q(context, this.u), createBuilder, view, activity, true);
        return createBuilder;
    }

    @Override // defpackage.dsq, defpackage.dsp
    public final void k(View view) {
        if (!((Boolean) qdb.o.e()).booleanValue()) {
            return;
        }
        if (this.w == null) {
            dtq dtqVar = a;
            this.w = new dtw(dtqVar.a, dtqVar.o);
        }
        this.w.d(view);
    }

    @Override // defpackage.dsq
    protected final aopa l(Context context, dnq dnqVar) {
        aopa createBuilder = dnw.a.createBuilder();
        if (!TextUtils.isEmpty(this.v)) {
            String str = this.v;
            createBuilder.copyOnWrite();
            dnw dnwVar = (dnw) createBuilder.instance;
            str.getClass();
            dnwVar.b |= 2;
            dnwVar.f = str;
        }
        p(q(context, this.u), context, createBuilder, dnqVar);
        if (dnqVar != null && (dnqVar.b & 2) != 0 && ((Boolean) qdb.p.e()).booleanValue()) {
            dns dnsVar = dnqVar.d;
            if (dnsVar == null) {
                dnsVar = dns.a;
            }
            if (!dts.g(dnsVar.c)) {
                aopa createBuilder2 = doa.a.createBuilder();
                dns dnsVar2 = dnqVar.d;
                if (dnsVar2 == null) {
                    dnsVar2 = dns.a;
                }
                String str2 = dnsVar2.c;
                createBuilder2.copyOnWrite();
                doa doaVar = (doa) createBuilder2.instance;
                str2.getClass();
                doaVar.b |= 1;
                doaVar.c = str2;
                doa doaVar2 = (doa) createBuilder2.mo39build();
                createBuilder.copyOnWrite();
                dnw dnwVar2 = (dnw) createBuilder.instance;
                doaVar2.getClass();
                dnwVar2.Y = doaVar2;
                dnwVar2.d |= 2;
            }
        }
        return createBuilder;
    }

    @Override // defpackage.dsq
    protected aopa m(Context context, View view, Activity activity) {
        aopa createBuilder = dnw.a.createBuilder();
        String str = this.v;
        createBuilder.copyOnWrite();
        dnw dnwVar = (dnw) createBuilder.instance;
        str.getClass();
        dnwVar.b |= 2;
        dnwVar.f = str;
        u(q(context, this.u), createBuilder, view, activity, false);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List o(dtq dtqVar, Context context, aopa aopaVar, dnq dnqVar) {
        int a = dtqVar.a();
        ArrayList arrayList = new ArrayList();
        if (!dtqVar.n) {
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.b |= 524288;
            dnwVar.p = 16384L;
            return arrayList;
        }
        arrayList.add(new dua(dtqVar, aopaVar, a, context, dnqVar));
        arrayList.add(new dud(dtqVar, aopaVar, r, a));
        arrayList.add(new duk(dtqVar, aopaVar, a));
        arrayList.add(new dun(dtqVar, aopaVar, a));
        arrayList.add(new dus(dtqVar, aopaVar, a));
        arrayList.add(new dtz(dtqVar, aopaVar, a, context));
        arrayList.add(new dub(dtqVar, aopaVar, a));
        arrayList.add(new duj(dtqVar, aopaVar, a));
        arrayList.add(new dul(dtqVar, aopaVar, a));
        arrayList.add(new duc(dtqVar, aopaVar, a));
        arrayList.add(new dug(dtqVar, aopaVar, a));
        arrayList.add(new dut(dtqVar, aopaVar, a));
        arrayList.add(new dty(dtqVar, aopaVar, a));
        arrayList.add(new duq(dtqVar, aopaVar, a));
        arrayList.add(new duo(dtqVar, aopaVar, a));
        if (Build.VERSION.SDK_INT >= 24 && ((Boolean) qdb.w.e()).booleanValue()) {
            arrayList.add(new dui(dtqVar, aopaVar, a, x));
        }
        if (((Boolean) qdb.v.e()).booleanValue()) {
            arrayList.add(new dum(dtqVar, aopaVar, a));
        }
        arrayList.add(new duh(dtqVar, aopaVar, a));
        return arrayList;
    }

    protected void p(dtq dtqVar, Context context, aopa aopaVar, dnq dnqVar) {
        if (dtqVar.b == null) {
            return;
        }
        t(o(dtqVar, context, aopaVar, dnqVar));
    }

    protected final void u(dtq dtqVar, aopa aopaVar, View view, Activity activity, boolean z) {
        List list;
        if (!dtqVar.n) {
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.b |= 524288;
            dnwVar.p = 16384L;
            list = Arrays.asList(new duf(dtqVar, aopaVar));
        } else {
            n(dtqVar, aopaVar);
            ArrayList arrayList = new ArrayList();
            if (dtqVar.b != null) {
                int a = dtqVar.a();
                arrayList.add(new duf(dtqVar, aopaVar));
                arrayList.add(new duk(dtqVar, aopaVar, a));
                arrayList.add(new dud(dtqVar, aopaVar, r, a));
                arrayList.add(new duc(dtqVar, aopaVar, a));
                arrayList.add(new duj(dtqVar, aopaVar, a));
                arrayList.add(new dul(dtqVar, aopaVar, a));
                arrayList.add(new dug(dtqVar, aopaVar, a));
                arrayList.add(new dub(dtqVar, aopaVar, a));
                arrayList.add(new dut(dtqVar, aopaVar, a));
                arrayList.add(new dty(dtqVar, aopaVar, a));
                arrayList.add(new duq(dtqVar, aopaVar, a));
                arrayList.add(new dup(dtqVar, aopaVar, a, new Throwable().getStackTrace()));
                arrayList.add(new duu(dtqVar, aopaVar, a, view));
                arrayList.add(new duo(dtqVar, aopaVar, a));
                if (((Boolean) qdb.m.e()).booleanValue()) {
                    arrayList.add(new dtx(dtqVar, aopaVar, a, view, activity));
                }
                if (z && ((Boolean) qdb.o.e()).booleanValue()) {
                    arrayList.add(new dur(dtqVar, aopaVar, a, this.w));
                }
            }
            list = arrayList;
        }
        t(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dsv(Context context, String str, boolean z) {
        super(context);
        this.v = str;
        this.u = z;
    }
}
