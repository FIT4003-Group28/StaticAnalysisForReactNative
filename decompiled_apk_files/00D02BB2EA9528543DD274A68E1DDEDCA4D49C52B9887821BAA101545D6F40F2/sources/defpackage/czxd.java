package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;
/* compiled from: PG */
/* renamed from: czxd  reason: default package */
/* loaded from: classes5.dex */
public final class czxd {
    static final long a = czyn.e(Month.b(1900, 0).f);
    static final long b = czyn.e(Month.b(2100, 11).f);
    public long c;
    public long d;
    public Long e;
    public CalendarConstraints.DateValidator f;

    public czxd() {
        throw null;
    }

    public czxd(CalendarConstraints calendarConstraints) {
        this.c = a;
        this.d = b;
        this.f = new DateValidatorPointForward(Long.MIN_VALUE);
        this.c = calendarConstraints.a.f;
        this.d = calendarConstraints.b.f;
        this.e = Long.valueOf(calendarConstraints.d.f);
        this.f = calendarConstraints.c;
    }
}
