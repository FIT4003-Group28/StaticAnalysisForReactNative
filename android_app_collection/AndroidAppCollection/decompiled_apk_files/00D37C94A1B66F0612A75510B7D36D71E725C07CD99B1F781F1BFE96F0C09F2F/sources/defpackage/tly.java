package defpackage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tly  reason: default package */
/* loaded from: classes4.dex */
public final class tly {
    public static tkk a(tju tjuVar) {
        return new tkn(tjuVar);
    }

    public static tkk b(String str) {
        return new tkm(str);
    }

    public static tkk c(tju tjuVar, Set set) {
        return new tkp(tjuVar, set);
    }

    public static tkk d(tju tjuVar, DecimalFormat decimalFormat) {
        return new tko(tjuVar, decimalFormat, 1);
    }

    public static tkk e(tju tjuVar) {
        return f(tjuVar, null);
    }

    public static tkk f(tju tjuVar, Set set) {
        return new tkp(tjuVar, set, 1);
    }

    public static tkk g(final tju tjuVar, final Set set, final boolean z) {
        return new tkk() { // from class: tkl
            @Override // defpackage.tkk
            public final String a(Map map) {
                tju tjuVar2 = tju.this;
                Set set2 = set;
                boolean z2 = z;
                Iterable<Number> j = tly.j(map.get(tjuVar2));
                if (set2 != null) {
                    j = tly.i(j, set2, z2);
                }
                if (j == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (Number number : j) {
                    if (number.longValue() != 0) {
                        sb.append(number);
                    }
                    sb.append(",");
                }
                return sb.substring(0, sb.length() - 1);
            }
        };
    }

    public static tkk h(tju tjuVar, DecimalFormat decimalFormat) {
        return new tko(tjuVar, decimalFormat);
    }

    public static amuk i(Iterable iterable, Set set, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (iterable == null) {
            return null;
        }
        int i = 0;
        if (z) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                if (set.contains(Integer.valueOf(i))) {
                    arrayList.add(number);
                }
                i++;
            }
        } else {
            Iterator it2 = iterable.iterator();
            long j = 0;
            while (it2.hasNext()) {
                Number number2 = (Number) it2.next();
                if (set.contains(Integer.valueOf(i))) {
                    arrayList.add(Long.valueOf(j + number2.longValue()));
                    j = 0;
                } else {
                    j += number2.longValue();
                }
                i++;
            }
        }
        return amuk.o(arrayList);
    }

    public static Iterable j(Object obj) {
        if (obj instanceof Object[]) {
            return Arrays.asList((Number[]) obj);
        }
        if (!(obj instanceof Iterable)) {
            return null;
        }
        return (Iterable) obj;
    }
}
