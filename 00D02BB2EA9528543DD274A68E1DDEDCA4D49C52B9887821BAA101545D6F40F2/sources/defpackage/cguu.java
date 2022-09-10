package defpackage;
/* compiled from: PG */
/* renamed from: cguu  reason: default package */
/* loaded from: classes4.dex */
public final class cguu implements cgun {
    @dzsi
    public dwpe a;
    @dzsi
    public dpyv b;
    @dzsi
    public dspd c;
    @dzsi
    public dhjz d;
    @dzsi
    public dqgh e;
    @dzsi
    public dnqh f;
    private final dhjx g;
    @dzsi
    private dspd h;
    @dzsi
    private String i;

    public cguu(dhjx dhjxVar) {
        this.g = dhjxVar;
    }

    @Override // defpackage.cgun
    public final dwsn a() {
        dbsg i;
        dqgh dqghVar = this.e;
        dspd dspdVar = this.h;
        dpyv dpyvVar = this.b;
        String str = this.i;
        dwpe dwpeVar = this.a;
        dwsc bZ = dwsn.k.bZ();
        dhjx dhjxVar = this.g;
        dhkb dhkbVar = dhjxVar.c;
        if (dhkbVar == null) {
            dhkbVar = dhkb.e;
        }
        if (dhkbVar.c != 0.0f) {
            dsqp dsqpVar = (dsqp) dhjxVar.cu(5);
            dsqpVar.bC(dhjxVar);
            dhjw dhjwVar = (dhjw) dsqpVar;
            dhkb dhkbVar2 = dhkb.e;
            if (dhjwVar.c) {
                dhjwVar.bF();
                dhjwVar.c = false;
            }
            dhjx dhjxVar2 = (dhjx) dhjwVar.b;
            dhkbVar2.getClass();
            dhjxVar2.c = dhkbVar2;
            dhjxVar2.a |= 2;
            dhjxVar = dhjwVar.bK();
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwsn dwsnVar = (dwsn) bZ.b;
        dhjxVar.getClass();
        dwsnVar.g = dhjxVar;
        dwsnVar.a |= 2;
        dwrh bZ2 = dwrt.e.bZ();
        dwrk bZ3 = dwrq.c.bZ();
        bZ3.a(dwrm.TITLE);
        bZ3.a(dwrm.PARAGRAPH);
        bZ3.a(dwrm.BOOLEAN_INPUT);
        bZ3.a(dwrm.STRING_INPUT);
        bZ3.a(dwrm.IMAGES);
        dwrn bZ4 = dwrp.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwrp dwrpVar = (dwrp) bZ4.b;
        dwrpVar.b = 1;
        dwrpVar.a |= 1;
        dwrp bK = bZ4.bK();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwrq dwrqVar = (dwrq) bZ3.b;
        bK.getClass();
        dsrj<dwrp> dsrjVar = dwrqVar.b;
        if (!dsrjVar.a()) {
            dwrqVar.b = dsqw.cl(dsrjVar);
        }
        dwrqVar.b.add(bK);
        dwrq bK2 = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwrt dwrtVar = (dwrt) bZ2.b;
        bK2.getClass();
        dwrtVar.b = bK2;
        dwrtVar.a |= 1;
        dwrr bZ5 = dwrs.c.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwrs dwrsVar = (dwrs) bZ5.b;
        dwrsVar.a |= 1;
        dwrsVar.b = true;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwrt dwrtVar2 = (dwrt) bZ2.b;
        dwrs bK3 = bZ5.bK();
        bK3.getClass();
        dwrtVar2.c = bK3;
        dwrtVar2.a |= 2;
        dwri bZ6 = dwrj.c.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dwrj dwrjVar = (dwrj) bZ6.b;
        dwrjVar.a |= 1;
        dwrjVar.b = true;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwrt dwrtVar3 = (dwrt) bZ2.b;
        dwrj bK4 = bZ6.bK();
        bK4.getClass();
        dwrtVar3.d = bK4;
        dwrtVar3.a |= 4;
        dwrt bK5 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwsn dwsnVar2 = (dwsn) bZ.b;
        bK5.getClass();
        dwsnVar2.j = bK5;
        dwsnVar2.a |= 256;
        dwsd bZ7 = dwse.c.bZ();
        if (dspdVar != null) {
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dwse dwseVar = (dwse) bZ7.b;
            dspdVar.getClass();
            dwseVar.a |= 1;
            dwseVar.b = dspdVar;
        }
        dwse bK6 = bZ7.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwsn dwsnVar3 = (dwsn) bZ.b;
        bK6.getClass();
        dwsnVar3.c = bK6;
        int i2 = 3;
        dwsnVar3.b = 3;
        if (dwpeVar != null) {
            dwpeVar.getClass();
            dwsnVar3.h = dwpeVar;
            dwsnVar3.a |= 16;
        }
        dwsh bZ8 = dwsi.e.bZ();
        if (this.b != dpyv.UGC_TASKS_NEARBY_NEED) {
            i = this.i != null ? dbsg.i(dwrx.PLACES_CENTERED) : dbpy.a;
        } else if (this.i == null) {
            i = dbsg.i(dwrx.INITIAL);
        } else {
            i = dbsg.i(dwrx.PLACES_CENTERED);
        }
        if (i.a()) {
            dwrx dwrxVar = (dwrx) i.b();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dwsi dwsiVar = (dwsi) bZ8.b;
            dwsiVar.d = dwrxVar.d;
            dwsiVar.a |= 2;
        }
        if (str != null) {
            dwrd bZ9 = dwrg.d.bZ();
            dhjz dhjzVar = this.d;
            dwpb bZ10 = dwpc.e.bZ();
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            dwpc dwpcVar = (dwpc) bZ10.b;
            str.getClass();
            dwpcVar.a |= 1;
            dwpcVar.b = str;
            if (dhjzVar != null) {
                dpum h = akqq.j(dhjzVar).h();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                dwpc dwpcVar2 = (dwpc) bZ10.b;
                h.getClass();
                dwpcVar2.c = h;
                dwpcVar2.a |= 2;
            }
            dwpc bK7 = bZ10.bK();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dwrg dwrgVar = (dwrg) bZ9.b;
            bK7.getClass();
            dwrgVar.b = bK7;
            dwrgVar.a |= 1;
            dpyv dpyvVar2 = this.b;
            if (dpyvVar2 == null || dpyvVar2.ordinal() != 107) {
                i2 = 2;
            }
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dwrg dwrgVar2 = (dwrg) bZ9.b;
            dwrgVar2.c = i2 - 1;
            dwrgVar2.a |= 2;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dwsi dwsiVar2 = (dwsi) bZ8.b;
            dwrg bK8 = bZ9.bK();
            bK8.getClass();
            dsrj<dwrg> dsrjVar2 = dwsiVar2.c;
            if (!dsrjVar2.a()) {
                dwsiVar2.c = dsqw.cl(dsrjVar2);
            }
            dwsiVar2.c.add(bK8);
        }
        dspd dspdVar2 = this.c;
        if (dspdVar2 != null) {
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dwsi dwsiVar3 = (dwsi) bZ8.b;
            dspdVar2.getClass();
            dwsiVar3.a |= 1;
            dwsiVar3.b = dspdVar2;
        }
        dwsi bK9 = bZ8.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwsn dwsnVar4 = (dwsn) bZ.b;
        bK9.getClass();
        dwsnVar4.i = bK9;
        dwsnVar4.a |= 32;
        if (dpyvVar != null) {
            dwsf bZ11 = dwsg.d.bZ();
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dwsg dwsgVar = (dwsg) bZ11.b;
            dwsgVar.b = dpyvVar.dm;
            dwsgVar.a |= 1;
            if (dqghVar != null && dpyvVar == dpyv.FACTUAL_MODERATION) {
                if (bZ11.c) {
                    bZ11.bF();
                    bZ11.c = false;
                }
                dwsg dwsgVar2 = (dwsg) bZ11.b;
                dwsgVar2.c = dqghVar.af;
                dwsgVar2.a |= 2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwsn dwsnVar5 = (dwsn) bZ.b;
            dwsg bK10 = bZ11.bK();
            bK10.getClass();
            dwsnVar5.e = bK10;
            dwsnVar5.d = 7;
        }
        dnqh dnqhVar = this.f;
        if (dnqhVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwsn dwsnVar6 = (dwsn) bZ.b;
            dnqhVar.getClass();
            dwsnVar6.f = dnqhVar;
            dwsnVar6.a |= 1;
        }
        return bZ.bK();
    }

    @Override // defpackage.cgun
    public final void b(@dzsi dspd dspdVar) {
        if (dspdVar == null || dspdVar.u()) {
            this.h = null;
        } else {
            this.h = dspdVar;
        }
    }

    @Override // defpackage.cgun
    public final void c(@dzsi String str) {
        if (dbsj.d(str)) {
            this.i = null;
        } else {
            this.i = str;
        }
    }
}
