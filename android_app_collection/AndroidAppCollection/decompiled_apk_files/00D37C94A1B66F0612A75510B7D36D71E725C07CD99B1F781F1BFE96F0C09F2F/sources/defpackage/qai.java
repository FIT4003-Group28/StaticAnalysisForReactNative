package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
/* compiled from: PG */
/* renamed from: qai  reason: default package */
/* loaded from: classes4.dex */
public final class qai {
    public static final qai a = new qai();

    protected qai() {
    }

    public final AdRequestParcel a(Context context, qcj qcjVar) {
        String str;
        int i;
        String str2;
        Date date = qcjVar.a;
        long time = date != null ? date.getTime() : -1L;
        int i2 = qcjVar.c;
        Set set = qcjVar.d;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        pzh pzhVar = qcm.a().a;
        qar.c();
        String h = qga.h(context);
        boolean z = qcjVar.i.contains(h) || new ArrayList(pzhVar.b).contains(h);
        Location location = qcjVar.e;
        Bundle bundle = qcjVar.f.getBundle(AdMobAdapter.class.getName());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            qar.c();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i3 = 0;
            while (true) {
                i = i3 + 1;
                if (i >= stackTrace.length) {
                    str2 = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i3];
                String className = stackTraceElement.getClassName();
                if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!qga.b.equalsIgnoreCase(className) && !qga.c.equalsIgnoreCase(className) && !qga.d.equalsIgnoreCase(className) && !qga.e.equalsIgnoreCase(className) && !qga.f.equalsIgnoreCase(className) && !qga.g.equalsIgnoreCase(className))) {
                    i3 = i;
                }
            }
            str2 = stackTrace[i].getClassName();
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb.append(stringTokenizer.nextToken());
                    int i4 = 2;
                    while (true) {
                        int i5 = i4 - 1;
                        if (i4 <= 0 || !stringTokenizer.hasMoreElements()) {
                            break;
                        }
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i4 = i5;
                    }
                    packageName = sb.toString();
                }
                if (str2 != null && !str2.contains(packageName)) {
                    str = str2;
                    boolean z2 = qcjVar.l;
                    pzh pzhVar2 = qcm.a().a;
                    return new AdRequestParcel(8, time, bundle, i2, unmodifiableList, z, Math.max(qcjVar.h, -1), false, null, null, location, null, qcjVar.f, qcjVar.j, Collections.unmodifiableList(new ArrayList(qcjVar.k)), null, str, z2, null, Math.max(-1, -1), (String) Collections.max(Arrays.asList(null, ""), fay.o), new ArrayList(qcjVar.b), 60000, null);
                }
            }
        }
        str = null;
        boolean z22 = qcjVar.l;
        pzh pzhVar22 = qcm.a().a;
        return new AdRequestParcel(8, time, bundle, i2, unmodifiableList, z, Math.max(qcjVar.h, -1), false, null, null, location, null, qcjVar.f, qcjVar.j, Collections.unmodifiableList(new ArrayList(qcjVar.k)), null, str, z22, null, Math.max(-1, -1), (String) Collections.max(Arrays.asList(null, ""), fay.o), new ArrayList(qcjVar.b), 60000, null);
    }
}
