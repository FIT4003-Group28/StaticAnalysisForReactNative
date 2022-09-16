package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
/* compiled from: PG */
/* renamed from: adic  reason: default package */
/* loaded from: classes.dex */
public final class adic {
    public AppStatus a;
    public Uri b;
    public Uri c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public adit j;
    private String k;
    private String l;
    private Long m;
    private Integer n;

    public adic() {
    }

    public adic(adid adidVar) {
        this.b = adidVar.b;
        this.c = adidVar.c;
        this.k = adidVar.d;
        this.l = adidVar.e;
        this.d = adidVar.f;
        this.e = adidVar.g;
        this.f = adidVar.h;
        this.g = adidVar.i;
        this.h = adidVar.j;
        this.m = Long.valueOf(adidVar.k);
        this.n = Integer.valueOf(adidVar.l);
        this.i = adidVar.m;
    }

    public final void b(String str) {
        if (str != null) {
            this.k = str;
            return;
        }
        throw new NullPointerException("Null deviceName");
    }

    public final void c(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null networkId");
    }

    public final void d(long j) {
        this.m = Long.valueOf(j);
    }

    public final void e(int i) {
        this.n = Integer.valueOf(i);
    }

    public final adid a() {
        String str;
        Long l;
        String str2 = this.k;
        if (str2 == null || (str = this.l) == null || (l = this.m) == null || this.n == null || this.i == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.k == null) {
                sb.append(" deviceName");
            }
            if (this.l == null) {
                sb.append(" networkId");
            }
            if (this.m == null) {
                sb.append(" wakeOnLanTimeout");
            }
            if (this.n == null) {
                sb.append(" wakeOnLanStatusOnStarted");
            }
            if (this.i == 0) {
                sb.append(" cacheMethod");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        adid adidVar = new adid(this.b, this.c, str2, str, this.d, this.e, this.f, this.g, this.h, l.longValue(), this.n.intValue(), this.i);
        AppStatus appStatus = this.a;
        appStatus.getClass();
        adidVar.a = appStatus;
        adidVar.n = this.j;
        return adidVar;
    }
}
