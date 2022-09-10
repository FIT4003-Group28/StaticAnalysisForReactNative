package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bhc  reason: default package */
/* loaded from: classes3.dex */
public final class bhc implements Runnable {
    private static final long a;
    private final Context b;
    private final bdn c;
    private int d = 0;

    static {
        bbz.f("ForceStopRunnable");
        a = TimeUnit.DAYS.toMillis(3650L);
    }

    public bhc(Context context, bdn bdnVar) {
        this.b = context.getApplicationContext();
        this.c = bdnVar;
    }

    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b = b(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + a;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204 A[Catch: SQLiteAccessPermException -> 0x0254, SQLiteTableLockedException -> 0x0256, SQLiteDatabaseLockedException -> 0x0258, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException -> 0x025a, SQLiteCantOpenDatabaseException -> 0x025c, TryCatch #7 {SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException -> 0x025a, blocks: (B:54:0x013a, B:56:0x013e, B:58:0x0148, B:73:0x01ae, B:79:0x01b9, B:81:0x01cb, B:83:0x01d5, B:89:0x022e, B:90:0x0232, B:98:0x0242, B:84:0x01fa, B:86:0x0204, B:88:0x021a, B:103:0x0250, B:104:0x0253), top: B:129:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhc.run():void");
    }
}
