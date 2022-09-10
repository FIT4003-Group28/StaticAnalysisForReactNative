package defpackage;
/* compiled from: PG */
/* renamed from: cmau  reason: default package */
/* loaded from: classes5.dex */
final class cmau {
    public static cmas a(cluk clukVar) {
        byte[] bArr;
        cmnk cmnkVar = new cmnk(16);
        if (cmat.a(clukVar, cmnkVar).a == 1380533830) {
            clukVar.f(cmnkVar.a, 0, 4);
            cmnkVar.f(0);
            int r = cmnkVar.r();
            if (r != 1463899717) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unsupported RIFF format: ");
                sb.append(r);
                sb.toString();
                return null;
            }
            cmat a = cmat.a(clukVar, cmnkVar);
            while (a.a != 1718449184) {
                clukVar.h((int) a.b);
                a = cmat.a(clukVar, cmnkVar);
            }
            cmmn.c(a.b >= 16);
            clukVar.f(cmnkVar.a, 0, 16);
            cmnkVar.f(0);
            int n = cmnkVar.n();
            int n2 = cmnkVar.n();
            int w = cmnkVar.w();
            cmnkVar.w();
            int n3 = cmnkVar.n();
            int n4 = cmnkVar.n();
            int i = ((int) a.b) - 16;
            if (i > 0) {
                byte[] bArr2 = new byte[i];
                clukVar.f(bArr2, 0, i);
                bArr = bArr2;
            } else {
                bArr = cmny.f;
            }
            return new cmas(n, n2, w, n3, n4, bArr);
        }
        return null;
    }
}
