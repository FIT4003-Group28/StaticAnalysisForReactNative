package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: uhk  reason: default package */
/* loaded from: classes4.dex */
public final class uhk implements uhe {
    public Context a;
    public ucj b;

    @Override // defpackage.uhe
    public final String a(ucw ucwVar) {
        Set emptySet;
        if (akg.c()) {
            if (akg.c()) {
                emptySet = new afy();
                for (NotificationChannel notificationChannel : ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannels()) {
                    emptySet.add(notificationChannel.getId());
                }
            } else {
                emptySet = Collections.emptySet();
            }
            aolv aolvVar = ucwVar.d.o;
            if (aolvVar == null) {
                aolvVar = aolv.a;
            }
            String str = aolvVar.b;
            if (!TextUtils.isEmpty(str) && emptySet.contains(str)) {
                return str;
            }
            String str2 = this.b.d.j;
            if (!TextUtils.isEmpty(str2) && emptySet.contains(str2)) {
                return str2;
            }
            uev.b("NotificationChannelHelperImpl", "Did not find the intended channel '%s' or the default channel '%s'", str, str2);
        }
        return null;
    }

    @Override // defpackage.uhe
    public final List c() {
        String str;
        int i;
        if (akg.c()) {
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel notificationChannel : ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannels()) {
                uha uhaVar = new uha();
                uhaVar.a("");
                String id = notificationChannel.getId();
                if (id != null) {
                    uhaVar.a = id;
                    int importance = notificationChannel.getImportance();
                    int i2 = 4;
                    if (importance == 0) {
                        i2 = 5;
                    } else if (importance != 2) {
                        i2 = importance != 3 ? importance != 4 ? 1 : 3 : 2;
                    }
                    uhaVar.c = i2;
                    if (!TextUtils.isEmpty(notificationChannel.getGroup())) {
                        uhaVar.a(notificationChannel.getGroup());
                    }
                    String str2 = uhaVar.a;
                    if (str2 != null && (str = uhaVar.b) != null && (i = uhaVar.c) != 0) {
                        arrayList.add(new uhb(str2, str, i));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (uhaVar.a == null) {
                            sb.append(" id");
                        }
                        if (uhaVar.b == null) {
                            sb.append(" group");
                        }
                        if (uhaVar.c == 0) {
                            sb.append(" importance");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                } else {
                    throw new NullPointerException("Null id");
                }
            }
            return arrayList;
        }
        return Arrays.asList(new uhb[0]);
    }

    @Override // defpackage.uhe
    public final void d(fi fiVar, ucw ucwVar) {
        String a = a(ucwVar);
        if (!TextUtils.isEmpty(a)) {
            uev.d("NotificationChannelHelperImpl", "Setting channel Id: '%s'", a);
            fiVar.E = a;
        }
    }

    @Override // defpackage.uhe
    public final boolean e(String str) {
        NotificationChannel notificationChannel;
        if (uid.d(this.a)) {
            return !TextUtils.isEmpty(str) && (notificationChannel = ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannel(str)) != null && notificationChannel.getImportance() > 0;
        }
        return true;
    }

    @Override // defpackage.uhe
    public final List b() {
        Boolean bool;
        if (Build.VERSION.SDK_INT < 28) {
            return Arrays.asList(new uhd[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (NotificationChannelGroup notificationChannelGroup : ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannelGroups()) {
            uhc uhcVar = new uhc();
            uhcVar.a(false);
            String id = notificationChannelGroup.getId();
            if (id != null) {
                uhcVar.a = id;
                uhcVar.a(notificationChannelGroup.isBlocked());
                String str = uhcVar.a;
                if (str != null && (bool = uhcVar.b) != null) {
                    arrayList.add(new uhd(str, bool.booleanValue()));
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (uhcVar.a == null) {
                        sb.append(" id");
                    }
                    if (uhcVar.b == null) {
                        sb.append(" blocked");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                throw new NullPointerException("Null id");
            }
        }
        return arrayList;
    }
}
