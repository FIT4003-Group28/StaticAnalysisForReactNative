package defpackage;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: csnk  reason: default package */
/* loaded from: classes5.dex */
public final class csnk {
    public static final dcza a = dcyv.a;
    private static final TimeZone f = TimeZone.getTimeZone("America/Los_Angeles");
    public final String b;
    public final int c;
    public final Set<dcyz> d = new HashSet();
    public volatile long e = a();
    private final cqat g;

    public csnk(cqat cqatVar, String str, int i) {
        this.g = cqatVar;
        this.b = str;
        this.c = i;
    }

    public final long a() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f);
        gregorianCalendar.setTimeInMillis(this.g.b());
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
