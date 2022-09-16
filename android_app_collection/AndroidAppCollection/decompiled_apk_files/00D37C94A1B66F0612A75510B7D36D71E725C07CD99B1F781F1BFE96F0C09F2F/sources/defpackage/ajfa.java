package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: ajfa  reason: default package */
/* loaded from: classes.dex */
public final class ajfa {
    public final ajet a;
    public final Executor b;
    public final snc c;
    public volatile ajey e;
    public volatile ajep f;
    public boolean g;
    public final LinkedBlockingQueue h = new LinkedBlockingQueue();
    private final Runnable i = new Runnable() { // from class: ajer
        @Override // java.lang.Runnable
        public final void run() {
            ajfa ajfaVar = ajfa.this;
            ylr.c();
            if (ajfaVar.e != null || !ajfaVar.d) {
                return;
            }
            ajfaVar.f = (ajep) ajfaVar.h.poll();
            ajep ajepVar = ajfaVar.f;
            if (ajepVar == null) {
                if (!ajfaVar.g) {
                    return;
                }
                ajfaVar.g = false;
                ajfaVar.a.a();
                return;
            }
            ajey ajeyVar = new ajey(ajfaVar);
            ajfaVar.e = ajeyVar;
            if (!ajfaVar.g) {
                ajfaVar.g = true;
                ajfaVar.a.d();
            }
            ajepVar.b(ajeyVar);
        }
    };
    public volatile boolean d = false;

    public ajfa(Executor executor, ajet ajetVar, snc sncVar) {
        this.a = new ajex(this, ajetVar);
        this.b = executor;
        this.c = sncVar;
    }

    public final void a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void b() {
        a(this.i);
    }

    public final void c(ajep ajepVar) {
        this.h.add(ajepVar);
        b();
    }

    public final void d() {
        ylr.c();
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
        this.e = null;
        this.g = false;
        this.h.clear();
    }

    public final void e(boolean z) {
        this.d = z;
        b();
    }
}
