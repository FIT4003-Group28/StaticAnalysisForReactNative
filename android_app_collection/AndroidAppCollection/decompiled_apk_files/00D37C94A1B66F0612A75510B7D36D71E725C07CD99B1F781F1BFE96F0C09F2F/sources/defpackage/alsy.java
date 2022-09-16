package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: alsy  reason: default package */
/* loaded from: classes.dex */
public final class alsy {
    private static final Map m = new HashMap();
    public final Context a;
    public final alrz b;
    public boolean f;
    public final Intent g;
    public final alsu h;
    public ServiceConnection k;
    public IInterface l;
    private final String n;
    public final List c = new ArrayList();
    public final Set d = new HashSet();
    public final Object e = new Object();
    public final IBinder.DeathRecipient j = new IBinder.DeathRecipient() { // from class: alsp
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            alsy alsyVar = alsy.this;
            alst alstVar = (alst) alsyVar.i.get();
            if (alstVar == null) {
                for (also alsoVar : alsyVar.c) {
                    alsoVar.b(alsyVar.a());
                }
                alsyVar.c.clear();
            } else {
                alstVar.a();
            }
            alsyVar.c();
        }
    };
    public final WeakReference i = new WeakReference(null);

    public alsy(Context context, alrz alrzVar, String str, Intent intent, alsu alsuVar) {
        this.a = context;
        this.b = alrzVar;
        this.n = str;
        this.g = intent;
        this.h = alsuVar;
    }

    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.n).concat(" : Binder has died."));
    }

    public final void b(also alsoVar, alvg alvgVar) {
        synchronized (this.e) {
            this.d.add(alvgVar);
            alvd alvdVar = alvgVar.a;
            alsq alsqVar = new alsq(this, alvgVar);
            alvdVar.b.a(new aluu(alvi.a, alsqVar));
            alvdVar.b();
        }
        d(new alsr(this, alsoVar.d, alsoVar));
    }

    public final void c() {
        synchronized (this.e) {
            for (alvg alvgVar : this.d) {
                alvgVar.a(a());
            }
            this.d.clear();
        }
    }

    public final void d(also alsoVar) {
        Handler handler;
        Map map = m;
        synchronized (map) {
            if (!map.containsKey(this.n)) {
                HandlerThread handlerThread = new HandlerThread(this.n, 10);
                handlerThread.start();
                map.put(this.n, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.n);
        }
        handler.post(alsoVar);
    }

    public final void e() {
        d(new alss(this));
    }
}
