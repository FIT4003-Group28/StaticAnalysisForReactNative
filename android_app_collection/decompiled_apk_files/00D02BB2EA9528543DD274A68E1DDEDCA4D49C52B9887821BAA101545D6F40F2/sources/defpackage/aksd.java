package defpackage;
/* compiled from: PG */
/* renamed from: aksd  reason: default package */
/* loaded from: classes2.dex */
public final class aksd extends ThreadLocal<akse[]> {
    private final int a = 4;

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ akse[] initialValue() {
        akse[] akseVarArr = new akse[this.a];
        for (int i = 0; i < this.a; i++) {
            akseVarArr[i] = new akse();
        }
        return akseVarArr;
    }
}
