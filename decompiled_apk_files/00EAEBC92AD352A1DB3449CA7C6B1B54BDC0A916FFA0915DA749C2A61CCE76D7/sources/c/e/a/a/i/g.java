package c.e.a.a.i;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final c.e.a.a.b f3711a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f3712b;

    public g(c.e.a.a.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr == null) {
                throw new NullPointerException("bytes is null");
            }
            this.f3711a = bVar;
            this.f3712b = bArr;
            return;
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.f3712b;
    }

    public c.e.a.a.b b() {
        return this.f3711a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3711a.equals(gVar.f3711a)) {
            return Arrays.equals(this.f3712b, gVar.f3712b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3711a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3712b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f3711a + ", bytes=[...]}";
    }
}
