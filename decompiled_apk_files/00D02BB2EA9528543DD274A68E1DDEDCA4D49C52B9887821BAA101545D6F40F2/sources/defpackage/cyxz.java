package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: cyxz  reason: default package */
/* loaded from: classes5.dex */
public final class cyxz {
    public static final Comparator<cyft> a = new cyxx();
    public static final Comparator<cyft> b = new cyxy();

    public static String a(Iterable<String> iterable) {
        return dbrz.e(";").g(dcfc.R(dcln.a, iterable));
    }

    public static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }
}
