package defpackage;
/* compiled from: PG */
/* renamed from: buac  reason: default package */
/* loaded from: classes.dex */
public final class buac {
    public boolean j;
    public btyq a = btyq.h;
    public btys b = btys.f;
    public btyw c = btyw.c;
    public btyo d = btyo.e;
    @dzsi
    public btlu e = null;
    @dzsi
    public ahnc f = null;
    @dzsi
    public dunt g = null;
    @dzsi
    public dssr<?> h = null;
    public btyk i = btyk.GMM_SERVER;
    public boolean k = true;

    public final buad a() {
        return new buad(this);
    }

    public final void b() {
        this.j = true;
    }

    public final void c(btys btysVar) {
        int i = btysVar.b;
        boolean z = true;
        dbsk.e(i >= 0, "negative retryDelayMs: %s", i);
        int i2 = btysVar.c;
        dbsk.e(i2 > 0, "maxAttempts < 1: %s", i2);
        long j = btysVar.d;
        if (j < 0) {
            z = false;
        }
        dbsk.f(z, "negative singleAttemptTimeoutMs: %s", j);
        this.b = btysVar;
    }

    public final void d(btyw btywVar) {
        int i = btywVar.b;
        dbsk.e(i >= 0, "negative maxDelayMs: %s", i);
        this.c = btywVar;
    }
}
