package defpackage;
/* compiled from: PG */
/* renamed from: cluh  reason: default package */
/* loaded from: classes5.dex */
public final class cluh {
    public static void a(long j, cmnk cmnkVar, clvk[] clvkVarArr) {
        int i;
        while (true) {
            boolean z = true;
            if (cmnkVar.d() > 1) {
                int c = c(cmnkVar);
                int c2 = c(cmnkVar);
                int i2 = cmnkVar.b + c2;
                if (c2 == -1 || c2 > cmnkVar.d()) {
                    i2 = cmnkVar.c;
                } else if (c == 4 && c2 >= 8) {
                    int l = cmnkVar.l();
                    int m = cmnkVar.m();
                    if (m == 49) {
                        i = cmnkVar.r();
                        m = 49;
                    } else {
                        i = 0;
                    }
                    int l2 = cmnkVar.l();
                    if (m == 47) {
                        cmnkVar.h(1);
                    }
                    boolean z2 = l == 181 && (m == 49 || m == 47) && l2 == 3;
                    if (m == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        b(j, cmnkVar, clvkVarArr);
                    }
                }
                cmnkVar.f(i2);
            } else {
                return;
            }
        }
    }

    public static void b(long j, cmnk cmnkVar, clvk[] clvkVarArr) {
        int l = cmnkVar.l();
        if ((l & 64) != 0) {
            cmnkVar.h(1);
            int i = (l & 31) * 3;
            int i2 = cmnkVar.b;
            for (clvk clvkVar : clvkVarArr) {
                cmnkVar.f(i2);
                clvkVar.d(cmnkVar, i);
                clvkVar.b(j, 1, i, 0, null);
            }
        }
    }

    private static int c(cmnk cmnkVar) {
        int i = 0;
        while (cmnkVar.d() != 0) {
            int l = cmnkVar.l();
            i += l;
            if (l != 255) {
                return i;
            }
        }
        return -1;
    }
}
