package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bnts  reason: default package */
/* loaded from: classes.dex */
public final class bnts extends Enum<bnts> implements bnrz {
    public static final bnts a;
    public static final int b;
    private static final /* synthetic */ bnts[] c;

    static {
        bnts bntsVar = new bnts();
        a = bntsVar;
        c = new bnts[]{bntsVar};
        b = bntk.d + bntk.values().length;
    }

    private bnts() {
    }

    public static bnts[] values() {
        return (bnts[]) c.clone();
    }

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.TRANSIT_PASS;
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
