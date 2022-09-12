package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cwml  reason: default package */
/* loaded from: classes5.dex */
public final class cwml implements cwlw {
    public final dbty<cwlw> a;
    public final AtomicReference<cwlw> b = new AtomicReference<>();
    private final dehp c;

    public cwml(ExecutorService executorService, dbty<cwlw> dbtyVar) {
        this.c = dehx.c(executorService);
        this.a = dbud.a(dbtyVar);
    }

    private final <T> dehn<T> g(final dbrn<cwlw, dehn<T>> dbrnVar) {
        if (this.b.get() != null) {
            return dbrnVar.a(this.b.get());
        }
        final dbty<cwlw> dbtyVar = this.a;
        dbtyVar.getClass();
        return dbac.b(dbae.e(new Callable(dbtyVar) { // from class: cwmg
            private final dbty a;

            {
                this.a = dbtyVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        }, this.c)).e(new defg(this, dbrnVar) { // from class: cwmh
            private final cwml a;
            private final dbrn b;

            {
                this.a = this;
                this.b = dbrnVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cwml cwmlVar = this.a;
                dbrn dbrnVar2 = this.b;
                cwlw cwlwVar = (cwlw) obj;
                cwmlVar.b.set(cwlwVar);
                return (dehn) dbrnVar2.a(cwlwVar);
            }
        }, dege.a);
    }

    private final void h(final Runnable runnable) {
        if (this.b.get() != null) {
            runnable.run();
        } else {
            this.c.execute(dazv.b(new Runnable(this, runnable) { // from class: cwmk
                private final cwml a;
                private final Runnable b;

                {
                    this.a = this;
                    this.b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cwml cwmlVar = this.a;
                    Runnable runnable2 = this.b;
                    cwmlVar.b.set(cwmlVar.a.a());
                    runnable2.run();
                }
            }));
        }
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> a() {
        return g(cwmc.a);
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> b() {
        return g(cwmd.a);
    }

    @Override // defpackage.cwlw
    public final void c(final cwgc cwgcVar) {
        h(new Runnable(this, cwgcVar) { // from class: cwmi
            private final cwml a;
            private final cwgc b;

            {
                this.a = this;
                this.b = cwgcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwml cwmlVar = this.a;
                cwmlVar.b.get().c(this.b);
            }
        });
    }

    @Override // defpackage.cwlw
    public final void d(final cwgc cwgcVar) {
        h(new Runnable(this, cwgcVar) { // from class: cwmj
            private final cwml a;
            private final cwgc b;

            {
                this.a = this;
                this.b = cwgcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwml cwmlVar = this.a;
                cwmlVar.b.get().d(this.b);
            }
        });
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> e(final String str, final int i) {
        return g(new dbrn(str, i) { // from class: cwme
            private final String a;
            private final int b;

            {
                this.a = str;
                this.b = i;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return ((cwlw) obj).e(this.a, this.b);
            }
        });
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> f(final String str, final int i) {
        return g(new dbrn(str, i) { // from class: cwmf
            private final String a;
            private final int b;

            {
                this.a = str;
                this.b = i;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return ((cwlw) obj).f(this.a, this.b);
            }
        });
    }
}
