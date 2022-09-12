package defpackage;
/* compiled from: PG */
/* renamed from: auif  reason: default package */
/* loaded from: classes.dex */
final class auif extends auiu {
    private final String a;
    private final int b;
    private final int c;
    private final dbsg<Integer> d;
    private final boolean e;
    private final boolean f;
    private final dbsg<auit> g;

    public auif(String str, int i, int i2, dbsg<Integer> dbsgVar, boolean z, boolean z2, dbsg<auit> dbsgVar2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = dbsgVar;
        this.e = z;
        this.f = z2;
        this.g = dbsgVar2;
    }

    @Override // defpackage.auiu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.auiu
    public final int b() {
        return this.b;
    }

    @Override // defpackage.auiu
    public final int c() {
        return this.c;
    }

    @Override // defpackage.auiu
    public final dbsg<Integer> d() {
        return this.d;
    }

    @Override // defpackage.auiu
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auiu) {
            auiu auiuVar = (auiu) obj;
            if (this.a.equals(auiuVar.a()) && this.b == auiuVar.b() && this.c == auiuVar.c() && this.d.equals(auiuVar.d()) && this.e == auiuVar.e() && this.f == auiuVar.f() && this.g.equals(auiuVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.auiu
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.auiu
    public final dbsg<auit> g() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        String valueOf = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        String valueOf2 = String.valueOf(this.g);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 172 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("NotificationChannelInfo{channelId=");
        sb.append(str);
        sb.append(", importance=");
        sb.append(i);
        sb.append(", nameResourceId=");
        sb.append(i2);
        sb.append(", descriptionResourceId=");
        sb.append(valueOf);
        sb.append(", shouldVibrate=");
        sb.append(z);
        sb.append(", shouldUseSound=");
        sb.append(z2);
        sb.append(", replacedChannel=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
