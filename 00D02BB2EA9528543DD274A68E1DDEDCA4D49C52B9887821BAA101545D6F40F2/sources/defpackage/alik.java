package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: alik  reason: default package */
/* loaded from: classes2.dex */
public final class alik extends Enum<alik> implements alhm {
    public static final alik a;
    private static final /* synthetic */ alik[] b;

    static {
        alik alikVar = new alik();
        a = alikVar;
        b = new alik[]{alikVar};
    }

    private alik() {
    }

    public static alik[] values() {
        return (alik[]) b.clone();
    }

    @Override // defpackage.alhm
    public final alhn a(akra akraVar) {
        return new alil(akraVar);
    }
}
