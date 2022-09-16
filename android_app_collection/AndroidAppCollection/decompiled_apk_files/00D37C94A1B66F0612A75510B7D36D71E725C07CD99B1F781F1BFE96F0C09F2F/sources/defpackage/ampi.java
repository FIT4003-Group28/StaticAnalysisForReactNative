package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ampi  reason: default package */
/* loaded from: classes.dex */
public final class ampi extends Enum implements ampg {
    public static final ampi a;
    private static final /* synthetic */ ampi[] b;

    static {
        ampi ampiVar = new ampi();
        a = ampiVar;
        b = new ampi[]{ampiVar};
    }

    private ampi() {
    }

    public static ampi[] values() {
        return (ampi[]) b.clone();
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        return obj;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }
}
