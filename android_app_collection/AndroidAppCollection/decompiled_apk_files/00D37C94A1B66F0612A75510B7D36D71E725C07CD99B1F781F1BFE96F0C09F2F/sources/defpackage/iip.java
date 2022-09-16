package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: iip  reason: default package */
/* loaded from: classes3.dex */
public final class iip {
    public Uri a;
    public String b;
    public Boolean c;
    public avbh d;
    public avbl e;
    public apos f;
    private Long g;
    private Long h;
    private Boolean i;
    private Boolean j;

    public iip() {
    }

    public iip(iiq iiqVar) {
        this.a = iiqVar.b;
        this.b = iiqVar.c;
        this.g = Long.valueOf(iiqVar.d);
        this.h = Long.valueOf(iiqVar.e);
        this.i = Boolean.valueOf(iiqVar.f);
        this.j = Boolean.valueOf(iiqVar.g);
        this.c = iiqVar.h;
        this.d = iiqVar.i;
        this.e = iiqVar.j;
        this.f = iiqVar.k;
    }

    public final void b(long j) {
        this.h = Long.valueOf(j);
    }

    public final void c(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public final void d(long j) {
        this.g = Long.valueOf(j);
    }

    public final void e(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public final iiq a() {
        String str;
        Long l;
        Long l2 = this.h;
        if (l2 == null) {
            throw new IllegalStateException("Property \"clientTimestamp\" has not been set");
        }
        if (l2.longValue() == 0) {
            b(System.currentTimeMillis());
        }
        Uri uri = this.a;
        if (uri == null || (str = this.b) == null || (l = this.g) == null || this.h == null || this.i == null || this.j == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" uri");
            }
            if (this.b == null) {
                sb.append(" channelId");
            }
            if (this.g == null) {
                sb.append(" serverTimestamp");
            }
            if (this.h == null) {
                sb.append(" clientTimestamp");
            }
            if (this.i == null) {
                sb.append(" subscriptionStateChanged");
            }
            if (this.j == null) {
                sb.append(" didRequireSignIn");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new iiq(uri, str, l.longValue(), this.h.longValue(), this.i.booleanValue(), this.j.booleanValue(), this.c, this.d, this.e, this.f);
    }
}
