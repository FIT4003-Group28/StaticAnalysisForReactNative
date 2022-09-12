package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dbun  reason: default package */
/* loaded from: classes.dex */
final class dbun extends Enum<dbun> implements dbwz<Object, Object> {
    public static final dbun a;
    private static final /* synthetic */ dbun[] b;

    static {
        dbun dbunVar = new dbun();
        a = dbunVar;
        b = new dbun[]{dbunVar};
    }

    private dbun() {
    }

    public static dbun[] values() {
        return (dbun[]) b.clone();
    }

    @Override // defpackage.dbwz
    public final int a() {
        return 1;
    }
}
