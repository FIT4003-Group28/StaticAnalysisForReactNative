package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: pws  reason: default package */
/* loaded from: classes4.dex */
public final class pws {
    private static pws c;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Object d = new Object();
    private int e = 0;

    private pws(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new pwq(this), intentFilter);
    }

    public static synchronized pws b(Context context) {
        pws pwsVar;
        synchronized (pws.class) {
            if (c == null) {
                c = new pws(context);
            }
            pwsVar = c;
        }
        return pwsVar;
    }

    public final int a() {
        int i;
        synchronized (this.d) {
            i = this.e;
        }
        return i;
    }

    public final void c(int i) {
        synchronized (this.d) {
            if (this.e == i) {
                return;
            }
            this.e = i;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                axg axgVar = (axg) weakReference.get();
                if (axgVar != null) {
                    axgVar.a(i);
                } else {
                    this.b.remove(weakReference);
                }
            }
        }
    }
}
