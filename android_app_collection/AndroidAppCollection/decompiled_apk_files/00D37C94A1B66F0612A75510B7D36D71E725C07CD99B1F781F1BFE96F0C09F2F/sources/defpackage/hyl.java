package defpackage;

import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: hyl  reason: default package */
/* loaded from: classes3.dex */
public final class hyl implements hyu, ecy {
    public final Set a = new HashSet();
    public final Map b = new HashMap();

    @Override // defpackage.ecy
    public final void a(ecx ecxVar) {
        this.a.add(ecxVar);
    }

    @Override // defpackage.hyu
    public final void b() {
        this.b.clear();
        for (ecx ecxVar : this.a) {
            ecxVar.b();
        }
    }

    @Override // defpackage.hyu
    public final void c(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, ViewGroup viewGroup) {
        xdo xdoVar = (xdo) this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        if (xdoVar == null) {
            return;
        }
        ViewGroup viewGroup2 = xdoVar.d;
        if (viewGroup2 != null) {
            if (akzj.f(viewGroup, viewGroup2)) {
                return;
            }
            e(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        }
        xdoVar.d = viewGroup;
        for (ecx ecxVar : this.a) {
            ecxVar.v(xdoVar);
        }
    }

    @Override // defpackage.hyu
    public final void d(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, asaj asajVar) {
        if (this.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            ((xdo) this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint)).c.a.c(asajVar);
        }
    }

    @Override // defpackage.hyu
    public final void e(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        xdo xdoVar = (xdo) this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        if (xdoVar == null || xdoVar.d == null) {
            return;
        }
        if (xdoVar.e) {
            wwf.a(null, "Trying to detach view for reel page before it is exited");
        }
        for (ecx ecxVar : this.a) {
            ecxVar.h(xdoVar);
        }
        xdoVar.d = null;
    }

    @Override // defpackage.hyu
    public final void f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) it.next();
            auku aukuVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.q;
            if (aukuVar == null) {
                aukuVar = auku.a;
            }
            if (aukuVar.b && !this.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                xdo xdoVar = new xdo(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                arrayList.add(xdoVar);
                this.b.put(reelWatchEndpointOuterClass$ReelWatchEndpoint, xdoVar);
            }
        }
        if (!arrayList.isEmpty()) {
            for (ecx ecxVar : this.a) {
                ecxVar.j(arrayList);
            }
        }
    }

    @Override // defpackage.hyu
    public final void g(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        if (this.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            xdo xdoVar = (xdo) this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
            if (xdoVar.d == null) {
                wwf.a(null, "Reel page was entered with no attached view");
            }
            xdoVar.e = true;
            for (ecx ecxVar : this.a) {
                ecxVar.l(xdoVar);
            }
        }
    }

    @Override // defpackage.hyu
    public final void h(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint, int i) {
        if (this.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            xdo xdoVar = (xdo) this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
            xdoVar.e = false;
            for (ecx ecxVar : this.a) {
                ecxVar.m(i, xdoVar);
            }
        }
    }
}
