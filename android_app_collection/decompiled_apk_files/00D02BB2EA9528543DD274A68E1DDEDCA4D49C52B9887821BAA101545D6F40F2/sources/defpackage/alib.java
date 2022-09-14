package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: alib  reason: default package */
/* loaded from: classes2.dex */
public final class alib extends Enum<alib> implements alhm {
    public static final alib a;
    private static final /* synthetic */ alib[] b;

    static {
        alib alibVar = new alib();
        a = alibVar;
        b = new alib[]{alibVar};
    }

    private alib() {
    }

    public static alib[] values() {
        return (alib[]) b.clone();
    }

    @Override // defpackage.alhm
    public final alhn a(akra akraVar) {
        return new alic(akraVar);
    }
}
