package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cucg  reason: default package */
/* loaded from: classes5.dex */
final class cucg extends ctzb {
    private final dbsg<String> a;
    private final Set<String> b;
    private final dbsg<String> c;
    private final String d;

    public cucg(dbsg<String> dbsgVar, Set<String> set, dbsg<String> dbsgVar2, String str) {
        this.a = dbsgVar;
        this.b = set;
        this.c = dbsgVar2;
        this.d = str;
    }

    @Override // defpackage.ctzb
    public final dbsg<String> a() {
        return this.a;
    }

    @Override // defpackage.ctzb
    public final Set<String> b() {
        return this.b;
    }

    @Override // defpackage.ctzb
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.ctzb
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctzb) {
            ctzb ctzbVar = (ctzb) obj;
            if (this.a.equals(ctzbVar.a()) && this.b.equals(ctzbVar.b()) && this.c.equals(ctzbVar.c()) && this.d.equals(ctzbVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 67 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("AccountUsers{gaiaEmail=");
        sb.append(valueOf);
        sb.append(", phoneNumbers=");
        sb.append(valueOf2);
        sb.append(", deviceId=");
        sb.append(valueOf3);
        sb.append(", tachyonAppName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
