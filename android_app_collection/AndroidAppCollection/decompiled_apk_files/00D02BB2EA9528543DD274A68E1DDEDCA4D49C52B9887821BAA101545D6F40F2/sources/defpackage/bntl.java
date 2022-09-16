package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bntl  reason: default package */
/* loaded from: classes.dex */
public final class bntl extends Enum<bntl> implements bnrz {
    public static final bntl a;
    public static final int b;
    private static final /* synthetic */ bntl[] c;

    static {
        bntl bntlVar = new bntl();
        a = bntlVar;
        c = new bntl[]{bntlVar};
        b = bnti.b + bnti.values().length;
    }

    private bntl() {
    }

    public static bntl[] values() {
        return (bntl[]) c.clone();
    }

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.LABEL_PASS;
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
