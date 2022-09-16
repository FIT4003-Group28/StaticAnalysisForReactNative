package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bmsh  reason: default package */
/* loaded from: classes3.dex */
public final class bmsh {
    public static JobInfo.Builder a(ComponentName componentName) {
        JobInfo.Builder requiresCharging = new JobInfo.Builder(159560342, componentName).setRequiredNetworkType(2).setRequiresCharging(true);
        try {
            requiresCharging.setPersisted(true);
        } catch (SecurityException unused) {
        }
        if (Build.VERSION.SDK_INT >= 26) {
            requiresCharging.setRequiresBatteryNotLow(true);
        }
        return requiresCharging;
    }

    public static PersistableBundle b(bmsd bmsdVar) {
        byte b;
        byte b2;
        byte b3;
        PersistableBundle persistableBundle = new PersistableBundle();
        bmrx bmrxVar = (bmrx) bmsdVar;
        int size = bmrxVar.a.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dcdc<bmsg> dcdcVar = bmrxVar.a;
        int size2 = dcdcVar.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            bmsg bmsgVar = dcdcVar.get(i2);
            strArr[i] = bmsgVar.a();
            jArr[i] = bmsgVar.b().a;
            try {
                bmsgVar.c().bU(byteArrayOutputStream);
                i++;
            } catch (IOException e) {
                throw new IllegalStateException("Writing to ByteArrayOutputStream never throws IOException.", e);
            }
        }
        dbsk.l(i == size);
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putStringArray("accounts", strArr);
        persistableBundle2.putLongArray("user-action-time-millis", jArr);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        persistableBundle2.putInt("location-survey-byte-count", length);
        int i3 = (length + 3) >> 2;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i5 + 1;
            byte b4 = byteArray[i5];
            int length2 = byteArray.length;
            if (i6 == length2) {
                b3 = 0;
            } else {
                int i7 = i6 + 1;
                byte b5 = byteArray[i6];
                if (i7 == length2) {
                    b3 = b5;
                    i6 = i7;
                } else {
                    int i8 = i7 + 1;
                    b = byteArray[i7];
                    if (i8 != length2) {
                        int i9 = i8 + 1;
                        b2 = byteArray[i8];
                        b3 = b5;
                        i6 = i9;
                        iArr[i4] = ((b4 & 255) << 24) | ((b3 & 255) << 16) | ((b & 255) << 8) | (b2 & 255);
                        i4++;
                        i5 = i6;
                    } else {
                        b3 = b5;
                        i6 = i8;
                        b2 = 0;
                        iArr[i4] = ((b4 & 255) << 24) | ((b3 & 255) << 16) | ((b & 255) << 8) | (b2 & 255);
                        i4++;
                        i5 = i6;
                    }
                }
            }
            b = 0;
            b2 = 0;
            iArr[i4] = ((b4 & 255) << 24) | ((b3 & 255) << 16) | ((b & 255) << 8) | (b2 & 255);
            i4++;
            i5 = i6;
        }
        if (i5 == byteArray.length) {
            z = true;
        }
        dbsk.l(z);
        persistableBundle2.putIntArray("location-survey-bytes-as-ints", iArr);
        persistableBundle.putPersistableBundle("chronological-owned-location-survey-list", persistableBundle2);
        return persistableBundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        r9 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bmsd c(android.os.PersistableBundle r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmsh.c(android.os.PersistableBundle):bmsd");
    }

    public static eaow d(btvo btvoVar) {
        dvka dvkaVar = btvoVar.getPersonalContextParameters().a;
        if (dvkaVar == null) {
            dvkaVar = dvka.i;
        }
        return eaow.e(dvkaVar.f);
    }

    public static int e(JobScheduler jobScheduler, JobInfo jobInfo) {
        try {
            return jobScheduler.schedule(jobInfo);
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    public static eaow f(eaow eaowVar, eapd eapdVar, eapd eapdVar2) {
        return (eaow) dbzu.a(eaow.a, eaowVar.k((eapq) dcln.a.n(eaow.a, new eaow(eapdVar, eapdVar2))));
    }
}
