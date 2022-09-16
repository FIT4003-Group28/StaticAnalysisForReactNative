package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bypf  reason: default package */
/* loaded from: classes4.dex */
final class bypf implements btzi<dmxh, dmxv> {
    final /* synthetic */ long a;
    final /* synthetic */ pef b;
    final /* synthetic */ bypg c;

    public bypf(bypg bypgVar, long j, pef pefVar) {
        this.c = bypgVar;
        this.a = j;
        this.b = pefVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dmxh> btzrVar, btzy btzyVar) {
        int i;
        bypg bypgVar = this.c;
        ckgz ckgzVar = ckht.aC;
        if (btzyVar.equals(btzy.a)) {
            i = 5;
        } else if (btzyVar.equals(btzy.b)) {
            i = 6;
        } else if (btzyVar.equals(btzy.c)) {
            i = 7;
        } else if (btzyVar.equals(btzy.d)) {
            i = 8;
        } else if (btzyVar.equals(btzy.e)) {
            i = 9;
        } else if (btzyVar.equals(btzy.f)) {
            i = 10;
        } else if (btzyVar.equals(btzy.g)) {
            i = 11;
        } else if (btzyVar.equals(btzy.h)) {
            i = 12;
        } else if (btzyVar.equals(btzy.i)) {
            i = 13;
        } else if (btzyVar.equals(btzy.j)) {
            i = 14;
        } else if (btzyVar.equals(btzy.k)) {
            i = 15;
        } else if (btzyVar.equals(btzy.l)) {
            i = 16;
        } else if (btzyVar.equals(btzy.m)) {
            i = 17;
        } else {
            i = btzyVar.equals(btzy.n) ? 18 : 4;
        }
        bypgVar.d(ckgzVar, ckhk.a(i));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dmxh> btzrVar, dmxv dmxvVar) {
        bypg bypgVar;
        int a;
        ckgz ckgzVar;
        int a2;
        pef pefVar;
        dmxv dmxvVar2 = dmxvVar;
        ckgz ckgzVar2 = ckht.aC;
        int i = 1;
        if (dmxvVar2.a.size() > 0) {
            dmxt dmxtVar = dmxvVar2.a.get(0);
            int a3 = dmxs.a(dmxtVar.b);
            if (a3 != 0 && a3 == 7 && this.c.d.getTripAssistanceNotificationsParameters().g) {
                bypg bypgVar2 = this.c;
                long j = this.a;
                String str = dmxtVar.f;
                try {
                    try {
                        String valueOf = String.valueOf(j);
                        dbsg dbsgVar = (dbsg) bypgVar2.b.a(valueOf, (dssr) byqj.f.cu(7)).get();
                        if (dbsgVar.a()) {
                            byqj byqjVar = (byqj) dbsgVar.b();
                            dsqp dsqpVar = (dsqp) byqjVar.cu(5);
                            dsqpVar.bC(byqjVar);
                            byqi byqiVar = (byqi) dsqpVar;
                            if (byqiVar.c) {
                                byqiVar.bF();
                                byqiVar.c = false;
                            }
                            byqj byqjVar2 = (byqj) byqiVar.b;
                            str.getClass();
                            byqjVar2.a |= 4;
                            byqjVar2.d = str;
                            long b = bypgVar2.e.b();
                            if (byqiVar.c) {
                                byqiVar.bF();
                                byqiVar.c = false;
                            }
                            byqj byqjVar3 = (byqj) byqiVar.b;
                            byqjVar3.a |= 8;
                            byqjVar3.e = b;
                            bypgVar2.b.b(valueOf, byqiVar.bK()).get().booleanValue();
                        }
                    } catch (Throwable unused) {
                    }
                } catch (InterruptedException | ExecutionException e) {
                    e.getStackTrace();
                }
            } else if ((dmxtVar.a & 8) != 0) {
                bypg bypgVar3 = this.c;
                dspd dspdVar = dmxtVar.c;
                long j2 = this.a;
                String str2 = dmxtVar.f;
                String valueOf2 = String.valueOf(j2);
                byqi bZ = byqj.f.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                byqj byqjVar4 = (byqj) bZ.b;
                int i2 = byqjVar4.a | 1;
                byqjVar4.a = i2;
                byqjVar4.b = j2;
                dspdVar.getClass();
                int i3 = i2 | 2;
                byqjVar4.a = i3;
                byqjVar4.c = dspdVar;
                str2.getClass();
                byqjVar4.a = i3 | 4;
                byqjVar4.d = str2;
                long b2 = bypgVar3.e.b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                byqj byqjVar5 = (byqj) bZ.b;
                byqjVar5.a |= 8;
                byqjVar5.e = b2;
                try {
                    if (true != bypgVar3.b.b(valueOf2, bZ.bK()).get().booleanValue()) {
                        i = 2;
                    }
                    ckgzVar = ckht.aA;
                    a2 = ckhm.a(i);
                } catch (Exception unused2) {
                    ckgzVar = ckht.aA;
                    a2 = ckhm.a(2);
                } catch (Throwable th) {
                    bypgVar3.d(ckht.aA, ckhm.a(2));
                    throw th;
                }
                bypgVar3.d(ckgzVar, a2);
            }
            synchronized (this.c.c) {
                pefVar = this.c.f;
            }
            if (pefVar != null && this.b.equals(pefVar)) {
                this.c.d(ckgzVar2, ckhk.a(3));
                pda a4 = this.c.a.a();
                pau pauVar = pefVar.d;
                if (pauVar == null) {
                    pauVar = pau.f;
                }
                pas pasVar = pefVar.c;
                if (pasVar == null) {
                    pasVar = pas.d;
                }
                dlfv dlfvVar = pefVar.b;
                if (dlfvVar == null) {
                    dlfvVar = dlfv.h;
                }
                a4.d(pauVar, pasVar, dlfvVar);
                return;
            }
            bypgVar = this.c;
            a = ckhk.a(2);
        } else {
            bypgVar = this.c;
            a = ckhk.a(1);
        }
        bypgVar.d(ckgzVar2, a);
    }
}
