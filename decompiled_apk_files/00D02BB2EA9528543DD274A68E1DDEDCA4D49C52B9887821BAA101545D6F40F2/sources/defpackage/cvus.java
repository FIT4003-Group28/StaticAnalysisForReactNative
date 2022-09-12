package defpackage;
/* compiled from: PG */
/* renamed from: cvus  reason: default package */
/* loaded from: classes5.dex */
public final class cvus<T> extends cvvh<T> {
    private final Class<T> a;
    private final T b;
    private final cvvo c;

    /* JADX WARN: Multi-variable type inference failed */
    public cvus(Class cls, Object obj, cvvo cvvoVar) {
        this.a = cls;
        if (obj != 0) {
            this.b = obj;
            this.c = cvvoVar;
            return;
        }
        throw new NullPointerException("Null data");
    }

    @Override // defpackage.cvvh
    public final Class<T> a() {
        return this.a;
    }

    @Override // defpackage.cvvh
    public final T b() {
        return this.b;
    }

    @Override // defpackage.cvvh
    public final String c() {
        return null;
    }

    @Override // defpackage.cvvh
    public final cvvo d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvvh) {
            cvvh cvvhVar = (cvvh) obj;
            if (this.a.equals(cvvhVar.a()) && this.b.equals(cvvhVar.b()) && this.c.equals(cvvhVar.d()) && cvvhVar.c() == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 77 + length2 + String.valueOf(valueOf3).length() + "null".length());
        sb.append("BadgeContent{dataClass=");
        sb.append(valueOf);
        sb.append(", data=");
        sb.append(valueOf2);
        sb.append(", badgeViewHolderFactory=");
        sb.append(valueOf3);
        sb.append(", contentDescription=");
        sb.append((String) null);
        sb.append("}");
        return sb.toString();
    }
}
