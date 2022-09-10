package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnhr  reason: default package */
/* loaded from: classes3.dex */
public final class bnhr {
    private static final Comparator<dwzu> a = bnhq.a;

    public static String a(Resources resources, List<dwzu> list) {
        dcdc z;
        if (list.isEmpty()) {
            return "";
        }
        if (!dcbg.b(list).q(bnhm.a)) {
            z = dcbg.b(list).o(bnhn.a).s(bnho.a).z();
        } else {
            dcdc A = dcbg.b(list).o(bnhp.a).A(a);
            dccx dccxVar = new dccx();
            int size = A.size();
            String str = null;
            String str2 = null;
            int i = 1;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                dwzu dwzuVar = (dwzu) A.get(i3);
                if (str == null) {
                    str = dwzuVar.d;
                    i2 = dwzuVar.c;
                } else {
                    int i4 = dwzuVar.c;
                    if (i4 - i2 <= 1000) {
                        str2 = dwzuVar.d;
                        i++;
                        i2 = i4;
                    } else {
                        b(dccxVar, str, str2, i, resources);
                        str = dwzuVar.d;
                        i2 = dwzuVar.c;
                        i = 1;
                        str2 = null;
                    }
                }
            }
            if (str != null) {
                b(dccxVar, str, str2, i, resources);
            }
            z = dccxVar.f();
        }
        if (z.isEmpty()) {
            return "";
        }
        String a2 = bvsm.a(z, resources);
        int i5 = 0;
        for (dwzu dwzuVar2 : list) {
            if ((dwzuVar2.a & 4) != 0 && dwzuVar2.d.length() > 0) {
                i5++;
            }
        }
        return resources.getQuantityString(R.plurals.FLOORS, i5, a2);
    }

    private static void b(dccx<String> dccxVar, String str, @dzsi String str2, int i, Resources resources) {
        if (str2 == null) {
            dccxVar.g(str);
        } else if (i < 3) {
            dccxVar.g(str);
            dccxVar.g(str2);
        } else {
            dccxVar.g(resources.getString(R.string.FLOOR_SEQUENCE_SEPARATOR, str, str2));
        }
    }
}
