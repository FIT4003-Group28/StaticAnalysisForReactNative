package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: uxy */
/* loaded from: classes4.dex */
public final class uxy {
    private static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture");
    private static amqo b = aqxo.i(gsh.g);
    private final azqb c;
    private final Context d;

    public uxy(azqb azqbVar, Context context) {
        this.c = azqbVar;
        this.d = context;
    }

    public static /* synthetic */ ampq a() {
        try {
            return ampq.j(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", '^', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
            return amon.a;
        } catch (NoSuchMethodException e2) {
            ((amzw) ((amzw) ((amzw) a.c()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", '\\', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) not found");
            return amon.a;
        } catch (Exception e3) {
            e = e3;
            ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", '^', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
            return amon.a;
        }
    }

    private static int c(Debug.MemoryInfo memoryInfo) {
        Method method = (Method) ((ampq) b.get()).f();
        if (method != null) {
            try {
                return ((Integer) method.invoke(memoryInfo, 14)).intValue();
            } catch (Error | Exception e) {
                b = gsh.h;
                ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getOtherGraphicsPss", 'w', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) invocation failure");
                return -1;
            }
        }
        return -1;
    }

    private static Integer d(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    private static Long e(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            String group = matcher.group(1);
            araa.w(group);
            return Long.valueOf(Long.parseLong(group));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final azzq b(int i, int i2, String str, String str2) {
        ActivityManager.MemoryInfo memoryInfo;
        uxl uxlVar = (uxl) this.c.get();
        uwp.e();
        uxx uxxVar = null;
        Debug.MemoryInfo memoryInfo2 = uxlVar.d ? uul.a(this.d).getProcessMemoryInfo(new int[]{i2})[0] : null;
        if (uxlVar.e) {
            ActivityManager.MemoryInfo memoryInfo3 = new ActivityManager.MemoryInfo();
            uul.a(this.d).getMemoryInfo(memoryInfo3);
            memoryInfo = memoryInfo3;
        } else {
            memoryInfo = null;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                String a2 = anhe.j(new File("/proc/self/status"), Charset.defaultCharset()).a();
                if (a2.isEmpty()) {
                    ((amzw) ((amzw) a.f()).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 220, "MemoryUsageCapture.java")).q("Null or empty proc status");
                } else {
                    uxx uxxVar2 = new uxx();
                    uxxVar2.f = e(uxx.a, a2);
                    uxxVar2.g = e(uxx.b, a2);
                    uxxVar2.h = e(uxx.c, a2);
                    uxxVar2.i = e(uxx.d, a2);
                    uxxVar2.j = e(uxx.e, a2);
                    uxxVar = uxxVar2;
                }
            } catch (IOException e) {
                ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getProcStatus", (char) 249, "MemoryUsageCapture.java")).q("Error reading proc status");
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            aopc aopcVar = (aopc) azzq.a.createBuilder();
            aopa createBuilder = azzp.a.createBuilder();
            aopa createBuilder2 = azzn.a.createBuilder();
            if (memoryInfo2 != null) {
                int i3 = memoryInfo2.dalvikPss;
                createBuilder2.copyOnWrite();
                azzn azznVar = (azzn) createBuilder2.instance;
                azznVar.b |= 1;
                azznVar.c = i3;
                int i4 = memoryInfo2.nativePss;
                createBuilder2.copyOnWrite();
                azzn azznVar2 = (azzn) createBuilder2.instance;
                azznVar2.b |= 2;
                azznVar2.d = i4;
                int i5 = memoryInfo2.otherPss;
                createBuilder2.copyOnWrite();
                azzn azznVar3 = (azzn) createBuilder2.instance;
                azznVar3.b |= 4;
                azznVar3.e = i5;
                int i6 = memoryInfo2.dalvikPrivateDirty;
                createBuilder2.copyOnWrite();
                azzn azznVar4 = (azzn) createBuilder2.instance;
                azznVar4.b |= 8;
                azznVar4.f = i6;
                int i7 = memoryInfo2.nativePrivateDirty;
                createBuilder2.copyOnWrite();
                azzn azznVar5 = (azzn) createBuilder2.instance;
                azznVar5.b |= 16;
                azznVar5.g = i7;
                int i8 = memoryInfo2.otherPrivateDirty;
                createBuilder2.copyOnWrite();
                azzn azznVar6 = (azzn) createBuilder2.instance;
                azznVar6.b |= 32;
                azznVar6.h = i8;
                int totalPss = memoryInfo2.getTotalPss();
                createBuilder2.copyOnWrite();
                azzn azznVar7 = (azzn) createBuilder2.instance;
                azznVar7.b |= 64;
                azznVar7.i = totalPss;
                int totalPrivateClean = memoryInfo2.getTotalPrivateClean();
                createBuilder2.copyOnWrite();
                azzn azznVar8 = (azzn) createBuilder2.instance;
                azznVar8.b |= 128;
                azznVar8.j = totalPrivateClean;
                int totalSwappablePss = memoryInfo2.getTotalSwappablePss();
                createBuilder2.copyOnWrite();
                azzn azznVar9 = (azzn) createBuilder2.instance;
                azznVar9.b |= 512;
                azznVar9.l = totalSwappablePss;
                int totalSharedDirty = memoryInfo2.getTotalSharedDirty();
                createBuilder2.copyOnWrite();
                azzn azznVar10 = (azzn) createBuilder2.instance;
                azznVar10.b |= 256;
                azznVar10.k = totalSharedDirty;
                int c = c(memoryInfo2);
                if (c != -1) {
                    createBuilder2.copyOnWrite();
                    azzn azznVar11 = (azzn) createBuilder2.instance;
                    azznVar11.b |= 1024;
                    azznVar11.m = c;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        Map<String, String> memoryStats = memoryInfo2.getMemoryStats();
                        Integer d = d(memoryStats.get("summary.code"));
                        if (d != null) {
                            int intValue = d.intValue();
                            createBuilder2.copyOnWrite();
                            azzn azznVar12 = (azzn) createBuilder2.instance;
                            azznVar12.b |= 4096;
                            azznVar12.o = intValue;
                        }
                        Integer d2 = d(memoryStats.get("summary.stack"));
                        if (d2 != null) {
                            int intValue2 = d2.intValue();
                            createBuilder2.copyOnWrite();
                            azzn azznVar13 = (azzn) createBuilder2.instance;
                            azznVar13.b |= 8192;
                            azznVar13.p = intValue2;
                        }
                        Integer d3 = d(memoryStats.get("summary.graphics"));
                        if (d3 != null) {
                            int intValue3 = d3.intValue();
                            createBuilder2.copyOnWrite();
                            azzn azznVar14 = (azzn) createBuilder2.instance;
                            azznVar14.b |= 16384;
                            azznVar14.q = intValue3;
                        }
                        Integer d4 = d(memoryStats.get("summary.system"));
                        if (d4 != null) {
                            int intValue4 = d4.intValue();
                            createBuilder2.copyOnWrite();
                            azzn azznVar15 = (azzn) createBuilder2.instance;
                            azznVar15.b |= 65536;
                            azznVar15.s = intValue4;
                        }
                        Integer d5 = d(memoryStats.get("summary.java-heap"));
                        if (d5 != null) {
                            int intValue5 = d5.intValue();
                            createBuilder2.copyOnWrite();
                            azzn azznVar16 = (azzn) createBuilder2.instance;
                            azznVar16.b |= 2048;
                            azznVar16.n = intValue5;
                        }
                        Integer d6 = d(memoryStats.get("summary.private-other"));
                        if (d6 != null) {
                            int intValue6 = d6.intValue();
                            createBuilder2.copyOnWrite();
                            azzn azznVar17 = (azzn) createBuilder2.instance;
                            azznVar17.b |= 32768;
                            azznVar17.r = intValue6;
                        }
                    } catch (NumberFormatException e2) {
                        ((amzw) ((amzw) ((amzw) a.f()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "addDebugInfoToMemoryStats", (char) 326, "MemoryUsageCapture.java")).q("failed to collect memory summary stats");
                    }
                }
            }
            if (memoryInfo != null) {
                long j = memoryInfo.availMem;
                createBuilder2.copyOnWrite();
                azzn azznVar18 = (azzn) createBuilder2.instance;
                azznVar18.b |= 131072;
                azznVar18.t = (int) (j >> 10);
                long j2 = memoryInfo.totalMem;
                createBuilder2.copyOnWrite();
                azzn azznVar19 = (azzn) createBuilder2.instance;
                azznVar19.b |= 262144;
                azznVar19.u = (int) (j2 >> 20);
            }
            if (uxxVar != null) {
                Long l = uxxVar.f;
                if (l != null) {
                    long longValue = l.longValue();
                    createBuilder2.copyOnWrite();
                    azzn azznVar20 = (azzn) createBuilder2.instance;
                    azznVar20.b |= 524288;
                    azznVar20.v = longValue;
                }
                Long l2 = uxxVar.g;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    createBuilder2.copyOnWrite();
                    azzn azznVar21 = (azzn) createBuilder2.instance;
                    azznVar21.b |= 1048576;
                    azznVar21.w = longValue2;
                }
                Long l3 = uxxVar.h;
                if (l3 != null) {
                    long longValue3 = l3.longValue();
                    createBuilder2.copyOnWrite();
                    azzn azznVar22 = (azzn) createBuilder2.instance;
                    azznVar22.b |= 2097152;
                    azznVar22.x = longValue3;
                }
                Long l4 = uxxVar.i;
                if (l4 != null) {
                    long longValue4 = l4.longValue();
                    createBuilder2.copyOnWrite();
                    azzn azznVar23 = (azzn) createBuilder2.instance;
                    azznVar23.b |= 4194304;
                    azznVar23.y = longValue4;
                }
                Long l5 = uxxVar.j;
                if (l5 != null) {
                    long longValue5 = l5.longValue();
                    createBuilder2.copyOnWrite();
                    azzn azznVar24 = (azzn) createBuilder2.instance;
                    azznVar24.b |= 8388608;
                    azznVar24.z = longValue5;
                }
            }
            azzn azznVar25 = (azzn) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            azzp azzpVar = (azzp) createBuilder.instance;
            azznVar25.getClass();
            azzpVar.c = azznVar25;
            azzpVar.b |= 1;
            aopcVar.copyOnWrite();
            azzq azzqVar = (azzq) aopcVar.instance;
            azzp azzpVar2 = (azzp) createBuilder.mo39build();
            azzpVar2.getClass();
            azzqVar.c = azzpVar2;
            azzqVar.b |= 1;
            aopa createBuilder3 = baag.a.createBuilder();
            baaf g = uuo.g(str, this.d);
            createBuilder3.copyOnWrite();
            baag baagVar = (baag) createBuilder3.instance;
            g.getClass();
            baagVar.c = g;
            baagVar.b |= 1;
            aopcVar.copyOnWrite();
            azzq azzqVar2 = (azzq) aopcVar.instance;
            baag baagVar2 = (baag) createBuilder3.mo39build();
            baagVar2.getClass();
            azzqVar2.d = baagVar2;
            azzqVar2.b |= 2;
            aopa createBuilder4 = azzo.a.createBuilder();
            boolean d7 = uul.d(this.d);
            createBuilder4.copyOnWrite();
            azzo azzoVar = (azzo) createBuilder4.instance;
            azzoVar.b = 1 | azzoVar.b;
            azzoVar.c = d7;
            aopcVar.copyOnWrite();
            azzq azzqVar3 = (azzq) aopcVar.instance;
            azzo azzoVar2 = (azzo) createBuilder4.mo39build();
            azzoVar2.getClass();
            azzqVar3.f = azzoVar2;
            azzqVar3.b |= 8;
            aopcVar.copyOnWrite();
            azzq azzqVar4 = (azzq) aopcVar.instance;
            azzqVar4.e = i - 1;
            azzqVar4.b |= 4;
            if (str2 != null) {
                aopcVar.copyOnWrite();
                azzq azzqVar5 = (azzq) aopcVar.instance;
                azzqVar5.b |= 16;
                azzqVar5.g = str2;
            }
            return (azzq) aopcVar.mo39build();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
