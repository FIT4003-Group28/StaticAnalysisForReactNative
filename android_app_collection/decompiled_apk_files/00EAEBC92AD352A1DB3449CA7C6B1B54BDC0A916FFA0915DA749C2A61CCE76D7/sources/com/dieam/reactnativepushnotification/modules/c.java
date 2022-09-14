package com.dieam.reactnativepushnotification.modules;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.dieam.reactnativepushnotification.modules.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private Context f5127a;

    /* renamed from: b  reason: collision with root package name */
    private b f5128b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f5129c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f5130a;

        a(Bundle bundle) {
            this.f5130a = bundle;
        }

        @Override // com.dieam.reactnativepushnotification.modules.e.c
        public void a(Bitmap bitmap, Bitmap bitmap2) {
            c.this.a(this.f5130a, bitmap, bitmap2);
        }
    }

    public c(Application application) {
        this.f5127a = application;
        this.f5128b = new b(application);
        this.f5129c = application.getSharedPreferences("rn_push_notification", 0);
    }

    private boolean a(NotificationManager notificationManager, String str, String str2, String str3, Uri uri, int i, long[] jArr) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26 && notificationManager != null) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
            if (str2 == null) {
                str2 = this.f5128b.b(str);
            }
            if (str3 == null) {
                str3 = this.f5128b.a(str);
            }
            if (notificationChannel != null && notificationChannel.getName().equals(str2) && notificationChannel.getDescription().equals(str3)) {
                return false;
            }
            NotificationChannel notificationChannel2 = new NotificationChannel(str, str2, i);
            notificationChannel2.setDescription(str3);
            notificationChannel2.enableLights(true);
            if (jArr != null) {
                z = true;
            }
            notificationChannel2.enableVibration(z);
            notificationChannel2.setVibrationPattern(jArr);
            if (uri != null) {
                notificationChannel2.setSound(uri, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
            } else {
                notificationChannel2.setSound(null, null);
            }
            notificationManager.createNotificationChannel(notificationChannel2);
            return true;
        }
        return false;
    }

    private void d(String str) {
        Log.i(RNPushNotification.LOG_TAG, "Cancelling notification: " + str);
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        PendingIntent f2 = f(bundle);
        if (f2 != null) {
            i().cancel(f2);
        }
        if (this.f5129c.contains(str)) {
            SharedPreferences.Editor edit = this.f5129c.edit();
            edit.remove(str);
            edit.apply();
        } else {
            Log.w(RNPushNotification.LOG_TAG, "Unable to find notification " + str);
        }
        try {
            j().cancel(Integer.parseInt(str));
        } catch (Exception e2) {
            Log.e(RNPushNotification.LOG_TAG, "Unable to parse Notification ID " + str, e2);
        }
    }

    private Uri e(String str) {
        if (str == null || "default".equalsIgnoreCase(str)) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (this.f5127a.getResources().getIdentifier(str, "raw", this.f5127a.getPackageName()) == 0) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        int identifier = this.f5127a.getResources().getIdentifier(str, "raw", this.f5127a.getPackageName());
        return Uri.parse("android.resource://" + this.f5127a.getPackageName() + "/" + identifier);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void e(Bundle bundle) {
        char c2;
        long j;
        long j2;
        String str;
        String string = bundle.getString("repeatType");
        long j3 = (long) bundle.getDouble("repeatTime");
        if (string != null) {
            long j4 = (long) bundle.getDouble("fireDate");
            if (!Arrays.asList("time", "month", "week", "day", "hour", "minute").contains(string)) {
                str = String.format("Invalid repeatType specified as %s", string);
            } else if (!"time".equals(string) || j3 > 0) {
                switch (string.hashCode()) {
                    case -1074026988:
                        if (string.equals("minute")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 99228:
                        if (string.equals("day")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3208676:
                        if (string.equals("hour")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3560141:
                        if (string.equals("time")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3645428:
                        if (string.equals("week")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 104080000:
                        if (string.equals("month")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    j = j4 + j3;
                } else if (c2 != 1) {
                    if (c2 == 2) {
                        j2 = 604800000;
                    } else if (c2 == 3) {
                        j2 = 86400000;
                    } else if (c2 == 4) {
                        j2 = 3600000;
                    } else if (c2 != 5) {
                        j = 0;
                    } else {
                        j2 = 60000;
                    }
                    j = j2 + j4;
                } else {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTime(new Date(j4));
                    int i = gregorianCalendar.get(5);
                    int i2 = gregorianCalendar.get(12);
                    int i3 = gregorianCalendar.get(11);
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                    gregorianCalendar2.setTime(new Date());
                    int i4 = gregorianCalendar2.get(2);
                    int i5 = i4 < 11 ? i4 + 1 : 0;
                    gregorianCalendar2.set(1, gregorianCalendar2.get(1) + (i5 == 0 ? 1 : 0));
                    gregorianCalendar2.set(2, i5);
                    gregorianCalendar2.set(5, Math.min(i, gregorianCalendar2.getActualMaximum(5)));
                    gregorianCalendar2.set(11, i3);
                    gregorianCalendar2.set(12, i2);
                    gregorianCalendar2.set(13, 0);
                    j = gregorianCalendar2.getTimeInMillis();
                }
                if (j == 0) {
                    return;
                }
                Log.d(RNPushNotification.LOG_TAG, String.format("Repeating notification with id %s at time %s", bundle.getString("id"), Long.toString(j)));
                bundle.putDouble("fireDate", j);
                b(bundle);
                return;
            } else {
                str = "repeatType specified as time but no repeatTime has been mentioned";
            }
            Log.w(RNPushNotification.LOG_TAG, str);
        }
    }

    private PendingIntent f(Bundle bundle) {
        try {
            int parseInt = Integer.parseInt(bundle.getString("id"));
            Intent intent = new Intent(this.f5127a, RNPushNotificationPublisher.class);
            intent.putExtra("notificationId", parseInt);
            intent.putExtras(bundle);
            return PendingIntent.getBroadcast(this.f5127a, parseInt, intent, 134217728);
        } catch (Exception e2) {
            Log.e(RNPushNotification.LOG_TAG, "Unable to parse Notification ID", e2);
            return null;
        }
    }

    private AlarmManager i() {
        return (AlarmManager) this.f5127a.getSystemService("alarm");
    }

    private NotificationManager j() {
        return (NotificationManager) this.f5127a.getSystemService("notification");
    }

    public void a() {
        Log.i(RNPushNotification.LOG_TAG, "Cancelling all notifications");
        for (String str : this.f5129c.getAll().keySet()) {
            d(str);
        }
    }

    public void a(Bundle bundle) {
        try {
            Intent intent = new Intent(this.f5127a, Class.forName(this.f5127a.getPackageManager().getLaunchIntentForPackage(this.f5127a.getPackageName()).getComponent().getClassName()));
            if (bundle != null) {
                intent.putExtra("notification", bundle);
            }
            intent.addFlags(268435456);
            this.f5127a.startActivity(intent);
        } catch (Exception e2) {
            Log.e(RNPushNotification.LOG_TAG, "Class not found", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:(1:224)(52:225|(1:86)|87|(3:89|(1:(1:220)(1:221))(1:93)|(48:98|(1:100)|101|(1:103)|104|(1:106)|(1:108)(1:218)|109|(1:111)|112|(31:117|(1:210)|121|(1:209)|125|(2:127|(1:129)(2:130|(1:132)))|133|(17:138|139|(1:143)|144|(1:146)|147|148|149|(2:151|152)(1:195)|153|(3:155|(8:158|159|160|(1:162)(1:170)|163|(2:165|166)(2:168|169)|167|156)|175)|176|(1:178)|179|(2:186|(1:188)(1:189))|183|185)|201|(1:203)(1:208)|204|(1:206)|207|139|(2:141|143)|144|(0)|147|148|149|(0)(0)|153|(0)|176|(0)|179|(1:181)|186|(0)(0)|183|185)|211|(1:213)|214|(1:216)|217|(1:119)|210|121|(1:123)|209|125|(0)|133|(20:135|138|139|(0)|144|(0)|147|148|149|(0)(0)|153|(0)|176|(0)|179|(0)|186|(0)(0)|183|185)|201|(0)(0)|204|(0)|207|139|(0)|144|(0)|147|148|149|(0)(0)|153|(0)|176|(0)|179|(0)|186|(0)(0)|183|185))|222|(0)|101|(0)|104|(0)|(0)(0)|109|(0)|112|(34:114|117|(0)|210|121|(0)|209|125|(0)|133|(0)|201|(0)(0)|204|(0)|207|139|(0)|144|(0)|147|148|149|(0)(0)|153|(0)|176|(0)|179|(0)|186|(0)(0)|183|185)|211|(0)|214|(0)|217|(0)|210|121|(0)|209|125|(0)|133|(0)|201|(0)(0)|204|(0)|207|139|(0)|144|(0)|147|148|149|(0)(0)|153|(0)|176|(0)|179|(0)|186|(0)(0)|183|185))|148|149|(0)(0)|153|(0)|176|(0)|179|(0)|186|(0)(0)|183|185) */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x042d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0430, code lost:
        r2 = com.dieam.reactnativepushnotification.modules.RNPushNotification.LOG_TAG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0432, code lost:
        android.util.Log.e(r2, "Exception while converting actions to JSON object.", r0);
        r7 = null;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01db A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01eb A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f5 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021b A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022c A[Catch: Exception -> 0x0508, TRY_ENTER, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024f A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x027f A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0293 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a1 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b1 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e4 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f2 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0310 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0329 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0336 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0349 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x038a A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x039f A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03d8 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x041c A[Catch: JSONException -> 0x042d, Exception -> 0x0508, TRY_LEAVE, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04c5 A[Catch: Exception -> 0x0506, TryCatch #3 {Exception -> 0x0506, blocks: (B:250:0x0439, B:252:0x043f, B:253:0x0443, B:255:0x0477, B:257:0x0481, B:259:0x0491, B:263:0x04b1, B:260:0x04a0, B:262:0x04a6, B:264:0x04b8, B:266:0x04c5, B:267:0x04d1, B:269:0x04d7, B:275:0x0502, B:271:0x04df, B:273:0x04f1, B:274:0x04fd, B:247:0x0432, B:238:0x0414, B:240:0x041c), top: B:290:0x0414, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04d7 A[Catch: Exception -> 0x0506, TryCatch #3 {Exception -> 0x0506, blocks: (B:250:0x0439, B:252:0x043f, B:253:0x0443, B:255:0x0477, B:257:0x0481, B:259:0x0491, B:263:0x04b1, B:260:0x04a0, B:262:0x04a6, B:264:0x04b8, B:266:0x04c5, B:267:0x04d1, B:269:0x04d7, B:275:0x0502, B:271:0x04df, B:273:0x04f1, B:274:0x04fd, B:247:0x0432, B:238:0x0414, B:240:0x041c), top: B:290:0x0414, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04f1 A[Catch: Exception -> 0x0506, TryCatch #3 {Exception -> 0x0506, blocks: (B:250:0x0439, B:252:0x043f, B:253:0x0443, B:255:0x0477, B:257:0x0481, B:259:0x0491, B:263:0x04b1, B:260:0x04a0, B:262:0x04a6, B:264:0x04b8, B:266:0x04c5, B:267:0x04d1, B:269:0x04d7, B:275:0x0502, B:271:0x04df, B:273:0x04f1, B:274:0x04fd, B:247:0x0432, B:238:0x0414, B:240:0x041c), top: B:290:0x0414, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04fd A[Catch: Exception -> 0x0506, TryCatch #3 {Exception -> 0x0506, blocks: (B:250:0x0439, B:252:0x043f, B:253:0x0443, B:255:0x0477, B:257:0x0481, B:259:0x0491, B:263:0x04b1, B:260:0x04a0, B:262:0x04a6, B:264:0x04b8, B:266:0x04c5, B:267:0x04d1, B:269:0x04d7, B:275:0x0502, B:271:0x04df, B:273:0x04f1, B:274:0x04fd, B:247:0x0432, B:238:0x0414, B:240:0x041c), top: B:290:0x0414, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015b A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:58:0x00d6, B:60:0x00de, B:61:0x00e6, B:85:0x012f, B:94:0x0141, B:96:0x015b, B:123:0x01a8, B:125:0x01db, B:126:0x01e5, B:128:0x01eb, B:129:0x01ef, B:131:0x01f5, B:133:0x01fd, B:134:0x0200, B:136:0x0206, B:138:0x020c, B:139:0x0213, B:141:0x021b, B:142:0x0222, B:145:0x022c, B:147:0x0232, B:152:0x023f, B:155:0x024a, B:157:0x024f, B:159:0x0257, B:161:0x025d, B:167:0x0270, B:169:0x0276, B:172:0x027f, B:173:0x0282, B:175:0x0293, B:176:0x0296, B:180:0x02a1, B:182:0x02b9, B:184:0x02e4, B:185:0x02e9, B:187:0x02f2, B:199:0x0329, B:202:0x0330, B:204:0x0336, B:207:0x0343, B:209:0x0349, B:211:0x035c, B:214:0x0367, B:215:0x036a, B:217:0x038a, B:229:0x03d2, B:231:0x03d8, B:233:0x03e0, B:234:0x03e3, B:237:0x03ec, B:238:0x0414, B:240:0x041c, B:221:0x0397, B:223:0x039f, B:228:0x03b3, B:206:0x033c, B:201:0x032d, B:191:0x02fe, B:194:0x0308, B:196:0x0310, B:197:0x0322, B:181:0x02b1, B:163:0x0264, B:103:0x0177, B:106:0x0181, B:109:0x018b, B:63:0x00ea, B:66:0x00f2, B:69:0x00fc, B:72:0x0106, B:75:0x0110, B:78:0x011a, B:81:0x0124), top: B:288:0x00d6 }] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.app.NotificationManager] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.os.Bundle r23, android.graphics.Bitmap r24, android.graphics.Bitmap r25) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dieam.reactnativepushnotification.modules.c.a(android.os.Bundle, android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    public void a(ReadableArray readableArray) {
        NotificationManager j = j();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            Log.i(RNPushNotification.LOG_TAG, "Removing notification with id " + string);
            j.cancel(Integer.parseInt(string));
        }
    }

    public void a(ReadableMap readableMap) {
        for (String str : this.f5129c.getAll().keySet()) {
            try {
                String string = this.f5129c.getString(str, null);
                if (string != null && com.dieam.reactnativepushnotification.modules.a.a(string).a(readableMap)) {
                    d(str);
                }
            } catch (JSONException e2) {
                Log.w(RNPushNotification.LOG_TAG, "Problem dealing with scheduled notification " + str, e2);
            }
        }
    }

    public void a(String str, int i) {
        Log.i(RNPushNotification.LOG_TAG, "Clearing notification: " + i);
        NotificationManager j = j();
        if (str != null) {
            j.cancel(str, i);
        } else {
            j.cancel(i);
        }
    }

    public boolean a(String str) {
        NotificationManager j;
        NotificationChannel notificationChannel;
        return Build.VERSION.SDK_INT >= 26 && (j = j()) != null && (notificationChannel = j.getNotificationChannel(str)) != null && notificationChannel.getImportance() == 0;
    }

    public void b() {
        if (!this.f5128b.a()) {
            return;
        }
        NotificationManager j = j();
        int i = Build.VERSION.SDK_INT;
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        a(j, "rn-push-notification-channel-id-4-default-300", null, null, defaultUri, 4, new long[]{0, 300});
    }

    public void b(Bundle bundle) {
        String str;
        if (e() == null) {
            str = "No activity class found for the scheduled notification";
        } else if (bundle.getString("message") == null) {
            str = "No message specified for the scheduled notification";
        } else if (bundle.getString("id") == null) {
            str = "No notification ID specified for the scheduled notification";
        } else if (bundle.getDouble("fireDate") != 0.0d) {
            com.dieam.reactnativepushnotification.modules.a aVar = new com.dieam.reactnativepushnotification.modules.a(bundle);
            String b2 = aVar.b();
            Log.d(RNPushNotification.LOG_TAG, "Storing push notification with id " + b2);
            SharedPreferences.Editor edit = this.f5129c.edit();
            edit.putString(b2, aVar.i().toString());
            edit.apply();
            if (!this.f5129c.contains(b2)) {
                Log.e(RNPushNotification.LOG_TAG, "Failed to save " + b2);
            }
            c(bundle);
            return;
        } else {
            str = "No date specified for the scheduled notification";
        }
        Log.e(RNPushNotification.LOG_TAG, str);
    }

    public boolean b(ReadableMap readableMap) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return a(j(), readableMap.getString("channelId"), readableMap.getString("channelName"), readableMap.hasKey("channelDescription") ? readableMap.getString("channelDescription") : null, e(readableMap.hasKey("soundName") ? readableMap.getString("soundName") : "default"), readableMap.hasKey("importance") ? readableMap.getInt("importance") : 4, readableMap.hasKey("vibrate") && readableMap.getBoolean("vibrate") ? new long[]{300} : null);
    }

    public boolean b(String str) {
        NotificationManager j;
        return (Build.VERSION.SDK_INT < 26 || (j = j()) == null || j.getNotificationChannel(str) == null) ? false : true;
    }

    public void c() {
        Log.i(RNPushNotification.LOG_TAG, "Clearing alerts from the notification centre");
        j().cancelAll();
    }

    public void c(Bundle bundle) {
        long j = (long) bundle.getDouble("fireDate");
        boolean z = bundle.getBoolean("allowWhileIdle");
        PendingIntent f2 = f(bundle);
        if (f2 == null) {
            return;
        }
        Log.d(RNPushNotification.LOG_TAG, String.format("Setting a notification with id %s at time %s", bundle.getString("id"), Long.toString(j)));
        int i = Build.VERSION.SDK_INT;
        if (i < 19) {
            i().set(0, j, f2);
        } else if (!z || i < 23) {
            i().setExact(0, j, f2);
        } else {
            i().setExactAndAllowWhileIdle(0, j, f2);
        }
    }

    public void c(String str) {
        NotificationManager j;
        if (Build.VERSION.SDK_INT >= 26 && (j = j()) != null) {
            j.deleteNotificationChannel(str);
        }
    }

    public WritableArray d() {
        StatusBarNotification[] activeNotifications = j().getActiveNotifications();
        Log.i(RNPushNotification.LOG_TAG, "Found " + activeNotifications.length + " delivered notifications");
        WritableArray createArray = Arguments.createArray();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Notification notification = statusBarNotification.getNotification();
            Bundle bundle = notification.extras;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("identifier", "" + statusBarNotification.getId());
            createMap.putString("title", bundle.getString("android.title"));
            createMap.putString("body", bundle.getString("android.text"));
            createMap.putString("tag", statusBarNotification.getTag());
            createMap.putString("group", notification.getGroup());
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    public void d(Bundle bundle) {
        e eVar = new e(new a(bundle));
        eVar.b(this.f5127a, bundle.getString("largeIconUrl"));
        eVar.a(this.f5127a, bundle.getString("bigPictureUrl"));
    }

    public Class e() {
        try {
            return Class.forName(this.f5127a.getPackageManager().getLaunchIntentForPackage(this.f5127a.getPackageName()).getComponent().getClassName());
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public WritableArray f() {
        WritableArray createArray = Arguments.createArray();
        for (Map.Entry<String, ?> entry : this.f5129c.getAll().entrySet()) {
            try {
                com.dieam.reactnativepushnotification.modules.a a2 = com.dieam.reactnativepushnotification.modules.a.a(entry.getValue().toString());
                WritableMap createMap = Arguments.createMap();
                createMap.putString("title", a2.g());
                createMap.putString("message", a2.c());
                createMap.putString("number", a2.d());
                createMap.putDouble("date", a2.a());
                createMap.putString("id", a2.b());
                createMap.putString("repeatInterval", a2.e());
                createMap.putString("soundName", a2.f());
                createArray.pushMap(createMap);
            } catch (JSONException e2) {
                Log.e(RNPushNotification.LOG_TAG, e2.getMessage());
            }
        }
        return createArray;
    }

    public boolean g() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f5127a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(this.f5127a.getPackageName()) && runningAppProcessInfo.importance == 100 && runningAppProcessInfo.pkgList.length > 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public List<String> h() {
        NotificationManager j;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 26 && (j = j()) != null) {
            for (NotificationChannel notificationChannel : j.getNotificationChannels()) {
                arrayList.add(notificationChannel.getId());
            }
            return arrayList;
        }
        return arrayList;
    }
}
