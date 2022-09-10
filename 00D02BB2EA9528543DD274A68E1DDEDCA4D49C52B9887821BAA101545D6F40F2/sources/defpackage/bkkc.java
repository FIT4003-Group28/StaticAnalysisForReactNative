package defpackage;

import android.util.Base64;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bkkc  reason: default package */
/* loaded from: classes3.dex */
public final class bkkc {
    public static dtbq a(String str) {
        dbsk.s(str);
        byte[] decode = Base64.decode(str, 10);
        try {
            dtbq dtbqVar = (dtbq) dsqw.cr(dtbq.g, decode, dsqa.c());
            if (!d(dtbqVar, decode)) {
                throw new IllegalArgumentException("The place id is not normalized");
            }
            return dtbqVar;
        } catch (dsrm e) {
            throw new IllegalArgumentException("Could not parse place id into a proto", e);
        }
    }

    public static String b(dtbq dtbqVar) {
        boolean z = true;
        if (1 != (dtbqVar.a & 1)) {
            z = false;
        }
        dbsk.a(z);
        byte[] bS = dtbqVar.bS();
        if (!d(dtbqVar, bS)) {
            throw new IllegalArgumentException("The place id is not normalized");
        }
        return Base64.encodeToString(bS, 11);
    }

    public static String c(akqi akqiVar) {
        dtbp dtbpVar = (dtbp) dtbq.g.bZ();
        dgrh h = akqiVar.h();
        if (dtbpVar.c) {
            dtbpVar.bF();
            dtbpVar.c = false;
        }
        dtbq dtbqVar = (dtbq) dtbpVar.b;
        h.getClass();
        dtbqVar.b = h;
        dtbqVar.a |= 1;
        if (!dbsj.d(null)) {
            if (dtbpVar.c) {
                dtbpVar.bF();
                dtbpVar.c = false;
            }
            dtbq dtbqVar2 = (dtbq) dtbpVar.b;
            throw null;
        }
        return b((dtbq) dtbpVar.bK());
    }

    private static boolean d(dtbq dtbqVar, byte[] bArr) {
        dtbp dtbpVar = (dtbp) dtbq.g.bZ();
        dgrh dgrhVar = dtbqVar.b;
        if (dgrhVar == null) {
            dgrhVar = dgrh.d;
        }
        if (dtbpVar.c) {
            dtbpVar.bF();
            dtbpVar.c = false;
        }
        dtbq dtbqVar2 = (dtbq) dtbpVar.b;
        dgrhVar.getClass();
        dtbqVar2.b = dgrhVar;
        dtbqVar2.a |= 1;
        if (!dtbqVar.c.isEmpty()) {
            String str = dtbqVar.c;
            if (dtbpVar.c) {
                dtbpVar.bF();
                dtbpVar.c = false;
            }
            dtbq dtbqVar3 = (dtbq) dtbpVar.b;
            str.getClass();
            dtbqVar3.a |= 2;
            dtbqVar3.c = str;
        }
        return Arrays.equals(((dtbq) dtbpVar.bK()).bS(), bArr);
    }
}
