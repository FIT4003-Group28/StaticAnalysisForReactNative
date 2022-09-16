package defpackage;
/* compiled from: PG */
/* renamed from: puo  reason: default package */
/* loaded from: classes4.dex */
final class puo implements Comparable {
    public final int a;
    public final puk b;

    public puo(int i, puk pukVar) {
        this.a = i;
        this.b = pukVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.a;
        int i2 = ((puo) obj).a;
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }
}
