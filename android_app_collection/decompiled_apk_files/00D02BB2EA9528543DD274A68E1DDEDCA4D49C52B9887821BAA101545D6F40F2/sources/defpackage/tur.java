package defpackage;
/* compiled from: PG */
/* renamed from: tur  reason: default package */
/* loaded from: classes7.dex */
public class tur {
    private final trs a;
    private dcdc<tlv> b = dcdc.e();
    private dbsg<tuq> c = dbpy.a;

    public tur(trs trsVar) {
        this.a = trsVar;
    }

    public final void a(dcdc<tlv> dcdcVar) {
        dcqe.b.v(dcqz.MEDIUM);
        dcdcVar.size();
        this.b = dcdcVar;
        this.c = dbpy.a;
    }

    public final void b(tuq tuqVar) {
        this.c = dbsg.i(tuqVar);
    }

    public final cjtd c(cjtd cjtdVar, tlv tlvVar, amve amveVar) {
        int n;
        dbsg<Integer> w = tlvVar.w(amveVar);
        if (w.a() && !this.b.isEmpty() && this.c.a()) {
            int indexOf = tlvVar.m().indexOf(amveVar);
            dcdc<tlv> dcdcVar = this.b;
            int size = dcdcVar.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                tlv tlvVar2 = dcdcVar.get(i);
                if (!tlvVar2.equals(tlvVar)) {
                    if (this.a.a(tlvVar2)) {
                        n = tlvVar2.m().size();
                    } else {
                        n = tlvVar2.n();
                    }
                    i2 += n;
                    i++;
                } else {
                    indexOf = tlvVar2.l().indexOf(amveVar);
                    i2 += indexOf;
                    break;
                }
            }
            ddlx bZ = ddly.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddly ddlyVar = (ddly) bZ.b;
            ddlyVar.a |= 1;
            ddlyVar.b = i2;
            int indexOf2 = this.b.indexOf(tlvVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddly ddlyVar2 = (ddly) bZ.b;
            ddlyVar2.a |= 2;
            ddlyVar2.c = indexOf2;
            ddly bK = bZ.bK();
            boolean z = indexOf >= tlvVar.n();
            ddlt bZ2 = ddlu.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddlu ddluVar = (ddlu) bZ2.b;
            bK.getClass();
            ddluVar.f = bK;
            ddluVar.a |= 16;
            boolean z2 = tlvVar.s() && tlvVar.b() != w.b().intValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddlu ddluVar2 = (ddlu) bZ2.b;
            int i3 = ddluVar2.a | 4;
            ddluVar2.a = i3;
            ddluVar2.d = z2;
            ddluVar2.a = i3 | 2;
            ddluVar2.c = z;
            boolean b = this.c.b().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddlu ddluVar3 = (ddlu) bZ2.b;
            ddluVar3.a |= 8;
            ddluVar3.e = b;
            if (!z) {
                boolean z3 = i2 > this.c.b().a() + (-1);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddlu ddluVar4 = (ddlu) bZ2.b;
                ddluVar4.a |= 1;
                ddluVar4.b = z3;
            }
            cjta c = cjtd.c(cjtdVar);
            ddes bZ3 = ddet.D.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddet ddetVar = (ddet) bZ3.b;
            ddlu bK2 = bZ2.bK();
            bK2.getClass();
            ddetVar.B = bK2;
            ddetVar.b |= 8;
            c.s(bZ3.bK());
            ddlv bZ4 = ddlw.c.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            ddlw ddlwVar = (ddlw) bZ4.b;
            bK.getClass();
            ddlwVar.b = bK;
            ddlwVar.a |= 1;
            ddlw bK3 = bZ4.bK();
            ddeu ddeuVar = c.e;
            if (ddeuVar.c) {
                ddeuVar.bF();
                ddeuVar.c = false;
            }
            ddev ddevVar = (ddev) ddeuVar.b;
            ddev ddevVar2 = ddev.u;
            bK3.getClass();
            ddevVar.r = bK3;
            ddevVar.a |= 67108864;
            return c.a();
        }
        return cjtdVar;
    }
}
