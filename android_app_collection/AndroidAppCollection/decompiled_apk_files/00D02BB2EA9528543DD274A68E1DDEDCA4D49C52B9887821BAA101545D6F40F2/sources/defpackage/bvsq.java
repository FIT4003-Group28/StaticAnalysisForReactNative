package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bvsq  reason: default package */
/* loaded from: classes4.dex */
public abstract class bvsq {
    public static bvsq d(bvsp bvspVar, int i) {
        return new bvsh(bvspVar, i);
    }

    public abstract bvsp a();

    public abstract int b();

    public final String c() {
        if (a() == bvsp.MILES_P1 || a() == bvsp.KILOMETERS_P1) {
            Locale locale = Locale.getDefault();
            double b = b();
            Double.isNaN(b);
            return String.format(locale, "%.1f", Double.valueOf(b / 1000.0d));
        }
        return String.format(Locale.getDefault(), "%,d", Integer.valueOf(b() / 1000));
    }
}
