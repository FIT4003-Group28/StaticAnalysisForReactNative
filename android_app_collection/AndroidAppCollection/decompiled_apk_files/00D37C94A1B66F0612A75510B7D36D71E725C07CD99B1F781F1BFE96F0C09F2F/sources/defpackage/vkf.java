package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vkf  reason: default package */
/* loaded from: classes4.dex */
public final class vkf implements vkp {
    public final vke a;
    private final snc b;
    private final long c;
    private long d;

    public vkf(vke vkeVar, snc sncVar, long j, TimeUnit timeUnit) {
        this.a = vkeVar;
        this.b = sncVar;
        this.c = timeUnit.toMillis(j);
        this.d = sncVar.c();
    }

    @Override // defpackage.vkp
    public final void a(int i) {
        this.a.a(i);
        if (this.b.c() - this.d >= this.c) {
            this.a.b();
            this.d = this.b.c();
        }
    }

    @Override // defpackage.vkp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }
}
