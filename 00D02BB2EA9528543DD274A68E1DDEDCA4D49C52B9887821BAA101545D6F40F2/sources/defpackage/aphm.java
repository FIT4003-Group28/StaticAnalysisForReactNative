package defpackage;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aphm  reason: default package */
/* loaded from: classes2.dex */
public final class aphm {
    public static dcdc<aoxt> a(List<aoxt> list, aoxr aoxrVar) {
        Comparator g;
        aoxr aoxrVar2 = aoxr.LAST_VISIT_TIME;
        int ordinal = aoxrVar.ordinal();
        if (ordinal == 0) {
            g = dcmw.a.g(aphl.a);
        } else if (ordinal == 2) {
            g = dclu.d(Collator.getInstance(Locale.getDefault())).g(aphk.a);
        } else {
            String valueOf = String.valueOf(aoxrVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Unexpected sorting: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return dcdc.w(g, list);
    }
}
