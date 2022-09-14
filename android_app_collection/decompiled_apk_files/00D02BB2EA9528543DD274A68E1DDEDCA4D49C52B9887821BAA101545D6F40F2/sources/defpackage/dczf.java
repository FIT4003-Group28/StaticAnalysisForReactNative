package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dczf  reason: default package */
/* loaded from: classes5.dex */
final class dczf extends Enum<dczf> implements dczg {
    public static final dczf a;
    private static final /* synthetic */ dczf[] b;

    static {
        dczf dczfVar = new dczf();
        a = dczfVar;
        b = new dczf[]{dczfVar};
    }

    private dczf() {
    }

    public static dczf[] values() {
        return (dczf[]) b.clone();
    }

    @Override // defpackage.dczg
    public final /* synthetic */ long a(byte[] bArr, int i) {
        if (ordinal() == 0) {
            return decn.g(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
        }
        throw null;
    }
}
