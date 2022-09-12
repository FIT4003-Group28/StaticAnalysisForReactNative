package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anle  reason: default package */
/* loaded from: classes2.dex */
public final class anle {
    private static final eaow b = eaow.d(60);
    public boolean a = false;
    private final dxio<acwo> c;
    private final bvrb d;
    private final Executor e;

    public anle(dxio<acwo> dxioVar, bvrb bvrbVar, Executor executor) {
        this.c = dxioVar;
        this.d = bvrbVar;
        this.e = executor;
    }

    public final void a() {
        this.d.a(new Runnable(this) { // from class: anlc
            private final anle a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        }, bvrj.UI_THREAD, b.b);
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        if (!this.a) {
            deha.q(this.c.a().i(dvum.TIMELINE_AFTER_ONE_MINUTE_OR_CLOSE, null), bvqj.b(new bvqg(this) { // from class: anld
                private final anle a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.a = ((Boolean) obj).booleanValue();
                }
            }), this.e);
        }
    }
}
