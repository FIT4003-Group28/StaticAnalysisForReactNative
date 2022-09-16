package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bte  reason: default package */
/* loaded from: classes2.dex */
public abstract class bte {
    protected final Context a;
    public final Object b = new Object();
    public final Set c = new LinkedHashSet();
    public Object d;
    protected final bwn e;

    static {
        bqf.b("ConstraintTracker");
    }

    public bte(Context context, bwn bwnVar) {
        this.a = context.getApplicationContext();
        this.e = bwnVar;
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    public final void f(bsm bsmVar) {
        synchronized (this.b) {
            if (this.c.remove(bsmVar) && this.c.isEmpty()) {
                e();
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == obj || (obj2 != null && obj2.equals(obj))) {
                return;
            }
            this.d = obj;
            this.e.c.execute(new btd(this, new ArrayList(this.c)));
        }
    }
}
