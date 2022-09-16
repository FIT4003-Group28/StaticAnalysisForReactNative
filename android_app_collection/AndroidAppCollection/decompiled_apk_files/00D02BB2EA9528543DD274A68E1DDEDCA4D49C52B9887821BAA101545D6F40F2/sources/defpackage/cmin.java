package defpackage;
/* compiled from: PG */
/* renamed from: cmin  reason: default package */
/* loaded from: classes5.dex */
final class cmin implements Comparable<cmin> {
    public final int a;
    public final cmii b;

    public cmin(int i, cmii cmiiVar) {
        this.a = i;
        this.b = cmiiVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cmin cminVar) {
        return Integer.compare(this.a, cminVar.a);
    }
}
