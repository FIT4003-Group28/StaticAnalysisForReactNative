package defpackage;
/* compiled from: PG */
/* renamed from: cnkf  reason: default package */
/* loaded from: classes.dex */
public class cnkf implements cnkc {
    protected final int a;

    public cnkf(int i) {
        if (i > 0) {
            this.a = i;
            return;
        }
        StringBuilder sb = new StringBuilder(22);
        sb.append("bad alias: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.cnkc
    public long a(long j) {
        long j2 = this.a;
        return j2 * (j / j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnkf) && this.a == ((cnkf) obj).a;
    }
}
