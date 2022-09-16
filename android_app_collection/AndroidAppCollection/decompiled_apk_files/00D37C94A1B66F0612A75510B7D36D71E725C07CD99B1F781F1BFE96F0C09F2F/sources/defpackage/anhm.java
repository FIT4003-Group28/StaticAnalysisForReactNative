package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: anhm  reason: default package */
/* loaded from: classes.dex */
public final class anhm extends Enum implements anhn {
    public static final anhm a;
    private static final /* synthetic */ anhm[] b;

    static {
        anhm anhmVar = new anhm();
        a = anhmVar;
        b = new anhm[]{anhmVar};
    }

    private anhm() {
    }

    public static anhm[] values() {
        return (anhm[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
