package defpackage;
/* compiled from: PG */
/* renamed from: cnkg  reason: default package */
/* loaded from: classes.dex */
public final class cnkg extends cnkf {
    private final long b;
    private final long c;

    public cnkg(int i, int i2, int i3) {
        super(i);
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.cnkf, defpackage.cnkc
    public final long a(long j) {
        return super.a(Math.max(Math.min(j, this.c), this.b));
    }

    @Override // defpackage.cnkf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnkg) && this.a == ((cnkg) obj).a;
    }
}
