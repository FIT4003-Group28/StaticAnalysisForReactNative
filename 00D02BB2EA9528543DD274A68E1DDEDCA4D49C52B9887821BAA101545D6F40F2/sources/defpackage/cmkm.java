package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cmkm  reason: default package */
/* loaded from: classes5.dex */
final class cmkm extends BroadcastReceiver {
    private static cmkm a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final ArrayList<WeakReference<cmkn>> c = new ArrayList<>();

    private cmkm() {
    }

    public static synchronized cmkm a(Context context) {
        cmkm cmkmVar;
        synchronized (cmkm.class) {
            if (a == null) {
                a = new cmkm();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(a, intentFilter);
            }
            cmkmVar = a;
        }
        return cmkmVar;
    }

    private final void c() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.c.get(size).get() == null) {
                    this.c.remove(size);
                }
            } else {
                return;
            }
        }
    }

    public final synchronized void b(final cmkn cmknVar) {
        c();
        this.c.add(new WeakReference<>(cmknVar));
        this.b.post(new Runnable(cmknVar) { // from class: cmkl
            private final cmkn a;

            {
                this.a = cmknVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        c();
        for (int i = 0; i < this.c.size(); i++) {
            cmkn cmknVar = this.c.get(i).get();
            if (cmknVar != null) {
                cmknVar.b();
            }
        }
    }
}
