package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cmia  reason: default package */
/* loaded from: classes5.dex */
final class cmia {
    public static cmib a(cmib cmibVar, String[] strArr, Map<String, cmib> map) {
        int length;
        int i = 0;
        if (cmibVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return map.get(strArr[0]);
            }
            if (length2 > 1) {
                cmib cmibVar2 = new cmib();
                while (i < length2) {
                    cmibVar2.d(map.get(strArr[i]));
                    i++;
                }
                return cmibVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            cmibVar.d(map.get(strArr[0]));
            return cmibVar;
        } else if (strArr != null && (length = strArr.length) > 1) {
            while (i < length) {
                cmibVar.d(map.get(strArr[i]));
                i++;
            }
        }
        return cmibVar;
    }
}
