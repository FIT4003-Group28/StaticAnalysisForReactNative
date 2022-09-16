package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ron  reason: default package */
/* loaded from: classes4.dex */
public final class ron extends rpf {
    public final rlc a;
    public final rlc b;
    public final rlc c;
    public final rlc d;
    public final rlc e;
    private String f;
    private boolean g;
    private long h;

    public ron(rpn rpnVar) {
        super(rpnVar);
        rlf M = M();
        M.getClass();
        this.a = new rlc(M, "last_delete_stale", 0L);
        rlf M2 = M();
        M2.getClass();
        this.b = new rlc(M2, "backoff", 0L);
        rlf M3 = M();
        M3.getClass();
        this.c = new rlc(M3, "last_upload", 0L);
        rlf M4 = M();
        M4.getClass();
        this.d = new rlc(M4, "last_upload_attempt", 0L);
        rlf M5 = M();
        M5.getClass();
        this.e = new rlc(M5, "midnight_offset", 0L);
    }

    @Deprecated
    final Pair a(String str) {
        n();
        Q();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = this.f;
        if (str2 == null || elapsedRealtime >= this.h) {
            this.h = elapsedRealtime + J().g(str);
            try {
                qaa a = qab.a(I());
                this.f = "";
                String str3 = a.a;
                if (str3 != null) {
                    this.f = str3;
                }
                this.g = a.b;
            } catch (Exception e) {
                aG().j.b("Unable to get advertising id", e);
                this.f = "";
            }
            return new Pair(this.f, Boolean.valueOf(this.g));
        }
        return new Pair(str2, Boolean.valueOf(this.g));
    }

    @Override // defpackage.rpf
    protected final void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair c(String str, rjq rjqVar) {
        if (rjqVar.g()) {
            return a(str);
        }
        return new Pair("", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final String d(String str) {
        n();
        String str2 = (String) a(str).first;
        MessageDigest ax = rps.ax();
        if (ax == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, ax.digest(str2.getBytes())));
    }
}
