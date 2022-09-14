package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dbrq  reason: default package */
/* loaded from: classes5.dex */
public final class dbrq extends Enum<dbrq> implements dbrn<Object, Object> {
    public static final dbrq a;
    private static final /* synthetic */ dbrq[] b;

    static {
        dbrq dbrqVar = new dbrq();
        a = dbrqVar;
        b = new dbrq[]{dbrqVar};
    }

    private dbrq() {
    }

    public static dbrq[] values() {
        return (dbrq[]) b.clone();
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return obj;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }
}
