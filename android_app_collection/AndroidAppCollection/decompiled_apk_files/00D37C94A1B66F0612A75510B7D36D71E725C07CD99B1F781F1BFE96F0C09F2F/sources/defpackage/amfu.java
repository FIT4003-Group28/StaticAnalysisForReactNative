package defpackage;
/* compiled from: PG */
/* renamed from: amfu  reason: default package */
/* loaded from: classes.dex */
public final class amfu {
    public final String a;

    public amfu(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null uniquenessKey");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof amfu) && this.a.equals(((amfu) obj).a);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 58);
        sb.append("UniqueWorkSpec{uniquenessKey=");
        sb.append(str);
        sb.append(", existingWorkPolicy=REPLACE}");
        return sb.toString();
    }

    public amfu() {
    }
}
