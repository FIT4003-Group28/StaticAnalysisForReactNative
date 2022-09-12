package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: btsf  reason: default package */
/* loaded from: classes.dex */
public final class btsf {
    public final cocu a;
    @dzsi
    public final gce b;
    @dzsi
    public final cjqq c;
    public final cpcf<Void> d;
    @dzsi
    public final acfu e;

    private btsf(Context context, acfu acfuVar, cjqq cjqqVar, gce gceVar) {
        cocu cocuVar = new cocu(context);
        this.d = new btsd(this);
        this.a = cocuVar;
        this.e = acfuVar;
        this.c = cjqqVar;
        this.b = gceVar;
    }

    @dzsi
    public static btsf a(Context context, @dzsi acfu acfuVar, @dzsi cjqq cjqqVar, @dzsi gce gceVar) {
        if (!btsj.b(context)) {
            return null;
        }
        return new btsf(context, acfuVar, cjqqVar, gceVar);
    }
}
