package defpackage;
/* compiled from: PG */
/* renamed from: bnxy  reason: default package */
/* loaded from: classes3.dex */
public final class bnxy {
    public static dgzz a(dqnn dqnnVar) {
        dgzy dgzyVar;
        dgzy dgzyVar2 = dgzy.MSG_UNSPECIFIED;
        int a = dqnm.a(dqnnVar.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        int i2 = 4;
        if (i == 1) {
            dgzyVar = dgzy.MSG_VALID;
        } else if (i == 2) {
            dgzyVar = dgzy.MSG_INFERRED;
        } else if (i != 3) {
            dgzyVar = i != 4 ? dgzy.MSG_UNSPECIFIED : dgzy.MSG_INCOMPLETE;
        } else {
            dgzyVar = dgzy.MSG_CORRECTIONS;
        }
        int a2 = dqnk.a(dqnnVar.c);
        if (a2 == 0) {
            a2 = 1;
        }
        int i3 = a2 - 1;
        if (i3 == 1) {
            i2 = 3;
        } else if (i3 != 2) {
            i2 = 2;
        }
        dgzw bZ = dgzz.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dgzz) bZ.b).a = dgzyVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dgzz) bZ.b).b = dgzx.a(i2);
        return bZ.bK();
    }

    public static dhad b(dqnr dqnrVar) {
        dhac bZ = dhad.c.bZ();
        dqnx dqnxVar = dqnrVar.b;
        if (dqnxVar == null) {
            dqnxVar = dqnx.d;
        }
        dstm bZ2 = dstn.b.bZ();
        String str = dqnxVar.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        str.getClass();
        ((dstn) bZ2.b).a = str;
        dstn bK = bZ2.bK();
        dhai bZ3 = dhaj.c.bZ();
        dsrj<String> dsrjVar = dqnxVar.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhaj dhajVar = (dhaj) bZ3.b;
        dhajVar.b();
        dsod.bv(dsrjVar, dhajVar.a);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bK.getClass();
        ((dhaj) bZ3.b).b = bK;
        dhaj bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bK2.getClass();
        ((dhad) bZ.b).a = bK2;
        if ((dqnrVar.a & 2) != 0) {
            dqnn dqnnVar = dqnrVar.c;
            if (dqnnVar == null) {
                dqnnVar = dqnn.e;
            }
            dgzz a = a(dqnnVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            a.getClass();
            ((dhad) bZ.b).b = a;
        }
        return bZ.bK();
    }

    public static dqnn c(dgzz dgzzVar) {
        dgzy dgzyVar = dgzy.MSG_UNSPECIFIED;
        dgzy b = dgzy.b(dgzzVar.a);
        if (b == null) {
            b = dgzy.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        int i = 4;
        int i2 = 3;
        int i3 = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 1 : 5 : 4 : 3 : 2;
        int i4 = dgzzVar.b;
        if (i4 == 0) {
            i = 2;
        } else if (i4 == 1) {
            i = 3;
        } else if (i4 != 2) {
            i = 0;
        }
        if (i == 0) {
            i = 1;
        }
        int i5 = i - 2;
        if (i5 == 1) {
            i2 = 2;
        } else if (i5 != 2) {
            i2 = 1;
        }
        dqni bZ = dqnn.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqnn dqnnVar = (dqnn) bZ.b;
        dqnnVar.b = i3 - 1;
        int i6 = dqnnVar.a | 1;
        dqnnVar.a = i6;
        dqnnVar.c = i2 - 1;
        dqnnVar.a = i6 | 2;
        return bZ.bK();
    }
}
