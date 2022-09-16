package defpackage;
/* compiled from: PG */
/* renamed from: hkv  reason: default package */
/* loaded from: classes3.dex */
public final class hkv {
    public ampq a;
    private amuk b;

    public hkv() {
    }

    public hkv(byte[] bArr) {
        this.a = amon.a;
    }

    public final hkw a() {
        amuk amukVar = this.b;
        if (amukVar == null) {
            throw new IllegalStateException("Missing required properties: thumbnailList");
        }
        return new hkw(amukVar, this.a);
    }

    public final void b(amuk amukVar) {
        if (amukVar != null) {
            this.b = amukVar;
            return;
        }
        throw new NullPointerException("Null thumbnailList");
    }
}
