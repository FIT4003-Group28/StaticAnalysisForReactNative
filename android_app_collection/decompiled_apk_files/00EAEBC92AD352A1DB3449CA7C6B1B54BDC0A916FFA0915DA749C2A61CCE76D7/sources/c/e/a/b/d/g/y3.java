package c.e.a.b.d.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y3 extends f4 {

    /* renamed from: f  reason: collision with root package name */
    private final int f4531f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4532g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y3(byte[] bArr, int i, int i2) {
        super(bArr);
        v3.b(i, i + i2, bArr.length);
        this.f4531f = i;
        this.f4532g = i2;
    }

    @Override // c.e.a.b.d.g.f4, c.e.a.b.d.g.v3
    public final byte a(int i) {
        int f2 = f();
        if (((f2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(f2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.f4149e[this.f4531f + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c.e.a.b.d.g.f4, c.e.a.b.d.g.v3
    public final byte b(int i) {
        return this.f4149e[this.f4531f + i];
    }

    @Override // c.e.a.b.d.g.f4, c.e.a.b.d.g.v3
    public final int f() {
        return this.f4532g;
    }

    @Override // c.e.a.b.d.g.f4
    protected final int g() {
        return this.f4531f;
    }
}
