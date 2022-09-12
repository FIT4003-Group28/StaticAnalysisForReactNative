package defpackage;
/* compiled from: PG */
/* renamed from: amuc  reason: default package */
/* loaded from: classes2.dex */
public final class amuc {
    public static amvh[] a(amvh[] amvhVarArr) {
        int i = 0;
        for (amvh amvhVar : amvhVarArr) {
            if (amvhVar.y) {
                i++;
            }
        }
        amvh[] amvhVarArr2 = new amvh[amvhVarArr.length - i];
        int i2 = 0;
        for (amvh amvhVar2 : amvhVarArr) {
            if (!amvhVar2.y) {
                amvhVarArr2[i2] = amvhVar2;
                i2++;
            }
        }
        return amvhVarArr2;
    }

    public static amvh[] b(amvh[] amvhVarArr, dpjp dpjpVar) {
        dpal dpalVar = dpjpVar.b;
        if (dpalVar == null) {
            dpalVar = dpal.e;
        }
        dpjn dpjnVar = dpalVar.b;
        if (dpjnVar == null) {
            dpjnVar = dpjn.m;
        }
        if ((dpjnVar.a & 1) != 0) {
            int length = amvhVarArr.length;
            int i = length + 1;
            amvh[] amvhVarArr2 = new amvh[i];
            int i2 = length - 1;
            System.arraycopy(amvhVarArr, 0, amvhVarArr2, 0, i2);
            dpal dpalVar2 = dpjpVar.b;
            if (dpalVar2 == null) {
                dpalVar2 = dpal.e;
            }
            dpjn dpjnVar2 = dpalVar2.b;
            if (dpjnVar2 == null) {
                dpjnVar2 = dpjn.m;
            }
            dpjx dpjxVar = dpjnVar2.b;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            amvhVarArr2[i - 2] = amvh.N(dpjxVar);
            amvhVarArr2[i - 1] = amvhVarArr[i2];
            return amvhVarArr2;
        }
        return amvhVarArr;
    }
}
