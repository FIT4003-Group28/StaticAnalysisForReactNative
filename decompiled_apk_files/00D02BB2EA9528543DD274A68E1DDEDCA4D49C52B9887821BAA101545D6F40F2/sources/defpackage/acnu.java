package defpackage;
/* compiled from: PG */
/* renamed from: acnu  reason: default package */
/* loaded from: classes2.dex */
final class acnu implements acny {
    public int[] a;

    @Override // defpackage.acny
    public final int a(int i) {
        int[] iArr = this.a;
        return iArr[i % iArr.length];
    }
}
