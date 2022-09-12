package defpackage;

import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: bvq  reason: default package */
/* loaded from: classes.dex */
final class bvq implements btw {
    private final btw b;
    private final btw c;

    public bvq(btw btwVar, btw btwVar2) {
        this.b = btwVar;
        this.c = btwVar2;
    }

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        if (obj instanceof bvq) {
            bvq bvqVar = (bvq) obj;
            if (this.b.equals(bvqVar.b) && this.c.equals(bvqVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("DataCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
