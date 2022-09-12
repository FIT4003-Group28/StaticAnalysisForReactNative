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
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dair  reason: default package */
/* loaded from: classes5.dex */
public final class dair<T extends IInterface> {
    private static final Map<String, Handler> l = new HashMap();
    public final Context a;
    public final daii b;
    public boolean e;
    public final Intent f;
    public ServiceConnection i;
    public T j;
    public final dalu k;
    public final List<daij> d = new ArrayList();
    public final IBinder.DeathRecipient h = new IBinder.DeathRecipient(this) { // from class: daik
        private final dair a;

        {
            this.a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            dair dairVar = this.a;
            dairVar.b.c("reportBinderDeath", new Object[0]);
            dain dainVar = dairVar.g.get();
            if (dainVar == null) {
                dairVar.b.c("%s : Binder has died.", dairVar.c);
                for (daij daijVar : dairVar.d) {
                    dane<?> daneVar = daijVar.a;
                    if (daneVar != null) {
                        daneVar.a(new RemoteException(String.valueOf(dairVar.c).concat(" : Binder has died.")));
                    }
                }
                dairVar.d.clear();
                return;
            }
            dairVar.b.c("calling onBinderDied", new Object[0]);
            dainVar.a();
        }
    };
    public final String c = "SplitInstallService";
    public final WeakReference<dain> g = new WeakReference<>(null);

    public dair(Context context, daii daiiVar, Intent intent, dalu daluVar) {
        this.a = context;
        this.b = daiiVar;
        this.f = intent;
        this.k = daluVar;
    }

    public final void a(daij daijVar) {
        c(new dail(this, daijVar.a, daijVar));
    }

    public final void b() {
        c(new daim(this));
    }

    public final void c(daij daijVar) {
        Handler handler;
        Map<String, Handler> map = l;
        synchronized (map) {
            if (!map.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                map.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.c);
        }
        handler.post(daijVar);
    }
}
