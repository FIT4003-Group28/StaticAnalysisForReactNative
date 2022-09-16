package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: alii  reason: default package */
/* loaded from: classes2.dex */
public final class alii extends Enum<alii> implements alhm {
    public static final alii a;
    private static final /* synthetic */ alii[] b;

    static {
        alii aliiVar = new alii();
        a = aliiVar;
        b = new alii[]{aliiVar};
    }

    private alii() {
    }

    public static alii[] values() {
        return (alii[]) b.clone();
    }

    @Override // defpackage.alhm
    public final alhn a(akra akraVar) {
        return new alij(akraVar);
    }
}
