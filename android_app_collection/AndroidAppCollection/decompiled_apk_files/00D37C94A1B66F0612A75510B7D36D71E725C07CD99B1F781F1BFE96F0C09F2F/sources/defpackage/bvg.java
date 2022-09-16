package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvg  reason: default package */
/* loaded from: classes2.dex */
public final class bvg implements Runnable {
    private static final String a = bqf.b("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final brq d;
    private int e = 0;

    public bvg(Context context, brq brqVar) {
        this.c = context.getApplicationContext();
        this.d = brqVar;
    }

    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b2 = b(context, true != akg.e() ? 134217728 : 167772160);
        long currentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b2);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x025a, code lost:
        if (r3 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025c, code lost:
        defpackage.bqf.a().d(new java.lang.Throwable[0]);
        r3 = r16.d;
        defpackage.bra.b(r3.d, r3.e);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cc A[Catch: all -> 0x0308, TRY_LEAVE, TryCatch #17 {all -> 0x0308, blocks: (B:3:0x0004, B:5:0x0013, B:11:0x0041, B:13:0x004e, B:15:0x0054, B:17:0x0066, B:19:0x006e, B:21:0x007f, B:23:0x0088, B:20:0x0073, B:24:0x00c2, B:25:0x00ca, B:27:0x00d0, B:30:0x00e4, B:32:0x00ea, B:33:0x00fe, B:35:0x0105, B:37:0x011c, B:36:0x0111, B:38:0x0126, B:39:0x012f, B:41:0x0133, B:56:0x014c, B:70:0x01b1, B:76:0x01bc, B:78:0x01cc, B:80:0x01d6, B:82:0x01fa, B:86:0x0205, B:90:0x0213, B:96:0x021d, B:98:0x0228, B:100:0x022e, B:103:0x0235, B:105:0x023b, B:125:0x0282, B:108:0x024a, B:118:0x025c, B:124:0x0274, B:163:0x02c4, B:165:0x02cc, B:167:0x02ee, B:169:0x02f4, B:170:0x0307, B:111:0x0250, B:136:0x02a7, B:137:0x02aa, B:6:0x001d), top: B:182:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211  */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvg.run():void");
    }
}
