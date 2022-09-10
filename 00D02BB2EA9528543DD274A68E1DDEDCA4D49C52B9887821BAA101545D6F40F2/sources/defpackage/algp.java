package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: algp  reason: default package */
/* loaded from: classes.dex */
public final class algp extends Enum<algp> implements alhm {
    public static final algp a;
    private static final /* synthetic */ algp[] b;

    static {
        algp algpVar = new algp();
        a = algpVar;
        b = new algp[]{algpVar};
    }

    private algp() {
    }

    public static algp[] values() {
        return (algp[]) b.clone();
    }

    @Override // defpackage.alhm
    public final alhn a(akra akraVar) {
        return new algq(akraVar);
    }
}
