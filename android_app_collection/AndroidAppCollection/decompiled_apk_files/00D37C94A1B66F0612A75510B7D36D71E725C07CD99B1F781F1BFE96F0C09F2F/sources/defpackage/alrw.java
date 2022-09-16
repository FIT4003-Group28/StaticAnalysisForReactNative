package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: alrw  reason: default package */
/* loaded from: classes.dex */
public abstract class alrw {
    private final IntentFilter b;
    private final Context c;
    protected final Set a = new HashSet();
    private alrv d = null;
    private volatile boolean e = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public alrw(IntentFilter intentFilter, Context context) {
        this.b = intentFilter;
        this.c = akpq.m(context);
    }

    private final void e() {
        alrv alrvVar;
        if (!this.a.isEmpty() && this.d == null) {
            alrv alrvVar2 = new alrv(this);
            this.d = alrvVar2;
            this.c.registerReceiver(alrvVar2, this.b);
        }
        if (!this.a.isEmpty() || (alrvVar = this.d) == null) {
            return;
        }
        this.c.unregisterReceiver(alrvVar);
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(alrx alrxVar) {
        this.a.add(alrxVar);
        e();
    }

    public final synchronized void c(alrx alrxVar) {
        this.a.remove(alrxVar);
        e();
    }

    public final synchronized void d(Object obj) {
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            ((alrx) it.next()).i(obj);
        }
    }
}
