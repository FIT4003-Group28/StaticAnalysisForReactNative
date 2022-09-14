package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: daig  reason: default package */
/* loaded from: classes5.dex */
public abstract class daig<StateT> {
    public final daii a;
    private final IntentFilter c;
    private final Context d;
    protected final Set<btbl> b = new HashSet();
    private daif e = null;
    private volatile boolean f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public daig(daii daiiVar, IntentFilter intentFilter, Context context) {
        this.a = daiiVar;
        this.c = intentFilter;
        this.d = dank.a(context);
    }

    private final void e() {
        daif daifVar;
        if ((this.f || !this.b.isEmpty()) && this.e == null) {
            daif daifVar2 = new daif(this);
            this.e = daifVar2;
            this.d.registerReceiver(daifVar2, this.c);
        }
        if (this.f || !this.b.isEmpty() || (daifVar = this.e) == null) {
            return;
        }
        this.d.unregisterReceiver(daifVar);
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(StateT statet) {
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            ((btbl) it.next()).a(statet);
        }
    }

    public final synchronized void c(btbl btblVar) {
        this.a.c("registerListener", new Object[0]);
        this.b.add(btblVar);
        e();
    }

    public final synchronized void d() {
        this.f = true;
        e();
    }
}
