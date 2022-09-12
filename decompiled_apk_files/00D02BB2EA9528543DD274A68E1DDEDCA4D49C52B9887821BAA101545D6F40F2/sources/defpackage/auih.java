package defpackage;
/* compiled from: PG */
/* renamed from: auih  reason: default package */
/* loaded from: classes2.dex */
final class auih extends auiv {
    public final ddho a;
    public final ddho b;
    public final ddho c;
    public final ddho d;

    public auih(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.c = ddhoVar3;
        this.d = ddhoVar4;
    }

    @Override // defpackage.auiv
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.auiv
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.auiv
    public final ddho c() {
        return this.c;
    }

    @Override // defpackage.auiv
    public final ddho d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auiv) {
            auiv auivVar = (auiv) obj;
            if (this.a.equals(auivVar.a()) && this.b.equals(auivVar.b()) && this.c.equals(auivVar.c()) && this.d.equals(auivVar.d())) {
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
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("NotificationOptOutUiVes{noThanksVe=");
        sb.append(valueOf);
        sb.append(", okGotItVe=");
        sb.append(valueOf2);
        sb.append(", pageVe=");
        sb.append(valueOf3);
        sb.append(", backPressVe=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
