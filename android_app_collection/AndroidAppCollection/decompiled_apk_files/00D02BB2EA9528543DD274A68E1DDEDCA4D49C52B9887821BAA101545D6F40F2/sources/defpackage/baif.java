package defpackage;
/* compiled from: PG */
/* renamed from: baif  reason: default package */
/* loaded from: classes3.dex */
enum baif {
    ALWAYS_VISIBLE_ALONE(dcdc.h(byeb.PERMANENTLY_CLOSED, byeb.FUTURE_OPEN, byeb.TEMPORARILY_CLOSED)),
    VISIBLE_BEFORE_SERVICE(dcdc.m(byeb.OPENS_SOON, byeb.OPENS_SOON_NEXT_DAY, byeb.CLOSED_ALL_DAY, byeb.CLOSED_FOR_DAY, byeb.CLOSED_NOW_WILL_REOPEN, byeb.CLOSED_NOW_HOURS_UNKNOWN, byeb.CLOSING_SOON_WILL_REOPEN, byeb.CLOSING_SOON_LAST_INTERVAL)),
    INVISIBLE(dcdc.j(byeb.OPEN_FOR_NEXT_24_HOURS, byeb.OPEN_NOW_CLOSES_NEXT_DAY, byeb.OPEN_NOW_LAST_INTERVAL, byeb.HOURS_UNKNOWN, byeb.OPEN_NOW_HOURS_UNKNOWN));
    
    public final dcdc<byeb> d;

    baif(dcdc dcdcVar) {
        this.d = dcdcVar;
    }
}
