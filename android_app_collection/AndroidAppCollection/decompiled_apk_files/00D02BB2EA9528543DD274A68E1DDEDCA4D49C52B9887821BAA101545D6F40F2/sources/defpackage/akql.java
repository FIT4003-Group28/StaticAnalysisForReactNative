package defpackage;
/* compiled from: PG */
/* renamed from: akql  reason: default package */
/* loaded from: classes.dex */
public final class akql {
    public final int a;
    public final int b;

    public akql(int i, int i2) {
        i2 = i2 == -180000000 ? 180000000 : i2;
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akql) {
            akql akqlVar = (akql) obj;
            if (akqlVar.a == this.a && akqlVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 29) + this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        return sb.toString();
    }
}
