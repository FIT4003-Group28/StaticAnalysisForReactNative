package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: im  reason: default package */
/* loaded from: classes.dex */
public final class im implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map<ComponentName, il> d = new HashMap();
    private Set<String> e = new HashSet();

    public im(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(il ilVar) {
        if (ilVar.b) {
            this.b.unbindService(this);
            ilVar.b = false;
        }
        ilVar.e = null;
    }

    private final void b(il ilVar) {
        if (this.a.hasMessages(3, ilVar.a)) {
            return;
        }
        int i = ilVar.d + 1;
        ilVar.d = i;
        if (i > 6) {
            r0 = "Giving up on delivering " + ilVar.c.size() + " tasks to " + ilVar.a + " after " + ilVar.d + " retries";
            ilVar.c.clear();
            return;
        }
        this.a.sendMessageDelayed(this.a.obtainMessage(3, ilVar.a), (1 << (i - 1)) * 1000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r6.b != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(defpackage.il r6) {
        /*
            r5 = this;
            java.util.ArrayDeque<ij> r0 = r6.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8a
            boolean r0 = r6.b
            if (r0 == 0) goto Ld
            goto L45
        Ld:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r0.<init>(r1)
            android.content.ComponentName r1 = r6.a
            android.content.Intent r0 = r0.setComponent(r1)
            android.content.Context r1 = r5.b
            r2 = 33
            boolean r0 = r1.bindService(r0, r5, r2)
            r6.b = r0
            if (r0 == 0) goto L2a
            r0 = 0
            r6.d = r0
            goto L41
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to bind to listener "
            r0.append(r1)
            android.content.ComponentName r1 = r6.a
            r0.append(r1)
            r0.toString()
            android.content.Context r0 = r5.b
            r0.unbindService(r5)
        L41:
            boolean r0 = r6.b
            if (r0 == 0) goto L87
        L45:
            ht r0 = r6.e
            if (r0 == 0) goto L87
        L49:
            java.util.ArrayDeque<ij> r0 = r6.c
            java.lang.Object r0 = r0.peek()
            ij r0 = (defpackage.ij) r0
            if (r0 != 0) goto L54
            goto L7b
        L54:
            ht r1 = r6.e     // Catch: android.os.RemoteException -> L67 android.os.DeadObjectException -> L7a
            java.lang.String r2 = r0.a     // Catch: android.os.RemoteException -> L67 android.os.DeadObjectException -> L7a
            int r3 = r0.b     // Catch: android.os.RemoteException -> L67 android.os.DeadObjectException -> L7a
            java.lang.String r4 = r0.c     // Catch: android.os.RemoteException -> L67 android.os.DeadObjectException -> L7a
            android.app.Notification r0 = r0.d     // Catch: android.os.RemoteException -> L67 android.os.DeadObjectException -> L7a
            r1.a(r2, r3, r4, r0)     // Catch: android.os.RemoteException -> L67 android.os.DeadObjectException -> L7a
            java.util.ArrayDeque<ij> r0 = r6.c     // Catch: android.os.RemoteException -> L67 android.os.DeadObjectException -> L7a
            r0.remove()     // Catch: android.os.RemoteException -> L67 android.os.DeadObjectException -> L7a
            goto L49
        L67:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RemoteException communicating with "
            r0.append(r1)
            android.content.ComponentName r1 = r6.a
            r0.append(r1)
            r0.toString()
            goto L7b
        L7a:
        L7b:
            java.util.ArrayDeque<ij> r0 = r6.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L86
            r5.b(r6)
        L86:
            return
        L87:
            r5.b(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im.c(il):void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ht htVar;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    il ilVar = this.d.get((ComponentName) message.obj);
                    if (ilVar != null) {
                        a(ilVar);
                    }
                    return true;
                } else if (i != 3) {
                    return false;
                } else {
                    il ilVar2 = this.d.get((ComponentName) message.obj);
                    if (ilVar2 != null) {
                        c(ilVar2);
                    }
                    return true;
                }
            }
            ik ikVar = (ik) message.obj;
            ComponentName componentName = ikVar.a;
            IBinder iBinder = ikVar.b;
            il ilVar3 = this.d.get(componentName);
            if (ilVar3 != null) {
                if (iBinder == null) {
                    htVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof ht)) {
                        htVar = new ht(iBinder);
                    } else {
                        htVar = (ht) queryLocalInterface;
                    }
                }
                ilVar3.e = htVar;
                ilVar3.d = 0;
                c(ilVar3);
            }
            return true;
        }
        ij ijVar = (ij) message.obj;
        Set<String> g = in.g(this.b);
        if (!g.equals(this.e)) {
            this.e = g;
            List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (g.contains(resolveInfo.serviceInfo.packageName)) {
                    ComponentName componentName2 = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        String str = "Permission present on component " + componentName2 + ", not adding listener record.";
                    } else {
                        hashSet.add(componentName2);
                    }
                }
            }
            for (ComponentName componentName3 : hashSet) {
                if (!this.d.containsKey(componentName3)) {
                    this.d.put(componentName3, new il(componentName3));
                }
            }
            Iterator<Map.Entry<ComponentName, il>> it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, il> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    a(next.getValue());
                    it.remove();
                }
            }
        }
        for (il ilVar4 : this.d.values()) {
            ilVar4.c.add(ijVar);
            c(ilVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new ik(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
