package defpackage;

import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dywu  reason: default package */
/* loaded from: classes6.dex */
public final class dywu {
    public final Logger a;
    public final Level b;

    public dywu(Level level, Class<?> cls) {
        Logger logger = Logger.getLogger(cls.getName());
        dbsk.t(level, "level");
        this.b = level;
        dbsk.t(logger, "logger");
        this.a = logger;
    }

    public final boolean a() {
        return this.a.isLoggable(this.b);
    }

    public final void b(int i, int i2, eaiz eaizVar, int i3, boolean z) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a = dyws.a(i);
            String h = h(eaizVar);
            StringBuilder sb = new StringBuilder(a.length() + 69 + String.valueOf(h).length());
            sb.append(a);
            sb.append(" DATA: streamId=");
            sb.append(i2);
            sb.append(" endStream=");
            sb.append(z);
            sb.append(" length=");
            sb.append(i3);
            sb.append(" bytes=");
            sb.append(h);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logData", sb.toString());
        }
    }

    public final void c(int i, int i2, dyxw dyxwVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a = dyws.a(i);
            String valueOf = String.valueOf(dyxwVar);
            StringBuilder sb = new StringBuilder(a.length() + 44 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(" RST_STREAM: streamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(valueOf);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", sb.toString());
        }
    }

    public final void d(int i, dyyl dyylVar) {
        dywt[] values;
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a = dyws.a(i);
            EnumMap enumMap = new EnumMap(dywt.class);
            for (dywt dywtVar : dywt.values()) {
                if (dyylVar.a(dywtVar.g)) {
                    enumMap.put((EnumMap) dywtVar, (dywt) Integer.valueOf(dyylVar.b(dywtVar.g)));
                }
            }
            String enumMap2 = enumMap.toString();
            StringBuilder sb = new StringBuilder(a.length() + 30 + String.valueOf(enumMap2).length());
            sb.append(a);
            sb.append(" SETTINGS: ack=false settings=");
            sb.append(enumMap2);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", sb.toString());
        }
    }

    public final void e(int i, long j) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a = dyws.a(i);
            StringBuilder sb = new StringBuilder(a.length() + 43);
            sb.append(a);
            sb.append(" PING: ack=false bytes=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", sb.toString());
        }
    }

    public final void f(int i, int i2, dyxw dyxwVar, eajc eajcVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a = dyws.a(i);
            String valueOf = String.valueOf(dyxwVar);
            int h = eajcVar.h();
            eaiz eaizVar = new eaiz();
            eaizVar.I(eajcVar);
            String h2 = h(eaizVar);
            int length = a.length();
            StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(valueOf).length() + String.valueOf(h2).length());
            sb.append(a);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(valueOf);
            sb.append(" length=");
            sb.append(h);
            sb.append(" bytes=");
            sb.append(h2);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", sb.toString());
        }
    }

    public final void g(int i, int i2, long j) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a = dyws.a(i);
            StringBuilder sb = new StringBuilder(a.length() + 77);
            sb.append(a);
            sb.append(" WINDOW_UPDATE: streamId=");
            sb.append(i2);
            sb.append(" windowSizeIncrement=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", sb.toString());
        }
    }

    private static String h(eaiz eaizVar) {
        long j = eaizVar.b;
        if (j > 64) {
            return String.valueOf(eaizVar.F((int) Math.min(j, 64L)).e()).concat("...");
        }
        return eaizVar.E().e();
    }
}
