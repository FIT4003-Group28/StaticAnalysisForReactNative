package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: dad  reason: default package */
/* loaded from: classes5.dex */
public abstract class dad {
    public static dad h(dsze dszeVar, dfla dflaVar, double d) {
        return new dac(dszeVar, dflaVar, d);
    }

    public abstract dsze a();

    public abstract dfla b();

    public abstract double c();

    public abstract int d();

    public final dsza e() {
        dsza dszaVar = a().b;
        return dszaVar == null ? dsza.e : dszaVar;
    }

    public final akqq f() {
        dsza e = e();
        return new akqq(e.b, e.c);
    }

    public final dszc g() {
        dszc dszcVar = a().c;
        return dszcVar == null ? dszc.e : dszcVar;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[11];
        objArr[0] = Double.valueOf(e().b);
        objArr[1] = Double.valueOf(e().c);
        objArr[2] = Double.valueOf(e().d);
        objArr[3] = Double.valueOf(g().c);
        objArr[4] = Double.valueOf(g().b);
        objArr[5] = Double.valueOf(g().d);
        objArr[6] = Double.valueOf(c());
        objArr[7] = Double.valueOf(b().d);
        objArr[8] = Double.valueOf(b().c);
        int a = dfkz.a(b().b);
        if (a == 0) {
            a = 1;
        }
        objArr[9] = Integer.toString(a - 1);
        int d = d();
        objArr[10] = d != 1 ? d != 2 ? "null" : "VPS" : "FUSED";
        return String.format(locale, "Position: (%.2f, %.2f, %.0fm)\nOrientation: (%.0f°, %.0f°, %.0f°)\nHeading: %f\nConfidence: (%.0fm, %.0f°, %s)\nSource: %s", objArr);
    }
}
