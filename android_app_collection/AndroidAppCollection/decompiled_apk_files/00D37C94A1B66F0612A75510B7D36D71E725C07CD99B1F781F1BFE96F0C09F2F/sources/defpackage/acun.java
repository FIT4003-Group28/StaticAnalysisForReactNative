package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: acun  reason: default package */
/* loaded from: classes.dex */
public final class acun {
    @Deprecated
    public static acum a(awbs awbsVar) {
        return new acum(awbsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9, types: [aoob] */
    public static asvv b(aoqu aoquVar) {
        aoob aoobVar;
        if (aoquVar == 0) {
            return null;
        }
        aqxo.q(true, "fieldNumber must be > 0");
        aoog O = aoog.O(aoquVar.toByteArray());
        while (!O.E()) {
            try {
                int n = O.n();
                int a = aosl.a(n);
                int b = aosl.b(n);
                if (a != 999 || b != 2) {
                    O.G(n);
                } else {
                    aoquVar = O.x();
                    aoobVar = aoquVar;
                    break;
                }
            } catch (IOException unused) {
                String valueOf = String.valueOf(aoquVar.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Error while getting field 999 from ");
                sb.append(valueOf);
                zep.l(sb.toString());
            }
        }
        aoobVar = null;
        if (aoobVar == null) {
            return null;
        }
        try {
            return (asvv) aopi.parseFrom(asvv.b, aoobVar, aoos.b());
        } catch (aopx unused2) {
            return null;
        }
    }

    public static String c(aacz aaczVar) {
        apyy b = aaczVar.b();
        if (b != null) {
            atfw atfwVar = b.k;
            if (atfwVar == null) {
                atfwVar = atfw.a;
            }
            aqju aqjuVar = atfwVar.t;
            if (aqjuVar == null) {
                aqjuVar = aqju.a;
            }
            aswg aswgVar = aqjuVar.b;
            if (aswgVar == null) {
                aswgVar = aswg.a;
            }
            if (aswgVar.c.isEmpty()) {
                return "https://www.youtube.com/csi_204";
            }
            atfw atfwVar2 = b.k;
            if (atfwVar2 == null) {
                atfwVar2 = atfw.a;
            }
            aqju aqjuVar2 = atfwVar2.t;
            if (aqjuVar2 == null) {
                aqjuVar2 = aqju.a;
            }
            aswg aswgVar2 = aqjuVar2.b;
            if (aswgVar2 == null) {
                aswgVar2 = aswg.a;
            }
            return aswgVar2.c;
        }
        return "https://www.youtube.com/csi_204";
    }
}
