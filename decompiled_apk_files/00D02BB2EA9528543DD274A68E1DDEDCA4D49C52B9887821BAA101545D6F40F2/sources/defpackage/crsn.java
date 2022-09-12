package defpackage;

import android.util.LongSparseArray;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.ar.core.ImageMetadata;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crsn  reason: default package */
/* loaded from: classes5.dex */
public final class crsn implements crfl, crgy {
    public static final /* synthetic */ int b = 0;
    private static final dnqh c;
    public GmmLocation a;
    private final ckcw d;
    private final akfa e;
    private final btvo f;
    private final cqat g;
    private final Executor h;
    private final btrm i;
    private final bvgn l;
    private final Set<Runnable> k = new HashSet();
    private final LongSparseArray<Long> j = new LongSparseArray<>();

    static {
        dnqg bZ = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        int i = ddda.aG.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ.b;
        dnqhVar2.a |= 64;
        dnqhVar2.g = i;
        dnqh.b(dnqhVar2);
        c = bZ.bK();
    }

    public crsn(cqat cqatVar, btrm btrmVar, btvo btvoVar, ckcw ckcwVar, akfa akfaVar, Executor executor, bvgn bvgnVar) {
        this.h = executor;
        this.d = ckcwVar;
        this.e = akfaVar;
        this.f = btvoVar;
        this.g = cqatVar;
        this.i = btrmVar;
        this.l = bvgnVar;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        btrm btrmVar = this.i;
        dceq a = dcet.a();
        a.b(amqo.class, new crso(amqo.class, this));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.i.a(this);
        this.j.clear();
    }

    @Override // defpackage.crfl
    public final boolean c(long j) {
        return this.j.get(j) != null;
    }

    @Override // defpackage.crfl
    public final long d(long j, long j2) {
        return Math.max(j2, this.j.get(j, Long.valueOf(j2)).longValue());
    }

    @Override // defpackage.crfl
    public final void e(Runnable runnable) {
        this.k.add(runnable);
    }

    @Override // defpackage.crfl
    public final void f(Runnable runnable) {
        this.k.remove(runnable);
    }

    @Override // defpackage.crfl
    public final boolean g(amwb amwbVar) {
        boolean z = this.f.getUgcParameters().ag() || doyd.INCIDENT_SPEED_LIMIT.equals(amwbVar.h());
        btlu j = this.e.j();
        return amwbVar.l() && j != null && j.u() && z;
    }

