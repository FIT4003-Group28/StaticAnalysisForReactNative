package defpackage;

import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: btto  reason: default package */
/* loaded from: classes.dex */
public final class btto implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final bvjj a;
    public final dune b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public boolean d = false;
    private final bttf e;
    private final ctu f;
    private final dzsj<djzi> g;
    private final btyy h;
    private final dzsj<dixz> i;
    private final dzsj<dbsg<dhmr>> j;
    private final TelephonyManager k;

    public btto(bvjj bvjjVar, bttf bttfVar, dune duneVar, ctu ctuVar, dzsj<djzi> dzsjVar, btyy btyyVar, dzsj<dixz> dzsjVar2, dzsj<dbsg<dhmr>> dzsjVar3, TelephonyManager telephonyManager) {
        this.a = bvjjVar;
        this.e = bttfVar;
        this.b = duneVar;
        this.f = ctuVar;
        this.g = dzsjVar;
        this.h = btyyVar;
        this.i = dzsjVar2;
        this.j = dzsjVar3;
        this.k = telephonyManager;
    }

    @dzsi
    public static dkgr d(TelephonyManager telephonyManager) {
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            String simOperator = telephonyManager.getSimOperator();
            if (!dbsj.d(simOperator) && simOperator.length() >= 5) {
                dkgo bZ = dkgr.c.bZ();
                dkgp bZ2 = dkgq.d.bZ();
                String substring = simOperator.substring(0, 3);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dkgq dkgqVar = (dkgq) bZ2.b;
                substring.getClass();
                dkgqVar.a |= 1;
                dkgqVar.b = substring;
                String substring2 = simOperator.substring(3);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dkgq dkgqVar2 = (dkgq) bZ2.b;
                substring2.getClass();
                dkgqVar2.a |= 2;
                dkgqVar2.c = substring2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dkgr dkgrVar = (dkgr) bZ.b;
                dkgq bK = bZ2.bK();
                bK.getClass();
                dkgrVar.b = bK;
                dkgrVar.a |= 1;
                return bZ.bK();
            }
        }
        return null;
    }

    public final void a() {
        synchronized (this.b) {
            dune duneVar = this.b;
            if (!((dung) duneVar.b).j) {
                if (duneVar.c) {
                    duneVar.bF();
                    duneVar.c = false;
                }
                dung.c((dung) duneVar.b);
                String z = this.a.z(bvjk.br, null);
                if (z != null && !"*".equals(z)) {
                    dune duneVar2 = this.b;
                    if (duneVar2.c) {
                        duneVar2.bF();
                        duneVar2.c = false;
                    }
                    dung dungVar = (dung) duneVar2.b;
                    z.getClass();
                    dungVar.a |= 4096;
                    dungVar.k = z;
                }
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = (((dung) this.b.b).a & 4096) != 0;
        }
        return z;
    }

    public final dung c(boolean z) {
        dbsg dbsgVar;
        dkgr d;
        synchronized (this.b) {
            ctu ctuVar = this.f;
            try {
                if (ctuVar.c.isDone() && !ctuVar.c.isCancelled()) {
                    dbsgVar = dbsg.i(ctuVar.c.get());
                } else {
                    dbsgVar = dbpy.a;
                }
            } catch (InterruptedException | ExecutionException unused) {
                dbsgVar = dbpy.a;
            }
            bvor.a(dbsgVar, new mw(this) { // from class: bttl
                private final btto a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    btto bttoVar = this.a;
                    String str = (String) obj;
                    synchronized (bttoVar.b) {
                        dune duneVar = bttoVar.b;
                        if (duneVar.c) {
                            duneVar.bF();
                            duneVar.c = false;
                        }
                        dung dungVar = (dung) duneVar.b;
                        dung dungVar2 = dung.R;
                        str.getClass();
                        dungVar.b |= 2097152;
                        dungVar.L = str;
                    }
                }
            });
            String z2 = this.a.z(bvjk.A, "");
            if (!z2.isEmpty()) {
                synchronized (this.b) {
                    dune duneVar = this.b;
                    if (duneVar.c) {
                        duneVar.bF();
                        duneVar.c = false;
                    }
                    dung dungVar = (dung) duneVar.b;
                    dung dungVar2 = dung.R;
                    z2.getClass();
                    dungVar.a |= 2;
                    dungVar.d = z2;
                }
            }
            if (z && (d = d(this.k)) != null) {
                synchronized (this.b) {
                    dune duneVar2 = this.b;
                    if (duneVar2.c) {
                        duneVar2.bF();
                        duneVar2.c = false;
                    }
                    dung dungVar3 = (dung) duneVar2.b;
                    dung dungVar4 = dung.R;
                    d.getClass();
                    dungVar3.g = d;
                    dungVar3.a |= 128;
                }
            }
            if (this.a.z(bvjk.kc, "").isEmpty()) {
                dccx F = dcdc.F();
                F.i(this.g.a().a);
                F.i(this.h.b());
                dcdc f = F.f();
                synchronized (this.b) {
                    dune duneVar3 = this.b;
                    if (f != null) {
                        if (duneVar3.c) {
                            duneVar3.bF();
                            duneVar3.c = false;
                        }
                        dung dungVar5 = dung.R;
                        ((dung) duneVar3.b).q = dung.cf();
                        if (duneVar3.c) {
                            duneVar3.bF();
                            duneVar3.c = false;
                        }
                        dung dungVar6 = (dung) duneVar3.b;
                        dsrf dsrfVar = dungVar6.q;
                        if (!dsrfVar.a()) {
                            dungVar6.q = dsqw.cg(dsrfVar);
                        }
                        dsod.bv(f, dungVar6.q);
                    }
                }
            } else {
                String z3 = this.a.z(bvjk.kc, "");
                if (!z3.isEmpty()) {
                    synchronized (this.b) {
                        dune duneVar4 = this.b;
                        if (duneVar4.c) {
                            duneVar4.bF();
                            duneVar4.c = false;
                        }
                        dung dungVar7 = dung.R;
                        ((dung) duneVar4.b).P = dsqw.ck();
                        dune duneVar5 = this.b;
                        if (duneVar5.c) {
                            duneVar5.bF();
                            duneVar5.c = false;
                        }
                        dung dungVar8 = (dung) duneVar5.b;
                        z3.getClass();
                        dsrj<String> dsrjVar = dungVar8.P;
                        if (!dsrjVar.a()) {
                            dungVar8.P = dsqw.cl(dsrjVar);
                        }
                        dungVar8.P.add(z3);
                    }
                }
            }
            dumt dumtVar = (dumt) this.a.H(bvjk.jD, dumt.class, null);
            if (dumtVar != null) {
                synchronized (this.b) {
                    dune duneVar6 = this.b;
                    if (duneVar6.c) {
                        duneVar6.bF();
                        duneVar6.c = false;
                    }
                    dung dungVar9 = (dung) duneVar6.b;
                    dung dungVar10 = dung.R;
                    dungVar9.M = dumtVar.e;
                    dungVar9.b |= 4194304;
                }
            }
            bvor.a(this.j.a(), new mw(this) { // from class: bttm
                private final btto a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    btto bttoVar = this.a;
                    dhmr dhmrVar = (dhmr) obj;
                    synchronized (bttoVar.b) {
                        dune duneVar7 = bttoVar.b;
                        if (duneVar7.c) {
                            duneVar7.bF();
                            duneVar7.c = false;
                        }
                        dung dungVar11 = (dung) duneVar7.b;
                        dung dungVar12 = dung.R;
                        dhmrVar.getClass();
                        dungVar11.Q = dhmrVar;
                        dungVar11.b |= 67108864;
                    }
                }
            });
            if (this.i.a().g) {
                synchronized (this.b) {
                    dune duneVar7 = this.b;
                    if (duneVar7.c) {
                        duneVar7.bF();
                        duneVar7.c = false;
                    }
                    dung dungVar11 = (dung) duneVar7.b;
                    dung dungVar12 = dung.R;
                    dungVar11.a |= 262144;
                    dungVar11.n = true;
                }
            }
            if (!b() || this.a.i(bvjk.br)) {
                return this.b.bK();
            }
            Thread.currentThread().getName();
            dung bK = this.b.bK();
            dsqp dsqpVar = (dsqp) bK.cu(5);
            dsqpVar.bC(bK);
            dune duneVar8 = (dune) dsqpVar;
            if (duneVar8.c) {
                duneVar8.bF();
                duneVar8.c = false;
            }
            dung dungVar13 = (dung) duneVar8.b;
            dung dungVar14 = dung.R;
            dungVar13.a &= -4097;
            dungVar13.k = dung.R.k;
            dung bK2 = duneVar8.bK();
            this.a.ac(bvjk.br, "*");
            this.d = true;
            return bK2;
        }
    }

    public final void e(String str) {
        synchronized (this.b) {
            dune duneVar = this.b;
            if (duneVar.c) {
                duneVar.bF();
                duneVar.c = false;
            }
            dung dungVar = (dung) duneVar.b;
            dung dungVar2 = dung.R;
            str.getClass();
            dungVar.a |= 1;
            dungVar.c = str;
            this.a.ac(bvjk.bu, str);
        }
    }

    public final void f(String str) {
        synchronized (this.b) {
            dune duneVar = this.b;
            if (duneVar.c) {
                duneVar.bF();
                duneVar.c = false;
            }
            dung dungVar = (dung) duneVar.b;
            dung dungVar2 = dung.R;
            str.getClass();
            dungVar.a |= 4;
            dungVar.e = str;
            bttf bttfVar = this.e;
            ((btte) bttfVar).c.ac(btte.a, str);
            ((btte) bttfVar).d = "";
        }
    }

    public final void g(String str) {
        synchronized (this.b) {
            dune duneVar = this.b;
            if (duneVar.c) {
                duneVar.bF();
                duneVar.c = false;
            }
            dung dungVar = (dung) duneVar.b;
            dung dungVar2 = dung.R;
            str.getClass();
            dungVar.a |= 4096;
            dungVar.k = str;
            this.a.ac(bvjk.br, str);
            Thread.currentThread().getName();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }
}
