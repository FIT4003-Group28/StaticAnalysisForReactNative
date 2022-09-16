package defpackage;
/* compiled from: PG */
/* renamed from: auob  reason: default package */
/* loaded from: classes2.dex */
final class auob extends auoe {
    private final int a;
    private final CharSequence b;
    private final dbsg<ip> c;
    private final auhx d;
    private final boolean e;
    private final dbsg<ddcu> f;
    private final dbsg<String> g;
    private final dbsg<Integer> h;
    private final dbsg<cjtd> i;
    private final int j;

    public auob(int i, int i2, CharSequence charSequence, dbsg<ip> dbsgVar, auhx auhxVar, boolean z, dbsg<ddcu> dbsgVar2, dbsg<String> dbsgVar3, dbsg<Integer> dbsgVar4, dbsg<cjtd> dbsgVar5) {
        this.j = i;
        this.a = i2;
        this.b = charSequence;
        this.c = dbsgVar;
        this.d = auhxVar;
        this.e = z;
        this.f = dbsgVar2;
        this.g = dbsgVar3;
        this.h = dbsgVar4;
        this.i = dbsgVar5;
    }

    @Override // defpackage.auoe
    public final int a() {
        return this.a;
    }

    @Override // defpackage.auoe
    public final CharSequence b() {
        return this.b;
    }

    @Override // defpackage.auoe
    public final dbsg<ip> c() {
        return this.c;
    }

    @Override // defpackage.auoe
    public final auhx d() {
        return this.d;
    }

    @Override // defpackage.auoe
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof auoe)) {
            return false;
        }
        auoe auoeVar = (auoe) obj;
        int i = this.j;
        int j = auoeVar.j();
        if (i == 0) {
            throw null;
        }
        return i == j && this.a == auoeVar.a() && this.b.equals(auoeVar.b()) && this.c.equals(auoeVar.c()) && this.d.equals(auoeVar.d()) && this.e == auoeVar.e() && this.f.equals(auoeVar.f()) && this.g.equals(auoeVar.g()) && this.h.equals(auoeVar.h()) && this.i.equals(auoeVar.i());
    }

    @Override // defpackage.auoe
    public final dbsg<ddcu> f() {
        return this.f;
    }

    @Override // defpackage.auoe
    public final dbsg<String> g() {
        return this.g;
    }

    @Override // defpackage.auoe
    public final dbsg<Integer> h() {
        return this.h;
    }

    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return ((((((((((((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ 2040732332;
        }
        throw null;
    }

    @Override // defpackage.auoe
    public final dbsg<cjtd> i() {
        return this.i;
    }

    @Override // defpackage.auoe
    public final int j() {
        return this.j;
    }

    public final String toString() {
        int i = this.j;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "TERTIARY" : "SECONDARY" : "PRIMARY";
        int i2 = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 211 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("GenericNotificationAction{genericNotificationActionPosition=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(i2);
        sb.append(", title=");
        sb.append(valueOf);
        sb.append(", remoteInput=");
        sb.append(valueOf2);
        sb.append(", intentWithType=");
        sb.append(valueOf3);
        sb.append(", shouldDismissNotification=");
        sb.append(z);
        sb.append(", dataElementType=");
        sb.append(valueOf4);
        sb.append(", ved=");
        sb.append(valueOf5);
        sb.append(", clientLeafVe=");
        sb.append(valueOf6);
        sb.append(", extraLoggingParams=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
