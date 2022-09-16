package defpackage;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dylg  reason: default package */
/* loaded from: classes6.dex */
public final class dylg {
    static final Logger a = Logger.getLogger(dyev.class.getName());
    public final Object b = new Object();
    public final dygo c;
    @dzsi
    public final Collection<dygh> d;

    public dylg(dygo dygoVar, long j, String str) {
        dbsk.t(str, "description");
        dbsk.t(dygoVar, "logId");
        this.c = dygoVar;
        this.d = null;
        dygf dygfVar = new dygf();
        dygfVar.a = String.valueOf(str).concat(" created");
        dygfVar.b = dygg.CT_INFO;
        dygfVar.b(j);
        a(dygfVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(dygo dygoVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            String valueOf = String.valueOf(dygoVar);
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
    public final void a(dygh dyghVar) {
        Level level;
        dygg dyggVar = dygg.CT_UNKNOWN;
        int ordinal = dyghVar.b.ordinal();
        if (ordinal != 2) {
            level = ordinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        b(dyghVar);
        c(this.c, level, dyghVar.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(dygh dyghVar) {
        synchronized (this.b) {
        }
    }
}
