package defpackage;

import java.io.DataOutputStream;
/* compiled from: PG */
/* renamed from: alwv  reason: default package */
/* loaded from: classes2.dex */
public final class alwv {
    public static final byte[] a = {76, 84, 73, 80, 10};
    public dxcy b;
    @dzsi
    public dxcs c;

    public static void b(String[] strArr, String[] strArr2, int i, DataOutputStream dataOutputStream) {
        dxcx bZ = dxcy.c.bZ();
        if (strArr != null || strArr2 != null) {
            dxcr bZ2 = dxcs.e.bZ();
            for (String str : strArr) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dxcs dxcsVar = (dxcs) bZ2.b;
                str.getClass();
                dsrj<String> dsrjVar = dxcsVar.b;
                if (!dsrjVar.a()) {
                    dxcsVar.b = dsqw.cl(dsrjVar);
                }
                dxcsVar.b.add(str);
            }
            for (String str2 : strArr2) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dxcs dxcsVar2 = (dxcs) bZ2.b;
                str2.getClass();
                dsrj<String> dsrjVar2 = dxcsVar2.c;
                if (!dsrjVar2.a()) {
                    dxcsVar2.c = dsqw.cl(dsrjVar2);
                }
                dxcsVar2.c.add(str2);
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dxcs dxcsVar3 = (dxcs) bZ2.b;
            dxcsVar3.a |= 1;
            dxcsVar3.d = i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxcy dxcyVar = (dxcy) bZ.b;
            dxcs bK = bZ2.bK();
            bK.getClass();
            dxcyVar.b = bK;
            dxcyVar.a |= 4;
        }
        dataOutputStream.write(a);
        bvrs.a(dataOutputStream, bZ.bK());
    }

    @dzsi
    public final dxcs a() {
        dxcy dxcyVar;
        if (this.c == null && (dxcyVar = this.b) != null && (dxcyVar.a & 4) != 0) {
            dxcs dxcsVar = dxcyVar.b;
            if (dxcsVar == null) {
                dxcsVar = dxcs.e;
            }
            this.c = dxcsVar;
        }
        return this.c;
    }
}
