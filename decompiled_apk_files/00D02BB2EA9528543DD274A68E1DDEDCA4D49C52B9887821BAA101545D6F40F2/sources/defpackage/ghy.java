package defpackage;
/* compiled from: PG */
/* renamed from: ghy  reason: default package */
/* loaded from: classes6.dex */
final class ghy extends gib {
    public final int a;
    public final int b;

    public ghy(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.gib
    public final int a() {
        return this.a;
    }

    @Override // defpackage.gib
    public final boolean b() {
        return false;
    }

    @Override // defpackage.gib
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gib) {
            gib gibVar = (gib) obj;
            if (this.a == gibVar.a() && this.b == gibVar.c() && !gibVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ 1237;
    }

    public final String toString() {
        int i = this.a;
        String a = gia.a(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 77);
        sb.append("IconDefinition{resourceId=");
        sb.append(i);
        sb.append(", imageFormat=");
        sb.append(a);
        sb.append(", enableMirrorInRtl=");
        sb.append(false);
        sb.append("}");
        return sb.toString();
    }
}
