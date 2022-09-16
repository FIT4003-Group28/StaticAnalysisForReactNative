package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aro  reason: default package */
/* loaded from: classes2.dex */
final class aro implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ IBinder b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ aru d;
    final /* synthetic */ arv e;

    public aro(aru aruVar, arv arvVar, String str, IBinder iBinder, Bundle bundle) {
        this.d = aruVar;
        this.e = arvVar;
        this.a = str;
        this.b = iBinder;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ara araVar = (ara) this.d.a.c.get(this.e.a());
        if (araVar == null) {
            Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.a);
            return;
        }
        arx arxVar = this.d.a;
        String str = this.a;
        IBinder iBinder = this.b;
        Bundle bundle = this.c;
        List<jj> list = (List) araVar.d.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (jj jjVar : list) {
            if (iBinder == jjVar.a) {
                Bundle bundle2 = (Bundle) jjVar.b;
                if (bundle == bundle2) {
                    return;
                }
                if (bundle == null) {
                    if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                        return;
                    }
                } else if (bundle2 == null) {
                    if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                        return;
                    }
                } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                    return;
                }
            }
        }
        list.add(new jj(iBinder, bundle));
        araVar.d.put(str, list);
        aqw aqwVar = new aqw(arxVar, str, araVar, str, bundle);
        if (bundle == null) {
            arxVar.b(aqwVar);
        } else {
            arxVar.d(aqwVar);
        }
        if (aqwVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + araVar.a + " id=" + str);
    }
}
