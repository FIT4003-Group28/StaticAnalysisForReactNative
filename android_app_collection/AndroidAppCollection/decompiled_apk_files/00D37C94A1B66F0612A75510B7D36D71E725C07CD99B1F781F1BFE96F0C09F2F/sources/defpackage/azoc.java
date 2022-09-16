package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: azoc  reason: default package */
/* loaded from: classes2.dex */
public final class azoc extends Enum implements ayrk {
    public static final azoc a;
    private static final /* synthetic */ azoc[] b;

    static {
        azoc azocVar = new azoc();
        a = azocVar;
        b = new azoc[]{azocVar};
    }

    private azoc() {
    }

    public static void b(bame bameVar) {
        bameVar.f(a);
        bameVar.sm();
    }

    public static void f(Throwable th, bame bameVar) {
        bameVar.f(a);
        bameVar.b(th);
    }

    public static azoc[] values() {
        return (azoc[]) b.clone();
    }

    @Override // defpackage.ayrn
    public final void d() {
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.ayrn
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.bamf
    public final void si() {
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return i & 2;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        return null;
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        azof.h(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
