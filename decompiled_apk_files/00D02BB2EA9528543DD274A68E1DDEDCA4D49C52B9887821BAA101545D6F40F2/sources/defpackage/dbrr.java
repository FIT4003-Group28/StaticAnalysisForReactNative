package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dbrr  reason: default package */
/* loaded from: classes5.dex */
public final class dbrr extends Enum<dbrr> implements dbrn<Object, String> {
    public static final dbrr a;
    private static final /* synthetic */ dbrr[] b;

    static {
        dbrr dbrrVar = new dbrr();
        a = dbrrVar;
        b = new dbrr[]{dbrrVar};
    }

    private dbrr() {
    }

    public static dbrr[] values() {
        return (dbrr[]) b.clone();
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        dbsk.s(obj);
        return obj.toString();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.toStringFunction()";
    }
}
