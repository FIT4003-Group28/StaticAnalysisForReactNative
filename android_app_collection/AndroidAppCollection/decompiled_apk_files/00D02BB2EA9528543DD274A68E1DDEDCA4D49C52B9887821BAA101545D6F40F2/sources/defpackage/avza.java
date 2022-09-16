package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: avza  reason: default package */
/* loaded from: classes.dex */
public class avza {
    public final Context a;
    private final dehq b;
    private final bvjj c;

    public avza(Application application, dehq dehqVar, bvjj bvjjVar) {
        this.a = application;
        this.b = dehqVar;
        this.c = bvjjVar;
    }

    public final dehn<Boolean> a() {
        return this.b.c(new Callable(this) { // from class: avyz
            private final avza a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return Boolean.valueOf(bvog.g(this.a.a));
                } catch (bvof unused) {
                    return false;
                }
            }
        });
    }

    public final boolean b(@dzsi btlu btluVar) {
        return !this.c.o(bvjk.ei, btluVar, true);
    }

    public final long c(boolean z) {
        long d;
        if (z) {
            d = bvog.l(this.a);
        } else {
            d = bvog.d(this.a);
        }
        return bvop.i(d);
    }
}
