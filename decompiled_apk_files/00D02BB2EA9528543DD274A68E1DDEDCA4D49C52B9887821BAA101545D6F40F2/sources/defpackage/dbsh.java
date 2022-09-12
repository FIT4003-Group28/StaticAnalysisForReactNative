package defpackage;

import java.util.Comparator;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dbsh  reason: default package */
/* loaded from: classes5.dex */
public final class dbsh extends Enum<dbsh> implements Comparator<dbsi<Comparable<?>, Object>> {
    public static final dbsh a;
    private static final /* synthetic */ dbsh[] b;

    static {
        dbsh dbshVar = new dbsh();
        a = dbshVar;
        b = new dbsh[]{dbshVar};
    }

    private dbsh() {
    }

    public static dbsh[] values() {
        return (dbsh[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dbsi<Comparable<?>, Object> dbsiVar, dbsi<Comparable<?>, Object> dbsiVar2) {
        return dbsiVar.a.compareTo(dbsiVar2.a);
    }
}
