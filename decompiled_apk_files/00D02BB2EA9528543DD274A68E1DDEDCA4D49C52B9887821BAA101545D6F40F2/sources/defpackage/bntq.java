package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bntq  reason: default package */
/* loaded from: classes.dex */
public final class bntq extends Enum<bntq> implements bnrz {
    public static final bntq a;
    public static final int b;
    private static final /* synthetic */ bntq[] c;

    static {
        bntq bntqVar = new bntq();
        a = bntqVar;
        c = new bntq[]{bntqVar};
        b = bntt.values().length;
    }

    private bntq() {
    }

    public static bntq[] values() {
        return (bntq[]) c.clone();
    }

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.BASE_TILE_PASS;
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
