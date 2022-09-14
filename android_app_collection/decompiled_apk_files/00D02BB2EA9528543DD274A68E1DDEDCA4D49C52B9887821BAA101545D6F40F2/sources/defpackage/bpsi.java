package defpackage;
/* compiled from: PG */
/* renamed from: bpsi  reason: default package */
/* loaded from: classes4.dex */
final class bpsi extends bptm {
    private final int b;
    private final int c;
    private final int d;

    public bpsi(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.bptm
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bptm
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bptm
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bptm) {
            bptm bptmVar = (bptm) obj;
            if (this.b == bptmVar.a() && this.c == bptmVar.b() && this.d == bptmVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(96);
        sb.append("MessageIds{progressMessageId=");
        sb.append(i);
        sb.append(", offlineTitleId=");
        sb.append(i2);
        sb.append(", offlineBodyId=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
