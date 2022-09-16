package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ywg  reason: default package */
/* loaded from: classes4.dex */
public final class ywg implements ywk {
    private final File X;
    private final File Y;
    private final zds Z;
    public final AtomicReference a = new AtomicReference(null);
    private final ScheduledExecutorService aa;
    private final int ab;
    private volatile int ac;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ywg(android.content.Context r7, defpackage.zds r8, java.util.concurrent.ScheduledExecutorService r9, java.lang.String[] r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.Z = r8
            r6.aa = r9
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r9.<init>(r0)
            r6.a = r9
            r9 = 7
            r1 = 2
            r2 = 1
            r3 = 0
            java.io.File r4 = o(r7)     // Catch: java.lang.Exception -> L68
            r4.getClass()
            java.io.File r5 = p(r4)     // Catch: java.lang.Exception -> L68
            java.io.File r4 = n(r4)     // Catch: java.lang.Exception -> L68
            if (r10 == 0) goto L2e
            r8 = r10[r3]     // Catch: java.lang.Exception -> L68
            r10 = r10[r2]     // Catch: java.lang.Exception -> L68
            long[][] r7 = s(r7, r8, r10)     // Catch: java.lang.Exception -> L68
        L2c:
            r8 = 1
            goto L66
        L2e:
            boolean r10 = defpackage.zgd.B(r5)     // Catch: java.lang.Exception -> L68
            if (r10 != 0) goto L43
            boolean r10 = defpackage.zgd.B(r4)     // Catch: java.lang.Exception -> L68
            if (r10 != 0) goto L43
            java.lang.String r8 = defpackage.ywp.h(r7)     // Catch: java.lang.Exception -> L68
            long[][] r7 = s(r7, r0, r8)     // Catch: java.lang.Exception -> L68
            goto L2c
        L43:
            long[][] r7 = new long[r1]     // Catch: java.lang.Exception -> L68
            r7[r3] = r0     // Catch: java.lang.Exception -> L68
            long[] r10 = m(r4, r8)     // Catch: java.lang.Exception -> L68
            if (r10 == 0) goto L51
            defpackage.zgd.C(r4, r5, r8)     // Catch: java.lang.Exception -> L68
            goto L55
        L51:
            long[] r10 = m(r5, r8)     // Catch: java.lang.Exception -> L68
        L55:
            if (r10 != 0) goto L59
            long[] r10 = new long[r9]     // Catch: java.lang.Exception -> L68
        L59:
            r7[r2] = r10     // Catch: java.lang.Exception -> L68
            int r8 = defpackage.ywg.b     // Catch: java.lang.Exception -> L68
            long r8 = a(r10, r8)     // Catch: java.lang.Exception -> L68
            int r9 = (int) r8
            if (r9 == r2) goto L65
            goto L2c
        L65:
            r8 = 0
        L66:
            r9 = 0
            goto L74
        L68:
            long[][] r7 = new long[r1]
            r7[r3] = r0
            long[] r8 = new long[r9]
            r7[r2] = r8
            r4 = r0
            r5 = r4
            r8 = 0
            r9 = 1
        L74:
            r6.X = r5
            r6.Y = r4
            r10 = r7[r2]
            long[] r10 = q(r10)
            r7[r2] = r10
            r1 = r7[r3]
            if (r1 == 0) goto L8b
            long[] r10 = q(r1)
            r7[r3] = r10
            goto L8d
        L8b:
            r7[r3] = r10
        L8d:
            r10 = r7[r2]
            int r1 = defpackage.ywg.g
            long r4 = a(r10, r1)
            int r10 = (int) r4
            int r10 = r10 * 5
            if (r10 > 0) goto L9c
            r10 = 30
        L9c:
            r6.ab = r10
            ywe r10 = new ywe
            r10.<init>()
            r10.c(r3)
            r10.d(r3)
            r10.f(r3)
            r1 = r7[r3]
            r10.h(r1)
            r7 = r7[r2]
            r10.g(r7)
            r10.e(r8)
            r10.d(r9)
            r6.k(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywg.<init>(android.content.Context, zds, java.util.concurrent.ScheduledExecutorService, java.lang.String[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long[] jArr, int i) {
        int c = ywh.c(i);
        int i2 = c >> 6;
        int i3 = c & 63;
        long d = ywh.d(i);
        if (i2 >= jArr.length) {
            return 0L;
        }
        return (jArr[i2] >> i3) & d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(long[] jArr, int i, long j) {
        int c = ywh.c(i);
        int i2 = c >> 6;
        int i3 = c & 63;
        long d = ywh.d(i);
        if (d != -1) {
            j = zgd.O(j, 0L, d);
        }
        jArr[i2] = (j << i3) | (jArr[i2] & ((d << i3) ^ (-1)));
    }

    static long[] m(File file, zds zdsVar) {
        int read;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                int i = 0;
                do {
                    read = fileInputStream.read(bArr, i, length - i);
                    i += read;
                } while (read != 0);
                long[] jArr = new long[(length + 7) >> 3];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 >> 3;
                    jArr[i3] = jArr[i3] | ((bArr[i2] & 255) << ((i2 & 7) << 3));
                }
                fileInputStream.close();
                return jArr;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        } catch (Throwable unused3) {
            zgd.G(file, zdsVar);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File n(File file) {
        return new File(file, "bootstrap.data.bak");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File o(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return new File(filesDir, cfg.b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File p(File file) {
        return new File(file, "bootstrap.data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long[] q(long[] jArr) {
        if (jArr.length < 7) {
            jArr = Arrays.copyOf(jArr, 7);
        }
        if (((int) a(jArr, b)) <= 0 && a(jArr, x) == 0) {
            j(jArr, x, 534773760L);
        }
        if (jArr.length > 7) {
            jArr = Arrays.copyOf(jArr, 7);
        }
        j(jArr, b, 1L);
        return jArr;
    }

    private static void r(ywf ywfVar, ywf ywfVar2) {
        ScheduledFuture scheduledFuture;
        if (ywfVar == null || (scheduledFuture = ywfVar.g) == null) {
            return;
        }
        if (ywfVar2 != null && scheduledFuture == ywfVar2.g) {
            return;
        }
        scheduledFuture.cancel(false);
    }

    private static final long[][] s(Context context, String str, String str2) {
        ywc ywcVar = new ywc(str, str2);
        ywcVar.d();
        ywp.b(ywp.f(context).edit()).apply();
        return new long[][]{ywcVar.a, ywcVar.b};
    }

    public final long b(int i) {
        return a(((ywf) this.a.get()).a, i);
    }

    @Override // defpackage.ywk
    public final long c(ywj ywjVar) {
        return b(ywjVar.c);
    }

    @Override // defpackage.ywk
    public final SharedPreferences.Editor d(SharedPreferences.Editor editor, apyy apyyVar, arhd arhdVar) {
        aveq aveqVar = apyyVar.u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        apgx apgxVar = aveqVar.g;
        if (apgxVar == null) {
            apgxVar = apgx.a;
        }
        avfg avfgVar = arhdVar.y;
        if (avfgVar == null) {
            avfgVar = avfg.a;
        }
        atfw atfwVar = apyyVar.k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        avff avffVar = atfwVar.x;
        if (avffVar == null) {
            avffVar = avff.a;
        }
        asxj asxjVar = apyyVar.e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        atfw atfwVar2 = apyyVar.k;
        if (atfwVar2 == null) {
            atfwVar2 = atfw.a;
        }
        aqle aqleVar = atfwVar2.j;
        if (aqleVar == null) {
            aqleVar = aqle.a;
        }
        ywd f = f(32);
        f.b(m, avfgVar.b);
        f.c(l, apgxVar.b);
        f.b(k, apgxVar.c);
        f.b(o, apgxVar.d);
        f.b(x, apgxVar.f);
        f.b(h, apgxVar.h);
        f.c(n, apgxVar.g);
        f.c(p, aveqVar.m);
        f.b(j, aveqVar.n);
        f.b(i, yxk.c(avffVar));
        int i = q;
        atcj atcjVar = apyyVar.n;
        if (atcjVar == null) {
            atcjVar = atcj.a;
        }
        int O = almu.O(atcjVar.ac);
        int i2 = 1;
        if (O == 0) {
            O = 1;
        }
        f.b(i, O - 1);
        f.b(g, apgxVar.e);
        int i3 = r;
        aovy aovyVar = apyyVar.i;
        if (aovyVar == null) {
            aovyVar = aovy.a;
        }
        f.c(i3, aovyVar.d);
        f.c(s, asxjVar.cH);
        f.c(t, asxjVar.E);
        int i4 = u;
        aver averVar = avffVar.i;
        if (averVar == null) {
            averVar = aver.a;
        }
        f.b(i4, averVar.m);
        int i5 = v;
        aveq aveqVar2 = apyyVar.u;
        if (aveqVar2 == null) {
            aveqVar2 = aveq.a;
        }
        int d = apfu.d(aveqVar2.s);
        if (d != 0) {
            i2 = d;
        }
        f.b(i5, i2 - 1);
        f.b(w, aqleVar.i);
        int i6 = y;
        atjw atjwVar = apyyVar.g;
        if (atjwVar == null) {
            atjwVar = atjw.a;
        }
        atjx atjxVar = atjwVar.b;
        if (atjxVar == null) {
            atjxVar = atjx.a;
        }
        f.c(i6, atjxVar.b);
        f.b(B, aveqVar.u);
        int i7 = z;
        avez avezVar = avffVar.o;
        if (avezVar == null) {
            avezVar = avez.a;
        }
        aveu aveuVar = avezVar.b;
        if (aveuVar == null) {
            aveuVar = aveu.a;
        }
        f.b(i7, aveuVar.b);
        int i8 = A;
        avez avezVar2 = avffVar.o;
        if (avezVar2 == null) {
            avezVar2 = avez.a;
        }
        avfb avfbVar = avezVar2.c;
        if (avfbVar == null) {
            avfbVar = avfb.a;
        }
        f.b(i8, avfbVar.b);
        f.a();
        return editor;
    }

    @Override // defpackage.ywk
    public final SharedPreferences.Editor e(SharedPreferences.Editor editor) {
        ywd f = f(1);
        f.a++;
        f.a();
        return editor;
    }

    public final ywd f(int i) {
        return new ywd(this, i);
    }

    @Override // defpackage.ywk
    public final Object g() {
        ywf ywfVar = (ywf) this.a.get();
        return new long[][]{ywfVar.a, ywfVar.b};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        ywf ywfVar;
        ywe b;
        int i;
        do {
            ywfVar = (ywf) this.a.get();
            if (!ywfVar.c) {
                return;
            }
            b = ywfVar.b();
            b.e(false);
        } while (!k(ywfVar, b));
        synchronized (this) {
            int i2 = this.ac;
            int i3 = ywfVar.f;
            if (i2 < i3) {
                this.ac = i3;
                zgd.C(this.X, this.Y, this.Z);
                OutputStream F = zgd.F(this.X);
                try {
                    long[] jArr = ywfVar.b;
                    byte[] bArr = new byte[56];
                    for (i = 0; i < 56; i++) {
                        bArr[i] = (byte) ((jArr[i >> 3] >> ((i & 7) << 3)) & 255);
                    }
                    F.write(bArr);
                    F.close();
                    zgd.G(this.Y, this.Z);
                } catch (Throwable th) {
                    try {
                        F.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.ywk
    public final void i(int i) {
        ywf ywfVar;
        ywe b;
        do {
            ywfVar = (ywf) this.a.get();
            if (ywfVar.a()) {
                return;
            }
            b = ywfVar.b();
            b.d(i);
        } while (!k(ywfVar, b));
        if (i == 2) {
            h();
        }
    }

    @Override // defpackage.ywk
    public final boolean l(ywj ywjVar) {
        return b(ywjVar.c) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(ywf ywfVar, ywe yweVar) {
        long[] jArr;
        Boolean bool;
        int i = 0;
        if (ywfVar == null || !ywfVar.a()) {
            if (yweVar.a() != 0) {
                yweVar.g = null;
                if (yweVar.a() == 1) {
                    yweVar.e(false);
                }
            } else {
                Boolean bool2 = yweVar.c;
                if (bool2 == null) {
                    throw new IllegalStateException("Property \"isDirty\" has not been set");
                }
                if (!bool2.booleanValue()) {
                    yweVar.g = null;
                } else if (yweVar.g == null || (yweVar.b() != 0 && (ywfVar == null || ywfVar.e == 0))) {
                    if (yweVar.b() == 0) {
                        i = this.ab;
                    }
                    yweVar.g = this.aa.schedule(new Runnable() { // from class: ywb
                        @Override // java.lang.Runnable
                        public final void run() {
                            ywg.this.h();
                        }
                    }, i, TimeUnit.SECONDS);
                }
            }
        } else {
            yweVar.d(ywfVar.d);
            if (!ywfVar.c) {
                yweVar.e(false);
            }
        }
        Integer num = yweVar.f;
        if (num == null) {
            throw new IllegalStateException("Property \"changeCount\" has not been set");
        }
        yweVar.c(num.intValue() + 1);
        long[] jArr2 = yweVar.a;
        if (jArr2 == null || (jArr = yweVar.b) == null || (bool = yweVar.c) == null || yweVar.d == null || yweVar.e == null || yweVar.f == null) {
            StringBuilder sb = new StringBuilder();
            if (yweVar.a == null) {
                sb.append(" active");
            }
            if (yweVar.b == null) {
                sb.append(" serialized");
            }
            if (yweVar.c == null) {
                sb.append(" isDirty");
            }
            if (yweVar.d == null) {
                sb.append(" disposed");
            }
            if (yweVar.e == null) {
                sb.append(" isShutdownLikely");
            }
            if (yweVar.f == null) {
                sb.append(" changeCount");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        ywf ywfVar2 = new ywf(jArr2, jArr, bool.booleanValue(), yweVar.d.intValue(), yweVar.e.intValue(), yweVar.f.intValue(), yweVar.g);
        boolean compareAndSet = this.a.compareAndSet(ywfVar, ywfVar2);
        if (compareAndSet) {
            r(ywfVar, ywfVar2);
        } else {
            r(ywfVar2, ywfVar);
        }
        return compareAndSet;
    }
}
