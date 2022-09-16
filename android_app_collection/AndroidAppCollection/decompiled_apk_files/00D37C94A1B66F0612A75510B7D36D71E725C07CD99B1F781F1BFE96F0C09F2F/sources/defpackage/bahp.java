package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bahp  reason: default package */
/* loaded from: classes2.dex */
public abstract class bahp implements Serializable {
    private static final long serialVersionUID = -42615285973990L;
    public final String z;
    public static final bahp c = new baho("era", (byte) 1, bahx.a, null);
    public static final bahp d = new baho("yearOfEra", (byte) 2, bahx.d, bahx.a);
    public static final bahp e = new baho("centuryOfEra", (byte) 3, bahx.b, bahx.a);
    public static final bahp f = new baho("yearOfCentury", (byte) 4, bahx.d, bahx.b);
    public static final bahp g = new baho("year", (byte) 5, bahx.d, null);
    public static final bahp h = new baho("dayOfYear", (byte) 6, bahx.g, bahx.d);
    public static final bahp i = new baho("monthOfYear", (byte) 7, bahx.e, bahx.d);
    public static final bahp j = new baho("dayOfMonth", (byte) 8, bahx.g, bahx.e);
    public static final bahp k = new baho("weekyearOfCentury", (byte) 9, bahx.c, bahx.b);
    public static final bahp l = new baho("weekyear", (byte) 10, bahx.c, null);
    public static final bahp m = new baho("weekOfWeekyear", (byte) 11, bahx.f, bahx.c);
    public static final bahp n = new baho("dayOfWeek", (byte) 12, bahx.g, bahx.f);
    public static final bahp o = new baho("halfdayOfDay", (byte) 13, bahx.h, bahx.g);
    public static final bahp p = new baho("hourOfHalfday", (byte) 14, bahx.i, bahx.h);
    public static final bahp q = new baho("clockhourOfHalfday", (byte) 15, bahx.i, bahx.h);
    public static final bahp r = new baho("clockhourOfDay", (byte) 16, bahx.i, bahx.g);
    public static final bahp s = new baho("hourOfDay", (byte) 17, bahx.i, bahx.g);
    public static final bahp t = new baho("minuteOfDay", (byte) 18, bahx.j, bahx.g);
    public static final bahp u = new baho("minuteOfHour", (byte) 19, bahx.j, bahx.i);
    public static final bahp v = new baho("secondOfDay", (byte) 20, bahx.k, bahx.g);
    public static final bahp w = new baho("secondOfMinute", (byte) 21, bahx.k, bahx.j);
    public static final bahp x = new baho("millisOfDay", (byte) 22, bahx.l, bahx.g);
    public static final bahp y = new baho("millisOfSecond", (byte) 23, bahx.l, bahx.k);

    /* JADX INFO: Access modifiers changed from: protected */
    public bahp(String str) {
        this.z = str;
    }

    public abstract bahn a(bahl bahlVar);

    public final String toString() {
        return this.z;
    }
}
