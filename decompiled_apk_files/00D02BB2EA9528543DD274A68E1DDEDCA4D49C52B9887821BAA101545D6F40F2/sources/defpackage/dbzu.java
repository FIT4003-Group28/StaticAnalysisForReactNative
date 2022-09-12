package defpackage;
/* compiled from: PG */
/* renamed from: dbzu  reason: default package */
/* loaded from: classes5.dex */
public final class dbzu {
    public static <T extends Comparable<? super T>> T a(T t, T t2) {
        return t.compareTo(t2) >= 0 ? t : t2;
    }
}
