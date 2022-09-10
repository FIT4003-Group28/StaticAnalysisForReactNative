package defpackage;
/* compiled from: PG */
/* renamed from: anar  reason: default package */
/* loaded from: classes2.dex */
public final class anar {
    public static boolean a(dmpn dmpnVar) {
        dnbc v = akxf.v(dmpnVar);
        if (v == null || (v.a & 1) == 0) {
            return false;
        }
        dnpo dnpoVar = v.b;
        if (dnpoVar == null) {
            dnpoVar = dnpo.t;
        }
        return !new dsrh(dnpoVar.d, dnpo.e).contains(dnow.MINOR_RESULT) || !akxf.s(dmpnVar).equals(dnbv.c);
    }

    public static dnpo b(dmpn dmpnVar, int i, dnpn dnpnVar) {
        dnbc v = akxf.v(dmpnVar);
        dbsk.s(v);
        dnpo dnpoVar = v.b;
        if (dnpoVar == null) {
            dnpoVar = dnpo.t;
        }
        dnbv s = akxf.s(dmpnVar);
        dnox ca = dnpo.t.ca(dnpoVar);
        long b = akxf.b(dmpnVar);
        if (b != 0) {
            String valueOf = String.valueOf(Long.toHexString(b));
            String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnpo dnpoVar2 = (dnpo) ca.b;
            concat.getClass();
            dnpoVar2.a |= 1;
            dnpoVar2.b = concat;
        } else {
            String valueOf2 = String.valueOf(Long.toHexString(akqi.a.c));
            String concat2 = valueOf2.length() != 0 ? "0x".concat(valueOf2) : new String("0x");
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnpo dnpoVar3 = (dnpo) ca.b;
            concat2.getClass();
            dnpoVar3.a |= 1;
            dnpoVar3.b = concat2;
        }
        if ((s.a & 1) != 0) {
            dndc dndcVar = s.b;
            if (dndcVar == null) {
                dndcVar = dndc.f;
            }
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnpo dnpoVar4 = (dnpo) ca.b;
            dndcVar.getClass();
            dnpoVar4.c = dndcVar;
            dnpoVar4.a |= 2;
        }
        if (i == 1) {
            dnpo dnpoVar5 = (dnpo) ca.b;
            dnpoVar5.a &= -5;
            dnpoVar5.h = 1;
        } else {
            dnpo dnpoVar6 = (dnpo) ca.b;
            dnpoVar6.h = i;
            dnpoVar6.a |= 4;
        }
        if (dnpnVar == dnpn.UNKNOWN_REASON) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnpo dnpoVar7 = (dnpo) ca.b;
            dnpoVar7.a &= -9;
            dnpoVar7.i = 0;
        } else {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dnpo dnpoVar8 = (dnpo) ca.b;
            dnpoVar8.i = dnpnVar.c;
            dnpoVar8.a |= 8;
        }
        return ca.bK();
    }
}
