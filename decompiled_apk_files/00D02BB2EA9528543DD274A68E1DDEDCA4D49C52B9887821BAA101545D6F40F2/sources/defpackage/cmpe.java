package defpackage;
/* compiled from: PG */
/* renamed from: cmpe  reason: default package */
/* loaded from: classes5.dex */
public final class cmpe implements Comparable<cmpe> {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cmpe cmpeVar) {
        cmpe cmpeVar2 = cmpeVar;
        int i = this.b;
        int i2 = cmpeVar2.b;
        return i != i2 ? i - i2 : this.a - cmpeVar2.a;
    }

    public final String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + '}';
    }
}
