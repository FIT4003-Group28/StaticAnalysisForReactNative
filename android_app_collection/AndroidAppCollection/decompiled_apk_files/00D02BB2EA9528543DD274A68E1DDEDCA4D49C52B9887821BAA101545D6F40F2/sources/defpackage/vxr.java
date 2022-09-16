package defpackage;
/* compiled from: PG */
/* renamed from: vxr  reason: default package */
/* loaded from: classes7.dex */
public enum vxr {
    DEPARTURE_TIME,
    ARRIVAL_TIME,
    LAST_AVAILABLE;

    public static vxr a(dwao dwaoVar) {
        int i = 1;
        if ((dwaoVar.a & 1073741824) == 0) {
            dwbk dwbkVar = dwaoVar.f;
            if (dwbkVar == null) {
                dwbkVar = dwbk.s;
            }
            if ((dwbkVar.a & 2048) == 0) {
                dwbk dwbkVar2 = dwaoVar.f;
                if (dwbkVar2 == null) {
                    dwbkVar2 = dwbk.s;
                }
                int a = dqvd.a(dwbkVar2.b);
                if (a == 0) {
                    a = 1001;
                }
                int i2 = a - 1;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return ARRIVAL_TIME;
                    }
                    if (i2 == 2) {
                        return LAST_AVAILABLE;
                    }
                }
                return DEPARTURE_TIME;
            }
        }
        dwbk dwbkVar3 = dwaoVar.f;
        if (dwbkVar3 == null) {
            dwbkVar3 = dwbk.s;
        }
        int a2 = dqvf.a(dwbkVar3.k);
        if (a2 == 0 || a2 != 6) {
            dosz doszVar = dwaoVar.B;
            if (doszVar == null) {
                doszVar = dosz.e;
            }
            int a3 = dquo.a(doszVar.b);
            if (a3 != 0) {
                i = a3;
            }
            return i + (-1) != 0 ? ARRIVAL_TIME : DEPARTURE_TIME;
        }
        return LAST_AVAILABLE;
    }
}
