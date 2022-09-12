package defpackage;
/* compiled from: PG */
/* renamed from: crpo  reason: default package */
/* loaded from: classes5.dex */
public final class crpo {
    public int a;
    public int b;

    public crpo() {
        this.a = 0;
        this.b = -1;
    }

    private crpo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* renamed from: a */
    public final crpo clone() {
        return new crpo(this.a, this.b);
    }

    public final crpo b(boolean z) {
        if (z) {
            return new crpo(this.a + 1, 0);
        }
        return new crpo(this.a, this.b + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(crpo crpoVar) {
        this.a = crpoVar.a;
        this.b = crpoVar.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(26);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
