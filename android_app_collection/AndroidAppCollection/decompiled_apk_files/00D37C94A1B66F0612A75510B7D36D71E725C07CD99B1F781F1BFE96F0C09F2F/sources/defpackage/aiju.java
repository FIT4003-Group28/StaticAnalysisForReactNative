package defpackage;
/* compiled from: PG */
/* renamed from: aiju  reason: default package */
/* loaded from: classes.dex */
public final class aiju {
    public final int a;
    public final int b;

    public aiju() {
    }

    public aiju(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public static aijt a() {
        aijt aijtVar = new aijt();
        aijtVar.b(0);
        aijtVar.a = 1;
        return aijtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aiju)) {
            return false;
        }
        aiju aijuVar = (aiju) obj;
        int i = this.b;
        int i2 = aijuVar.b;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == aijuVar.a;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return ((i ^ 1000003) * 1000003) ^ this.a;
        }
        throw null;
    }

    public final String toString() {
        int i = this.b;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 84);
        sb.append("PrefetchPlaybackContextWrapper{prefetchReason=");
        sb.append(num);
        sb.append(", playbackBeginsInSeconds=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
