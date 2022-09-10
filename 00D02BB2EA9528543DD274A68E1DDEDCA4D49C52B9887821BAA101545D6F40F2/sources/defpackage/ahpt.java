package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Random;
/* compiled from: PG */
/* renamed from: ahpt  reason: default package */
/* loaded from: classes2.dex */
public final class ahpt {
    public final float a;
    public final Random b;
    private final float g;
    private final cqat h;
    @dzsi
    private amuh i;
    @dzsi
    private GmmCarProjectionStateEvent p;
    @dzsi
    private final ahok u;
    public final Deque<ahps> c = new ArrayDeque();
    private dqvj j = dqvj.WALK;
    private dqvj k = dqvj.WALK;
    public Boolean d = Boolean.FALSE;
    private Boolean l = Boolean.FALSE;
    public boolean e = false;
    private boolean m = false;
    private amvw n = null;
    private long o = 0;
    private long q = Long.MAX_VALUE;
    private long r = Long.MIN_VALUE;
    private int s = 10;
    public ahpr f = new ahpr(0, 0);
    private ahpr t = new ahpr(0, 0);

    public ahpt(float f, float f2, ahok ahokVar, long j, cqat cqatVar) {
        this.a = f;
        this.g = f2;
        this.u = ahokVar;
        this.b = new Random(j);
        this.h = cqatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0ae3 A[SYNTHETIC] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ddqu k(long r30, long r32) {
        /*
            Method dump skipped, instructions count: 2830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpt.k(long, long):ddqu");
    }

    private static void l(ddqv ddqvVar, akra akraVar, akra akraVar2, akra akraVar3, double d) {
        double d2 = akraVar.a - akraVar2.a;
        Double.isNaN(d2);
        int round = (int) Math.round(d2 * d);
        double d3 = akraVar.b - akraVar2.b;
        Double.isNaN(d3);
        int round2 = (int) Math.round(d3 * d);
        int i = round - akraVar3.a;
        int i2 = round2 - akraVar3.b;
        if (i != 0) {
            if (ddqvVar.c) {
                ddqvVar.bF();
                ddqvVar.c = false;
            }
            ddru ddruVar = (ddru) ddqvVar.b;
            ddru ddruVar2 = ddru.g;
            ddruVar.a |= 2;
            ddruVar.e = i;
        }
        if (i2 != 0) {
            if (ddqvVar.c) {
                ddqvVar.bF();
                ddqvVar.c = false;
            }
            ddru ddruVar3 = (ddru) ddqvVar.b;
            ddru ddruVar4 = ddru.g;
            ddruVar3.a |= 4;
            ddruVar3.f = i2;
        }
        akraVar3.a = round;
        akraVar3.b = round2;
    }

    private static void m(ddqv ddqvVar, amuh amuhVar, akra akraVar, akrp akrpVar) {
        double r = 1.0d / akraVar.r();
        ddrr bZ = ddrs.g.bZ();
        boolean z = false;
        if (amuhVar.j()) {
            int b = amuhVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddrs ddrsVar = (ddrs) bZ.b;
            ddrsVar.a |= 1;
            ddrsVar.b = b;
        }
        Iterator<amub> it = amuhVar.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            amub next = it.next();
            if (bZ.c) {
                bZ.bF();
                bZ.c = z;
            }
            ddrs ddrsVar2 = (ddrs) bZ.b;
            dsrf dsrfVar = ddrsVar2.c;
            if (!dsrfVar.a()) {
                ddrsVar2.c = dsqw.cg(dsrfVar);
            }
            ddrsVar2.c.h(i2);
            Iterator<akru> it2 = next.m.a(akrpVar).iterator();
            while (it2.hasNext()) {
                akru next2 = it2.next();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = z;
                }
                ddrs ddrsVar3 = (ddrs) bZ.b;
                dsrf dsrfVar2 = ddrsVar3.d;
                if (!dsrfVar2.a()) {
                    ddrsVar3.d = dsqw.cg(dsrfVar2);
                }
                ddrsVar3.d.h(i2);
                int i4 = 0;
                while (i4 < next2.a()) {
                    akra b2 = next2.b(i4);
                    Iterator<akru> it3 = it2;
                    double d = b2.a - akraVar.a;
                    Double.isNaN(d);
                    int round = (int) Math.round(d * r);
                    double d2 = b2.b - akraVar.b;
                    Double.isNaN(d2);
                    int round2 = (int) Math.round(d2 * r);
                    int i5 = round - i3;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddrs ddrsVar4 = (ddrs) bZ.b;
                    dsrf dsrfVar3 = ddrsVar4.e;
                    if (!dsrfVar3.a()) {
                        ddrsVar4.e = dsqw.cg(dsrfVar3);
                    }
                    ddrsVar4.e.h(i5);
                    int i6 = round2 - i;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddrs ddrsVar5 = (ddrs) bZ.b;
                    dsrf dsrfVar4 = ddrsVar5.f;
                    if (!dsrfVar4.a()) {
                        ddrsVar5.f = dsqw.cg(dsrfVar4);
                    }
                    ddrsVar5.f.h(i6);
                    i2++;
                    i4++;
                    it2 = it3;
                    i3 = round;
                    i = round2;
                    z = false;
                }
            }
        }
        if (ddqvVar.c) {
            ddqvVar.bF();
            ddqvVar.c = false;
        }
        ddru ddruVar = (ddru) ddqvVar.b;
        ddrs bK = bZ.bK();
        ddru ddruVar2 = ddru.g;
        bK.getClass();
        ddruVar.c = bK;
        ddruVar.b = 6;
    }

    private static void n(ddqv ddqvVar, GmmCarProjectionStateEvent gmmCarProjectionStateEvent) {
        ddqw bZ = ddqx.d.bZ();
        boolean isInProjectedMode = gmmCarProjectionStateEvent.isInProjectedMode();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddqx ddqxVar = (ddqx) bZ.b;
        ddqxVar.a |= 1;
        ddqxVar.b = isInProjectedMode;
        int locationCharacterization = gmmCarProjectionStateEvent.getLocationCharacterization();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddqx ddqxVar2 = (ddqx) bZ.b;
        ddqxVar2.a |= 2;
        ddqxVar2.c = locationCharacterization;
        ddqx bK = bZ.bK();
        if (ddqvVar.c) {
            ddqvVar.bF();
            ddqvVar.c = false;
        }
        ddru ddruVar = (ddru) ddqvVar.b;
        ddru ddruVar2 = ddru.g;
        bK.getClass();
        ddruVar.c = bK;
        ddruVar.b = 17;
    }

    public final void a(ahqe ahqeVar) {
        if (ahqeVar instanceof ahqg) {
            int i = this.s + 1;
            this.s = i;
            if (i < 10) {
                return;
            }
            this.s = 0;
        }
        c(j(4, ahqeVar));
    }

    public final void b(dqvj dqvjVar) {
        if (dqvjVar != this.j) {
            this.j = dqvjVar;
            i(8, dqvjVar);
        }
    }

    public final void c(ahps ahpsVar) {
        bvrj.LOCATION_DISPATCHER.c();
        synchronized (this.c) {
            ahps peekLast = this.c.peekLast();
            if (peekLast != null) {
                ahpsVar.a = Math.max(ahpsVar.a, peekLast.a);
            }
            this.c.addLast(ahpsVar);
        }
        long j = this.q;
        long j2 = this.r;
        if (j >= j2 || ahpsVar.a <= j2) {
            return;
        }
        h();
    }

    public final boolean d() {
        if (this.b.nextFloat() < this.a) {
            f();
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.b.nextFloat() < this.g) {
            f();
            return true;
        }
        return false;
    }

    final void f() {
        g(this.h.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(long j) {
        this.q = Math.min(this.q, (-25000) + j);
        this.r = Math.max(this.r, j + 10000);
    }

    public final void h() {
        ddqu k;
        synchronized (this.c) {
            k = k(this.q, this.r);
        }
        this.q = Long.MAX_VALUE;
        this.r = Long.MIN_VALUE;
        if (k != null) {
            ahos ahosVar = this.u.a;
            bvrj.LOCATION_DISPATCHER.c();
            cjqy cjqyVar = ahosVar.o;
            if (cjqyVar == null) {
                return;
            }
            cjqyVar.u(new ahoo(ahosVar.j, cjqyVar.G(), k));
        }
    }

    public final void i(int i, Object obj) {
        c(j(i, obj));
    }

    public final ahps j(int i, @dzsi Object obj) {
        ahps removeFirst;
        amvw x;
        bvrj.LOCATION_DISPATCHER.c();
        synchronized (this.c) {
            removeFirst = this.c.size() >= 250 ? this.c.removeFirst() : new ahps();
            Object obj2 = removeFirst.b;
            if (obj2 instanceof amuh) {
                this.i = (amuh) obj2;
            }
            if (obj2 instanceof dqvj) {
                this.k = (dqvj) obj2;
            }
            if (obj2 instanceof ascc) {
                this.m = ((ascc) obj2).d;
            }
            if (removeFirst.j == 13 && (obj2 instanceof Boolean)) {
                this.l = (Boolean) obj2;
            }
            if (obj2 instanceof GmmCarProjectionStateEvent) {
                this.p = (GmmCarProjectionStateEvent) obj2;
            }
            if (obj2 instanceof ahpr) {
                this.t = (ahpr) obj2;
            }
            if ((obj2 instanceof GmmLocation) && (x = ((GmmLocation) obj2).x()) != null) {
                this.n = x;
                this.o = removeFirst.a;
            }
        }
        long e = this.h.e();
        if (obj instanceof ahqe) {
            e = ((ahqe) obj).a;
        } else if (i == 2 && (obj instanceof GmmLocation)) {
            e = ((GmmLocation) obj).j;
        }
        removeFirst.j = i;
        removeFirst.a = e;
        removeFirst.b = obj;
        removeFirst.c = false;
        removeFirst.d = false;
        removeFirst.e = false;
        removeFirst.f = false;
        removeFirst.g = false;
        removeFirst.i = false;
        return removeFirst;
    }
}
