package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cyzy  reason: default package */
/* loaded from: classes5.dex */
public final class cyzy {
    public static final String[] a = {"_id", "displayName", "accountName", "accountType", "packageName"};
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public cyzy(long j, String str, String str2, String str3, String str4) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyzy) {
            cyzy cyzyVar = (cyzy) obj;
            if (this.b == cyzyVar.b && dbsd.a(this.c, cyzyVar.c) && dbsd.a(this.d, cyzyVar.d) && dbsd.a(this.e, cyzyVar.e) && dbsd.a(this.f, cyzyVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.g("id", this.b);
        b.b("displayName", this.c);
        b.b("accountName", this.d);
        b.b("accountType", this.e);
        b.b("packageName", this.f);
        return b.toString();
    }
}
