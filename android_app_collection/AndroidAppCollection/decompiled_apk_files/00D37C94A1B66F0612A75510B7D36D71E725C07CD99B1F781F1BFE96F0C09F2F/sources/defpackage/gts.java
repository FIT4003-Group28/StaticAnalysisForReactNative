package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: gts  reason: default package */
/* loaded from: classes3.dex */
public final class gts {
    public ReelToReelList c;
    public final Map a = new HashMap();
    public final WeakHashMap b = new WeakHashMap();
    public amuk d = amuk.q();
    public final Set e = new HashSet();
    public final Set f = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r1 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.apzg a(defpackage.apzg r8) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gts.a(apzg):apzg");
    }

    public final void b(Object obj, Runnable runnable) {
        this.b.put(obj, runnable);
    }

    public final void c(int i, apzg apzgVar, boolean z) {
        apzgVar.getClass();
        if (!apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) == 0) {
            return;
        }
        synchronized (this.a) {
            gtr gtrVar = (gtr) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
            if (gtrVar == null) {
                gtrVar = new gtr();
                this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint.e, gtrVar);
            }
            int hashCode = reelWatchEndpointOuterClass$ReelWatchEndpoint.hashCode();
            int i2 = gtrVar.a.get(i);
            boolean z2 = false;
            if (i2 != 0 && i2 != hashCode) {
                z2 = true;
            }
            if (z2) {
                gtrVar.b = reelWatchEndpointOuterClass$ReelWatchEndpoint;
            }
            if (i2 == 0 || z2) {
                gtrVar.a.put(i, hashCode);
                gtrVar.c = z;
            }
        }
    }

    public final void d(Object obj) {
        this.b.remove(obj);
    }

    public final void e(apzg apzgVar) {
        apzgVar.getClass();
        if (!apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) == 0) {
            return;
        }
        synchronized (this.a) {
            gtr gtrVar = (gtr) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
            if (gtrVar == null) {
                gtrVar = new gtr();
                this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint.e, gtrVar);
            }
            gtrVar.b = reelWatchEndpointOuterClass$ReelWatchEndpoint;
        }
    }

    public final boolean f(apzg apzgVar) {
        apzgVar.getClass();
        boolean z = false;
        if (apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) != 0) {
                synchronized (this.a) {
                    gtr gtrVar = (gtr) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
                    if (gtrVar != null && gtrVar.c) {
                        z = true;
                    }
                }
                return z;
            }
        }
        return false;
    }

    public final void g(apzg apzgVar) {
        apzgVar.getClass();
        if (!apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) == 0) {
            return;
        }
        synchronized (this.a) {
            gtr gtrVar = (gtr) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
            if (gtrVar == null) {
                gtrVar = new gtr();
                this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint.e, gtrVar);
            }
            gtrVar.b = reelWatchEndpointOuterClass$ReelWatchEndpoint;
            gtrVar.c = true;
        }
        synchronized (this.f) {
            this.f.add(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
        }
    }
}
