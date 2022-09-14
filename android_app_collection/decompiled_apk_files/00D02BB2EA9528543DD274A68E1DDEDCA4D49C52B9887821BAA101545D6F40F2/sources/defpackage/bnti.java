package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bnti  reason: default package */
/* loaded from: classes.dex */
public final class bnti extends Enum<bnti> implements bnrz {
    public static final bnti a;
    public static final int b;
    private static final /* synthetic */ bnti[] c;

    static {
        bnti bntiVar = new bnti();
        a = bntiVar;
        c = new bnti[]{bntiVar};
        b = bntp.j + bntp.values().length;
    }

    private bnti() {
    }

    public static bnti[] values() {
        return (bnti[]) c.clone();
    }

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.BUILDING_PASS;
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
