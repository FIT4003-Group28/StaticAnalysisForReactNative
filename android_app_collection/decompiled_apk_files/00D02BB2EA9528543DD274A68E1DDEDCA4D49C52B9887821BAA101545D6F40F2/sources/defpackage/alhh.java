package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: alhh  reason: default package */
/* loaded from: classes2.dex */
public final class alhh extends Enum<alhh> implements alhm {
    public static final alhh a;
    private static final /* synthetic */ alhh[] b;

    static {
        alhh alhhVar = new alhh();
        a = alhhVar;
        b = new alhh[]{alhhVar};
    }

    private alhh() {
    }

    public static alhh[] values() {
        return (alhh[]) b.clone();
    }

    @Override // defpackage.alhm
    public final alhn a(akra akraVar) {
        return new alhi(akraVar);
    }
}
