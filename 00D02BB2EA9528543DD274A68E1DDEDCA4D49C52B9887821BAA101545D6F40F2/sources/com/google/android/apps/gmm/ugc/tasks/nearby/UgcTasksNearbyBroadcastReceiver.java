package com.google.android.apps.gmm.ugc.tasks.nearby;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.gmm.ugc.tasks.nearby.UgcTasksNearbyBroadcastReceiver;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UgcTasksNearbyBroadcastReceiver extends BroadcastReceiver {
    public static final String a = b("TRIGGER_NEARBY_NEED");
    public static final String b = b("TRIGGER_NEARBY_PLACE_REMINDER");
    public static final String c = b("NO_NEARBY_NEED");
    public static final String d = b("DISMISS_NEARBY_NEED");
    public static final String e = b("DISMISS_NEARBY_PLACE_REMINDER");
    public static final String f = b("BLACKLIST_PLACE");
    public static final String g = b("DELETE_PLACE_REMINDER");
    public cgsy h;
    public cgth i;
    public cgtk j;
    public cgsr k;

    public static Intent a(String str, Context context, GmmLocation gmmLocation, long j) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setClass(context, UgcTasksNearbyBroadcastReceiver.class);
        intent.putExtra("LAT", gmmLocation.getLatitude());
        intent.putExtra("LNG", gmmLocation.getLongitude());
        intent.putExtra("TIMESTAMP_MS", j);
        return intent;
    }

    private static String b(String str) {
        String canonicalName = UgcTasksNearbyBroadcastReceiver.class.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 1 + str.length());
        sb.append(canonicalName);
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        dxiq.c(this, context);
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        cgsr cgsrVar = this.k;
        cgsrVar.a.execute(new Runnable(this, context, intent, goAsync) { // from class: cgsp
            private final UgcTasksNearbyBroadcastReceiver a;
            private final Context b;
            private final Intent c;
            private final BroadcastReceiver.PendingResult d;

            {
                this.a = this;
                this.b = context;
                this.c = intent;
                this.d = goAsync;
            }

            /* JADX WARN: Code restructure failed: missing block: B:110:0x02db, code lost:
                if (r7 != 2) goto L92;
             */
            /* JADX WARN: Removed duplicated region for block: B:207:0x0669 A[Catch: all -> 0x072f, TRY_LEAVE, TryCatch #6 {all -> 0x072f, blocks: (B:218:0x067e, B:220:0x0682, B:184:0x0520, B:186:0x0526, B:187:0x052a, B:189:0x053d, B:190:0x053f, B:194:0x0559, B:202:0x065a, B:203:0x065d, B:204:0x0660, B:205:0x0663, B:206:0x0666, B:165:0x0458, B:167:0x0465, B:169:0x0472, B:170:0x047a, B:172:0x0480, B:173:0x04aa, B:175:0x04e5, B:177:0x04eb, B:179:0x04fe, B:168:0x0470, B:174:0x04dd, B:180:0x050b, B:182:0x0514, B:183:0x0517, B:207:0x0669, B:217:0x067a, B:221:0x06a3, B:223:0x06ad, B:225:0x06b5, B:226:0x06c5, B:228:0x06cd, B:229:0x06d4, B:231:0x06dc, B:233:0x06e4, B:234:0x06eb, B:237:0x06f5, B:239:0x0705, B:240:0x070b, B:28:0x00c0, B:33:0x00ed, B:34:0x0114), top: B:257:0x0075, inners: #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:220:0x0682 A[Catch: all -> 0x072f, TryCatch #6 {all -> 0x072f, blocks: (B:218:0x067e, B:220:0x0682, B:184:0x0520, B:186:0x0526, B:187:0x052a, B:189:0x053d, B:190:0x053f, B:194:0x0559, B:202:0x065a, B:203:0x065d, B:204:0x0660, B:205:0x0663, B:206:0x0666, B:165:0x0458, B:167:0x0465, B:169:0x0472, B:170:0x047a, B:172:0x0480, B:173:0x04aa, B:175:0x04e5, B:177:0x04eb, B:179:0x04fe, B:168:0x0470, B:174:0x04dd, B:180:0x050b, B:182:0x0514, B:183:0x0517, B:207:0x0669, B:217:0x067a, B:221:0x06a3, B:223:0x06ad, B:225:0x06b5, B:226:0x06c5, B:228:0x06cd, B:229:0x06d4, B:231:0x06dc, B:233:0x06e4, B:234:0x06eb, B:237:0x06f5, B:239:0x0705, B:240:0x070b, B:28:0x00c0, B:33:0x00ed, B:34:0x0114), top: B:257:0x0075, inners: #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:53:0x016c A[Catch: all -> 0x0027, TryCatch #4 {all -> 0x0027, blocks: (B:7:0x0021, B:13:0x0043, B:18:0x008c, B:49:0x0149, B:51:0x014f, B:53:0x016c, B:54:0x0171, B:56:0x0191, B:57:0x0196, B:59:0x01b5, B:60:0x01bb, B:61:0x01cc, B:72:0x0206, B:83:0x0238, B:87:0x024e, B:89:0x025f, B:90:0x0265, B:94:0x027f, B:96:0x0283, B:97:0x0285, B:101:0x02ab, B:102:0x02bb, B:104:0x02c1, B:106:0x02d1, B:111:0x02dd, B:116:0x02e9, B:118:0x02f3, B:119:0x02fb, B:121:0x0301, B:124:0x0310, B:126:0x0316, B:131:0x032b, B:136:0x0361, B:154:0x03c1, B:141:0x036f, B:143:0x0381, B:148:0x0392, B:40:0x0132, B:46:0x0143, B:22:0x009b, B:62:0x01cd, B:63:0x01ee), top: B:256:0x0021 }] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0191 A[Catch: all -> 0x0027, TryCatch #4 {all -> 0x0027, blocks: (B:7:0x0021, B:13:0x0043, B:18:0x008c, B:49:0x0149, B:51:0x014f, B:53:0x016c, B:54:0x0171, B:56:0x0191, B:57:0x0196, B:59:0x01b5, B:60:0x01bb, B:61:0x01cc, B:72:0x0206, B:83:0x0238, B:87:0x024e, B:89:0x025f, B:90:0x0265, B:94:0x027f, B:96:0x0283, B:97:0x0285, B:101:0x02ab, B:102:0x02bb, B:104:0x02c1, B:106:0x02d1, B:111:0x02dd, B:116:0x02e9, B:118:0x02f3, B:119:0x02fb, B:121:0x0301, B:124:0x0310, B:126:0x0316, B:131:0x032b, B:136:0x0361, B:154:0x03c1, B:141:0x036f, B:143:0x0381, B:148:0x0392, B:40:0x0132, B:46:0x0143, B:22:0x009b, B:62:0x01cd, B:63:0x01ee), top: B:256:0x0021 }] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01b5 A[Catch: all -> 0x0027, TryCatch #4 {all -> 0x0027, blocks: (B:7:0x0021, B:13:0x0043, B:18:0x008c, B:49:0x0149, B:51:0x014f, B:53:0x016c, B:54:0x0171, B:56:0x0191, B:57:0x0196, B:59:0x01b5, B:60:0x01bb, B:61:0x01cc, B:72:0x0206, B:83:0x0238, B:87:0x024e, B:89:0x025f, B:90:0x0265, B:94:0x027f, B:96:0x0283, B:97:0x0285, B:101:0x02ab, B:102:0x02bb, B:104:0x02c1, B:106:0x02d1, B:111:0x02dd, B:116:0x02e9, B:118:0x02f3, B:119:0x02fb, B:121:0x0301, B:124:0x0310, B:126:0x0316, B:131:0x032b, B:136:0x0361, B:154:0x03c1, B:141:0x036f, B:143:0x0381, B:148:0x0392, B:40:0x0132, B:46:0x0143, B:22:0x009b, B:62:0x01cd, B:63:0x01ee), top: B:256:0x0021 }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x01cd A[Catch: all -> 0x01f0, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:7:0x0021, B:13:0x0043, B:18:0x008c, B:49:0x0149, B:51:0x014f, B:53:0x016c, B:54:0x0171, B:56:0x0191, B:57:0x0196, B:59:0x01b5, B:60:0x01bb, B:61:0x01cc, B:72:0x0206, B:83:0x0238, B:87:0x024e, B:89:0x025f, B:90:0x0265, B:94:0x027f, B:96:0x0283, B:97:0x0285, B:101:0x02ab, B:102:0x02bb, B:104:0x02c1, B:106:0x02d1, B:111:0x02dd, B:116:0x02e9, B:118:0x02f3, B:119:0x02fb, B:121:0x0301, B:124:0x0310, B:126:0x0316, B:131:0x032b, B:136:0x0361, B:154:0x03c1, B:141:0x036f, B:143:0x0381, B:148:0x0392, B:40:0x0132, B:46:0x0143, B:22:0x009b, B:62:0x01cd, B:63:0x01ee), top: B:256:0x0021 }] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x01f6 A[Catch: all -> 0x0731, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0731, blocks: (B:4:0x000c, B:11:0x002d, B:14:0x0048, B:16:0x0077, B:25:0x00b2, B:28:0x00c0, B:29:0x00cc, B:31:0x00dd, B:32:0x00ec, B:35:0x0115, B:70:0x01f6, B:75:0x020d, B:78:0x0216, B:81:0x022e, B:85:0x023c, B:91:0x027a, B:98:0x0288, B:99:0x02a5, B:129:0x031f, B:133:0x032f, B:152:0x03bb, B:156:0x03c7, B:158:0x0410, B:161:0x041f, B:163:0x0429, B:138:0x0364, B:145:0x0387, B:151:0x0398, B:74:0x0209, B:38:0x011d, B:41:0x0134, B:44:0x013f, B:20:0x0093, B:24:0x00ae), top: B:252:0x000c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1855
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cgsp.run():void");
            }
        });
    }
}
