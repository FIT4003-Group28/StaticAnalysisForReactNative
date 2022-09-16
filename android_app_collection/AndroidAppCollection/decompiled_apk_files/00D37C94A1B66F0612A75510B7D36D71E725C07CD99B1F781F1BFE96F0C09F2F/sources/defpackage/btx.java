package defpackage;
/* compiled from: PG */
/* renamed from: btx  reason: default package */
/* loaded from: classes2.dex */
public final class btx {
    public final String a;
    public final int b;

    public btx(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btx)) {
            return false;
        }
        btx btxVar = (btx) obj;
        if (this.b == btxVar.b) {
            return this.a.equals(btxVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