    @Override // defpackage.crfl
    public final void h(akra akraVar, dqkr dqkrVar, @dzsi Float f, @dzsi String str) {
        dkxf d = auej.d(this.f, dqkrVar);
        if (d == null) {
            return;
        }
        if (dqkr.INCIDENT_SUSPECTED_CLOSURE.equals(dqkrVar)) {
            this.i.b(new crio());
        } else {
            bvgn bvgnVar = this.l;
            dqkz bZ = dqlb.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqlb dqlbVar = (dqlb) bZ.b;
            dqlbVar.b = 1;
            dqlbVar.a |= 1;
            if (!Float.isNaN(f.floatValue())) {
                float floatValue = f.floatValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqlb dqlbVar2 = (dqlb) bZ.b;
                dqlbVar2.a |= 2;
                dqlbVar2.c = floatValue;
            }
            if (str != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqlb dqlbVar3 = (dqlb) bZ.b;
                str.getClass();
                dqlbVar3.a |= 4;
                dqlbVar3.d = str;
            }
            dqks bZ2 = dqlc.f.bZ();
            dpul bZ3 = dpum.d.bZ();
            double k = akraVar.k();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dpum dpumVar = (dpum) bZ3.b;
            dpumVar.a |= 1;
            dpumVar.b = k;
            double o = akraVar.o();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dpum dpumVar2 = (dpum) bZ3.b;
            dpumVar2.a |= 2;
            dpumVar2.c = o;
            bZ2.a(bZ3);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqlc dqlcVar = (dqlc) bZ2.b;
            dqlb bK = bZ.bK();
            bK.getClass();
            dqlcVar.d = bK;
            dqlcVar.a |= 32;
            switch (dqkrVar.ordinal()) {
                case 2:
                case 3:
                case 6:
                case 9:
                case 10:
                case 11:
                    break;
                case 4:
                    dqkt bZ4 = dqkw.d.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dqkw dqkwVar = (dqkw) bZ4.b;
                    dqkwVar.b = 1;
                    dqkwVar.a |= 1;
                    dqkw dqkwVar2 = (dqkw) bZ4.b;
                    dqkwVar2.c = 2;
                    dqkwVar2.a |= 2;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dqlc dqlcVar2 = (dqlc) bZ2.b;
                    dqkw bK2 = bZ4.bK();
                    bK2.getClass();
                    dqlcVar2.c = bK2;
                    dqlcVar2.a |= 16;
                    break;
                case 5:
                    dqkt bZ5 = dqkw.d.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dqkw dqkwVar3 = (dqkw) bZ5.b;
                    dqkwVar3.b = 1;
                    dqkwVar3.a |= 1;
                    dqkw dqkwVar4 = (dqkw) bZ5.b;
                    dqkwVar4.c = 1;
                    dqkwVar4.a |= 2;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dqlc dqlcVar3 = (dqlc) bZ2.b;
                    dqkw bK3 = bZ5.bK();
                    bK3.getClass();
                    dqlcVar3.c = bK3;
                    dqlcVar3.a |= 16;
                    break;
                case 7:
                case 8:
                default:
                    throw new IllegalArgumentException("UserIncidentType");
            }
            dkcv bZ6 = dkcw.i.bZ();
            dnqh dnqhVar = c;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dkcw dkcwVar = (dkcw) bZ6.b;
            dnqhVar.getClass();
            dkcwVar.b = dnqhVar;
            dkcwVar.a |= 1;
            long micros = TimeUnit.MILLISECONDS.toMicros(this.g.b());
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dkcw dkcwVar2 = (dkcw) bZ6.b;
            dkcwVar2.a |= 32;
            dkcwVar2.g = micros;
            dkcw dkcwVar3 = (dkcw) bZ6.b;
            dkcwVar3.c = 1;
            dkcwVar3.a |= 2;
            dkcw dkcwVar4 = (dkcw) bZ6.b;
            dkcwVar4.d = 6;
            int i = dkcwVar4.a | 4;
            dkcwVar4.a = i;
            dkcwVar4.e = dqkrVar.q;
            dkcwVar4.a = i | 8;
            dqlc bK4 = bZ2.bK();
            bK4.getClass();
            dkcwVar4.h = bK4;
            dkcwVar4.a |= 64;
            bvgnVar.b(bZ6.bK(), new crsm(this, dqkrVar), this.h);
        }
        int i2 = d.a;
        if ((i2 & 4) == 0 || (i2 & 8) == 0) {
            ((ckco) this.d.a(ckhi.aI)).a(0);
            return;
        }
        btrm btrmVar = this.i;
        auei c2 = auei.c(d.c, d.d);
        dkxc b2 = dkxc.b(d.e);
        if (b2 == null) {
            b2 = dkxc.UNKNOWN_LABEL;
        }
        btrmVar.b(new crik(akraVar, c2, auej.a(b2)));
    }

