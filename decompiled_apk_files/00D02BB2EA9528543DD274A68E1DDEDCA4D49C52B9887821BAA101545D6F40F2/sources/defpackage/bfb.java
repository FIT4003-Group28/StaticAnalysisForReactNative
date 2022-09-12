package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bfb  reason: default package */
/* loaded from: classes3.dex */
public abstract class bfb<T> {
    protected final Context a;
    public final Object b = new Object();
    public final Set<bej<T>> c = new LinkedHashSet();
    public T d;
    protected final bif e;

    static {
        bbz.f("ConstraintTracker");
    }

    public bfb(Context context, bif bifVar) {
        this.a = context.getApplicationContext();
        this.e = bifVar;
    }

    public abstract T b();

    public abstract void d();

    public abstract void e();

    public final void f(bej<T> bejVar) {
        synchronized (this.b) {
            if (this.c.remove(bejVar) && this.c.isEmpty()) {
                e();
            }
        }
    }

    public final void g(T t) {
        synchronized (this.b) {
            T t2 = this.d;
            if (t2 == t || (t2 != null && t2.equals(t))) {
                return;
            }
            this.d = t;
            this.e.c.execute(new bfa(this, new ArrayList(this.c)));
        }
    }
}
