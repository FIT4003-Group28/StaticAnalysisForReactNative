package defpackage;

import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: uzb  reason: default package */
/* loaded from: classes4.dex */
public final class uzb {
    private static volatile ampq a;

    public static ampq a() {
        ampq ampqVar;
        ampq ampqVar2;
        ampq j;
        FileInputStream fileInputStream;
        int i;
        int i2;
        ampq ampqVar3 = a;
        if (ampqVar3 == null) {
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            if (sysconf > 0) {
                ampqVar = ampq.j(Long.valueOf(sysconf));
            } else {
                ampqVar = amon.a;
            }
            if (!ampqVar.h()) {
                j = amon.a;
            } else {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                byte[] bArr = new byte[440];
                try {
                    try {
                        fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                    } catch (IOException unused) {
                        amon amonVar = amon.a;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        ampqVar2 = amonVar;
                    }
                    try {
                        int read = fileInputStream.read(bArr);
                        fileInputStream.close();
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        boolean z = false;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= read) {
                                i3 = 0;
                                break;
                            } else if (bArr[i3] == 40) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 == 0 || (i = i3 + 16) >= read) {
                            ampqVar2 = amon.a;
                        } else {
                            while (true) {
                                i2 = 1;
                                if (i <= i3) {
                                    break;
                                } else if (bArr[i] == 41) {
                                    i3 = i;
                                    z = true;
                                    break;
                                } else {
                                    i--;
                                }
                            }
                            if (!z) {
                                ampqVar2 = amon.a;
                            } else {
                                long j2 = 0;
                                while (true) {
                                    if (i3 >= read) {
                                        break;
                                    }
                                    byte b = bArr[i3];
                                    if (b == 32) {
                                        int i4 = i2 + 1;
                                        if (i2 != 21) {
                                            i2 = i4;
                                            i3++;
                                        } else if (j2 > 0) {
                                            ampqVar2 = ampq.j(Long.valueOf(j2));
                                        }
                                    } else {
                                        if (i2 == 21) {
                                            if (j2 > 922337203685477580L) {
                                                break;
                                            }
                                            long j3 = j2 * 10;
                                            if (b < 48 || b > 57) {
                                                break;
                                            }
                                            j2 = j3 + (b - 48);
                                        } else {
                                            continue;
                                        }
                                        i3++;
                                    }
                                }
                                ampqVar2 = amon.a;
                            }
                        }
                        j = !ampqVar2.h() ? amon.a : ampq.j(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) ampqVar2.c()).longValue()) / ((Long) ampqVar.c()).longValue()));
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused2) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th2;
                }
            }
            a = j;
            return j;
        }
        return ampqVar3;
    }
}
