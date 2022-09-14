package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaop  reason: default package */
/* loaded from: classes.dex */
public abstract class eaop implements Serializable {
    private static final long serialVersionUID = -42615285973990L;
    public final String z;
    public static final eaop c = new eaoo("era", (byte) 1, eaoz.a, null);
    public static final eaop d = new eaoo("yearOfEra", (byte) 2, eaoz.d, eaoz.a);
    public static final eaop e = new eaoo("centuryOfEra", (byte) 3, eaoz.b, eaoz.a);
    public static final eaop f = new eaoo("yearOfCentury", (byte) 4, eaoz.d, eaoz.b);
    public static final eaop g = new eaoo("year", (byte) 5, eaoz.d, null);
    public static final eaop h = new eaoo("dayOfYear", (byte) 6, eaoz.g, eaoz.d);
    public static final eaop i = new eaoo("monthOfYear", (byte) 7, eaoz.e, eaoz.d);
    public static final eaop j = new eaoo("dayOfMonth", (byte) 8, eaoz.g, eaoz.e);
    public static final eaop k = new eaoo("weekyearOfCentury", (byte) 9, eaoz.c, eaoz.b);
    public static final eaop l = new eaoo("weekyear", (byte) 10, eaoz.c, null);
    public static final eaop m = new eaoo("weekOfWeekyear", (byte) 11, eaoz.f, eaoz.c);
    public static final eaop n = new eaoo("dayOfWeek", (byte) 12, eaoz.g, eaoz.f);
    public static final eaop o = new eaoo("halfdayOfDay", (byte) 13, eaoz.h, eaoz.g);
    public static final eaop p = new eaoo("hourOfHalfday", (byte) 14, eaoz.i, eaoz.h);
    public static final eaop q = new eaoo("clockhourOfHalfday", (byte) 15, eaoz.i, eaoz.h);
    public static final eaop r = new eaoo("clockhourOfDay", (byte) 16, eaoz.i, eaoz.g);
    public static final eaop s = new eaoo("hourOfDay", (byte) 17, eaoz.i, eaoz.g);
    public static final eaop t = new eaoo("minuteOfDay", (byte) 18, eaoz.j, eaoz.g);
    public static final eaop u = new eaoo("minuteOfHour", (byte) 19, eaoz.j, eaoz.i);
    public static final eaop v = new eaoo("secondOfDay", (byte) 20, eaoz.k, eaoz.g);
    public static final eaop w = new eaoo("secondOfMinute", (byte) 21, eaoz.k, eaoz.j);
    public static final eaop x = new eaoo("millisOfDay", (byte) 22, eaoz.l, eaoz.g);
    public static final eaop y = new eaoo("millisOfSecond", (byte) 23, eaoz.l, eaoz.k);

    /* JADX INFO: Access modifiers changed from: protected */
    public eaop(String str) {
        this.z = str;
    }

    public abstract eaoz a();

    public abstract eaoz b();

    public abstract eaon c(eaok eaokVar);

    public final String toString() {
        return this.z;
    }
}
