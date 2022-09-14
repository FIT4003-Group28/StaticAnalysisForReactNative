package defpackage;
/* compiled from: PG */
/* renamed from: bqdm  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqdm {
    public static bqdm c(akra akraVar) {
        return new bqdj(akraVar, dbpy.a);
    }

    public static bqdm d(akra akraVar, long j) {
        return new bqdj(akraVar, dbsg.i(Long.valueOf(j)));
    }

    public abstract akra a();

    public abstract dbsg<Long> b();
}
