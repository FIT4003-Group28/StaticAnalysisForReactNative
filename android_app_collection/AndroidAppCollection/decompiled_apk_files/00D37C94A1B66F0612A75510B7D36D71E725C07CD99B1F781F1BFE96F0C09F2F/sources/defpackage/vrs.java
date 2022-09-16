package defpackage;
/* compiled from: PG */
/* renamed from: vrs  reason: default package */
/* loaded from: classes4.dex */
final class vrs implements Comparable {
    public final int a;
    public final vrr b;
    public boolean c = false;

    public vrs(int i, vrr vrrVar) {
        this.a = i;
        this.b = vrrVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.a;
        int i2 = ((vrs) obj).a;
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }
}
