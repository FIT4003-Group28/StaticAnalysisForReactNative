package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent;
import com.google.android.apps.gmm.notification.log.api.NotificationLogger$IntentMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auhf  reason: default package */
/* loaded from: classes2.dex */
public final class auhf {
    public static <T> void a(@dzsi T t, auhe<T> auheVar) {
        if (t != null) {
            auheVar.a(t);
        }
    }

    public static final PendingIntent b(@dzsi auhx auhxVar, @dzsi cjsh cjshVar, cjtd cjtdVar, NotificationLogger$IntentMetadata notificationLogger$IntentMetadata, boolean z, Application application, augj augjVar) {
        dbsg<Integer> dbsgVar;
        cjrc cjrcVar;
        ausn f = augjVar.t.f();
        int i = augjVar.a;
        if (auhxVar == null) {
            return PendingIntent.getBroadcast(application, i, aush.b(application, null, notificationLogger$IntentMetadata, cjshVar, cjtdVar, f, augjVar.R, null, i, augjVar.g, augjVar.e, false), 268435456);
        }
        dbsg<String> dbsgVar2 = dbpy.a;
        dbsg<String> dbsgVar3 = dbpy.a;
        String str = null;
        if (cjtdVar != null) {
            cjsa cjsaVar = cjtdVar.m;
            if (cjsaVar != null && (cjrcVar = cjsaVar.a) != null) {
                str = cjrcVar.a;
            }
            dbsgVar2 = dbsg.j(cjtdVar.d);
            dbsgVar3 = dbsg.j(cjtdVar.e);
        }
        aujb aujbVar = augjVar.b;
        auhy h = NotificationIntentConverter$NotificationIntent.h();
        if (aujbVar != null) {
            dbsgVar = dbsg.i(Integer.valueOf(aujbVar.a));
        } else {
            dbsgVar = dbpy.a;
        }
        auht auhtVar = (auht) h;
        auhtVar.a = dbsgVar;
        h.c(auhxVar.b);
        h.b(auhxVar.a);
        auhtVar.b = dbsgVar2;
        auhtVar.c = dbsgVar3;
        auhtVar.d = dbsg.j(str);
        return aush.a(application, h.a(), notificationLogger$IntentMetadata, cjshVar, cjtdVar, f, augjVar.R, null, i, augjVar.g, augjVar.e, z);
    }
}
