package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ausf  reason: default package */
/* loaded from: classes2.dex */
public final class ausf implements ausp {
    private static final dcqe a = dcqe.c("ausf");
    private final Context b;
    private final auso c;
    private final auhz d;
    private final auql e;

    public ausf(Application application, auhz auhzVar, auso ausoVar, auql auqlVar) {
        this.b = application;
        this.d = auhzVar;
        this.c = ausoVar;
        this.e = auqlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(Intent intent) {
        Bundle bundle;
        NotificationIntentConverter$NotificationIntent notificationIntentConverter$NotificationIntent;
        NotificationIntentConverter$NotificationIntent a2;
        int i;
        String string;
        Map map;
        auhz auhzVar = this.d;
        Context context = this.b;
        if (!aush.c(intent) || (bundle = (Bundle) intent.getParcelableExtra("extras_bundle")) == null || (notificationIntentConverter$NotificationIntent = (NotificationIntentConverter$NotificationIntent) bundle.getParcelable("notification_intent")) == null) {
            a2 = null;
        } else {
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent != null) {
                Iterator<String> it = resultsFromIntent.keySet().iterator();
                while (it.hasNext()) {
                    int i2 = 1;
                    ip[] ipVarArr = {new io(it.next()).a()};
                    Intent c = notificationIntentConverter$NotificationIntent.c();
                    if (Build.VERSION.SDK_INT < 26) {
                        Bundle resultsFromIntent2 = RemoteInput.getResultsFromIntent(c);
                        if (Build.VERSION.SDK_INT >= 28) {
                            i = RemoteInput.getResultsSource(c);
                        } else {
                            Intent d = ip.d(c);
                            i = d == null ? 0 : d.getExtras().getInt("android.remoteinput.resultsSource", 0);
                        }
                        if (resultsFromIntent2 == null) {
                            resultsFromIntent2 = resultsFromIntent;
                        } else {
                            resultsFromIntent2.putAll(resultsFromIntent);
                        }
                        ip ipVar = ipVarArr[0];
                        String str = ipVar.a;
                        if (Build.VERSION.SDK_INT >= 26) {
                            map = RemoteInput.getDataResultsFromIntent(c, str);
                        } else {
                            Intent d2 = ip.d(c);
                            if (d2 == null) {
                                map = null;
                            } else {
                                Map hashMap = new HashMap();
                                for (String str2 : d2.getExtras().keySet()) {
                                    if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                                        String substring = str2.substring(39);
                                        if (!substring.isEmpty() && (string = d2.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                                            hashMap.put(substring, Uri.parse(string));
                                        }
                                    }
                                }
                                i2 = 1;
                                map = hashMap.isEmpty() ? null : hashMap;
                            }
                        }
                        ip[] ipVarArr2 = new ip[i2];
                        ipVarArr2[0] = ipVar;
                        RemoteInput.addResultsToIntent(ip.b(ipVarArr2), c, resultsFromIntent2);
                        if (map != null) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                RemoteInput.addDataResultToIntent(ip.c(ipVar), c, map);
                            } else {
                                Intent d3 = ip.d(c);
                                if (d3 == null) {
                                    d3 = new Intent();
                                }
                                for (Map.Entry entry : map.entrySet()) {
                                    String str3 = (String) entry.getKey();
                                    Uri uri = (Uri) entry.getValue();
                                    if (str3 != null) {
                                        Bundle bundleExtra = d3.getBundleExtra(ip.a(str3));
                                        if (bundleExtra == null) {
                                            bundleExtra = new Bundle();
                                        }
                                        bundleExtra.putString(ipVar.a, uri.toString());
                                        d3.putExtra(ip.a(str3), bundleExtra);
                                    }
                                }
                                c.setClipData(ClipData.newIntent("android.remoteinput.results", d3));
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            RemoteInput.setResultsSource(c, i);
                        } else {
                            Intent d4 = ip.d(c);
                            if (d4 == null) {
                                d4 = new Intent();
                            }
                            d4.putExtra("android.remoteinput.resultsSource", i);
                            c.setClipData(ClipData.newIntent("android.remoteinput.results", d4));
                        }
                    } else {
                        RemoteInput.addResultsToIntent(ip.b(ipVarArr), c, resultsFromIntent);
                    }
                }
            }
            Intent c2 = notificationIntentConverter$NotificationIntent.c();
            c2.setExtrasClassLoader(context.getClassLoader());
            auhy g = notificationIntentConverter$NotificationIntent.g();
            g.b(c2);
            a2 = g.a();
        }
        PendingIntent d5 = auhzVar.d(a2);
        if (d5 == null) {
            return;
        }
        try {
            d5.send();
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0093 A[Catch: all -> 0x010d, Exception -> 0x010f, Merged into TryCatch #1 {all -> 0x010d, Exception -> 0x010f, blocks: (B:3:0x000b, B:5:0x0014, B:9:0x0023, B:11:0x002b, B:12:0x0030, B:14:0x0036, B:15:0x0043, B:19:0x0052, B:23:0x0061, B:33:0x007c, B:42:0x0096, B:51:0x00af, B:53:0x00c1, B:55:0x00c5, B:58:0x00ce, B:63:0x00de, B:66:0x00e5, B:68:0x00ed, B:69:0x0102, B:61:0x00d6, B:57:0x00c9, B:45:0x009d, B:48:0x00a4, B:50:0x00ac, B:36:0x0084, B:39:0x008b, B:41:0x0093, B:26:0x0069, B:29:0x0070, B:32:0x0079, B:22:0x005a, B:18:0x004b, B:8:0x001d, B:77:0x0110), top: B:83:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d A[Catch: all -> 0x010d, Exception -> 0x010f, Merged into TryCatch #1 {all -> 0x010d, Exception -> 0x010f, blocks: (B:3:0x000b, B:5:0x0014, B:9:0x0023, B:11:0x002b, B:12:0x0030, B:14:0x0036, B:15:0x0043, B:19:0x0052, B:23:0x0061, B:33:0x007c, B:42:0x0096, B:51:0x00af, B:53:0x00c1, B:55:0x00c5, B:58:0x00ce, B:63:0x00de, B:66:0x00e5, B:68:0x00ed, B:69:0x0102, B:61:0x00d6, B:57:0x00c9, B:45:0x009d, B:48:0x00a4, B:50:0x00ac, B:36:0x0084, B:39:0x008b, B:41:0x0093, B:26:0x0069, B:29:0x0070, B:32:0x0079, B:22:0x005a, B:18:0x004b, B:8:0x001d, B:77:0x0110), top: B:83:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac A[Catch: all -> 0x010d, Exception -> 0x010f, Merged into TryCatch #1 {all -> 0x010d, Exception -> 0x010f, blocks: (B:3:0x000b, B:5:0x0014, B:9:0x0023, B:11:0x002b, B:12:0x0030, B:14:0x0036, B:15:0x0043, B:19:0x0052, B:23:0x0061, B:33:0x007c, B:42:0x0096, B:51:0x00af, B:53:0x00c1, B:55:0x00c5, B:58:0x00ce, B:63:0x00de, B:66:0x00e5, B:68:0x00ed, B:69:0x0102, B:61:0x00d6, B:57:0x00c9, B:45:0x009d, B:48:0x00a4, B:50:0x00ac, B:36:0x0084, B:39:0x008b, B:41:0x0093, B:26:0x0069, B:29:0x0070, B:32:0x0079, B:22:0x005a, B:18:0x004b, B:8:0x001d, B:77:0x0110), top: B:83:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1 A[Catch: all -> 0x010d, Exception -> 0x010f, Merged into TryCatch #1 {all -> 0x010d, Exception -> 0x010f, blocks: (B:3:0x000b, B:5:0x0014, B:9:0x0023, B:11:0x002b, B:12:0x0030, B:14:0x0036, B:15:0x0043, B:19:0x0052, B:23:0x0061, B:33:0x007c, B:42:0x0096, B:51:0x00af, B:53:0x00c1, B:55:0x00c5, B:58:0x00ce, B:63:0x00de, B:66:0x00e5, B:68:0x00ed, B:69:0x0102, B:61:0x00d6, B:57:0x00c9, B:45:0x009d, B:48:0x00a4, B:50:0x00ac, B:36:0x0084, B:39:0x008b, B:41:0x0093, B:26:0x0069, B:29:0x0070, B:32:0x0079, B:22:0x005a, B:18:0x004b, B:8:0x001d, B:77:0x0110), top: B:83:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6 A[Catch: all -> 0x010d, Exception -> 0x010f, Merged into TryCatch #1 {all -> 0x010d, Exception -> 0x010f, blocks: (B:3:0x000b, B:5:0x0014, B:9:0x0023, B:11:0x002b, B:12:0x0030, B:14:0x0036, B:15:0x0043, B:19:0x0052, B:23:0x0061, B:33:0x007c, B:42:0x0096, B:51:0x00af, B:53:0x00c1, B:55:0x00c5, B:58:0x00ce, B:63:0x00de, B:66:0x00e5, B:68:0x00ed, B:69:0x0102, B:61:0x00d6, B:57:0x00c9, B:45:0x009d, B:48:0x00a4, B:50:0x00ac, B:36:0x0084, B:39:0x008b, B:41:0x0093, B:26:0x0069, B:29:0x0070, B:32:0x0079, B:22:0x005a, B:18:0x004b, B:8:0x001d, B:77:0x0110), top: B:83:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de A[Catch: all -> 0x010d, Exception -> 0x010f, Merged into TryCatch #1 {all -> 0x010d, Exception -> 0x010f, blocks: (B:3:0x000b, B:5:0x0014, B:9:0x0023, B:11:0x002b, B:12:0x0030, B:14:0x0036, B:15:0x0043, B:19:0x0052, B:23:0x0061, B:33:0x007c, B:42:0x0096, B:51:0x00af, B:53:0x00c1, B:55:0x00c5, B:58:0x00ce, B:63:0x00de, B:66:0x00e5, B:68:0x00ed, B:69:0x0102, B:61:0x00d6, B:57:0x00c9, B:45:0x009d, B:48:0x00a4, B:50:0x00ac, B:36:0x0084, B:39:0x008b, B:41:0x0093, B:26:0x0069, B:29:0x0070, B:32:0x0079, B:22:0x005a, B:18:0x004b, B:8:0x001d, B:77:0x0110), top: B:83:0x000b }] */
    @Override // defpackage.ausp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Intent r17, java.lang.Runnable r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ausf.a(android.content.Intent, java.lang.Runnable):void");
    }
}
