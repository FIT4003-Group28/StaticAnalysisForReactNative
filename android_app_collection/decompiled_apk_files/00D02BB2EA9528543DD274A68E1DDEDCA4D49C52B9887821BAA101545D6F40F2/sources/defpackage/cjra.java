package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cjra  reason: default package */
/* loaded from: classes.dex */
public final class cjra {
    private static final dcqe a = dcqe.c("cjra");

    public static String a(String str, int i) {
        String valueOf = String.valueOf(i);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }

    public static String b(ddxz ddxzVar) {
        ddyb ddybVar = ddxzVar.b;
        if (ddybVar == null) {
            ddybVar = ddyb.e;
        }
        String d = d(ddybVar);
        if ((ddxzVar.a & 2) != 0) {
            String valueOf = String.valueOf(d);
            long j = ddxzVar.c;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append(valueOf);
            sb.append(":");
            sb.append(j);
            return sb.toString();
        }
        return d;
    }

    @dzsi
    public static ddyb c(String str) {
        if (dbsj.d(str)) {
            return null;
        }
        ddya bZ = ddyb.e.bZ();
        try {
            dspj J = dspj.J(ddae.e.j(str));
            long j = ((J.j() & 4294967295L) * 1000000) + J.h();
            int h = J.h();
            int i = (h & 16777215) | ((((h >> 24) + 10) & 255) << 24);
            int h2 = J.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddyb ddybVar = (ddyb) bZ.b;
            int i2 = ddybVar.a | 1;
            ddybVar.a = i2;
            ddybVar.b = j;
            int i3 = i2 | 2;
            ddybVar.a = i3;
            ddybVar.c = i;
            ddybVar.a = i3 | 4;
            ddybVar.d = h2;
            return bZ.bK();
        } catch (IOException | IllegalArgumentException unused) {
            return null;
        }
    }

    public static String d(ddyb ddybVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dspp B = dspp.B(byteArrayOutputStream);
        try {
            long j = ddybVar.b;
            B.t((int) (j / 1000000));
            B.r((int) (j % 1000000));
            B.s(ddybVar.c - 167772160);
            B.s(ddybVar.d);
            B.y();
        } catch (IOException e) {
            bvoo.h("EventIdMessage couldn't be encoded %s", e);
        }
        return ddae.e.h().i(byteArrayOutputStream.toByteArray());
    }

    @dzsi
    public static ddxz e(@dzsi String str) {
        String[] split;
        int length;
        if (!dbsj.d(str) && (length = (split = str.split(":")).length) <= 2) {
            ddxy bZ = ddxz.d.bZ();
            if (!dbsj.d(split[0])) {
                ddyb c = c(split[0]);
                if (c == null) {
                    return null;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddxz ddxzVar = (ddxz) bZ.b;
                c.getClass();
                ddxzVar.b = c;
                ddxzVar.a |= 1;
            }
            if (length == 2 && !split[1].isEmpty()) {
                try {
                    long parseInt = Integer.parseInt(split[1]);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxz ddxzVar2 = (ddxz) bZ.b;
                    ddxzVar2.a |= 2;
                    ddxzVar2.c = parseInt;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            return bZ.bK();
        }
        return null;
    }
}
