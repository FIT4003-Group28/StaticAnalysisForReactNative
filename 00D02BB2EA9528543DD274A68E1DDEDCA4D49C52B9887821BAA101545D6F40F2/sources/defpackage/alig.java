package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: alig  reason: default package */
/* loaded from: classes2.dex */
public final class alig extends Enum<alig> implements alhm {
    public static final alig a;
    private static final /* synthetic */ alig[] b;

    static {
        alig aligVar = new alig();
        a = aligVar;
        b = new alig[]{aligVar};
    }

    private alig() {
    }

    public static alig[] values() {
        return (alig[]) b.clone();
    }

    @Override // defpackage.alhm
    public final alhn a(akra akraVar) {
        return new alih(akraVar);
    }
}
