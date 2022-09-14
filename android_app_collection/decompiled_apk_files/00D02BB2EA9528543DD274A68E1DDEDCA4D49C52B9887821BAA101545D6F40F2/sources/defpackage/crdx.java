package defpackage;

import android.os.Vibrator;
/* compiled from: PG */
/* renamed from: crdx  reason: default package */
/* loaded from: classes5.dex */
public final class crdx extends crbc {
    private final Vibrator a;
    private final long[] b;

    public crdx(Vibrator vibrator, long[] jArr) {
        this.a = vibrator;
        this.b = jArr;
    }

    @Override // defpackage.crbc
    public final boolean a() {
        return true;
    }

    @Override // defpackage.crbc
    public final void b(crbb crbbVar) {
        if (crbbVar != null) {
            crbbVar.a(this);
        }
        this.a.vibrate(this.b, -1);
        if (crbbVar != null) {
            crbbVar.b(this);
        }
    }

    @Override // defpackage.crbc
    public final void c() {
    }

    @Override // defpackage.crbc
    public final long d() {
        return -1L;
    }

    @Override // defpackage.crbc
    public final void e(cres cresVar) {
    }
}
