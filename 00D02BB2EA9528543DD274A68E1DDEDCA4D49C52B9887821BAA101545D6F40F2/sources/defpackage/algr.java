package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: algr  reason: default package */
/* loaded from: classes2.dex */
public final class algr extends Enum<algr> implements alhm {
    public static final algr a;
    private static final /* synthetic */ algr[] b;

    static {
        algr algrVar = new algr();
        a = algrVar;
        b = new algr[]{algrVar};
    }

    private algr() {
    }

    public static algr[] values() {
        return (algr[]) b.clone();
    }

    @Override // defpackage.alhm
    public final alhn a(akra akraVar) {
        return new algs(akraVar);
    }
}
