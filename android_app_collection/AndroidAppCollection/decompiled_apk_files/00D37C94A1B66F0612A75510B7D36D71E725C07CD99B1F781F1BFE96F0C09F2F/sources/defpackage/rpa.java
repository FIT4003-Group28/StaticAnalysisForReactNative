package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: rpa  reason: default package */
/* loaded from: classes4.dex */
public final class rpa extends riw {
    public Handler b;
    protected final roz c;
    protected final roy d;
    protected final row e;

    public rpa(rlx rlxVar) {
        super(rlxVar);
        this.c = new roz(this);
        this.d = new roy(this);
        this.e = new row(this);
    }

    @Override // defpackage.riw
    protected final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(long j) {
        return this.d.a(j);
    }

    public final void f() {
        n();
        if (this.b == null) {
            this.b = new rfm(Looper.getMainLooper());
        }
    }

    public final boolean o(boolean z, boolean z2, long j) {
        return this.d.b(z, z2, j);
    }
}
