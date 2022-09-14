package defpackage;
/* compiled from: PG */
/* renamed from: cvut  reason: default package */
/* loaded from: classes5.dex */
final class cvut extends cvvx {
    private final cvwj a;
    private final String b;

    public cvut(cvwj cvwjVar, String str) {
        this.a = cvwjVar;
        this.b = str;
    }

    @Override // defpackage.cvvx
    public final cvwj a() {
        return this.a;
    }

    @Override // defpackage.cvvx
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvvx) {
            cvvx cvvxVar = (cvvx) obj;
            if (this.a.equals(cvvxVar.a()) && ((str = this.b) != null ? str.equals(cvvxVar.b()) : cvvxVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(str).length());
        sb.append("RingContent{ringDrawableFactory=");
        sb.append(valueOf);
        sb.append(", contentDescription=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
