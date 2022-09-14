package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crql  reason: default package */
/* loaded from: classes5.dex */
public class crql extends crpu {
    private static final long c = TimeUnit.SECONDS.toMillis(60);
    public final lnp a;
    private final long d = System.currentTimeMillis() + c;

    public crql(lnp lnpVar) {
        this.a = lnpVar;
    }

    @Override // defpackage.crqw
    public final crqv a() {
        return crqv.JRNY_PENDING;
    }

    @Override // defpackage.crqw
    public final boolean b() {
        return true;
    }

    @Override // defpackage.crqw
    public final boolean c() {
        return false;
    }

    @Override // defpackage.crpu, defpackage.crqw
    public final long f() {
        return this.d;
    }
}
