package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: ckw  reason: default package */
/* loaded from: classes2.dex */
final class ckw implements chy {
    private static final cuz b = new cuz(50);
    private final clb c;
    private final chy d;
    private final chy e;
    private final int f;
    private final int g;
    private final Class h;
    private final cic i;
    private final cig j;

    public ckw(clb clbVar, chy chyVar, chy chyVar2, int i, int i2, cig cigVar, Class cls, cic cicVar) {
        this.c = clbVar;
        this.d = chyVar;
        this.e = chyVar2;
        this.f = i;
        this.g = i2;
        this.j = cigVar;
        this.h = cls;
        this.i = cicVar;
    }

    @Override // defpackage.chy
    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.c.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        this.i.a(messageDigest);
        cuz cuzVar = b;
        byte[] bArr2 = (byte[]) cuzVar.f(this.h);
        if (bArr2 == null) {
            bArr2 = this.h.getName().getBytes(a);
            cuzVar.g(this.h, bArr2);
        }
        messageDigest.update(bArr2);
        this.c.c(bArr);
    }

    @Override // defpackage.chy
    public final boolean equals(Object obj) {
        if (obj instanceof ckw) {
            ckw ckwVar = (ckw) obj;
            if (this.g == ckwVar.g && this.f == ckwVar.f && cvd.l(this.j, ckwVar.j) && this.h.equals(ckwVar.h) && this.d.equals(ckwVar.d) && this.e.equals(ckwVar.e) && this.i.equals(ckwVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chy
    public final int hashCode() {
        int hashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        cig cigVar = this.j;
        if (cigVar != null) {
            hashCode = (hashCode * 31) + cigVar.hashCode();
        }
        return (((hashCode * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        int i2 = this.g;
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", decodedResourceClass=");
        sb.append(valueOf3);
        sb.append(", transformation='");
        sb.append(valueOf4);
        sb.append("', options=");
        sb.append(valueOf5);
        sb.append('}');
        return sb.toString();
    }
}
