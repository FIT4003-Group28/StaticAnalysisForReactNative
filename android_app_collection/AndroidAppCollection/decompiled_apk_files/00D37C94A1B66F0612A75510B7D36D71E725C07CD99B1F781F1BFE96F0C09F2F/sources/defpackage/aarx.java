package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aarx  reason: default package */
/* loaded from: classes.dex */
public final class aarx {
    public final Intent a;
    public final Throwable b;

    public aarx(Intent intent, Throwable th) {
        this.a = intent;
        this.b = th;
    }

    public static aarx a(Throwable th) {
        return new aarx(null, th);
    }

    public final boolean b() {
        return this.a != null;
    }
}
