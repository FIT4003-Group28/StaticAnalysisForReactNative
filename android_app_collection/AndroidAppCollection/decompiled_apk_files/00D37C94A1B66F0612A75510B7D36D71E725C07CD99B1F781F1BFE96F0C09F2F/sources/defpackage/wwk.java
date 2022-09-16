package defpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wwk  reason: default package */
/* loaded from: classes4.dex */
public final class wwk implements xio {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public final wwl b;

    public wwk(wwl wwlVar) {
        this.b = wwlVar;
    }

    public final amqo a() {
        return new wwj(this);
    }

    public final String b() {
        String d = this.b.d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 22);
        sb.append("sdkv=");
        sb.append(d);
        sb.append("&output=xml_vast2");
        return new StringBuilder(sb.toString()).toString();
    }

    @Override // defpackage.xio
    public final String c(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.xio
    public final String d() {
        return this.b.b();
    }

    @Override // defpackage.xio
    public final String e() {
        return this.b.c();
    }

    @Override // defpackage.xio
    public final Map f() {
        afw afwVar = new afw(1);
        afwVar.put(e(), d());
        return afwVar;
    }
}
