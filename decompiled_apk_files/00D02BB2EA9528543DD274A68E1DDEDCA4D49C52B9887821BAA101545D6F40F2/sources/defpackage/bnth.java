package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bnth  reason: default package */
/* loaded from: classes.dex */
public final class bnth extends Enum<bnth> implements bnrz {
    public static final bnth a;
    public static final int b;
    private static final /* synthetic */ bnth[] c;

    static {
        bnth bnthVar = new bnth();
        a = bnthVar;
        c = new bnth[]{bnthVar};
        b = bnts.b + bnts.values().length;
    }

    private bnth() {
    }

    public static bnth[] values() {
        return (bnth[]) c.clone();
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
