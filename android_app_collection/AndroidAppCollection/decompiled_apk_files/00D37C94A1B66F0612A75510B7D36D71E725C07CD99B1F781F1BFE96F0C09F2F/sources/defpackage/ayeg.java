package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ayeg  reason: default package */
/* loaded from: classes2.dex */
public final class ayeg {
    static final Logger a = Logger.getLogger(axyf.class.getName());
    public final Object b = new Object();
    public final axzs c;

    public ayeg(axzs axzsVar, long j, String str) {
        str.getClass();
        axzsVar.getClass();
        this.c = axzsVar;
        axzj axzjVar = new axzj();
        axzjVar.a = str.concat(" created");
        axzjVar.b = axzk.CT_INFO;
        axzjVar.b(j);
        b(axzjVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(axzs axzsVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            String valueOf = String.valueOf(axzsVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(str).length());
            sb.append("[");
            sb.append(valueOf);
            sb.append("] ");
            sb.append(str);
            LogRecord logRecord = new LogRecord(level, sb.toString());
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(axzm axzmVar) {
        Level level;
        axzk axzkVar = axzk.CT_UNKNOWN;
        int ordinal = axzmVar.b.ordinal();
        if (ordinal != 2) {
            level = ordinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.b) {
        }
        a(this.c, level, axzmVar.a);
    }
}
