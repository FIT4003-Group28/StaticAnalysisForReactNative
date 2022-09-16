package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ziu  reason: default package */
/* loaded from: classes4.dex */
public final class ziu {
    public final Uri a;
    public final Object b;
    public final Long c;
    public final int d;
    private final Object e;

    public ziu() {
    }

    public ziu(Uri uri, int i, Object obj, Object obj2, Long l) {
        this.a = uri;
        this.d = i;
        this.e = obj;
        this.b = obj2;
        this.c = l;
    }

    public static ziu a(Uri uri, int i, Object obj, Object obj2, Long l) {
        return new ziu(uri, i, obj, obj2, l);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ziu) {
            ziu ziuVar = (ziu) obj;
            if (this.a.equals(ziuVar.a) && this.d == ziuVar.d && ((obj2 = this.e) != null ? obj2.equals(ziuVar.e) : ziuVar.e == null) && ((obj3 = this.b) != null ? obj3.equals(ziuVar.b) : ziuVar.b == null)) {
                Long l = this.c;
                Long l2 = ziuVar.c;
                if (l != null ? l.equals(l2) : l2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d) * 1000003;
        Object obj = this.e;
        int i = 0;
        int hashCode2 = (hashCode ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        Object obj2 = this.b;
        int hashCode3 = (hashCode2 ^ (obj2 == null ? 0 : obj2.hashCode())) * 1000003;
        Long l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.d != 1 ? "DELETED" : "UPDATED";
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length + 76 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("DataSyncModelChange{path=");
        sb.append(valueOf);
        sb.append(", updateType=");
        sb.append(str);
        sb.append(", previousModel=");
        sb.append(valueOf2);
        sb.append(", nextModel=");
        sb.append(valueOf3);
        sb.append(", expiry=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
