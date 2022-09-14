package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bntm  reason: default package */
/* loaded from: classes.dex */
public final class bntm extends Enum<bntm> implements bnrz {
    public static final bntm a;
    public static final int b;
    private static final /* synthetic */ bntm[] c;

    static {
        bntm bntmVar = new bntm();
        a = bntmVar;
        c = new bntm[]{bntmVar};
        b = bntl.b + bntl.values().length;
    }

    private bntm() {
    }

    public static bntm[] values() {
        return (bntm[]) c.clone();
    }

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.MY_MAPS_PASS;
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
