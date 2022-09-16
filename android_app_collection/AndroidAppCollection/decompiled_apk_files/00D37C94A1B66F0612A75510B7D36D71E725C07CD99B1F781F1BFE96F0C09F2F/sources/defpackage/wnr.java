package defpackage;

import java.io.Serializable;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: wnr  reason: default package */
/* loaded from: classes4.dex */
final class wnr implements Comparator, Serializable {
    private static final long serialVersionUID = 1;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int d;
        aoyb aoybVar = (aoyb) obj;
        aoyb aoybVar2 = (aoyb) obj2;
        int d2 = aoyt.d(aoybVar.d);
        if ((d2 != 0 && d2 == 2) || ((d = aoyt.d(aoybVar2.d)) != 0 && d == 2)) {
            int d3 = aoyt.d(aoybVar.d);
            if (d3 != 0 && d3 == 2) {
                return -1;
            }
        } else {
            int d4 = aoyt.d(aoybVar.d);
            if (d4 == 0 || d4 != 4) {
                int d5 = aoyt.d(aoybVar2.d);
                if (d5 == 0 || d5 != 4) {
                    return aoybVar.b - aoybVar2.b;
                }
                return -1;
            }
            int d6 = aoyt.d(aoybVar2.d);
            if (d6 != 0 && d6 == 4) {
                return 0;
            }
        }
        return 1;
    }
}
