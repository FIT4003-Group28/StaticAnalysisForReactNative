package defpackage;

import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: ciy  reason: default package */
/* loaded from: classes.dex */
public final class ciy implements btw {
    private final Object b;

    public ciy(Object obj) {
        cjn.b(obj);
        this.b = obj;
    }

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        if (obj instanceof ciy) {
            return this.b.equals(((ciy) obj).b);
        }
        return false;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ObjectKey{object=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
