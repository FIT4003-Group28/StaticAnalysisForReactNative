package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: algt  reason: default package */
/* loaded from: classes2.dex */
public final class algt extends Enum<algt> implements alhm {
    public static final algt a;
    private static final /* synthetic */ algt[] b;

    static {
        algt algtVar = new algt();
        a = algtVar;
        b = new algt[]{algtVar};
    }

    private algt() {
    }

    public static algt[] values() {
        return (algt[]) b.clone();
    }

    @Override // defpackage.alhm
    public final alhn a(akra akraVar) {
        return new algu(akraVar);
    }
}
