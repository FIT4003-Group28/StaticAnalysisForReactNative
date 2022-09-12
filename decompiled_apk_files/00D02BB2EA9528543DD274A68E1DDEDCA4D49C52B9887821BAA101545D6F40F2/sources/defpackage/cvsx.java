package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cvsx  reason: default package */
/* loaded from: classes5.dex */
public final class cvsx {
    private final cvnp a;

    public cvsx(cvnp cvnpVar) {
        this.a = cvnpVar;
    }

    public static Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putLong("EVALUATION_INTERVAL_MS", dxxq.c());
        return bundle;
    }

    public final synchronized boolean a() {
        if (this.a.d(8)) {
            return false;
        }
        c();
        return true;
    }

    public final void b() {
        this.a.c(null, 8);
    }

    public final void c() {
        this.a.e(8, "ON_QUALITY_EVALUATION", d(), dxxq.c());
    }
}
