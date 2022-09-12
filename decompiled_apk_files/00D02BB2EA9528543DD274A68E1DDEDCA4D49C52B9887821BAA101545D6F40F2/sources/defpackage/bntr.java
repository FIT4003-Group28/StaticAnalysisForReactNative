package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bntr  reason: default package */
/* loaded from: classes.dex */
public final class bntr extends Enum<bntr> implements bnrz {
    public static final bntr a;
    public static final int b;
    private static final /* synthetic */ bntr[] c;

    static {
        bntr bntrVar = new bntr();
        a = bntrVar;
        c = new bntr[]{bntrVar};
        b = bnto.d + bnto.values().length;
    }

    private bntr() {
    }

    public static bntr[] values() {
        return (bntr[]) c.clone();
    }

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.TRAFFIC_PASS;
    }

    @Override // defpackage.bnrz
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.bnrz
    public final int c() {
        return b + ordinal();
    }
}
