package defpackage;

import java.util.List;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: azpp  reason: default package */
/* loaded from: classes.dex */
public final class azpp {
    public volatile boolean a = false;
    private final bvjj b;
    private final dxio<akfa> c;

    public azpp(bvjj bvjjVar, dxio<akfa> dxioVar) {
        this.b = bvjjVar;
        this.c = dxioVar;
    }

    @dzsi
    private final btlu d() {
        return this.c.a().j();
    }

    public final void a(List<azyh> list) {
        synchronized (this) {
            TreeSet<azpo> treeSet = new TreeSet();
            for (azyh azyhVar : list) {
                treeSet.add(new azpo(azyhVar, dspd.x(azxm.f.f(azyhVar))));
            }
            for (dspd dspdVar : b().b) {
                treeSet.add(new azpo(((azyc) azxm.f).c(dspdVar.G()).b(), dspdVar));
            }
            bzok b = b();
            dsqp dsqpVar = (dsqp) b.cu(5);
            dsqpVar.bC(b);
            bzoh bzohVar = (bzoh) dsqpVar;
            if (bzohVar.c) {
                bzohVar.bF();
                bzohVar.c = false;
            }
            ((bzok) bzohVar.b).b = bzok.ck();
            for (azpo azpoVar : treeSet) {
                dspd dspdVar2 = azpoVar.a;
                if (bzohVar.c) {
                    bzohVar.bF();
                    bzohVar.c = false;
                }
                bzok bzokVar = (bzok) bzohVar.b;
                dspdVar2.getClass();
                bzokVar.b();
                bzokVar.b.add(dspdVar2);
            }
            c(bzohVar.bK());
        }
    }

    public final bzok b() {
        return (bzok) this.b.N(bvjk.dD, d(), (dssr) bzok.e.cu(7), bzok.e);
    }

    public final void c(bzok bzokVar) {
        this.b.am(bvjk.dD, d(), bzokVar);
    }
}
