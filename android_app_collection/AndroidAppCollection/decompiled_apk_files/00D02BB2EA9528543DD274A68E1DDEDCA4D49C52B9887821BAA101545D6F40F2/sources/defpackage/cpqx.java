package defpackage;
/* compiled from: PG */
/* renamed from: cpqx  reason: default package */
/* loaded from: classes5.dex */
public final class cpqx {
    final int[] a;
    final int b;

    public cpqx(int[] iArr, int i) {
        cpwl.h(iArr, "pixelValues");
        cpwl.c(iArr.length >= i, "Claiming to use more elements than provided");
        this.a = iArr;
        this.b = i;
    }
}
