package defpackage;
/* compiled from: PG */
/* renamed from: ugl  reason: default package */
/* loaded from: classes4.dex */
final class ugl {
    public final aomr a;
    public final String b;
    public final int c;

    public ugl(aomr aomrVar, String str, int i) {
        if (aomrVar != null) {
            this.a = aomrVar;
            if (str != null) {
                this.b = str;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null actionId");
        }
        throw new NullPointerException("Null threadStateUpdate");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ugl) {
            ugl uglVar = (ugl) obj;
            if (this.a.equals(uglVar.a) && this.b.equals(uglVar.b) && this.c == uglVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String num = Integer.toString(this.c - 1);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 62 + str.length() + String.valueOf(num).length());
        sb.append("SdkBatchUpdateKey{threadStateUpdate=");
        sb.append(valueOf);
        sb.append(", actionId=");
        sb.append(str);
        sb.append(", eventSource=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }

    public ugl() {
    }
}
