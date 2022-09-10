package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cvox  reason: default package */
/* loaded from: classes5.dex */
public final class cvox implements cvor {
    public Context a;
    public cvjs b;

    @Override // defpackage.cvor
    public final void a(ib ibVar, cvkj cvkjVar) {
        String b = b(cvkjVar);
        if (!TextUtils.isEmpty(b)) {
            cvlw.c("NotificationChannelHelperImpl", "Setting channel Id: '%s'", b);
            ibVar.G = b;
        }
    }

    @Override // defpackage.cvor
    public final String b(cvkj cvkjVar) {
        Set emptySet;
        if (ako.a()) {
            if (ako.a()) {
                emptySet = new aih();
                for (NotificationChannel notificationChannel : ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannels()) {
                    emptySet.add(notificationChannel.getId());
                }
            } else {
                emptySet = Collections.emptySet();
            }
            dsbw dsbwVar = cvkjVar.d().n;
            if (dsbwVar == null) {
                dsbwVar = dsbw.b;
            }
            String str = dsbwVar.a;
            if (!TextUtils.isEmpty(str) && emptySet.contains(str)) {
                return str;
            }
            String l = this.b.e().l();
            if (!TextUtils.isEmpty(l) && emptySet.contains(l)) {
                return l;
            }
            cvlw.d("NotificationChannelHelperImpl", "Did not find the intended channel '%s' or the default channel '%s'", str, l);
        }
        return null;
    }

    @Override // defpackage.cvor
    public final List<cvoo> c() {
        if (ako.a()) {
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel notificationChannel : ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannels()) {
                cvoj cvojVar = new cvoj();
                String str = "";
                cvojVar.a(str);
                String id = notificationChannel.getId();
                if (id != null) {
                    cvojVar.a = id;
                    int importance = notificationChannel.getImportance();
                    int i = 4;
                    if (importance == 0) {
                        i = 5;
                    } else if (importance != 2) {
                        i = importance != 3 ? importance != 4 ? 1 : 3 : 2;
                    }
                    cvojVar.c = i;
                    if (!TextUtils.isEmpty(notificationChannel.getGroup())) {
                        cvojVar.a(notificationChannel.getGroup());
                    }
                    if (cvojVar.a == null) {
                        str = " id";
                    }
                    if (cvojVar.b == null) {
                        str = str.concat(" group");
                    }
                    if (cvojVar.c == 0) {
                        str = String.valueOf(str).concat(" importance");
                    }
                    if (!str.isEmpty()) {
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    arrayList.add(new cvok(cvojVar.a, cvojVar.b, cvojVar.c));
                } else {
                    throw new NullPointerException("Null id");
                }
            }
            return arrayList;
        }
        return Arrays.asList(new cvoo[0]);
    }

    @Override // defpackage.cvor
    public final List<cvoq> d() {
        if (ako.b()) {
            ArrayList arrayList = new ArrayList();
            for (NotificationChannelGroup notificationChannelGroup : ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannelGroups()) {
                cvol cvolVar = new cvol();
                cvolVar.a(false);
                String id = notificationChannelGroup.getId();
                if (id != null) {
                    cvolVar.a = id;
                    cvolVar.a(notificationChannelGroup.isBlocked());
                    String str = cvolVar.a == null ? " id" : "";
                    if (cvolVar.b == null) {
                        str = str.concat(" blocked");
                    }
                    if (!str.isEmpty()) {
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    arrayList.add(new cvom(cvolVar.a, cvolVar.b.booleanValue()));
                } else {
                    throw new NullPointerException("Null id");
                }
            }
            return arrayList;
        }
        return Arrays.asList(new cvoq[0]);
    }

    @Override // defpackage.cvor
    public final boolean e(String str) {
        NotificationChannel notificationChannel;
        if (cvpo.d(this.a)) {
            return !TextUtils.isEmpty(str) && (notificationChannel = ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannel(str)) != null && notificationChannel.getImportance() > 0;
        }
        return true;
    }
}
