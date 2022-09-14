package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: easa  reason: default package */
/* loaded from: classes6.dex */
public final class easa extends earz implements easg, easj {
    static final easa a = new easa();

    protected easa() {
    }

    @Override // defpackage.earz, defpackage.easg
    public final long a(Object obj, eaok eaokVar) {
        return ((Calendar) obj).getTime().getTime();
    }

    @Override // defpackage.earz, defpackage.easg, defpackage.easj
    public final eaok b(Object obj, eaou eaouVar) {
        if (obj.getClass().getName().endsWith(".BuddhistCalendar")) {
            return earc.W(eaouVar);
        }
        if (obj instanceof GregorianCalendar) {
            long time = ((GregorianCalendar) obj).getGregorianChange().getTime();
            if (time == Long.MIN_VALUE) {
                return earn.aB(eaouVar);
            }
            if (time == Long.MAX_VALUE) {
                return earr.aB(eaouVar);
            }
            return earh.Z(eaouVar, time == earh.E.a ? null : new eapd(time), 4);
        }
        return earp.X(eaouVar);
    }

    @Override // defpackage.earz, defpackage.easg, defpackage.easj
    public final eaok e(Object obj) {
        eaou i;
        Calendar calendar = (Calendar) obj;
        try {
            i = eaou.l(calendar.getTimeZone());
        } catch (IllegalArgumentException unused) {
            i = eaou.i();
        }
        return b(calendar, i);
    }

    @Override // defpackage.easb
    public final Class<?> f() {
        return Calendar.class;
    }
}
