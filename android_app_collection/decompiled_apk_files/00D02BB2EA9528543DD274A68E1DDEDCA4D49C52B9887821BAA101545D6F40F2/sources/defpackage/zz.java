package defpackage;
/* compiled from: PG */
/* renamed from: zz  reason: default package */
/* loaded from: classes7.dex */
final class zz {
    int b;
    int c;
    int d;
    int e;
    boolean h;
    boolean i;
    boolean a = true;
    int f = 0;
    int g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(aci aciVar) {
        int i = this.c;
        return i >= 0 && i < aciVar.b();
    }

    public final String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
