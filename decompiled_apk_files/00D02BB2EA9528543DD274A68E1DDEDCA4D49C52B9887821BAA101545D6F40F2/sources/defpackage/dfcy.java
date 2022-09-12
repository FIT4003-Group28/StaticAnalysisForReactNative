package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dfcy  reason: default package */
/* loaded from: classes6.dex */
public final class dfcy {
    public static final ddyb a;
    private static final Charset b;
    private final dfdl c;
    private final dfdr d;

    static {
        ddya bZ = ddyb.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyb ddybVar = (ddyb) bZ.b;
        int i = ddybVar.a | 1;
        ddybVar.a = i;
        ddybVar.b = 0L;
        int i2 = i | 2;
        ddybVar.a = i2;
        ddybVar.c = 0;
        ddybVar.a = i2 | 4;
        ddybVar.d = 0;
        a = bZ.bK();
        b = Charset.forName("UTF-8");
    }

    public dfcy(String str, int i, String str2, int i2) {
        dfdk bZ = dfdl.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfdl dfdlVar = (dfdl) bZ.b;
        str.getClass();
        int i3 = dfdlVar.a | 2;
        dfdlVar.a = i3;
        dfdlVar.c = str;
        int i4 = i3 | 1;
        dfdlVar.a = i4;
        dfdlVar.b = i;
        if (str2 != null) {
            str2.getClass();
            dfdlVar.a = i4 | 4;
            dfdlVar.d = str2;
        }
        this.c = bZ.bK();
        dfdp bZ2 = dfdr.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfdr dfdrVar = (dfdr) bZ2.b;
        dfdrVar.b = 3;
        dfdrVar.a |= 1;
        this.d = bZ2.bK();
    }

    @dzsi
    public static <T> T a(dcrj dcrjVar, dcqy<T> dcqyVar) {
        return (T) dcrjVar.l().e(dcqyVar);
    }

    public static String b(dcrj dcrjVar) {
        dcsl h = dcrjVar.h();
        if (h != null) {
            return h.b;
        }
        Object j = dcrjVar.j();
        if (j instanceof String) {
            return (String) j;
        }
        return j != null ? j.getClass().getName() : "null";
    }

    public static int c(dcrj dcrjVar) {
        return dczq.a.a(b(dcrjVar), b).c();
    }

    public final dfdm d(ddyw ddywVar, int i, long j, Object... objArr) {
        dfdm bZ = dfdo.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfdo dfdoVar = (dfdo) bZ.b;
        dfdoVar.b = i - 1;
        int i2 = dfdoVar.a | 1;
        dfdoVar.a = i2;
        dfdoVar.a = i2 | 2;
        dfdoVar.c = j;
        dfdi bZ2 = dfdj.d.bZ();
        dfdl dfdlVar = this.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfdj dfdjVar = (dfdj) bZ2.b;
        dfdlVar.getClass();
        dfdjVar.b = dfdlVar;
        int i3 = dfdjVar.a | 1;
        dfdjVar.a = i3;
        dfdr dfdrVar = this.d;
        dfdrVar.getClass();
        dfdjVar.c = dfdrVar;
        dfdjVar.a = i3 | 2;
        dfdj bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfdo dfdoVar2 = (dfdo) bZ.b;
        bK.getClass();
        dfdoVar2.d = bK;
        int i4 = dfdoVar2.a | 4;
        dfdoVar2.a = i4;
        ddywVar.getClass();
        dfdoVar2.e = ddywVar;
        dfdoVar2.a = i4 | 8;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj instanceof dfcx) {
                dfcx dfcxVar = (dfcx) obj;
                int i6 = dfcxVar.a;
                dfds bZ3 = dfdt.d.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dfdt dfdtVar = (dfdt) bZ3.b;
                dfdtVar.a |= 1;
                dfdtVar.b = i5;
                String dfcxVar2 = dfcxVar.toString();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dfdt dfdtVar2 = (dfdt) bZ3.b;
                dfcxVar2.getClass();
                dfdtVar2.a |= 2;
                dfdtVar2.c = dfcxVar2;
                dfdt bK2 = bZ3.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfdo dfdoVar3 = (dfdo) bZ.b;
                bK2.getClass();
                dsrj<dfdt> dsrjVar = dfdoVar3.f;
                if (!dsrjVar.a()) {
                    dfdoVar3.f = dsqw.cl(dsrjVar);
                }
                dfdoVar3.f.add(bK2);
            }
        }
        return bZ;
    }
}
