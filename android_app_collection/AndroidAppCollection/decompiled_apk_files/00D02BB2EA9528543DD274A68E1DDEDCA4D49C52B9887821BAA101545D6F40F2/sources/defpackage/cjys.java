package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cjys  reason: default package */
/* loaded from: classes4.dex */
public class cjys {
    public final List<dtkx> a;
    @dzsi
    public final dthb b;
    @dzsi
    public final String c;
    @dzsi
    public final String d;
    @dzsi
    public final dvnp e;

    public cjys(List<dtkx> list, @dzsi String str, @dzsi dvnp dvnpVar) {
        dthb dthbVar;
        this.d = str;
        this.e = dvnpVar;
        String str2 = null;
        if (list.size() <= 1) {
            this.a = list;
            this.b = null;
            this.c = null;
            return;
        }
        dccx F = dcdc.F();
        for (dtkx dtkxVar : list) {
            dsqp dsqpVar = (dsqp) dtkxVar.cu(5);
            dsqpVar.bC(dtkxVar);
            dtkw dtkwVar = (dtkw) dsqpVar;
            dtku dtkuVar = dtkxVar.b;
            dtkuVar = dtkuVar == null ? dtku.p : dtkuVar;
            int i = dtkuVar.a;
            if ((i & 1) != 0) {
                dsqp dsqpVar2 = (dsqp) dtkuVar.cu(5);
                dsqpVar2.bC(dtkuVar);
                dtkt dtktVar = (dtkt) dsqpVar2;
                dtkf dtkfVar = dtkuVar.b;
                dtkfVar = dtkfVar == null ? dtkf.n : dtkfVar;
                dsqp dsqpVar3 = (dsqp) dtkfVar.cu(5);
                dsqpVar3.bC(dtkfVar);
                dtke dtkeVar = (dtke) dsqpVar3;
                if (dtkeVar.c) {
                    dtkeVar.bF();
                    dtkeVar.c = false;
                }
                dtkf dtkfVar2 = (dtkf) dtkeVar.b;
                dtkfVar2.h = null;
                int i2 = dtkfVar2.a & (-3);
                dtkfVar2.a = i2;
                dtkfVar2.j = null;
                dtkfVar2.a = i2 & (-9);
                if (dtktVar.c) {
                    dtktVar.bF();
                    dtktVar.c = false;
                }
                dtku dtkuVar2 = (dtku) dtktVar.b;
                dtkf dtkfVar3 = (dtkf) dtkeVar.bK();
                dtkfVar3.getClass();
                dtkuVar2.b = dtkfVar3;
                dtkuVar2.a |= 1;
                dtkuVar = (dtku) dtktVar.bK();
            } else if ((i & 4) != 0) {
                dsqp dsqpVar4 = (dsqp) dtkuVar.cu(5);
                dsqpVar4.bC(dtkuVar);
                dtkt dtktVar2 = (dtkt) dsqpVar4;
                dtof dtofVar = dtkuVar.d;
                dtofVar = dtofVar == null ? dtof.i : dtofVar;
                dsqp dsqpVar5 = (dsqp) dtofVar.cu(5);
                dsqpVar5.bC(dtofVar);
                dtoe dtoeVar = (dtoe) dsqpVar5;
                if (dtoeVar.c) {
                    dtoeVar.bF();
                    dtoeVar.c = false;
                }
                dtof dtofVar2 = (dtof) dtoeVar.b;
                dtofVar2.d = null;
                dtofVar2.a &= -5;
                if (dtktVar2.c) {
                    dtktVar2.bF();
                    dtktVar2.c = false;
                }
                dtku dtkuVar3 = (dtku) dtktVar2.b;
                dtof dtofVar3 = (dtof) dtoeVar.bK();
                dtofVar3.getClass();
                dtkuVar3.d = dtofVar3;
                dtkuVar3.a |= 4;
                dtkuVar = (dtku) dtktVar2.bK();
            } else if ((i & 8) != 0) {
                dsqp dsqpVar6 = (dsqp) dtkuVar.cu(5);
                dsqpVar6.bC(dtkuVar);
                dtkt dtktVar3 = (dtkt) dsqpVar6;
                dtjz dtjzVar = dtkuVar.e;
                dtjzVar = dtjzVar == null ? dtjz.e : dtjzVar;
                dsqp dsqpVar7 = (dsqp) dtjzVar.cu(5);
                dsqpVar7.bC(dtjzVar);
                dtjy dtjyVar = (dtjy) dsqpVar7;
                if (dtjyVar.c) {
                    dtjyVar.bF();
                    dtjyVar.c = false;
                }
                dtjz dtjzVar2 = (dtjz) dtjyVar.b;
                dtjzVar2.c = null;
                dtjzVar2.a &= -3;
                if (dtktVar3.c) {
                    dtktVar3.bF();
                    dtktVar3.c = false;
                }
                dtku dtkuVar4 = (dtku) dtktVar3.b;
                dtjz dtjzVar3 = (dtjz) dtjyVar.bK();
                dtjzVar3.getClass();
                dtkuVar4.e = dtjzVar3;
                dtkuVar4.a |= 8;
                dtkuVar = (dtku) dtktVar3.bK();
            } else if ((i & 64) != 0) {
                dsqp dsqpVar8 = (dsqp) dtkuVar.cu(5);
                dsqpVar8.bC(dtkuVar);
                dtkt dtktVar4 = (dtkt) dsqpVar8;
                dton dtonVar = dtkuVar.h;
                dtonVar = dtonVar == null ? dton.f : dtonVar;
                dsqp dsqpVar9 = (dsqp) dtonVar.cu(5);
                dsqpVar9.bC(dtonVar);
                dtom dtomVar = (dtom) dsqpVar9;
                if (dtomVar.c) {
                    dtomVar.bF();
                    dtomVar.c = false;
                }
                dton dtonVar2 = (dton) dtomVar.b;
                dtonVar2.d = null;
                dtonVar2.a &= -17;
                if (dtktVar4.c) {
                    dtktVar4.bF();
                    dtktVar4.c = false;
                }
                dtku dtkuVar5 = (dtku) dtktVar4.b;
                dton dtonVar3 = (dton) dtomVar.bK();
                dtonVar3.getClass();
                dtkuVar5.h = dtonVar3;
                dtkuVar5.a |= 64;
                dtkuVar = (dtku) dtktVar4.bK();
            } else if ((i & 128) != 0) {
                dsqp dsqpVar10 = (dsqp) dtkuVar.cu(5);
                dsqpVar10.bC(dtkuVar);
                dtkt dtktVar5 = (dtkt) dsqpVar10;
                dtol dtolVar = dtkuVar.i;
                dtolVar = dtolVar == null ? dtol.q : dtolVar;
                dsqp dsqpVar11 = (dsqp) dtolVar.cu(5);
                dsqpVar11.bC(dtolVar);
                dtoi dtoiVar = (dtoi) dsqpVar11;
                if (dtoiVar.c) {
                    dtoiVar.bF();
                    dtoiVar.c = false;
                }
                dtol dtolVar2 = (dtol) dtoiVar.b;
                dtolVar2.m = null;
                dtolVar2.a &= -2049;
                if (dtktVar5.c) {
                    dtktVar5.bF();
                    dtktVar5.c = false;
                }
                dtku dtkuVar6 = (dtku) dtktVar5.b;
                dtol dtolVar3 = (dtol) dtoiVar.bK();
                dtolVar3.getClass();
                dtkuVar6.i = dtolVar3;
                dtkuVar6.a |= 128;
                dtkuVar = (dtku) dtktVar5.bK();
            }
            if (dtkwVar.c) {
                dtkwVar.bF();
                dtkwVar.c = false;
            }
            dtkx dtkxVar2 = (dtkx) dtkwVar.b;
            dtkuVar.getClass();
            dtkxVar2.b = dtkuVar;
            dtkxVar2.a |= 1;
            F.g((dtkx) dtkwVar.bK());
        }
        this.a = F.f();
        dtku dtkuVar7 = list.get(0).b;
        dtkuVar7 = dtkuVar7 == null ? dtku.p : dtkuVar7;
        int i3 = dtkuVar7.a;
        if ((i3 & 1) != 0) {
            dtkf dtkfVar4 = dtkuVar7.b;
            if (((dtkfVar4 == null ? dtkf.n : dtkfVar4).a & 2) != 0) {
                dtkf dtkfVar5 = dtkuVar7.b;
                dthbVar = (dtkfVar5 == null ? dtkf.n : dtkfVar5).h;
                if (dthbVar == null) {
                    dthbVar = dthb.F;
                }
            }
            dthbVar = null;
        } else if ((i3 & 4) != 0) {
            dtof dtofVar4 = dtkuVar7.d;
            if (((dtofVar4 == null ? dtof.i : dtofVar4).a & 4) != 0) {
                dtof dtofVar5 = dtkuVar7.d;
                dthbVar = (dtofVar5 == null ? dtof.i : dtofVar5).d;
                if (dthbVar == null) {
                    dthbVar = dthb.F;
                }
            }
            dthbVar = null;
        } else if ((i3 & 8) != 0) {
            dtjz dtjzVar4 = dtkuVar7.e;
            if (((dtjzVar4 == null ? dtjz.e : dtjzVar4).a & 2) != 0) {
                dtjz dtjzVar5 = dtkuVar7.e;
                dthbVar = (dtjzVar5 == null ? dtjz.e : dtjzVar5).c;
                if (dthbVar == null) {
                    dthbVar = dthb.F;
                }
            }
            dthbVar = null;
        } else if ((i3 & 64) != 0) {
            dton dtonVar4 = dtkuVar7.h;
            if (((dtonVar4 == null ? dton.f : dtonVar4).a & 16) != 0) {
                dton dtonVar5 = dtkuVar7.h;
                dthbVar = (dtonVar5 == null ? dton.f : dtonVar5).d;
                if (dthbVar == null) {
                    dthbVar = dthb.F;
                }
            }
            dthbVar = null;
        } else {
            if ((i3 & 128) != 0) {
                dtol dtolVar4 = dtkuVar7.i;
                if (((dtolVar4 == null ? dtol.q : dtolVar4).a & 2048) != 0) {
                    dtol dtolVar5 = dtkuVar7.i;
                    dthbVar = (dtolVar5 == null ? dtol.q : dtolVar5).m;
                    if (dthbVar == null) {
                        dthbVar = dthb.F;
                    }
                }
            }
            dthbVar = null;
        }
        this.b = dthbVar;
        dtku dtkuVar8 = list.get(0).b;
        dtkuVar8 = dtkuVar8 == null ? dtku.p : dtkuVar8;
        if ((1 & dtkuVar8.a) != 0) {
            dtkf dtkfVar6 = dtkuVar8.b;
            if (((dtkfVar6 == null ? dtkf.n : dtkfVar6).a & 8) != 0) {
                dtkf dtkfVar7 = dtkuVar8.b;
                if ((dtkfVar7 == null ? dtkf.n : dtkfVar7).j == null) {
                    dthb dthbVar2 = dthb.F;
                }
            }
        }
        dtku dtkuVar9 = list.get(0).b;
        dtkuVar9 = dtkuVar9 == null ? dtku.p : dtkuVar9;
        int i4 = dtkuVar9.a;
        if ((i4 & 1) != 0) {
            dtkf dtkfVar8 = dtkuVar9.b;
            if (((dtkfVar8 == null ? dtkf.n : dtkfVar8).a & 16) != 0) {
                dtkf dtkfVar9 = dtkuVar9.b;
                str2 = (dtkfVar9 == null ? dtkf.n : dtkfVar9).k;
            }
        } else if ((i4 & 4) != 0) {
            dtof dtofVar6 = dtkuVar9.d;
            if (((dtofVar6 == null ? dtof.i : dtofVar6).a & 32) != 0) {
                dtof dtofVar7 = dtkuVar9.d;
                str2 = (dtofVar7 == null ? dtof.i : dtofVar7).g;
            }
        } else if ((i4 & 8) != 0) {
            dtjz dtjzVar6 = dtkuVar9.e;
            if (((dtjzVar6 == null ? dtjz.e : dtjzVar6).a & 4) != 0) {
                dtjz dtjzVar7 = dtkuVar9.e;
                str2 = (dtjzVar7 == null ? dtjz.e : dtjzVar7).d;
            }
        } else if ((i4 & 64) != 0) {
            dton dtonVar6 = dtkuVar9.h;
            if (((dtonVar6 == null ? dton.f : dtonVar6).a & 128) != 0) {
                dton dtonVar7 = dtkuVar9.h;
                str2 = (dtonVar7 == null ? dton.f : dtonVar7).e;
            }
        } else if ((i4 & 128) != 0) {
            dtol dtolVar6 = dtkuVar9.i;
            if (((dtolVar6 == null ? dtol.q : dtolVar6).a & 4096) != 0) {
                dtol dtolVar7 = dtkuVar9.i;
                str2 = (dtolVar7 == null ? dtol.q : dtolVar7).n;
            }
        }
        this.c = str2;
    }
}
