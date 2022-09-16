package defpackage;

import android.media.MediaDrm;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: pnr  reason: default package */
/* loaded from: classes4.dex */
public final class pnr {
    public static int a(Throwable th) {
        return phk.b(pxi.f(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }

    public static boolean b(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static pue d(pue pueVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (pueVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (pue) map.get(strArr[0]);
            }
            if (length2 > 1) {
                pue pueVar2 = new pue();
                while (i < length2) {
                    pueVar2.d((pue) map.get(strArr[i]));
                    i++;
                }
                return pueVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            pueVar.d((pue) map.get(strArr[0]));
            return pueVar;
        } else if (strArr != null && (length = strArr.length) > 1) {
            while (i < length) {
                pueVar.d((pue) map.get(strArr[i]));
                i++;
            }
        }
        return pueVar;
    }

    private static long e(Map map, String str) {
        try {
            String str2 = (String) map.get(str);
            if (str2 == null) {
                return -9223372036854775807L;
            }
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair c(pne pneVar) {
        pej pejVar = (pej) pneVar;
        byte[] bArr = pejVar.j;
        HashMap<String, String> queryKeyStatus = bArr == null ? null : ((pob) pejVar.a).b.queryKeyStatus(bArr);
        if (queryKeyStatus == null) {
            return null;
        }
        return new Pair(Long.valueOf(e(queryKeyStatus, "LicenseDurationRemaining")), Long.valueOf(e(queryKeyStatus, "PlaybackDurationRemaining")));
    }
}
