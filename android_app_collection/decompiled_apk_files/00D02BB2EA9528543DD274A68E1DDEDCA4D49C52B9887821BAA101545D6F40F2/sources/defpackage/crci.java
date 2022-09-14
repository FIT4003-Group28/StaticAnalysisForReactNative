package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: crci  reason: default package */
/* loaded from: classes5.dex */
final class crci extends crbc {
    private final long a;

    public crci(long j) {
        this.a = j;
    }

    @Override // defpackage.crbc
    public final boolean a() {
        return true;
    }

    @Override // defpackage.crbc
    public final void b(final crbb crbbVar) {
        if (crbbVar != null) {
            crbbVar.a(this);
            new Handler().postDelayed(new Runnable(this, crbbVar) { // from class: crch
                private final crci a;
                private final crbb b;

                {
                    this.a = this;
                    this.b = crbbVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.b.b(this.a);
                }
            }, this.a);
        }
    }

    @Override // defpackage.crbc
    public final void c() {
    }

    @Override // defpackage.crbc
    public final long d() {
        return this.a;
    }

    @Override // defpackage.crbc
    public final void e(cres cresVar) {
    }
}
