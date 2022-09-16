package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: amzu  reason: default package */
/* loaded from: classes.dex */
public abstract class amzu {
    public final anbf a;

    /* JADX INFO: Access modifiers changed from: protected */
    public amzu(anbf anbfVar) {
        anha.c(anbfVar, "backend");
        this.a = anbfVar;
    }

    public static void i(String str, anbe anbeVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(anbeVar.e()))));
        sb.append(": logging error [");
        anah f = anbeVar.f();
        if (f != anah.a) {
            sb.append(f.b());
            sb.append('.');
            sb.append(f.d());
            sb.append(':');
            sb.append(f.a());
        }
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract anap a(Level level);

    public final anap b() {
        return a(Level.CONFIG);
    }

    public final anap c() {
        return a(Level.FINE);
    }

    public final anap d() {
        return a(Level.FINEST);
    }

    public final anap e() {
        return a(Level.INFO);
    }

    public final anap f() {
        return a(Level.SEVERE);
    }

    public final anap g() {
        return a(Level.WARNING);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String h() {
        return this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean j(Level level) {
        return this.a.d(level);
    }
}
