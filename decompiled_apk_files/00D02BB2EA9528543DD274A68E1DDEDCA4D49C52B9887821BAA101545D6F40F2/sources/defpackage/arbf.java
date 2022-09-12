package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: arbf  reason: default package */
/* loaded from: classes.dex */
public final class arbf {
    final /* synthetic */ arbi a;

    public arbf(arbi arbiVar) {
        this.a = arbiVar;
    }

    public final void a(amqo amqoVar) {
        boolean b;
        bvmn bvmnVar = bvmo.a;
        arbi arbiVar = this.a;
        GmmLocation a = amqoVar.a();
        if (a != null) {
            arbiVar.e.j(a, a.j);
        }
        GmmLocation a2 = amqoVar.a();
        arbi arbiVar2 = this.a;
        arbiVar2.n = a2 != null;
        if (a2 == null) {
            arbiVar2.y = null;
            arbiVar2.A();
            synchronized (this.a.o) {
                this.a.o.d();
            }
            return;
        }
        akox akoxVar = arbiVar2.h;
        if (akoxVar == null) {
            bvoo.h("mapContainer is null in onGmmLocationEvent().", new Object[0]);
            return;
        }
        arbiVar2.y = a2;
        akoxVar.ah();
        arbi arbiVar3 = this.a;
        if (!arbiVar3.b.l) {
            b = ahnb.b(arbiVar3.y.getTime(), this.a.c.b());
        } else {
            b = ahnb.a(arbiVar3.y, arbiVar3.c);
        }
        if (!b) {
            akox akoxVar2 = this.a.h;
            if (akoxVar2.v.compareAndSet(false, true)) {
                akoxVar2.t.j();
            }
        }
        synchronized (this.a) {
            arbi arbiVar4 = this.a;
            if (!arbiVar4.m) {
                arbiVar4.z();
            }
        }
        arbi arbiVar5 = this.a;
        boolean h = arbiVar5.p.h(arbiVar5.y);
        synchronized (this.a.o) {
            arbi arbiVar6 = this.a;
            GmmLocation gmmLocation = arbiVar6.y;
            long time = gmmLocation.c ? gmmLocation.getTime() : arbiVar6.c.b();
            arbi arbiVar7 = this.a;
            area areaVar = arbiVar7.o;
            areaVar.o = time;
            areaVar.p = arbiVar7.y.k;
        }
        if (!h) {
            return;
        }
        this.a.y();
    }
}
