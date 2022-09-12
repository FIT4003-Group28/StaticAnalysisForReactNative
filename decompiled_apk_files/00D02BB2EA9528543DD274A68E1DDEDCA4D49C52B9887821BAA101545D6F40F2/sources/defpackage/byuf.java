package defpackage;
/* compiled from: PG */
/* renamed from: byuf  reason: default package */
/* loaded from: classes4.dex */
public final class byuf {
    public final bwqv a;
    public final bysv b;

    public byuf(bwqv bwqvVar, bysv bysvVar) {
        this.a = bwqvVar;
        this.b = bysvVar;
    }

    @dzsi
    private final <T extends dssj> T e(String str, dssr<T> dssrVar) {
        bvrj.UI_THREAD.d();
        return (T) this.a.k(bwrj.TRANSIT_NOTIFICATION_DATA, str, dssrVar);
    }

    public final void a(bzil bzilVar) {
        d("station_departures", bzilVar);
    }

    @dzsi
    public final bzil b() {
        return (bzil) e("station_departures", (dssr) bzil.e.cu(7));
    }

    @dzsi
    public final bzhj c() {
        try {
            return (bzhj) e("commute_data", (dssr) bzhj.h.cu(7));
        } catch (RuntimeException e) {
            this.b.c(cken.ERROR_IN_DATA_STORAGE_GET_COMMUTE_NOTIFICATION);
            throw e;
        }
    }

    public final void d(String str, dssj dssjVar) {
        bvrj.UI_THREAD.d();
        deha.s(this.a.h(bwrj.TRANSIT_NOTIFICATION_DATA, str, dssjVar));
    }
}
