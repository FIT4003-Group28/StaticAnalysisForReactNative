package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: bxf  reason: default package */
/* loaded from: classes.dex */
final class bxf implements btw {
    private static final cjk<Class<?>, byte[]> b = new cjk<>(50);
    private final bxl c;
    private final btw d;
    private final btw e;
    private final int f;
    private final int g;
    private final Class<?> h;
    private final bua i;
    private final bue<?> j;

    public bxf(bxl bxlVar, btw btwVar, btw btwVar2, int i, int i2, bue<?> bueVar, Class<?> cls, bua buaVar) {
        this.c = bxlVar;
        this.d = btwVar;
        this.e = btwVar2;
        this.f = i;
        this.g = i2;
        this.j = bueVar;
        this.h = cls;
        this.i = buaVar;
    }

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.c.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        bue<?> bueVar = this.j;
        if (bueVar != null) {
            bueVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        cjk<Class<?>, byte[]> cjkVar = b;
        byte[] f = cjkVar.f(this.h);
        if (f == null) {
            f = this.h.getName().getBytes(a);
            cjkVar.g(this.h, f);
        }
        messageDigest.update(f);
        this.c.a(bArr);
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        if (obj instanceof bxf) {
            bxf bxfVar = (bxf) obj;
            if (this.g == bxfVar.g && this.f == bxfVar.f && cjp.j(this.j, bxfVar.j) && this.h.equals(bxfVar.h) && this.d.equals(bxfVar.d) && this.e.equals(bxfVar.e) && this.i.equals(bxfVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        int hashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        bue<?> bueVar = this.j;
        if (bueVar != null) {
            hashCode = (hashCode * 31) + bueVar.hashCode();
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
        sb.append('\'');
        sb.append(", options=");
        sb.append(valueOf5);
        sb.append('}');
        return sb.toString();
    }
}
