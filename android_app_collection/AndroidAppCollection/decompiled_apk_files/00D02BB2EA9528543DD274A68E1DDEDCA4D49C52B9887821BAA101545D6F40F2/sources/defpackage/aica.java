package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aica  reason: default package */
/* loaded from: classes2.dex */
abstract class aica {
    public boolean a;
    private final cqat b;
    private final aiby c;
    @dzsi
    private aibz d;

    public aica(cqat cqatVar, aiby aibyVar) {
        this.b = cqatVar;
        this.c = aibyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean b(@dzsi GmmLocation gmmLocation) {
        return gmmLocation != null && gmmLocation.hasSpeed() && gmmLocation.getSpeed() > 1.0f;
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.a) {
                this.a = false;
                z = true;
            }
        }
        if (z) {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d();

    protected abstract void e();

    @dzsi
    public abstract GmmLocation f();

    protected abstract dkod g();

    @dzsi
    protected abstract doek h();

    public final doek i() {
        doek h = h();
        doej bZ = doek.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doek doekVar = (doek) bZ.b;
        doekVar.a |= 4;
        doekVar.d = true;
        if (h != null) {
            dsqp dsqpVar = (dsqp) h.cu(5);
            dsqpVar.bC(h);
            bZ = (doej) dsqpVar;
        }
        long e = this.b.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doek doekVar2 = (doek) bZ.b;
        doekVar2.a |= 1;
        doekVar2.b = e;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        boolean z;
        cqat cqatVar = this.b;
        aiat aiatVar = new aiat(cqatVar.e(), i(), f());
        synchronized (this) {
            z = false;
            if (this.a) {
                aibz aibzVar = this.d;
                if (aibzVar != null) {
                    if (aibzVar.d(this.b) > TimeUnit.SECONDS.toMillis(g().b)) {
                        int i = g().b;
                    } else if (((aiat) aibzVar).b != null || aiatVar.b == null) {
                        if (aibzVar.d(this.b) < TimeUnit.SECONDS.toMillis(g().a)) {
                            int i2 = g().a;
                        } else {
                            doek doekVar = ((aiat) aibzVar).a;
                            doek doekVar2 = aiatVar.a;
                            if (doekVar.d == doekVar2.d) {
                                doqt doqtVar = doekVar.c;
                                if (doqtVar == null) {
                                    doqtVar = doqt.k;
                                }
                                dsrj<dpjx> dsrjVar = doqtVar.b;
                                doqt doqtVar2 = doekVar2.c;
                                if (doqtVar2 == null) {
                                    doqtVar2 = doqt.k;
                                }
                                if (dsrjVar.equals(doqtVar2.b)) {
                                    doqt doqtVar3 = doekVar.c;
                                    if (doqtVar3 == null) {
                                        doqtVar3 = doqt.k;
                                    }
                                    dqvj c = dqvj.c(doqtVar3.c);
                                    if (c == null) {
                                        c = dqvj.DRIVE;
                                    }
                                    doqt doqtVar4 = doekVar2.c;
                                    if (doqtVar4 == null) {
                                        doqtVar4 = doqt.k;
                                    }
                                    dqvj c2 = dqvj.c(doqtVar4.c);
                                    if (c2 == null) {
                                        c2 = dqvj.DRIVE;
                                    }
                                    if (c.equals(c2)) {
                                        doqt doqtVar5 = doekVar.c;
                                        if (doqtVar5 == null) {
                                            doqtVar5 = doqt.k;
                                        }
                                        doud doudVar = doqtVar5.e;
                                        if (doudVar == null) {
                                            doudVar = doud.c;
                                        }
                                        doqt doqtVar6 = doekVar2.c;
                                        if (doqtVar6 == null) {
                                            doqtVar6 = doqt.k;
                                        }
                                        doud doudVar2 = doqtVar6.e;
                                        if (doudVar2 == null) {
                                            doudVar2 = doud.c;
                                        }
                                        if (doudVar.equals(doudVar2)) {
                                            doqt doqtVar7 = doekVar.c;
                                            if (doqtVar7 == null) {
                                                doqtVar7 = doqt.k;
                                            }
                                            boolean z2 = doqtVar7.i;
                                            doqt doqtVar8 = doekVar2.c;
                                            if (doqtVar8 == null) {
                                                doqtVar8 = doqt.k;
                                            }
                                            if (z2 == doqtVar8.i) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.d = aiatVar;
                z = true;
            }
        }
        if (z) {
            this.c.a(aiatVar.a, aiatVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(boolean z) {
        boolean z2;
        synchronized (this) {
            z2 = this.a;
        }
        if (z2) {
            this.c.b(z);
            c();
        }
    }
}
