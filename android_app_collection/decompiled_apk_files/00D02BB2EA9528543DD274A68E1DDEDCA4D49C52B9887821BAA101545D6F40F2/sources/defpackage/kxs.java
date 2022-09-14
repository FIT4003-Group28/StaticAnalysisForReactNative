package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
/* compiled from: PG */
/* renamed from: kxs  reason: default package */
/* loaded from: classes7.dex */
public final class kxs {
    public final Handler a;
    public final kxn b;
    public boolean c;
    public boolean d;
    private final dcdc<kya> e;
    private final Runnable f;
    private final Runnable g;

    public kxs(View view, final kxn kxnVar, final kxu kxuVar) {
        this(view, kxnVar, new Runnable(kxuVar, kxnVar) { // from class: kxq
            private final kxu a;
            private final kxn b;

            {
                this.a = kxuVar;
                this.b = kxnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(this.b.j());
            }
        });
    }

    public final void a() {
        this.c = false;
        this.d = true;
        dcdc<kya> dcdcVar = this.e;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).a();
        }
        this.d = false;
        if (this.c) {
            c();
        }
    }

    public final void b() {
        dcdc<kya> dcdcVar = this.e;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).b();
        }
        this.a.removeCallbacksAndMessages(null);
    }

    public final void c() {
        this.d = false;
        this.b.c.clear();
        dcdc<kya> dcdcVar = this.e;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            kya kyaVar = dcdcVar.get(i);
            kxn kxnVar = this.b;
            Rect rect = new Rect(kyaVar.a, kyaVar.b, kyaVar.c, kyaVar.d);
            if (!rect.isEmpty()) {
                kxnVar.c.add(rect);
            }
        }
        this.f.run();
    }

    public kxs(View view, kxn kxnVar, Runnable runnable) {
        this.a = new Handler(Looper.getMainLooper());
        Runnable runnable2 = new Runnable(this) { // from class: kxp
            private final kxs a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final kxs kxsVar = this.a;
                kxsVar.c = true;
                if (kxsVar.d) {
                    return;
                }
                kxsVar.d = true;
                kxsVar.a.post(new Runnable(kxsVar) { // from class: kxr
                    private final kxs a;

                    {
                        this.a = kxsVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                });
            }
        };
        this.g = runnable2;
        this.b = kxnVar;
        dbsk.s(runnable);
        this.f = runnable;
        this.e = dcdc.f(new kya(view, runnable2));
    }
}
