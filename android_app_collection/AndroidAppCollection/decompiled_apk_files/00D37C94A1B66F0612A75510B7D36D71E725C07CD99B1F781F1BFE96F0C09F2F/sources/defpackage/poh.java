package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: poh  reason: default package */
/* loaded from: classes4.dex */
public final class poh extends ass implements ati {
    private static final Pattern c = Pattern.compile("(^|&)rn=[0-9]+");
    private static final AtomicInteger d = new AtomicInteger();
    public int b;
    private final ati e;
    private final long f;
    private long g;
    private Uri h;
    private asy i;
    private Uri j;
    private long k;
    private boolean l;

    public poh(ati atiVar, int i, long j) {
        super(true);
        ptx.a(atiVar);
        this.e = atiVar;
        this.b = i;
        this.f = j;
    }

    private final void n() {
        this.j = null;
        this.k = 0L;
    }

    private final void o() {
        this.j = null;
        this.k = 0L;
    }

    @Override // defpackage.ass, defpackage.asv
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        try {
            if (this.b > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
                if (elapsedRealtime > this.b) {
                    asy asyVar = this.i;
                    ptx.a(asyVar);
                    throw new pog(asyVar, elapsedRealtime);
                }
            }
            int g = this.e.g(bArr, i, i2);
            if (g != -1) {
                c(g);
            }
            return g;
        } catch (ate e) {
            o();
            throw e;
        }
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.g = elapsedRealtime;
        if (this.j != null && elapsedRealtime - this.k > this.f) {
            n();
        }
        if (!asyVar.a.equals(this.h)) {
            n();
            this.h = asyVar.a;
        }
        Uri uri = asyVar.a;
        Uri uri2 = this.j;
        if (uri2 != null) {
            uri = uri2;
        }
        String encodedQuery = uri.getEncodedQuery();
        int incrementAndGet = d.incrementAndGet();
        StringBuilder sb = new StringBuilder(14);
        sb.append("rn=");
        sb.append(incrementAndGet);
        String sb2 = sb.toString();
        if (encodedQuery != null) {
            Matcher matcher = c.matcher(encodedQuery);
            if (matcher.find()) {
                String valueOf = String.valueOf(sb2);
                sb2 = matcher.replaceFirst(valueOf.length() != 0 ? "$1".concat(valueOf) : new String("$1"));
            } else if (!encodedQuery.isEmpty()) {
                StringBuilder sb3 = new StringBuilder(encodedQuery.length() + 1 + String.valueOf(sb2).length());
                sb3.append(encodedQuery);
                sb3.append("&");
                sb3.append(sb2);
                sb2 = sb3.toString();
            }
        }
        asy d2 = asyVar.d(uri.buildUpon().encodedQuery(sb2).build());
        e(d2);
        this.i = d2;
        try {
            long h = this.e.h(d2);
            if (this.j == null) {
                this.j = this.e.i();
                this.k = SystemClock.elapsedRealtime();
            }
            f(d2);
            this.l = true;
            return h;
        } catch (ate e) {
            o();
            throw e;
        }
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.e.i();
    }

    @Override // defpackage.asv
    public final void j() {
        try {
            try {
                this.e.j();
                if (!this.l) {
                    return;
                }
                d();
                this.l = false;
            } catch (ate e) {
                o();
                throw e;
            }
        } catch (Throwable th) {
            if (this.l) {
                d();
                this.l = false;
            }
            throw th;
        }
    }

    @Override // defpackage.ati
    public final int k() {
        return this.e.k();
    }

    @Override // defpackage.ati
    public final void l() {
        this.e.l();
    }

    @Override // defpackage.ati
    public final void m(String str, String str2) {
        this.e.m(str, str2);
    }
}
