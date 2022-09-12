package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cspu  reason: default package */
/* loaded from: classes5.dex */
public final class cspu extends cspw {
    private Integer a;
    private Long b;
    private TimeUnit c;

    @Override // defpackage.cspw
    public final void b() {
        this.a = 1;
    }

    @Override // defpackage.cspw
    public final void c() {
        this.b = 12L;
    }

    @Override // defpackage.cspw
    public final void d(TimeUnit timeUnit) {
        if (timeUnit != null) {
            this.c = timeUnit;
            return;
        }
        throw new NullPointerException("Null inMemoryCacheTtlUnit");
    }

    @Override // defpackage.cspw
    public final cspx a() {
        String str = this.a == null ? " inMemoryCacheMaxSize" : "";
        if (this.b == null) {
            str = str.concat(" inMemoryCacheTtl");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" inMemoryCacheTtlUnit");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cspv(this.a.intValue(), this.b.longValue(), this.c);
    }
}
