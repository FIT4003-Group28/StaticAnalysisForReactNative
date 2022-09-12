package defpackage;
/* compiled from: PG */
/* renamed from: devl  reason: default package */
/* loaded from: classes6.dex */
final class devl extends devp {
    private final String a;
    private final String b;

    public devl(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // defpackage.devp
    public final String a() {
        return this.a;
    }

    @Override // defpackage.devp
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof devp) {
            devp devpVar = (devp) obj;
            if (this.a.equals(devpVar.a()) && this.b.equals(devpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 38 + str2.length());
        sb.append("LibraryVersion{libraryName=");
        sb.append(str);
        sb.append(", version=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
