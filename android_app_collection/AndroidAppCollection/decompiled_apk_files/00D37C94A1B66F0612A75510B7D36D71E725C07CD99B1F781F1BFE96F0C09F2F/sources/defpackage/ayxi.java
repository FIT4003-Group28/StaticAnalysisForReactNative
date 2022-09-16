package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ayxi  reason: default package */
/* loaded from: classes2.dex */
public final class ayxi extends Enum implements ayqb {
    public static final ayxi a;
    private static final /* synthetic */ ayxi[] b;

    static {
        ayxi ayxiVar = new ayxi();
        a = ayxiVar;
        b = new ayxi[]{ayxiVar};
    }

    private ayxi() {
    }

    public static ayxi[] values() {
        return (ayxi[]) b.clone();
    }

    @Override // defpackage.ayqb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((bamf) obj).sp(Long.MAX_VALUE);
    }
}
