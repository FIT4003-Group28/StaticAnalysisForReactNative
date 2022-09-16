package defpackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: ckvb  reason: default package */
/* loaded from: classes4.dex */
public final class ckvb {
    public final btrm a;
    public int e;
    private final dzsj<srv> g;
    public final Object b = new Object();
    public final ConcurrentMap<Object, ckux> c = new ConcurrentHashMap();
    public final Queue<ckva> d = new LinkedList();
    public final ckuz f = new ckuz(this);

    public ckvb(dzsj<srv> dzsjVar, btrm btrmVar) {
        dbsk.s(dzsjVar);
        this.g = dzsjVar;
        dbsk.s(btrmVar);
        this.a = btrmVar;
    }

    public static amvh b(akqq akqqVar) {
        amvg amvgVar = new amvg();
        amvgVar.d = akqqVar;
        return amvgVar.a();
    }

    public final void a() {
        ckva ckvaVar;
        synchronized (this.b) {
            if (this.d.isEmpty() || this.e >= 3) {
                ckvaVar = null;
            } else {
                ckvaVar = this.d.remove();
                int i = this.e;
                this.e = i + 1;
                if (i == 0) {
                    btrm btrmVar = this.a;
                    ckuz ckuzVar = this.f;
                    dceq a = dcet.a();
                    a.b(srf.class, new ckvc(srf.class, ckuzVar));
                    btrmVar.g(ckuzVar, a.a());
                }
            }
        }
        if (ckvaVar != null) {
            srv a2 = this.g.a();
            this.c.put(a2, ckvaVar.b);
            a2.j(ckvaVar.a, null);
        }
    }
}
