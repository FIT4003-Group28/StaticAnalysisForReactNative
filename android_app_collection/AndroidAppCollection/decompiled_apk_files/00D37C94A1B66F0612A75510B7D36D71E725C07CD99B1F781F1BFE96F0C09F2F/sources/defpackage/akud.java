package defpackage;

import android.database.sqlite.SQLiteDiskIOException;
import android.os.Environment;
import android.os.StatFs;
import java.lang.Thread;
/* compiled from: PG */
/* renamed from: akud  reason: default package */
/* loaded from: classes.dex */
public final class akud implements Thread.UncaughtExceptionHandler {
    static final String a = zep.a("LowStorage");
    Thread.UncaughtExceptionHandler b;
    private final aacz c;

    public akud(aacz aaczVar) {
        this.c = aaczVar;
    }

    public final void a() {
        this.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        aveq aveqVar = this.c.b().u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        if (aveqVar.i) {
            try {
                if ((th instanceof SQLiteDiskIOException) && th.getMessage() != null && th.getMessage().contains("code 4874")) {
                    String str = a;
                    StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
                    StringBuilder sb = new StringBuilder(81);
                    sb.append("Caught exception for low storage space with bytes available: ");
                    sb.append(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                    zep.m(str, sb.toString());
                }
            } catch (RuntimeException e) {
                String str2 = a;
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb2.append("Could not get available bytes: ");
                sb2.append(valueOf);
                zep.m(str2, sb2.toString());
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
