package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.StrictMode;
import com.google.ar.core.ImageMetadata;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cxac  reason: default package */
/* loaded from: classes5.dex */
final class cxac {
    private static final Pattern a = Pattern.compile("VmHWM:\\s*(\\d+)\\s*kB");
    private static final Pattern b = Pattern.compile("VmRSS:\\s*(\\d+)\\s*kB");
    private static final Pattern c = Pattern.compile("RssAnon:\\s*(\\d+)\\s*kB");
    private static final Pattern d = Pattern.compile("VmSwap:\\s*(\\d+)\\s*kB");
    private static final Pattern e = Pattern.compile("VmSize:\\s*(\\d+)\\s*kB");
    private static dbty<dbsg<Method>> f = dbud.a(cxaa.a);
    private final dzsj<cwze> g;
    private final Context h;

    public cxac(dzsj<cwze> dzsjVar, Context context) {
        this.g = dzsjVar;
        this.h = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ dbsg a() {
        try {
            return dbsg.i(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error | NoSuchMethodException | Exception unused) {
            return dbpy.a;
        }
    }

    private static int d(Debug.MemoryInfo memoryInfo) {
        Method f2 = f.a().f();
        if (f2 != null) {
            try {
                return ((Integer) f2.invoke(memoryInfo, 14)).intValue();
            } catch (Error | Exception unused) {
                f = cwzz.a;
                return -1;
            }
        }
        return -1;
    }

    private static Long e(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            return Long.valueOf(Long.parseLong(matcher.group(1)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @dzsi
    private static Integer f(@dzsi String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dzzn b(int i, int i2, String str, String str2) {
        ActivityManager.MemoryInfo memoryInfo;
        cwze a2 = this.g.a();
        czhz.c();
        cxab cxabVar = null;
        Debug.MemoryInfo memoryInfo2 = a2.f() ? cwuu.a(this.h).getProcessMemoryInfo(new int[]{i2})[0] : null;
        if (a2.g()) {
            memoryInfo = new ActivityManager.MemoryInfo();
            cwuu.a(this.h).getMemoryInfo(memoryInfo);
        } else {
            memoryInfo = null;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            String a3 = ddau.c(new File("/proc/self/status"), Charset.defaultCharset()).a();
            if (!a3.isEmpty()) {
                cxab cxabVar2 = new cxab();
                cxabVar2.a = e(a, a3);
                cxabVar2.b = e(b, a3);
                cxabVar2.c = e(c, a3);
                cxabVar2.d = e(d, a3);
                cxabVar2.e = e(e, a3);
                cxabVar = cxabVar2;
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        dzzl dzzlVar = (dzzl) dzzn.g.bZ();
        dzzj bZ = dzzk.c.bZ();
        dzzf bZ2 = dzzg.z.bZ();
        if (memoryInfo2 != null) {
            int i3 = memoryInfo2.dalvikPss;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar = (dzzg) bZ2.b;
            dzzgVar.a |= 1;
            dzzgVar.b = i3;
            int i4 = memoryInfo2.nativePss;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar2 = (dzzg) bZ2.b;
            dzzgVar2.a |= 2;
            dzzgVar2.c = i4;
            int i5 = memoryInfo2.otherPss;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar3 = (dzzg) bZ2.b;
            dzzgVar3.a |= 4;
            dzzgVar3.d = i5;
            int i6 = memoryInfo2.dalvikPrivateDirty;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar4 = (dzzg) bZ2.b;
            dzzgVar4.a |= 8;
            dzzgVar4.e = i6;
            int i7 = memoryInfo2.nativePrivateDirty;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar5 = (dzzg) bZ2.b;
            dzzgVar5.a |= 16;
            dzzgVar5.f = i7;
            int i8 = memoryInfo2.otherPrivateDirty;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar6 = (dzzg) bZ2.b;
            dzzgVar6.a |= 32;
            dzzgVar6.g = i8;
            int totalPss = memoryInfo2.getTotalPss();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar7 = (dzzg) bZ2.b;
            dzzgVar7.a |= 64;
            dzzgVar7.h = totalPss;
            int totalPrivateClean = memoryInfo2.getTotalPrivateClean();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar8 = (dzzg) bZ2.b;
            dzzgVar8.a |= 128;
            dzzgVar8.i = totalPrivateClean;
            int totalSwappablePss = memoryInfo2.getTotalSwappablePss();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar9 = (dzzg) bZ2.b;
            dzzgVar9.a |= 512;
            dzzgVar9.k = totalSwappablePss;
            int totalSharedDirty = memoryInfo2.getTotalSharedDirty();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar10 = (dzzg) bZ2.b;
            dzzgVar10.a |= 256;
            dzzgVar10.j = totalSharedDirty;
            int d2 = d(memoryInfo2);
            if (d2 != -1) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dzzg dzzgVar11 = (dzzg) bZ2.b;
                dzzgVar11.a |= 1024;
                dzzgVar11.l = d2;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Map<String, String> memoryStats = memoryInfo2.getMemoryStats();
                    Integer f2 = f(memoryStats.get("summary.code"));
                    if (f2 != null) {
                        int intValue = f2.intValue();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar12 = (dzzg) bZ2.b;
                        dzzgVar12.a |= 4096;
                        dzzgVar12.n = intValue;
                    }
                    Integer f3 = f(memoryStats.get("summary.stack"));
                    if (f3 != null) {
                        int intValue2 = f3.intValue();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar13 = (dzzg) bZ2.b;
                        dzzgVar13.a |= 8192;
                        dzzgVar13.o = intValue2;
                    }
                    Integer f4 = f(memoryStats.get("summary.graphics"));
                    if (f4 != null) {
                        int intValue3 = f4.intValue();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar14 = (dzzg) bZ2.b;
                        dzzgVar14.a |= 16384;
                        dzzgVar14.p = intValue3;
                    }
                    Integer f5 = f(memoryStats.get("summary.system"));
                    if (f5 != null) {
                        int intValue4 = f5.intValue();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar15 = (dzzg) bZ2.b;
                        dzzgVar15.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                        dzzgVar15.r = intValue4;
                    }
                    Integer f6 = f(memoryStats.get("summary.java-heap"));
                    if (f6 != null) {
                        int intValue5 = f6.intValue();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar16 = (dzzg) bZ2.b;
                        dzzgVar16.a |= 2048;
                        dzzgVar16.m = intValue5;
                    }
                    Integer f7 = f(memoryStats.get("summary.private-other"));
                    if (f7 != null) {
                        int intValue6 = f7.intValue();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dzzg dzzgVar17 = (dzzg) bZ2.b;
                        dzzgVar17.a |= 32768;
                        dzzgVar17.q = intValue6;
                    }
                } catch (NumberFormatException unused2) {
                }
            }
        }
        if (memoryInfo != null) {
            int i9 = (int) (memoryInfo.availMem >> 10);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar18 = (dzzg) bZ2.b;
            dzzgVar18.a |= 131072;
            dzzgVar18.s = i9;
            int i10 = (int) (memoryInfo.totalMem >> 20);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dzzg dzzgVar19 = (dzzg) bZ2.b;
            dzzgVar19.a |= 262144;
            dzzgVar19.t = i10;
        }
        if (cxabVar != null) {
            Long l = cxabVar.a;
            if (l != null) {
                long longValue = l.longValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dzzg dzzgVar20 = (dzzg) bZ2.b;
                dzzgVar20.a |= ImageMetadata.LENS_APERTURE;
                dzzgVar20.u = longValue;
            }
            Long l2 = cxabVar.b;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dzzg dzzgVar21 = (dzzg) bZ2.b;
                dzzgVar21.a |= ImageMetadata.SHADING_MODE;
                dzzgVar21.v = longValue2;
            }
            Long l3 = cxabVar.c;
            if (l3 != null) {
                long longValue3 = l3.longValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dzzg dzzgVar22 = (dzzg) bZ2.b;
                dzzgVar22.a |= 2097152;
                dzzgVar22.w = longValue3;
            }
            Long l4 = cxabVar.d;
            if (l4 != null) {
                long longValue4 = l4.longValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dzzg dzzgVar23 = (dzzg) bZ2.b;
                dzzgVar23.a |= 4194304;
                dzzgVar23.x = longValue4;
            }
            Long l5 = cxabVar.e;
            if (l5 != null) {
                long longValue5 = l5.longValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dzzg dzzgVar24 = (dzzg) bZ2.b;
                dzzgVar24.a |= 8388608;
                dzzgVar24.y = longValue5;
            }
        }
        dzzg bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzzk dzzkVar = (dzzk) bZ.b;
        bK.getClass();
        dzzkVar.b = bK;
        dzzkVar.a |= 1;
        if (dzzlVar.c) {
            dzzlVar.bF();
            dzzlVar.c = false;
        }
        dzzn dzznVar = (dzzn) dzzlVar.b;
        dzzk bK2 = bZ.bK();
        bK2.getClass();
        dzznVar.b = bK2;
        dzznVar.a |= 1;
        eaau bZ3 = eaav.c.bZ();
        eaat b2 = cwuv.b(str, this.h);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        eaav eaavVar = (eaav) bZ3.b;
        b2.getClass();
        eaavVar.b = b2;
        eaavVar.a |= 1;
        if (dzzlVar.c) {
            dzzlVar.bF();
            dzzlVar.c = false;
        }
        dzzn dzznVar2 = (dzzn) dzzlVar.b;
        eaav bK3 = bZ3.bK();
        bK3.getClass();
        dzznVar2.c = bK3;
        dzznVar2.a |= 2;
        dzzh bZ4 = dzzi.c.bZ();
        boolean c2 = cwuu.c(this.h);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dzzi dzziVar = (dzzi) bZ4.b;
        dzziVar.a = 1 | dzziVar.a;
        dzziVar.b = c2;
        if (dzzlVar.c) {
            dzzlVar.bF();
            dzzlVar.c = false;
        }
        dzzn dzznVar3 = (dzzn) dzzlVar.b;
        dzzi bK4 = bZ4.bK();
        bK4.getClass();
        dzznVar3.e = bK4;
        dzznVar3.a |= 8;
        if (dzzlVar.c) {
            dzzlVar.bF();
            dzzlVar.c = false;
        }
        dzzn dzznVar4 = (dzzn) dzzlVar.b;
        dzznVar4.d = i - 1;
        int i11 = dzznVar4.a | 4;
        dzznVar4.a = i11;
        if (str2 != null) {
            str2.getClass();
            dzznVar4.a = i11 | 16;
            dzznVar4.f = str2;
        }
        return (dzzn) dzzlVar.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dzzn c(int i, String str) {
        return b(i, Process.myPid(), null, str);
    }
}
