package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: aeph  reason: default package */
/* loaded from: classes.dex */
final class aeph implements aww {
    public final awv a = new awv();
    private Handler b;
    private awx c;

    public final void a(awx awxVar) {
        awx awxVar2 = this.c;
        if (awxVar != awxVar2) {
            if (awxVar2 != null) {
                awxVar2.g(this);
            }
            if (awxVar != null) {
                if (this.b == null) {
                    this.b = pxi.u();
                }
                awxVar.f(this.b, this);
            }
            this.c = awxVar;
        }
    }

    @Override // defpackage.aww
    public final void l(int i, long j, long j2) {
        this.a.b(i, j, j2);
    }
}
