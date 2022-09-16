package defpackage;
/* compiled from: PG */
/* renamed from: pyr  reason: default package */
/* loaded from: classes4.dex */
public final class pyr implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        pyr pyrVar = (pyr) obj;
        int i = this.b;
        int i2 = pyrVar.b;
        return i != i2 ? i - i2 : this.a - pyrVar.a;
    }

    public final String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + '}';
    }
}
