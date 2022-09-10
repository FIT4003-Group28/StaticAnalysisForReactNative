package defpackage;
/* compiled from: PG */
/* renamed from: aufz  reason: default package */
/* loaded from: classes2.dex */
final class aufz extends augf {
    private final int a;
    private final CharSequence b;
    private final dbsg<ip> c;
    private final auhx d;
    private final boolean e;
    private final ddho f;
    private final dbsg<String> g;
    private final dbsg<ddcu> h;
    private final dbsg<cjtd> i;

    public aufz(int i, CharSequence charSequence, dbsg<ip> dbsgVar, auhx auhxVar, boolean z, ddho ddhoVar, dbsg<String> dbsgVar2, dbsg<ddcu> dbsgVar3, dbsg<cjtd> dbsgVar4) {
        this.a = i;
        this.b = charSequence;
        this.c = dbsgVar;
        this.d = auhxVar;
        this.e = z;
        this.f = ddhoVar;
        this.g = dbsgVar2;
        this.h = dbsgVar3;
        this.i = dbsgVar4;
    }

    @Override // defpackage.augf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.augf
    public final CharSequence b() {
        return this.b;
    }

    @Override // defpackage.augf
    public final dbsg<ip> c() {
        return this.c;
    }

    @Override // defpackage.augf
    public final auhx d() {
        return this.d;
    }

    @Override // defpackage.augf
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof augf) {
            augf augfVar = (augf) obj;
            if (this.a == augfVar.a() && this.b.equals(augfVar.b()) && this.c.equals(augfVar.c()) && this.d.equals(augfVar.d()) && this.e == augfVar.e() && this.f.equals(augfVar.f()) && this.g.equals(augfVar.g()) && this.h.equals(augfVar.h()) && this.i.equals(augfVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.augf
    public final ddho f() {
        return this.f;
    }

    @Override // defpackage.augf
    public final dbsg<String> g() {
        return this.g;
    }

    @Override // defpackage.augf
    public final dbsg<ddcu> h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.augf
    public final dbsg<cjtd> i() {
        return this.i;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 179 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("NotificationAction{icon=");
        sb.append(i);
        sb.append(", title=");
        sb.append(valueOf);
        sb.append(", remoteInput=");
        sb.append(valueOf2);
        sb.append(", intentWithType=");
        sb.append(valueOf3);
        sb.append(", shouldDismissNotification=");
        sb.append(z);
        sb.append(", geoVisualElementType=");
        sb.append(valueOf4);
        sb.append(", ved=");
        sb.append(valueOf5);
        sb.append(", geoDataElementType=");
        sb.append(valueOf6);
        sb.append(", extraLoggingParams=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
