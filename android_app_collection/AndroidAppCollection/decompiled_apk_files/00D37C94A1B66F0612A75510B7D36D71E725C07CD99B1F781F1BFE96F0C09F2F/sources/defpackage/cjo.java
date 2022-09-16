package defpackage;

import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cjo  reason: default package */
/* loaded from: classes2.dex */
final class cjo implements chy {
    private final chy b;
    private final chy c;

    public cjo(chy chyVar, chy chyVar2) {
        this.b = chyVar;
        this.c = chyVar2;
    }

    @Override // defpackage.chy
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.chy
    public final boolean equals(Object obj) {
        if (obj instanceof cjo) {
            cjo cjoVar = (cjo) obj;
            if (this.b.equals(cjoVar.b) && this.c.equals(cjoVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chy
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
