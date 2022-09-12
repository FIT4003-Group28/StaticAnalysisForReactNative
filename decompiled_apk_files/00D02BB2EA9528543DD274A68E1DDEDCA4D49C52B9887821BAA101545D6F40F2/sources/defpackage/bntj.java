package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: bntj  reason: default package */
/* loaded from: classes.dex */
public final class bntj extends Enum<bntj> implements bnrz {
    public static final bntj a;
    public static final int b;
    private static final /* synthetic */ bntj[] c;

    static {
        bntj bntjVar = new bntj();
        a = bntjVar;
        c = new bntj[]{bntjVar};
        b = bnth.b + bnth.values().length;
    }

    private bntj() {
    }

    public static bntj[] values() {
        return (bntj[]) c.clone();
    }

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.CLIENT_INJECTED_PASS;
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
