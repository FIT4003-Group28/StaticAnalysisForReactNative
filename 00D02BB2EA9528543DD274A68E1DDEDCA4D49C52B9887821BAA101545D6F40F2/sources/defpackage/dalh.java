package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dalh  reason: default package */
/* loaded from: classes5.dex */
public final class dalh extends daig<dame> {
    private static dalh c;
    private final Handler d;
    private final dakr e;
    private final Set<btbl> f;

    public dalh(Context context, dakr dakrVar) {
        super(new daii("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.d = new Handler(Looper.getMainLooper());
        this.f = new LinkedHashSet();
        this.e = dakrVar;
    }

    public static synchronized dalh e(Context context) {
        dalh dalhVar;
        synchronized (dalh.class) {
            if (c == null) {
                c = new dalh(context, daky.a);
            }
            dalhVar = c;
        }
        return dalhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.daig
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        dame k = dame.k(bundleExtra);
        this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", k);
        daks a = this.e.a();
        dakn daknVar = (dakn) k;
        if (daknVar.b != 3 || a == null) {
            f(k);
        } else {
            a.a(daknVar.h, new dalf(this, k, intent, context));
        }
    }

    public final synchronized void f(dame dameVar) {
        Iterator it = new LinkedHashSet(this.f).iterator();
        while (it.hasNext()) {
            ((btbl) it.next()).a(dameVar);
        }
        super.b(dameVar);
    }

    public final void g(dame dameVar, int i, int i2) {
        this.d.post(new dalg(this, dameVar, i, i2));
    }
}
