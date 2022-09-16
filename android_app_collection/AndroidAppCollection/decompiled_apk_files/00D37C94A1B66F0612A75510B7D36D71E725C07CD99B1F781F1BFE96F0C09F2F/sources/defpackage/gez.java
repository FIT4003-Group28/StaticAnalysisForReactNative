package defpackage;
/* compiled from: PG */
/* renamed from: gez  reason: default package */
/* loaded from: classes3.dex */
final class gez implements Comparable {
    int a;
    int b;
    final long c;

    public gez(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((gez) obj).b;
    }
}
