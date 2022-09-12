package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bviv  reason: default package */
/* loaded from: classes4.dex */
public final class bviv {
    public static final List<bviu> a = dcdc.e();

    public static List<Integer> a() {
        ArrayList arrayList = new ArrayList();
        for (String str : "".split(",")) {
            String trim = str.trim();
            if (trim.length() > 0) {
                try {
                    dcpe listIterator = ((dcdc) a).listIterator();
                    if (listIterator.hasNext()) {
                        String str2 = ((bviu) listIterator.next()).a;
                        throw null;
                        break;
                    }
                    arrayList.add(Integer.valueOf(Integer.parseInt(trim)));
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        return arrayList;
    }
}
