package defpackage;
/* compiled from: PG */
/* renamed from: admm  reason: default package */
/* loaded from: classes.dex */
final class admm implements Cloneable {
    final long a;
    final long b;

    public admm(long j, long j2) {
        aqxo.p(j <= j2);
        this.a = j;
        this.b = j2;
    }

    /* renamed from: a */
    public final admm clone() {
        try {
            return (admm) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final boolean b(long j) {
        return j >= this.a && j <= this.b;
    }
}
