package defpackage;
/* compiled from: PG */
/* renamed from: cqvn  reason: default package */
/* loaded from: classes.dex */
final class cqvn {
    final long a;
    final long b;

    public cqvn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(long j) {
        return j >= this.a && j < this.b;
    }
}
