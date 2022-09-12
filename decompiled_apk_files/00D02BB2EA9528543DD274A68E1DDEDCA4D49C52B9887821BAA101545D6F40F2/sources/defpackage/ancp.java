package defpackage;

import android.os.Handler;
import android.os.Looper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ancp  reason: default package */
/* loaded from: classes2.dex */
public final class ancp implements ancl {
    final /* synthetic */ ancv a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Runnable c = new Runnable(this) { // from class: anco
        private final ancp a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.b();
        }
    };
    private boolean d = false;
    private long e = 0;

    public ancp(ancv ancvVar) {
        this.a = ancvVar;
    }

    @Override // defpackage.ancl
    public final void a() {
        this.e = this.a.ap.g() + ancv.b;
        this.b.removeCallbacks(this.c);
        this.b.postAtTime(this.c, this.e);
        if (!this.d) {
            this.d = true;
            cqkx.p(this.a.g);
        }
    }

    @Override // defpackage.ancl
    public final void b() {
        this.b.removeCallbacks(this.c);
        if (this.d) {
            this.d = false;
            cqkx.p(this.a.g);
        }
    }

    @Override // defpackage.ancl
    public final boolean c() {
        return this.d;
    }
}
