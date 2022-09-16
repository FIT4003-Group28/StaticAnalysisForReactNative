package defpackage;
/* compiled from: PG */
/* renamed from: clvp  reason: default package */
/* loaded from: classes5.dex */
public final class clvp {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static clvm b(cmnk cmnkVar, boolean z, boolean z2) {
        if (z) {
            c(3, cmnkVar, false);
        }
        cmnkVar.y((int) cmnkVar.q());
        long q = cmnkVar.q();
        String[] strArr = new String[(int) q];
        for (int i = 0; i < q; i++) {
            strArr[i] = cmnkVar.y((int) cmnkVar.q());
        }
        if (!z2 || (cmnkVar.l() & 1) != 0) {
            return new clvm(strArr);
        }
        throw new clob("framing bit expected to be set");
    }

    public static boolean c(int i, cmnk cmnkVar, boolean z) {
        if (cmnkVar.d() < 7) {
            if (z) {
                return false;
            }
            int d = cmnkVar.d();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(d);
            throw new clob(sb.toString());
        } else if (cmnkVar.l() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new clob(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (cmnkVar.l() == 118 && cmnkVar.l() == 111 && cmnkVar.l() == 114 && cmnkVar.l() == 98 && cmnkVar.l() == 105 && cmnkVar.l() == 115) {
            return true;
        } else {
            if (!z) {
                throw new clob("expected characters 'vorbis'");
            }
            return false;
        }
    }
}
