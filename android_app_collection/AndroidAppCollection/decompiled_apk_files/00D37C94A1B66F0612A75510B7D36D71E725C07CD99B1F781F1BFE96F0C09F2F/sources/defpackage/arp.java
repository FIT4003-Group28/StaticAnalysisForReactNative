package defpackage;

import android.os.IBinder;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: arp  reason: default package */
/* loaded from: classes2.dex */
final class arp implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ IBinder b;
    final /* synthetic */ aru c;
    final /* synthetic */ arv d;

    public arp(aru aruVar, arv arvVar, String str, IBinder iBinder) {
        this.c = aruVar;
        this.d = arvVar;
        this.a = str;
        this.b = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ara araVar = (ara) this.c.a.c.get(this.d.a());
        if (araVar == null) {
            Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.a);
            return;
        }
        String str = this.a;
        IBinder iBinder = this.b;
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            if (araVar.d.remove(str) != null) {
            }
            z = false;
        } else {
            List list = (List) araVar.d.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((jj) it.next()).a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    araVar.d.remove(str);
                }
                z = z2;
            }
            z = false;
        }
        if (z) {
            return;
        }
        Log.w("MBServiceCompat", "removeSubscription called for " + this.a + " which is not subscribed");
    }
}