    @Override // defpackage.crfl
    public final void i(long j, dqkr dqkrVar, int i, long j2, List<dqts> list, boolean z) {
        if (i == 6 && !list.isEmpty()) {
            this.i.b(new cril(dcdc.r(list)));
        }
        this.j.put(j, Long.valueOf(j2));
        for (Runnable runnable : this.k) {
            runnable.run();
        }
        dkcv bZ = dkcw.i.bZ();
        dnqh dnqhVar = c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkcw dkcwVar = (dkcw) bZ.b;
        dnqhVar.getClass();
        dkcwVar.b = dnqhVar;
        int i2 = dkcwVar.a | 1;
        dkcwVar.a = i2;
        dkcwVar.c = i - 1;
        dkcwVar.a = i2 | 2;
        dkcw dkcwVar2 = (dkcw) bZ.b;
        dkcwVar2.d = 6;
        int i3 = dkcwVar2.a | 4;
        dkcwVar2.a = i3;
        dkcwVar2.e = dqkrVar.q;
        int i4 = i3 | 8;
        dkcwVar2.a = i4;
        dkcwVar2.a = i4 | 16;
        dkcwVar2.f = j;
        this.l.b(bZ.bK(), new crsk(this, z, i, dqkrVar), this.h);
    }

    @Override // defpackage.crfl
    public final void j(akqq akqqVar, int i, int i2) {
        GmmLocation gmmLocation = this.a;
        if (gmmLocation == null) {
            return;
        }
        akra u = gmmLocation.u();
        float v = this.a.v();
        if (u == null || Float.isNaN(v)) {
            return;
        }
        dqks bZ = dqlc.f.bZ();
        dpul bZ2 = dpum.d.bZ();
        double k = u.k();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpum dpumVar = (dpum) bZ2.b;
        dpumVar.a |= 1;
        dpumVar.b = k;
        double o = u.o();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpum dpumVar2 = (dpum) bZ2.b;
        dpumVar2.a |= 2;
        dpumVar2.c = o;
        bZ.a(bZ2);
        dpum h = akqqVar.h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqlc dqlcVar = (dqlc) bZ.b;
        h.getClass();
        dqlcVar.b();
        dqlcVar.b.add(h);
        dqkz bZ3 = dqlb.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqlb dqlbVar = (dqlb) bZ3.b;
        dqlbVar.b = 1;
        int i3 = dqlbVar.a | 1;
        dqlbVar.a = i3;
        dqlbVar.a = i3 | 2;
        dqlbVar.c = v;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqlc dqlcVar2 = (dqlc) bZ.b;
        dqlb bK = bZ3.bK();
        bK.getClass();
        dqlcVar2.d = bK;
        dqlcVar2.a |= 32;
        dqkx bZ4 = dqky.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqky dqkyVar = (dqky) bZ4.b;
        dqkyVar.a |= 1;
        dqkyVar.b = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqlc dqlcVar3 = (dqlc) bZ.b;
        dqky bK2 = bZ4.bK();
        bK2.getClass();
        dqlcVar3.e = bK2;
        dqlcVar3.a |= 64;
        dqlc bK3 = bZ.bK();
        dkcv bZ5 = dkcw.i.bZ();
        dnqh dnqhVar = c;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dkcw dkcwVar = (dkcw) bZ5.b;
        dnqhVar.getClass();
        dkcwVar.b = dnqhVar;
        int i4 = dkcwVar.a | 1;
        dkcwVar.a = i4;
        dkcwVar.c = i2 - 1;
        dkcwVar.a = i4 | 2;
        dkcw dkcwVar2 = (dkcw) bZ5.b;
        dkcwVar2.d = 6;
        dkcwVar2.a |= 4;
        dqkr dqkrVar = dqkr.INCIDENT_SPEED_LIMIT;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dkcw dkcwVar3 = (dkcw) bZ5.b;
        dkcwVar3.e = dqkrVar.q;
        int i5 = dkcwVar3.a | 8;
        dkcwVar3.a = i5;
        bK3.getClass();
        dkcwVar3.h = bK3;
        dkcwVar3.a = i5 | 64;
        this.l.b(bZ5.bK(), new crsl(this, i2), this.h);
    }

    public final void k(int i, dqkr dqkrVar, long j) {
        this.i.b(new crim(i, dqkrVar, j));
    }
}
