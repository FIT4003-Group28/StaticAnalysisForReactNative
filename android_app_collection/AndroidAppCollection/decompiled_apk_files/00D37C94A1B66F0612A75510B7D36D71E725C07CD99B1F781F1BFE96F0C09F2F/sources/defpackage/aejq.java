package defpackage;

import android.net.Uri;
import j$.time.Duration;
/* compiled from: PG */
/* renamed from: aejq  reason: default package */
/* loaded from: classes.dex */
public final class aejq extends aflh {
    private final aejv b;
    private final snc c;
    private final aepf d;
    private final afgz e;
    private aejp f;

    public aejq(ati atiVar, aejv aejvVar, snc sncVar, aepf aepfVar, afgz afgzVar) {
        super(atiVar);
        this.b = aejvVar;
        this.c = sncVar;
        this.d = aepfVar;
        this.e = afgzVar;
    }

    static void c(StringBuilder sb, int i, int i2) {
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt((i >> 6) & 63));
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt(i & 63));
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt((i2 >> 6) & 63));
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt(i2 & 63));
    }

    private final void d() {
        aejp aejpVar = this.f;
        this.f = null;
        if (aejpVar == null || aejpVar.a == -1) {
            return;
        }
        long d = this.c.d();
        long min = Math.min(4095L, (aejpVar.h - (aejpVar.g * 1024)) / 1024);
        long min2 = Math.min(4095L, d - aejpVar.f);
        if (min > 0) {
            c(aejpVar.c, (int) min2, (int) min);
        }
        aejpVar.j = d - aejpVar.b;
        this.b.a(aejpVar);
    }

    private final void e(ate ateVar) {
        aejp aejpVar = this.f;
        if (aejpVar == null || aejpVar.a == -1) {
            return;
        }
        aejpVar.l = this.e.b(ateVar).i();
        d();
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        try {
            long e = this.c.e();
            int g = super.g(bArr, i, i2);
            aejp aejpVar = this.f;
            if (aejpVar != null && aejpVar.a != -1) {
                long e2 = this.c.e();
                aejpVar.h += g;
                long min = Math.min(4095L, Duration.ofNanos(e2).minusMillis(aejpVar.f).toMillis());
                long min2 = Math.min(4095L, (aejpVar.h - (aejpVar.g * 1024)) / 1024);
                if (Duration.ofNanos(e2 - e).toMillis() > 0 && min2 > 0) {
                    c(aejpVar.c, (int) min, (int) min2);
                    aejpVar.g += min2;
                    aejpVar.f += min;
                }
            }
            return g;
        } catch (ate e3) {
            e(e3);
            throw e3;
        }
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.asv
    public final long h(asy asyVar) {
        String queryParameter;
        d();
        Uri uri = asyVar.a;
        int i = -1;
        if (uri != null && (queryParameter = uri.getQueryParameter("rn")) != null) {
            try {
                i = Integer.parseInt(queryParameter);
            } catch (NumberFormatException unused) {
            }
        }
        aejp aejpVar = new aejp(i, this.c.d());
        this.f = aejpVar;
        try {
            long h = super.h(asyVar);
            long d = this.c.d();
            aejpVar.f = d;
            aejpVar.k = d - aejpVar.b;
            aejpVar.i = this.d.j();
            Object obj = asyVar.k;
            if (true != (obj instanceof aejz)) {
                obj = null;
            }
            if (obj != null) {
                Long l = ((aejz) obj).b;
                Long l2 = ((aejz) obj).c;
                if (l != null && l2 != null) {
                    long j = asyVar.h;
                    if (j == -1) {
                        j = ((l2.longValue() / 8) * l.longValue()) / 1000;
                    }
                    aejpVar.e = j;
                    aejpVar.d = l.longValue();
                }
            }
            return h;
        } catch (ate e) {
            e(e);
            throw e;
        }
    }

    @Override // defpackage.aflh, defpackage.ati, defpackage.asv
    public final void j() {
        try {
            super.j();
            d();
            super.j();
        } catch (ate e) {
            e(e);
            throw e;
        }
    }
}
