package defpackage;

import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cup  reason: default package */
/* loaded from: classes3.dex */
public final class cup implements chy {
    private final Object b;

    public cup(Object obj) {
        hy.N(obj);
        this.b = obj;
    }

    @Override // defpackage.chy
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.chy
    public final boolean equals(Object obj) {
        if (obj instanceof cup) {
            return this.b.equals(((cup) obj).b);
        }
        return false;
    }

    @Override // defpackage.chy
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
