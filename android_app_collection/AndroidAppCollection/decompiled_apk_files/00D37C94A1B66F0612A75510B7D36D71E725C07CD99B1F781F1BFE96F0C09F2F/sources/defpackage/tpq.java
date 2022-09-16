package defpackage;

import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: tpq  reason: default package */
/* loaded from: classes4.dex */
public final class tpq {
    private static final TimeZone a;
    private volatile long b;

    static {
        int i = andw.b;
        a = DesugarTimeZone.getTimeZone("America/Los_Angeles");
    }

    public tpq() {
        new HashSet();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a);
        gregorianCalendar.setTimeInMillis(System.currentTimeMillis());
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        this.b = gregorianCalendar.getTimeInMillis();
    }
}
