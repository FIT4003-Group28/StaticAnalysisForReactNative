package defpackage;
/* compiled from: PG */
/* renamed from: auee  reason: default package */
/* loaded from: classes2.dex */
public final class auee {
    public static int a(@dzsi String str) {
        if (dbsj.d(str)) {
            return 0;
        }
        return dczd.a.a(str, dbrc.c).hashCode();
    }

    public static int b(long j, @dzsi String str) {
        if (dbsj.d(str)) {
            return 0;
        }
        return a(str + j);
    }

    public static int c(long j, @dzsi String str) {
        if (dbsj.d(str)) {
            return 0;
        }
        return a(str + j);
    }
}
