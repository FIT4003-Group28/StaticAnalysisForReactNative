package defpackage;
/* compiled from: PG */
/* renamed from: scr  reason: default package */
/* loaded from: classes4.dex */
public final class scr {
    final int[] a;
    final int b;

    public scr(int[] iArr, int i) {
        sho.g(iArr, "pixelValues");
        sho.a(iArr.length >= i, "Claiming to use more elements than provided");
        this.a = iArr;
        this.b = i;
    }
}
